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
public class MealsIncluded {
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded
            init(Map<String, Object> reservationDetail){
            
            OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded
                    mealsIncluded = new OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded();
            
            String planCode = (String)reservationDetail.get("reservation_detail_room_board");
            
            mealsIncluded.setMealPlanIndicator("true");
            if(planCode==null){ 
                mealsIncluded.setMealPlanCodes( "3" );
            }else if (planCode.equals("OB")){
                mealsIncluded.setMealPlanCodes( "14"  );
            }else if (planCode.equals("BB")){
                mealsIncluded.setMealPlanCodes( "3"  );
            }else if (planCode.equals("FB")){
                mealsIncluded.setMealPlanCodes( "10"  );
            }else if (planCode.equals("HB")){
                mealsIncluded.setMealPlanCodes( "12"  );
            }else if (planCode.equals("AI")){
                mealsIncluded.setMealPlanCodes( "1"  );
            }else{
                mealsIncluded.setMealPlanCodes( "3"  );
            }
            
            return mealsIncluded;
    }
}
