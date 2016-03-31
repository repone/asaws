/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.abs.api.rates.AbsAdditionalGuestAmount;
import com.mmone.abs.api.rates.AbsBaseGuestAmount;
import com.mmone.abs.api.rates.AbsBaseGuestAmountByPerson;
import com.mmone.abs.api.rates.AbsBaseGuestAmountByRoom;
import com.mmone.abs.api.rates.AbsRate;
import com.mmone.abs.api.rates.GuestAmount;
import com.mmone.abs.helpers.exceptions.BuildErrorException;
import com.mmone.asa.helpers.MealConstants;
import java.util.ArrayList;
import java.util.List;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;

/**
 *
 * @author mauro.larese
 */
public class GuestAmountListBuilder implements Builder <List<GuestAmount>>{
    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate rate;
    protected AbsRate absRate;
    
    public static void buildAbsRate(AbsRate absRate,OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate rate) throws BuildErrorException{
        GuestAmountListBuilder b = new GuestAmountListBuilder(absRate, rate);
        b.build();
    }
    public AbsBaseGuestAmount baseGuestAmountFactory(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts.BaseByGuestAmt ga){
        if(ga.getType().equals( AbsBaseGuestAmount.GUEST_AMOUNT_TYPE_PER_PERSON ))
            return new AbsBaseGuestAmountByPerson();
        else
            return new AbsBaseGuestAmountByRoom();
    }
    
    public List<GuestAmount> build() throws BuildErrorException { 
        if(rate.getMealsIncluded()==null)
            throw new BuildErrorException("missint treatment");
        
        int mealCode = new Integer(rate.getMealsIncluded().getMealPlanCodes());
        int treatment = MealConstants.OTA_TO_MM[mealCode];
        
        if( rate.getBaseByGuestAmts() != null){
            List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts.BaseByGuestAmt> 
                    otaGaList = rate.getBaseByGuestAmts().getBaseByGuestAmt();
 
            for (OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts.BaseByGuestAmt otaGa : otaGaList) {
                AbsBaseGuestAmount absga = baseGuestAmountFactory(otaGa);
                absga.setAgeQualifyingCode(otaGa.getAgeQualifyingCode());
                absga.setAmount(otaGa.getAmountAfterTax()); 
                absga.setTreatment(treatment);
                absRate.addGuestAmount(absga);
            }
        }
        if(rate.getAdditionalGuestAmounts()!=null){
            List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts.AdditionalGuestAmount> 
                    otaAgaList = rate.getAdditionalGuestAmounts().getAdditionalGuestAmount();

            for (OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts.AdditionalGuestAmount otaAga : otaAgaList) {
                AbsAdditionalGuestAmount adga = new AbsAdditionalGuestAmount();
                
                adga.setAgeQualifyingCode(otaAga.getAgeQualifyingCode());
                adga.setAmount(otaAga.getAmount());
                adga.setCalculationType("V");
                adga.setMinAge(otaAga.getMinAge());
                adga.setMaxAge(otaAga.getMaxAge());
                adga.setTreatment(treatment);
                absRate.addGuestAmount(adga);
            }
        }
        return absRate.getGuestAmounts();
    }

    public GuestAmountListBuilder(AbsRate absRate, OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate rate) {
         this.rate=rate;
         this.absRate=absRate;
    }
    
}
