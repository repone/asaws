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
public class RoomTypes {
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType 
        RoomType( Map<String, Object> reservationDetail){  
       OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType roomType=
               new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType ();
              
       try { roomType.setRoomTypeCode( (String)    reservationDetail.get("reservation_detail_code") );  } catch (Exception e) {     }       
        
       return roomType;
    }    
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes 
        init( Map<String, Object> reservationDetail){  
       OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes roomTypes =
               new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes ();
       
       roomTypes.setRoomType(RoomType(  reservationDetail)); 
       return roomTypes;
    }
}
