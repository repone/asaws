/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import java.util.Date;
import java.util.Map;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import com.mmone.ota.asa.builders.Facilities;

/**
 *
 * @author mauro.larese
 */
public class TimeSpan {
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan 
        init( Map<String, Object> reservation){  
       OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan timeSpan =
               new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan ();
               timeSpan.setStart(  Facilities.dateToXMLGregorianCalendar( (Date) reservation.get("reservation_checkin_date") ));
               timeSpan.setEnd(    Facilities.dateToXMLGregorianCalendar( (Date) reservation.get("reservation_checkout_date") ) );
       return timeSpan;
    } 
}
