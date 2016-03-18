/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.rateplans;

import com.mmone.ota.asa.builders.OTAHotelRatePlanNotifRSBuilder;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;

/**
 *
 * @author mauro.larese
 */
public class RatePlanElaboratorFactory {
    public static final String RATE_PLAN_NOTIF_TYPE_NEW = "New";
    public static final String RATE_PLAN_NOTIF_TYPE_OVERLAY = "Overlay";
    public static final String RATE_PLAN_NOTIF_TYPE_REMOVE = "Remove";
    
    public static void getElaborator(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan rateplan){
        String rpType = rateplan.getRatePlanNotifType();
        RatePlanElaborator elaborator = null;   
        if(rpType.equals(RATE_PLAN_NOTIF_TYPE_NEW)){
           elaborator = new RatePlanNewElaborator (); 
        }else if(rpType.equals(RATE_PLAN_NOTIF_TYPE_OVERLAY)){
            //The server updates the rate plan 
            elaborator = new RatePlanOverlayElaborator();
        }else if(rpType.equals(RATE_PLAN_NOTIF_TYPE_REMOVE)){
            //The rate plan must be empty (no child elements). The server deletes the rate plan 
            elaborator = new RatePlanRemoveElaborator();
        }
        
        if(elaborator!=null)
            elaborator.elaborate();
        
    }
    
}
