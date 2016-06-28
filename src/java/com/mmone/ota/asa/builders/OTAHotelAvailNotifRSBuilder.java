/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceContext;
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRQ; 
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRS; 
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS;
import com.mmone.ota.asa.builders.exceptions.RoomIdNotFoundException;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Map;
import org.apache.commons.lang.time.DateUtils;

/**
 *
 * @author mauro.larese
 */
public class OTAHotelAvailNotifRSBuilder extends AbstractResponseBuilder{
    private static final String AVAIL_COMPLETE_SET = "CompleteSet";
    private static final String AVAIL_UPDATE = "Update"; 
    
    public OTAHotelAvailNotifRSBuilder(Object request,WebServiceContext webServiceContext,InitialContext initialContext){
        super(request, webServiceContext, initialContext);  
    }
     
    @Override
    public OTAHotelAvailNotifRQ getRequest(){
        return (OTAHotelAvailNotifRQ)super.getRequest();
    }
    @Override
    public String getHotelCodeFromRequest() {
        return this.getRequest().getAvailStatusMessages().getHotelCode();
    }

    private OTAHotelAvailNotifRS response = EmptyResponseFactory.newAvailNotifRS();
    @Override
    public OTAHotelAvailNotifRS getResponse() {
        return response;
    }

     
    @Override
    public void buildResponse() {  
        String recType=null;
        String instance = null;
        boolean hasInstance = false;
        try {
            recType = getRequest().getUniqueID().getType();
        } catch (Exception e) {  }
            
        if(recType==null) recType=AVAIL_UPDATE;
        Integer iHotelCode = new Integer(  getHotelCode() ); 
        
        List<OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage> availabilities = this.getRequest().getAvailStatusMessages().getAvailStatusMessage();
        OTAHotelAvailNotifRQ.UniqueID ud = this.getRequest().getUniqueID();
        
        if(ud!=null){
            hasInstance = true;
            instance = ud.getInstance();
            Logger.getLogger(this.getClass().getName()).log(Level.INFO, "instance="+instance );
        }else{
            Logger.getLogger(this.getClass().getName()).log(Level.INFO, "no instance" );
        }
        
        Map<String,Object> roomList = new Hashtable<String,Object>();
        
        if(hasInstance && instance.equals("CompleteSet")){
            BigInteger bookingLimit = new BigInteger("0") ;
             
            Date csStartDt= DateUtils.round(  new Date(),Calendar.HOUR );
            Date csEndDt=  DateUtils.addYears(csStartDt, 1)  ;
              
            
            for (OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage availability : availabilities) { 
                String roomCode = null;
                Integer roomId = null;
                try { roomCode = availability.getStatusApplicationControl().getInvTypeCode(); } catch (Exception e) {  continue; }    
                try { roomId = getServiceSource().getRoomIdByCode(roomCode, getHotelCode() ); } catch (RoomIdNotFoundException ex) {  continue; }                 
                 
                //Logger.getLogger(this.getClass().getName()).log(Level.INFO, "roomCode="+roomCode );
                
                if(!roomList.containsKey(roomCode)){
                    Map record = new Hashtable(4);
                        record.put("roomCode",roomCode);
                        record.put("roomId",roomId);
                        record.put("hotelCode",iHotelCode);
                        record.put("bookingLimit",bookingLimit);
                        record.put("startDt",csStartDt);
                        record.put("endDt",csEndDt);
                    
                    roomList.put(roomCode, record);
                    
                    Logger.getLogger( this.getClass().getName()).log(
                        Level.INFO, 
                        "[blanking availability] roomCode="+roomCode 
                        +" - dateStart="+csStartDt.toString()
                        +" - dateEnd="+csEndDt.toString()
                    );
             
                    getServiceSource().doSave( 
                            iHotelCode,
                            csStartDt,
                            csEndDt,
                            roomId,
                            bookingLimit.intValue() 
                    );
                }
                
                
            }
        }
        
        
        
        //if(true) return;
        
        
        for (OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage availability : availabilities) {
            BigInteger bookingLimit = null ;
            XMLGregorianCalendar dtFrom = null;
            XMLGregorianCalendar dtTo = null;
            Date startDt;
            Date endDt;
            String roomCode = null;
            Integer roomId = null;
            
            try {
                roomCode = availability.getStatusApplicationControl().getInvTypeCode();
            } catch (Exception e) { 
                addWarning(EWT_UNKNOWN, ERR_SYSTEM_ERROR, "@InvCode "+ roomCode + " is invalid ");
                continue;
            }    
            try {
                roomId = getServiceSource().getRoomIdByCode(roomCode, getHotelCode() );
            } catch (RoomIdNotFoundException ex) {
                addWarning(EWT_UNKNOWN, ERR_SYSTEM_ERROR, "@InvCode "+ roomCode + " not found");
                continue;
            }
            
            bookingLimit=availability.getBookingLimit();
            dtFrom = availability.getStatusApplicationControl().getStart();
            dtTo = availability.getStatusApplicationControl().getEnd(); 
            
            startDt = Facilities.xmlGregorianCalendarToSqlDate( dtFrom );
            endDt = Facilities.xmlGregorianCalendarToSqlDate( dtTo );
            int period = 0;
            
            try {
                period = (int) Facilities.dateDiff(startDt, endDt);
            } catch (Exception ex) { 
                continue;
            }
            
             
            
            getServiceSource().doSave( 
                    iHotelCode,
                    startDt,
                    endDt,
                    roomId,
                    bookingLimit.intValue() 
            );
            
        }
    }
    
    

    @Override
    public void fillErrors() {
         /*this.getResponse().setErrors( new  OTAHotelRatePlanNotifRS.Errors());
          
         for (int i = 0; i < this.getErrors().size(); i++) {
            ErrorType error = this.getErrors().get(i);
            OTAHotelRatePlanNotifRS.Errors.Error er = new OTAHotelRatePlanNotifRS.Errors.Error();
             
            er.setCode( new BigInteger( error.getCode() ));
            er.setType(error.getType());
            er.setContent(error.getMessage());     
            this.getResponse().getErrors().getError().add(er);
        }*/
    }

    @Override
    public void fillWarnings() { 
        /*
        this.getResponse().setWarnings(new OTAHotelRatePlanNotifRS.Warnings());
        for (WarningType warning : this.getWarning()) {
            OTAHotelRatePlanNotifRS.Warnings.Warning wa = 
                    new OTAHotelRatePlanNotifRS.Warnings.Warning();   
            wa.setContent( warning.getMessage() );
            wa.setRecordID(warning.getCode());
            wa.setType( new BigInteger(warning.getType() ) );
            
            this.getResponse().getWarnings().getWarning().add(wa);
        }*/
   
    }

    @Override
    public void markSuccess() {
        this.getResponse().setSuccess("");
    }
     
}
