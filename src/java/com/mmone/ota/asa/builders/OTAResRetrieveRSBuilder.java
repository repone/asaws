/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceContext;
import org.opentravel.ota._2003._05.OTAReadRQ;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import com.mmone.ota.asa.builders.exceptions.DateStartNotSetException;
import com.mmone.ota.asa.builders.resretrieve.HotelReservation;
import org.opentravel.ota._2003._05.SuccessType;
/**
 *
 * @author mauro.larese
 */
public class OTAResRetrieveRSBuilder extends AbstractResponseBuilder{ 
    public static final String CONTEXT_ID ="ASA_REQUEST_CXID";
    public final static String RES_STATUS_REQUESTED="Requested";
    public final static String RES_STATUS_RESERVED="Reserved";
    public final static String RES_STATUS_CANCELLED="Cancelled";
    public static final String RESERVATION_STATUS_CODE_WAITING_TO_CONFIRM = "0";
    public static final String RESERVATION_STATUS_CODE_CONFIRMED = "1";
    public static final String RESERVATION_STATUS_CODE_CANCEL_BY_STRUCTURE = "2";
    public static final String RESERVATION_STATUS_CODE_CANCEL_BY_GUEST = "3";
    public static final String RESERVATION_STATUS_CODE_CANCEL_NO_SHOW = "4";
    public static final String RESERVATION_STATUS_CODE_CANCEL_WRONG_CC = "5";
    public static final String RESERVATION_STATUS_CODE_CANCEL_BY_ADMIN = "6";
    public static final String RESERVATION_STATUS_CODE_CANCEL_GUEST_REQUEST = "7";
    public static final String RESERVATION_STATUS_CODE_REQUEST_TO_CANCEL_BY_GUEST = "20";
    public static final String RESERVATION_STATUS_CODE_REQUEST_TO_MODIFY_BY_GUEST = "21";
    public static final String RESERVATION_STATUS_CODE_SET_TO_MANUAL = "100";
    public static final String RESERVATION_STATUS_CODE_SET_TO_RESERVATION = "101";
    public static final String RESERVATION_STATUS_MODIFY_BY_MANAGEMENT_SOFTWARE = "102";
    public static final String RESERVATION_STATUS_CONFIRMED_BY_MANAGEMENT_SOFTWARE = "103";
    public static final Map<String, String> RESERVATION_STATUS_TO_RES_CODE = new Hashtable<String, String>();
    public static final Map<String, String> RES_STATUS_TO_UNIQUEID_TYPE = new Hashtable<String, String>();

    static { 
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_WAITING_TO_CONFIRM, RES_STATUS_REQUESTED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_CONFIRMED, RES_STATUS_RESERVED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_CANCEL_BY_STRUCTURE, RES_STATUS_CANCELLED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_CANCEL_BY_GUEST, RES_STATUS_CANCELLED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_CANCEL_NO_SHOW, RES_STATUS_CANCELLED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_CANCEL_WRONG_CC, RES_STATUS_CANCELLED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_CANCEL_BY_ADMIN, RES_STATUS_CANCELLED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_CANCEL_GUEST_REQUEST,RES_STATUS_CANCELLED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_REQUEST_TO_CANCEL_BY_GUEST, RES_STATUS_CANCELLED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_REQUEST_TO_MODIFY_BY_GUEST, RES_STATUS_RESERVED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_SET_TO_MANUAL, RES_STATUS_RESERVED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CODE_SET_TO_RESERVATION, RES_STATUS_RESERVED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_MODIFY_BY_MANAGEMENT_SOFTWARE,RES_STATUS_RESERVED);
        RESERVATION_STATUS_TO_RES_CODE.put(RESERVATION_STATUS_CONFIRMED_BY_MANAGEMENT_SOFTWARE,RES_STATUS_RESERVED);
        /*======================================================================================================*/
        RES_STATUS_TO_UNIQUEID_TYPE.put(RES_STATUS_REQUESTED, "14");
        RES_STATUS_TO_UNIQUEID_TYPE.put(RES_STATUS_RESERVED, "14");
        RES_STATUS_TO_UNIQUEID_TYPE.put(RES_STATUS_CANCELLED, "15");
        
    }
    // trattamenti
    public static final int MPT_ROOM_ONLY = 14;
    public static final int MM_ROOM_ONLY = 1;
    //----------------------------------------
    public static final int MPT_BB = 3;
    public static final int MM_BB = 2;
    //----------------------------------------
    public static final int MPT_HALF_BOARD = 12;
    public static final int MM_HALF_BOARD = 3;
    //----------------------------------------
    public static final int MPT_FULL_BOARD = 10;
    public static final int MM_FULL_BOARD = 4;
    //----------------------------------------
    public static final int MPT_ALL_INCLUSIVE = 1;
    public static final int MM_ALL_INCLUSIVE = 5;

    // environment
    public static final int TEST_ENVIRONMENT = 1;
    public static final int PRODUCTION_ENVIRONMENT = 2;
    
    public static final String CUSTOMER_GENDER_UNKNOWN="Unknown" ;
    public static final String CUSTOMER_LANGUAGE_DE="de";
    
    public static final int[] MM_TO_MPT = {
        /*00*/ MPT_ROOM_ONLY,
        /*01*/ MPT_ROOM_ONLY,
        /*02*/ MPT_BB,
        /*03*/ MPT_HALF_BOARD,
        /*04*/ MPT_FULL_BOARD,
        /*05*/ MPT_ALL_INCLUSIVE,
        /*06*/ MPT_ROOM_ONLY,
        /*07*/ MPT_ROOM_ONLY,
        /*08*/ MPT_ROOM_ONLY,
        /*09*/ MPT_ROOM_ONLY,
        /*10*/ MPT_ROOM_ONLY,
        /*11*/ MPT_ROOM_ONLY,
        /*12*/ MPT_ROOM_ONLY,
        /*13*/ MPT_ROOM_ONLY,
        /*14*/ MPT_ROOM_ONLY
    };
    
    private OTAResRetrieveRSBuilder( ){
        super(null,null,null);
    }
    
    public OTAResRetrieveRSBuilder(OTAReadRQ request, WebServiceContext webServiceContext,InitialContext initialContext){
        super(request, webServiceContext, initialContext); 
    }
    @Override
    public OTAReadRQ getRequest(){
        return (OTAReadRQ)super.getRequest();
    }
     
    @Override
    public String getHotelCodeFromRequest() {
        return this.getRequest().getReadRequests().getHotelReadRequest().getHotelCode();
    }
    private OTAResRetrieveRS response =new OTAResRetrieveRS(); 
    
    @Override
    public OTAResRetrieveRS getResponse() {
        return response;
    }
    @Override
    public void buildResponse() {
        java.util.Date dateStart=null;
        List<Map<String, Object>>reservations=null;
        
        try {
            dateStart= this.getFilterDateStart();        
        } catch (DateStartNotSetException ex) {   
        } catch (NullPointerException ex) { }   
        
        try {      
            reservations = this.getServiceSource().retrieveReservations( getHotelCode(),CONTEXT_ID,1,dateStart);    
            ReservationsList(reservations);
        }catch ( SQLException ex) {
            Logger.getLogger(OTAResRetrieveRSBuilder.class.getName()).log(Level.SEVERE, null, ex);
            addError(EWT_UNKNOWN, ERR_SYSTEM_ERROR, "System error");
            return;
        }
    }
   
    private void ReservationsList(List<Map<String, Object>> reservations){ 
        getRequest().setReadRequests(new OTAReadRQ.ReadRequests());
        getResponse().setReservationsList(new OTAResRetrieveRS.ReservationsList());
        List hotelReservationList = getResponse().getReservationsList().getHotelReservation();
        for (Map<String, Object> reservation : reservations) { 
            hotelReservationList.add(HotelReservation.init(reservation,getServiceSource())); 
        }
    }
    private java.util.Date getFilterDateStart()throws NullPointerException, DateStartNotSetException{
        java.util.Date  dateStart=null; 
        XMLGregorianCalendar xmlDateStart;
        xmlDateStart = this.getRequest()
                .getReadRequests()
                .getHotelReadRequest()
                .getSelectionCriteria().getStart();
 
        return xmlGregorianCalendarToSqlDate(xmlDateStart);
    }
    @Override
    public void fillErrors() { 
         this.getResponse().setErrors( new OTAResRetrieveRS.Errors());
          
         for (int i = 0; i < this.getErrors().size(); i++) {
            ErrorType error = this.getErrors().get(i);
            OTAResRetrieveRS.Errors.Error er = new OTAResRetrieveRS.Errors.Error();
             
            er.setCode( new BigInteger( error.getCode() ));
            er.setType(error.getType());
            er.setContent(error.getMessage());     
            this.getResponse().getErrors().getError().add(er);
        }
    }
    @Override
    public void fillWarnings() {}
    @Override
    public void markSuccess() {
        this
            .getResponse()
            .setSuccess( new String());
    } 
    public static void main(String[] args) {
         
    }
    
}
