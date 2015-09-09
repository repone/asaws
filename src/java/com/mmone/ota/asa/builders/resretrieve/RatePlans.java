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
public class RatePlans {
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan 
        RatePlan(Map<String, Object> reservationDetail){  
            OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan ratePlan = 
                    new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan();
            
            String mCode = "rate";
            try { mCode = (String)reservationDetail.get("mr_code");    } catch (Exception e) {   }
            ratePlan.setRatePlanCode(mCode); 
            ratePlan.setMealsIncluded( MealsIncluded.init(reservationDetail)); 
            return ratePlan;
    }
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans 
        init(Map<String, Object> reservationDetail){  
       
        OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans    ratePlans =
                new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans();
         
        ratePlans.setRatePlan( RatePlan(reservationDetail));
        return ratePlans;
    }  
}
