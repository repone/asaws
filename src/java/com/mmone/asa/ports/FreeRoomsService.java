/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.asa.ports;  
import com.sun.xml.internal.ws.api.message.Header;
import com.sun.xml.ws.api.message.HeaderList;
import com.sun.xml.ws.developer.JAXWSProperties;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceContext;
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRS;
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRQ;

/**
 *
 * @author mauro.larese
 */
@WebService(serviceName = "FreeRoomsService", portName = "FreeRoomsPort", endpointInterface = "https.webservices_asa_one_com.asaconnectservice._1.FreeRoomsPort", targetNamespace = "https://webservices.Asa-one.com/AsaConnectService/1.0", wsdlLocation = "WEB-INF/wsdl/FreeRoomsService/alpinebits.wsdl")
public class FreeRoomsService {
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
    public  OTAHotelAvailNotifRS otaHotelAvailNotif( OTAHotelAvailNotifRQ hotelAvailNotifRQMsg) {
        
        return (OTAHotelAvailNotifRS) 
               new ResponseBuildFactory(hotelAvailNotifRQMsg,wsc,getContext())
               .getBuilder().build();
    }
    
}
