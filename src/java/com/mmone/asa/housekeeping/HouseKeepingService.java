/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.asa.housekeeping;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author mauro.larese
 */
@WebService(serviceName = "HouseKeepingService")
public class HouseKeepingService {

    @WebMethod(operationName = "getVersion")
    public String getVersion() {
        return "OK:2014-04";
    }
    
    @WebMethod(operationName = "getCapabilities")
    public String getCapabilities() {
        return "OK:"
               +"action_getVersion," 
               +"action_getCapabilitie," 
               +"action_OTA_HotelAvailNotif," 
               +"action_OTA_Read," 
               +"action_OTA_HotelInvNotif_Inventor" 
                ;
    }
}
