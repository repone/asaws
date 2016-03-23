/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.abs.api.rates.AbsContextRecord;
import com.mmone.abs.api.rates.AbsRate;
import com.mmone.abs.api.rates.BuildingResources;
import com.mmone.abs.api.rates.Debuggable;
import com.mmone.abs.api.rates.RatePlanHelper;
import com.mmone.abs.api.room.RoomRecord;
import com.mmone.abs.helpers.ElaborationResults;
import com.mmone.abs.helpers.exceptions.BuildErrorException;
import com.mmone.abs.helpers.exceptions.MealPlanCodeInvalidException;
import com.mmone.asa.helpers.MealConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;

/**
 *
 * @author mauro.larese
 */
public class RateBuilder  extends Debuggable implements Builder<AbsRate> {
    private OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate rate;
    private ElaborationResults elaborationResults;
    private String ratePlanCode;
    private String currencyCode; 
    private int hotelCode; 
    BuildingResources buildingResources;
    
    public RateBuilder( 
            OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate rate, 
            OTAHotelRatePlanNotifRQ.RatePlans.RatePlan  ratePlan, 
            BuildingResources buildingRes,
            boolean isDebug) {
        
        this.rate = rate;
        this.elaborationResults = buildingRes.getElaborationResults();
        this.setDebug(isDebug);
        this.ratePlanCode=ratePlan.getRatePlanCode();
        this.currencyCode=ratePlan.getCurrencyCode();
        this.buildingResources = buildingRes;
        this.hotelCode = this.buildingResources.getHotelCode();
    }
    
    public int getTreatment() throws MealPlanCodeInvalidException{
        AbsContextRecord abc = OtaAbsContextRecordBuilder.build();
        int treatmentId = abc.getTreatmentOBId();
        
        if(rate.getMealsIncluded()==null)
            throw new MealPlanCodeInvalidException("Meal plan code null ");
        if(rate.getMealsIncluded().getMealPlanCodes()==null)
            throw new MealPlanCodeInvalidException("Meal plan code null ");
         
        int otaMealPlanCode = new Integer(rate.getMealsIncluded().getMealPlanCodes());
        
        treatmentId = MealConstants.OTA_TO_MM[otaMealPlanCode];
                 
        return treatmentId;
    }
    
    @Override
    public AbsRate build() throws BuildErrorException{
        try {
            AbsRate absRate = new AbsRate(); 
            String roomCode = rate.getInvTypeCode();
            if(roomCode==null)
                throw new BuildErrorException("No roomCode for ratePlan "+ratePlanCode);
            
            RoomRecord roomRec = RatePlanHelper.getRoomRecord(buildingResources.getRunner() , roomCode, hotelCode);
            absRate
                .setStartDate(  Facilities.xmlGregorianCalendarToSqlDate(   rate.getStart()) )
                .setEndDate(Facilities.xmlGregorianCalendarToSqlDate(   rate.getEnd()) )
                .setRateId(  ratePlanCode)
                .setCurrencyCode(currencyCode)
                .setMealPlanCode( getTreatment())
                .setRoomId(roomRec.getRoomId())
                .setRoomExtraBed(roomRec.getExtrabed())
                ;
            
                    
            return absRate;
        } catch (Exception ex) {
            Logger.getLogger(RateBuilder.class.getName()).log(Level.SEVERE, null, ex);
            throw new BuildErrorException("Error defining rate for ratePlan "+ratePlanCode);
        }
    }
    
}
