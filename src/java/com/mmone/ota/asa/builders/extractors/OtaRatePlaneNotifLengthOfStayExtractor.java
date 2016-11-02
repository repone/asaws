/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.extractors;
 
import com.mmone.abs.api.rates.LengthOfStayExtractor;
import com.mmone.abs.api.rates.AbsLengthsOfStay;
import com.mmone.abs.api.rates.Debuggable;
import java.util.List;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;

/**
 *
 * @author mauro.larese
 */
public class OtaRatePlaneNotifLengthOfStayExtractor extends Debuggable implements LengthOfStayExtractor{
    OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay los; 
    public OtaRatePlaneNotifLengthOfStayExtractor(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay los ) {
        this.los = los;
    }
    public OtaRatePlaneNotifLengthOfStayExtractor(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay los,boolean debug ) {
        this(los);
        this.setDebug(debug);
    }
    @Override
    public AbsLengthsOfStay extract() {
        AbsLengthsOfStay absLofs = new AbsLengthsOfStay();
        if( los.getLengthOfStay()==null ) return absLofs;
        
        List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay.LengthOfStay>
                    losList = los.getLengthOfStay();
     
        if(isDebug()){
            _pd(
               "**** Extracting Length of stay START *****"     
            );
        }
        for (OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay.LengthOfStay los : losList) {
            
            if(los.getMinMaxMessageType().equals("SetMinLOS")){ 
                absLofs.setMinStay(  los.getTime().intValue() );
                if(isDebug()){
                _pd(
                     " getMinMaxMessageType(SetMinLOS)=|"+los.getMinMaxMessageType()+"|"     
                   + " getTime="+los.getTime().intValue()     
                );
            }
            } else{  
                if(isDebug()){
                    _pd(
                         " getMinMaxMessageType(SetMaxLOS)=|"+los.getMinMaxMessageType()+"|"      
                       + " getTime="+los.getTime().intValue()     
                    );
                }
                absLofs.setMaxStay(los.getTime().intValue());
            }
        }
        
        if(isDebug()){
            _pd(
               "**** Extracting Length of stay END *****"     
            );
        }
        
        return absLofs;
    }
    
}