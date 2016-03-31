/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.abs.api.rates.AbsBookingRule;
import com.mmone.abs.api.rates.Debuggable;
import com.mmone.abs.api.rates.DowExtractor;
import com.mmone.abs.helpers.ElaborationResults;
import com.mmone.ota.asa.builders.extractors.OtaDowArrivalRestrictionsExtractor;
import com.mmone.ota.asa.builders.extractors.OtaDowDepartureRestrictionsExtractor;
import com.mmone.ota.asa.builders.extractors.OtaRatePlaneNotifLengthOfStayExtractor;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;

/**
 *
 * @author mauro.larese
 */
public class BookingRuleBuilder extends Debuggable implements Builder<AbsBookingRule>{
    private OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule otaBkRule;
    private ElaborationResults elaborationResults;
    
    public BookingRuleBuilder(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule otaBkRule,ElaborationResults elaborationResults) {
        this.otaBkRule = otaBkRule;
    }
    public BookingRuleBuilder(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule otaBkRule,ElaborationResults elaborationResults,boolean isDebug) {
        this(otaBkRule,elaborationResults);
        setDebug(isDebug);
    }
    @Override
    public AbsBookingRule build() { 
        return prepareBookingRule();
    }
    
    public AbsBookingRule prepareBookingRule(){
        AbsBookingRule rule = new AbsBookingRule();
        rule.setDebug(isDebug());
        rule.setStartDate( Facilities.xmlGregorianCalendarToSqlDate(otaBkRule.getStart()) ) ;
        rule.setEndDate(Facilities.xmlGregorianCalendarToSqlDate(otaBkRule.getEnd()) ) ; 
        
        
        /**************************
         *  Length Of Stay
         **************************/
        rule.setLengthsOfStay(
            new OtaRatePlaneNotifLengthOfStayExtractor(
                otaBkRule.getLengthsOfStay(),
                isDebug()
            ).extract()
        );
        
        /**************************
         *  DOW Restrictions
         **************************/
        DowExtractor arDowExt = null;
        DowExtractor deDowExt = null;
        if(otaBkRule.getDOWRestrictions()!=null && otaBkRule.getDOWRestrictions().getArrivalDaysOfWeek()!=null){
            arDowExt=new OtaDowArrivalRestrictionsExtractor(
                otaBkRule.getDOWRestrictions().getArrivalDaysOfWeek(),
                isDebug()
            );
        } 
        if(otaBkRule.getDOWRestrictions()!=null && otaBkRule.getDOWRestrictions().getDepartureDaysOfWeek()!=null){
            deDowExt=new OtaDowDepartureRestrictionsExtractor(
                otaBkRule.getDOWRestrictions().getDepartureDaysOfWeek(),
                isDebug()    
            ); 
        }
        
        rule.setDow( arDowExt ,deDowExt );
         ;
        rule._pd( );
                
        return rule;
    }

}
