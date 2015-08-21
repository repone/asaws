/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.asa;

import com.mmone.ota.asa.builders.OTAHotelRatePlanNotifRSBuilder;
import com.mmone.ota.asa.builders.ResponseBuilder;
import com.mmone.ota.asa.builders.OTANotifReportRSBuilder;
import com.mmone.ota.asa.builders.OTAHotelInvNotifRSBuilder;
import com.mmone.ota.asa.builders.OTAHotelAvailNotifRSBuilder;
import com.mmone.ota.asa.builders.OTAResRetrieveRSBuilder;
import java.io.PrintStream;
import javax.naming.InitialContext;
import javax.xml.ws.WebServiceContext;
import org.opentravel.ota._2003._05.OTAHotelInvNotifRQ;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;
import org.opentravel.ota._2003._05.OTANotifReportRQ;
import org.opentravel.ota._2003._05.OTAReadRQ;
 
 
/**
 *
 * @author mauro.larese
 */
public class ResponseBuildFactory {
    private static PrintStream sout=  System.out;  
    private ResponseBuilder builder;

    public ResponseBuilder getBuilder() {
        return builder;
    }
 
    public ResponseBuildFactory(OTAReadRQ request,WebServiceContext webServiceContext,InitialContext initialContext) {  
        this.builder = new OTAResRetrieveRSBuilder(request, webServiceContext,initialContext); 
    }   
    
    public ResponseBuildFactory(Object request,WebServiceContext webServiceContext,InitialContext initialContext) { 
        this.builder = new OTAHotelAvailNotifRSBuilder(request, webServiceContext,initialContext);    
    }    
 
    public ResponseBuildFactory(OTANotifReportRQ request,WebServiceContext webServiceContext,InitialContext initialContext) { 
       this.builder = new OTANotifReportRSBuilder (request, webServiceContext,initialContext);
    } 
    public ResponseBuildFactory(OTAHotelRatePlanNotifRQ request,WebServiceContext webServiceContext,InitialContext initialContext) {
       this.builder = new OTAHotelRatePlanNotifRSBuilder (request, webServiceContext,initialContext);
    } 
    public ResponseBuildFactory(OTAHotelInvNotifRQ request,WebServiceContext webServiceContext,InitialContext initialContext) {
       this.builder = new OTAHotelInvNotifRSBuilder (request, webServiceContext,initialContext);
    }

    public static void main(String[] args) {    
         
         
    }
}
