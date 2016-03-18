/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.asa.ports;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceContext;
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRS;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS;

/**
 *
 * @author mauro.larese
 */
@WebService(serviceName = "RatePlansService", portName = "RatePlansPort", endpointInterface = "https.webservices_asa_one_com.asaconnectservice._1.RatePlansPort", targetNamespace = "https://webservices.Asa-one.com/AsaConnectService/1.0", wsdlLocation = "WEB-INF/wsdl/RateplanService/alpinebits.wsdl")
public class RateplanService {
    @Resource
    private WebServiceContext wsc;
    private InitialContext getContext()  {
        
        try {    
            return new InitialContext();
        } catch (NamingException ex) {
           
            Logger.getLogger(GuestRequestsService.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }
    public org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS otaHotelRatePlanNotif(org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ hotelRatePlanNotifRQMsg) {
        
        return (OTAHotelRatePlanNotifRS) 
               new ResponseBuildFactory(hotelRatePlanNotifRQMsg,wsc,getContext())
               .getBuilder().build();
         
    }
    
}
