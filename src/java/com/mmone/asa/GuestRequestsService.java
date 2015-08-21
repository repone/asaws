/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.asa;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceContext;
import org.opentravel.ota._2003._05.OTANotifReportRQ;
import org.opentravel.ota._2003._05.OTANotifReportRS;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;

/**
 *
 * @author mauro.larese
 */
@WebService(serviceName = "GuestRequestsService", portName = "GuestRequestsPort", endpointInterface = "https.webservices_asa_one_com.asaconnectservice._1.GuestRequestsPort", targetNamespace = "https://webservices.Asa-one.com/AsaConnectService/1.0", wsdlLocation = "WEB-INF/wsdl/GuestRequestsService/alpinebits.wsdl")
public class GuestRequestsService {
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
    public  OTAResRetrieveRS otaRead(org.opentravel.ota._2003._05.OTAReadRQ readRQMsg) {
       return (OTAResRetrieveRS) 
               new ResponseBuildFactory(readRQMsg,wsc,getContext())
               .getBuilder().build();
    }

    public OTANotifReportRS otaNotifReport( OTANotifReportRQ notifReportRQMsg) {
        return (OTANotifReportRS) 
               new ResponseBuildFactory(notifReportRQMsg,wsc,getContext())
               .getBuilder().build();
    }
    
}
