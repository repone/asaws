/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.extractors;

import com.mmone.abs.api.rates.AbstractDowExtractor;
import com.mmone.abs.api.rates.Debuggable;
import com.mmone.abs.api.rates.DowExtractor;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;

/**
 *
 * @author mauro.larese
 */ 
public class OtaDowDepartureRestrictionsExtractor extends AbstractDowExtractor  { 

     
    public OtaDowDepartureRestrictionsExtractor(
        OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.DepartureDaysOfWeek otaDow
    ) {
        
        super(
           otaDow.isMon(),
           otaDow.isTue(),
           otaDow.isWeds(),
           otaDow.isThur(),
           otaDow.isFri(),
           otaDow.isSat(),
           otaDow.isSun()
        );
        
    }

    public OtaDowDepartureRestrictionsExtractor(
        OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.DepartureDaysOfWeek otaDow,
        boolean isDebug    
    ) {
        this(otaDow);
        this.setDebug(isDebug);
    }
    
    @Override
    public boolean[] extract() {
        if(isDebug()){  
            _pd(  "***** OtaDowDepartureRestrictionsExtractor"  ) ;
        }           
          
        return this.getDow();
    }
    
}
