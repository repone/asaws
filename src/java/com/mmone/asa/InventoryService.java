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
import org.opentravel.ota._2003._05.OTAHotelInvNotifRQ;
import org.opentravel.ota._2003._05.OTAHotelInvNotifRS;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;

/**
 *
 * @author mauro.larese
 */
@WebService(serviceName = "InventoryService", portName = "InventoryPort", endpointInterface = "https.webservices_asa_one_com.asaconnectservice._1.InventoryPort", targetNamespace = "https://webservices.Asa-one.com/AsaConnectService/1.0", wsdlLocation = "WEB-INF/wsdl/InventoryService/alpinebits.wsdl")
public class InventoryService {
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
    public OTAHotelInvNotifRS otaHotelInvNotif( OTAHotelInvNotifRQ hotelInvNotifRQMsg) {
        return (OTAHotelInvNotifRS) 
               new ResponseBuildFactory(hotelInvNotifRQMsg,wsc,getContext())
               .getBuilder().build();
    }
    
}
