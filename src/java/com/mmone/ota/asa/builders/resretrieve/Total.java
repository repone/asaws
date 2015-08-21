/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import java.math.BigDecimal;
import java.util.Map;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;

/**
 *
 * @author mauro.larese
 */
public class Total {
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.Total 
        init( Map<String, Object> reservation,Map<String, Object> reservationDetail){
        OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.Total  total=
                new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.Total ();
        total.setAmountAfterTax(  new BigDecimal(reservationDetail.get("reservation_detail_price").toString())  );
        total.setCurrencyCode("EUR");
        return  total;  
    }  
}
