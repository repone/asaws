/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import java.util.Map;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;

/**
 *
 * @author mauro.larese
 */
public class ResGlobalInfo {
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo 
        init(Map<String, Object> reservation){  
            OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo r= 
                    new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo();
                    //try { r.setComments(Comments.init(reservation));  } catch (Exception e) {  }
            return r;
    }
}
