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
public class ResGuests {
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest 
        ResGuest(Map<String, Object> reservation){  
        OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest resGuest=
                new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest();
                resGuest.setProfiles(Profiles.init(reservation));
                return resGuest;
    }
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests 
        init(Map<String, Object> reservation){  
        OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests resGuests = 
                new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests();
                resGuests.setResGuest(  ResGuest(reservation) );
        return resGuests;
    }     
}
