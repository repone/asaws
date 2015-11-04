/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.asa.ports;

import javax.jws.WebService;

/**
 *
 * @author mauro.larese
 */
@WebService(serviceName = "RatePlansService", portName = "RatePlansPort", endpointInterface = "https.webservices_asa_one_com.asaconnectservice._1.RatePlansPort", targetNamespace = "https://webservices.Asa-one.com/AsaConnectService/1.0", wsdlLocation = "WEB-INF/wsdl/RatePlansService/alpinebits.wsdl")
public class RatePlansService {

    public org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS otaHotelRatePlanNotif(org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ hotelRatePlanNotifRQMsg) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
