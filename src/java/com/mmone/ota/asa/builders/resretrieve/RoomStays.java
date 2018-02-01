/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import com.mmone.asa.helpers.ReservationDownloadServices;
import java.util.List;
import java.util.Map;
import org.apache.commons.dbutils.QueryRunner;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import com.mmone.ota.asa.builders.source.ReservationsSource;

/**
 *
 * @author mauro.larese
 */
public class RoomStays {
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay 
        RoomStay( Map<String, Object> reservation,Map<String, Object> reservationDetail){
        
            OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay roomStay=new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay();
            roomStay.setRoomTypes(RoomTypes.init(reservationDetail));
            roomStay.setRatePlans(RatePlans.init(reservationDetail));   
            roomStay.setTimeSpan(TimeSpan.init(reservation));
            roomStay.setTotal(Total.init(reservation, reservationDetail));
            roomStay.setGuestCounts( GuestCounts.init(reservation, reservationDetail)    );
            
            return roomStay;
    }
        
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays 
        init(Map<String, Object> reservation,ReservationsSource serviceSource){
        
            OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays roomStays=new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays();
        Integer reservationId=0;
        List<Map<String, Object>> reservationDetails=null;
        
        reservationDetails = ReservationDownloadServices.loadReservationOtherData(reservation);
        
        // try { reservationId = new Integer(  reservation.get("reservation_id").toString() ); } catch (Exception e) {  }
        // try { reservationDetails = serviceSource.retrieveReservationDetail( reservationId); } catch (Exception ex) { }
        
         
        for (Map<String, Object> reservationDetail : reservationDetails) { 
            roomStays.getRoomStay().add(RoomStay( reservation,reservationDetail));
        }
        return roomStays;
    }    
}
