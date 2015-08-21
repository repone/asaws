/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import java.util.Date;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.dbutils.QueryRunner;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import com.mmone.ota.asa.builders.Facilities;
import static com.mmone.ota.asa.builders.OTAResRetrieveRSBuilder.RESERVATION_STATUS_CODE_CONFIRMED;
import static com.mmone.ota.asa.builders.OTAResRetrieveRSBuilder.RESERVATION_STATUS_TO_RES_CODE;
import static com.mmone.ota.asa.builders.OTAResRetrieveRSBuilder.RES_STATUS_CANCELLED;
import com.mmone.ota.asa.builders.source.ReservationsSource;

/**
 *
 * @author mauro.larese
 */
public class HotelReservation {
    public static OTAResRetrieveRS.ReservationsList.HotelReservation 
        init(Map<String, Object> reservation,ReservationsSource serviceSource){ 
        OTAResRetrieveRS.ReservationsList.HotelReservation hotelReservation=new OTAResRetrieveRS.ReservationsList.HotelReservation();
        XMLGregorianCalendar today =   Facilities.dateToXMLGregorianCalendar(new Date());
        
        String resStatus = RESERVATION_STATUS_TO_RES_CODE.get(RESERVATION_STATUS_CODE_CONFIRMED); 
        try {
            resStatus = RESERVATION_STATUS_TO_RES_CODE.get(reservation.get("reservation_status").toString());
        } catch (Exception e) {  }
         
        hotelReservation.setCreateDateTime(today);
        try {
            XMLGregorianCalendar odt =  Facilities.dateToXMLGregorianCalendar((Date) reservation.get("reservation_opened_date")   )  ;            
            hotelReservation.setCreateDateTime( odt  ); 
        } catch (Exception e) {  }
        
        
        hotelReservation.setResStatus(  resStatus );
            hotelReservation.setUniqueID( UniqueId.init(resStatus,reservation) );
            
            if(!resStatus.equals(RES_STATUS_CANCELLED)) {
                hotelReservation.setRoomStays(RoomStays.init(reservation,serviceSource));
                hotelReservation.setResGuests(ResGuests.init(reservation));
                hotelReservation.setResGlobalInfo(ResGlobalInfo.init(reservation));
            }
        return hotelReservation; 
    }
}
