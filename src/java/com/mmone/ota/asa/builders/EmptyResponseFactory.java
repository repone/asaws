/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.abs.helpers.ErrConsts;
import com.mmone.abs.helpers.ErrTypeConsts;
import com.mmone.asa.ports.ErrorResultType;
import com.mmone.asa.ports.SuccessResultType;
import java.math.BigInteger;
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRS;
import org.opentravel.ota._2003._05.OTAHotelInvNotifRS;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Errors;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Errors.Error;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Warnings;
import org.opentravel.ota._2003._05.OTANotifReportRS;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;

/**
 *
 * @author mauro.larese
 */
public class EmptyResponseFactory{
    public static OTAHotelAvailNotifRS newAvailNotifRS(){
        OTAHotelAvailNotifRS r = new OTAHotelAvailNotifRS();
        r.setVersion("1.000"); 
        return r;
    } 
    public static OTAHotelAvailNotifRS newAvailNotifRS(ErrorResultType er){
        OTAHotelAvailNotifRS r = newAvailNotifRS();
 
        Errors errors=new Errors();
        Errors.Error error = new Errors.Error();
        error.setCode( new BigInteger(ErrConsts.ERR_SYSTEM_ERROR));
        error.setType(ErrTypeConsts.EWT_UNKNOWN);
        error.setContent(er.getMessage());
        errors.getError().add(new Errors.Error());
        r.setErrors(errors);
        return r;
    }
     
    
    public static OTAHotelInvNotifRS newInvNotifRS(){
        OTAHotelInvNotifRS r = new OTAHotelInvNotifRS();
        r.setVersion("1.000");
        return r;
    } 
    public static OTAHotelInvNotifRS newInvNotifRS(SuccessResultType suc){
        OTAHotelInvNotifRS r = newInvNotifRS();
        r.setSuccess("");
        return r;
    } 
    public static OTAHotelInvNotifRS newInvNotifRS(ErrorResultType er){
        OTAHotelInvNotifRS r = newInvNotifRS();
        Errors.Error error=new Errors.Error();
        Errors errors = new Errors();
        
        error.setCode( new BigInteger(ErrConsts.ERR_SYSTEM_ERROR));
        error.setType(ErrTypeConsts.EWT_UNKNOWN);
        error.setContent(er.getMessage());
        
        errors.getError().add( error);
                
        r.setErrors(  errors  );
        
        return r;
    }
    
    public static OTAHotelRatePlanNotifRS newRatePlanNotifRS(){
        OTAHotelRatePlanNotifRS r = new OTAHotelRatePlanNotifRS();
        r.setVersion("1.000");
        return r;
    }
    
    public static OTAHotelRatePlanNotifRS newRatePlanNotifRS(ErrorResultType er){
        OTAHotelRatePlanNotifRS r = newRatePlanNotifRS();
        Errors errors=new Errors();
        Errors.Error error=new Errors.Error();
        error.setCode( new BigInteger(ErrConsts.ERR_SYSTEM_ERROR));
        error.setType(ErrTypeConsts.EWT_UNKNOWN);
        error.setContent(er.getMessage());
        errors.getError().add(error);
        r.setErrors(errors);
        return r;
    }
    
    public static OTANotifReportRS newNotifReportRS(){
        OTANotifReportRS r = new OTANotifReportRS();
        r.setVersion("1.000");
        return r;
    }
    
    public static OTANotifReportRS newNotifReportRS(ErrorResultType er){
        OTANotifReportRS r = newNotifReportRS();
         
        r.setSuccess("");
        return r;
    }
    
    public static OTAResRetrieveRS newResRetrieveRS(){
        OTAResRetrieveRS r = new OTAResRetrieveRS();
        r.setVersion("1.000");
        return r;
    }
    public static OTAResRetrieveRS newResRetrieveRS(ErrorResultType er){
        OTAResRetrieveRS r = newResRetrieveRS(); 
        OTAResRetrieveRS.Errors errors=new OTAResRetrieveRS.Errors();
        OTAResRetrieveRS.Errors.Error error= new OTAResRetrieveRS.Errors.Error();
        
        error.setCode( new BigInteger(ErrConsts.ERR_SYSTEM_ERROR));
        error.setType(ErrTypeConsts.EWT_UNKNOWN);
        error.setContent(er.getMessage());
        
        errors.getError().add(error);
        r.setErrors(errors);
        
        return r;
    }
    
}
