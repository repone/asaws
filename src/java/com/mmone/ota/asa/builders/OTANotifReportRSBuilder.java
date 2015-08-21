/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.xml.ws.WebServiceContext;
import org.apache.xmlrpc.XmlRpcClient; 
import org.opentravel.ota._2003._05.OTANotifReportRQ; 
import org.opentravel.ota._2003._05.OTANotifReportRS; 
import com.mmone.ota.asa.builders.exceptions.ReservationNotFoundException;
import com.mmone.ota.asa.builders.source.ReservationsSource;
 
/**
 *
 * @author mauro.larese
 */
public class OTANotifReportRSBuilder extends AbstractResponseBuilder{ 
    public OTANotifReportRSBuilder(OTANotifReportRQ request, WebServiceContext webServiceContext,InitialContext initialContext){
        super(request, webServiceContext, initialContext);
    }
    @Override
    public OTANotifReportRQ getRequest(){
        return (OTANotifReportRQ)super.getRequest();
    }
     

    @Override
    public String getHotelCodeFromRequest() {
        return HOTEL_CODE_NOT_REQUIRED; 
    }
    private OTANotifReportRS response =new OTANotifReportRS();
    @Override
    public OTANotifReportRS getResponse() {
        return response;
    }
  
    @Override
    public void buildResponse() {
        
        List<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation>  hotelReservations=
            this.getRequest()
            .getNotifDetails()
            .getHotelNotifReport()
            .getHotelReservations()
            .getHotelReservation();
        
        for (OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation hotelReservation : hotelReservations) {
            String confirmationNumber = hotelReservation.getUniqueID().getID();
            
        }
    }
    private void markReservationAsDownloaded(String confirmationNumber ){
        Integer reservationId = null;
            
            try {
                reservationId = this.getServiceSource().getReservationIdByNumber(
                        confirmationNumber ); 
                
            } catch (ReservationNotFoundException ex) { 
                Logger.getLogger(OTANotifReportRSBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(reservationId!=null){
                try {
                    this.getServiceSource().insertOrUpdateDownloadRecord( 
                            OTAResRetrieveRSBuilder.CONTEXT_ID,
                            confirmationNumber,
                            reservationId,
                            null);
                } catch (Exception ex) {  
                    Logger.getLogger(OTANotifReportRSBuilder.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    @Override
    public void fillErrors() {
         
    }

    @Override
    public void fillWarnings() {
         
    }

    @Override
    public void markSuccess() {
        this.getResponse().setSuccess(new Boolean(true));
    }
}
