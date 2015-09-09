/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import static com.mmone.ota.asa.builders.resretrieve.RoomStays.RoomStay;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.collections.MapUtils;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;

/**
 *
 * @author mauro.larese
 */
public class GuestCounts {
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts.GuestCount 
        GuestCount(String count , String age){
         
        OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts.GuestCount 
                guestCount = new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts.GuestCount();
         
        if(age!=null)
            guestCount.setAge(    new BigInteger(age)      );
        if(count!=null)
            guestCount.setCount( new BigInteger(count)      );
        
        return guestCount;
    }

    public static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts 
        
        init(Map<String,Object> reservation,Map<String,Object> reservationDetail){
        
        OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts guestCounts= 
                new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts();
           
            String fieldGuest = (String)reservationDetail.get("reservation_detail_room_guest");
            String[] temp = fieldGuest.split("\\|");
            
            if (temp.length == 1) { // stringa vuota 
                try {
                    String count =  (String)reservation.get("reservation_numpersons") ;
                    guestCounts.getGuestCount().add( GuestCount(count, null) ); 
                } catch (Exception e) { }
            }else{
                
                for (int i = 0; i < temp.length; i++) {   
                    String age=null;
                    String count=null; 
                    String[] field = temp[i].split(":");
                    
                    if (field[0].equals("A")) { 
                        count =  field[1] ;  
                    } else if (field[0].equals("C")) {
                        if (!field[1].equals("-")) {
                            count = "1" ;   
                            if(field[1].equals("X"))
                                age = "0";
                            else
                                age = field[1]; 
                        }else { continue;  }
                    } else {  continue;  }
                    
                    guestCounts.getGuestCount().add( GuestCount(count, age) );  
                }
                 
            } 
        
 
        return guestCounts;
    }
        
    public static void main(String[] args) {
        Map<String,Object> reservation = new HashMap<String, Object>();
        Map<String,Object> reservationDetail= new HashMap<String, Object>();
        
        reservation.put("reservation_numpersons",1);
        reservationDetail.put("reservation_detail_room_guest", "A:6|C:-" );
        
        GuestCounts.init(reservation, reservationDetail);
    } 
    
}
