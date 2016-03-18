/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import java.util.List;
import javax.naming.InitialContext;
import javax.xml.ws.WebServiceContext;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS;
/**
 *
 * @author mauro.larese
 */
public class OTAHotelRatePlanNotifRSBuilder extends AbstractResponseBuilder{ 
    public OTAHotelRatePlanNotifRSBuilder(OTAHotelRatePlanNotifRQ request  , WebServiceContext webServiceContext,InitialContext initialContext){
        super(request, webServiceContext, initialContext);
    }
    @Override
    public OTAHotelRatePlanNotifRQ getRequest(){
        return (OTAHotelRatePlanNotifRQ)super.getRequest();
    }
     

    @Override
    public String getHotelCodeFromRequest() {
        return this.getRequest().getRatePlans().getHotelCode();
    }
    private OTAHotelRatePlanNotifRS response =new OTAHotelRatePlanNotifRS();
    @Override
    public OTAHotelRatePlanNotifRS getResponse() {
        return response;
    }

    @Override
    public void buildResponse() {
        this.getResponse().setVersion("1.000");
        List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan> ratePlanList = 
                getRequest().getRatePlans().getRatePlan();
         
        
        for (OTAHotelRatePlanNotifRQ.RatePlans.RatePlan ratePlan : ratePlanList) {
            
        }
        
    }

    @Override
    public void fillErrors() {
        
    }

    @Override
    public void fillWarnings() {
        
    }

    @Override
    public void markSuccess() {
        
    }
} 
