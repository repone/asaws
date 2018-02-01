/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import java.util.Map;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import static com.mmone.ota.asa.builders.OTAResRetrieveRSBuilder.RES_STATUS_TO_UNIQUEID_TYPE;

/**
 *
 * @author mauro.larese
 */
public class UniqueId {
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.UniqueID 
        init( String resStatus,Map<String, Object> reservation){  
        String id=null;
        try { id = reservation.get("new_reservation_id").toString(); } catch (Exception e) {  }
        OTAResRetrieveRS.ReservationsList.HotelReservation.UniqueID uniqueId = new OTAResRetrieveRS.ReservationsList.HotelReservation.UniqueID();
            uniqueId.setType(RES_STATUS_TO_UNIQUEID_TYPE.get(resStatus) );
            uniqueId.setID(id);
        return uniqueId;
    }     
}
