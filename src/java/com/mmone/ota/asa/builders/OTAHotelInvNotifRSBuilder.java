/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.ota.asa.builders.source.RoomsSource;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceContext;
import org.opentravel.ota._2003._05.OTAHotelInvNotifRS;
import org.opentravel.ota._2003._05.OTAHotelInvNotifRQ;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS;

/**
 *
 * @author mauro.larese
 */
public class OTAHotelInvNotifRSBuilder extends AbstractResponseBuilder{
    public OTAHotelInvNotifRSBuilder(OTAHotelInvNotifRQ request ,WebServiceContext webServiceContext,InitialContext initialContext){
        super(request, webServiceContext, initialContext);
    }
     
    @Override
    public OTAHotelInvNotifRQ getRequest(){
        return (OTAHotelInvNotifRQ)super.getRequest();
    }
    @Override
    public String getHotelCodeFromRequest() {
        return getRequest().getSellableProducts().getHotelCode();
    } 
    private OTAHotelInvNotifRS response =new OTAHotelInvNotifRS();
    @Override
    public OTAHotelInvNotifRS getResponse() {
        return response;
    }
    
    private void SellableProduct(OTAHotelInvNotifRQ.SellableProducts.SellableProduct sellableProduct){
        String roomCode = sellableProduct.getInvTypeCode();
        BigInteger qta = sellableProduct.getGuestRoom().getQuantities().getMaximumAdditionalGuests();
         
    }
    
    @Override
    public void buildResponse() {
        this.getResponse().setVersion("1.000");
        try {
            List<OTAHotelInvNotifRQ.SellableProducts.SellableProduct> sellableProducts =  this.getRequest().getSellableProducts().getSellableProduct() ;
            RoomsSource roomsSource;
            roomsSource = new RoomsSource(getRunner(), getRpcClient());
            for (OTAHotelInvNotifRQ.SellableProducts.SellableProduct sellableProduct : sellableProducts) {
                roomsSource.insertOrUpdateRoom(sellableProduct, new Integer(getHotelCode()) );
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(OTAHotelInvNotifRSBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(OTAHotelInvNotifRSBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }

    @Override
    public void fillErrors() {
         
        /*
        this.getResponse().setErrors( new OTAHotelRatePlanNotifRS.Errors());
          
         for (int i = 0; i < this.getErrors().size(); i++) {
            ErrorType error = this.getErrors().get(i);
            OTAHotelRatePlanNotifRS.Errors.Error er = new OTAHotelRatePlanNotifRS.Errors.Error();
             
            er.setCode( new BigInteger( error.getCode() ));
            er.setType(error.getType());
            er.setContent(error.getMessage());     
            this.getResponse().getErrors().getError().add(er);
        }*/
    }

    @Override
    public void fillWarnings() { 
        this.getResponse().setWarnings(new OTAHotelRatePlanNotifRS.Warnings());
        for (WarningType warning : this.getWarning()) {
            OTAHotelRatePlanNotifRS.Warnings.Warning wa = 
                    new OTAHotelRatePlanNotifRS.Warnings.Warning();   
            wa.setContent( warning.getMessage() );
            wa.setRecordID(warning.getCode());
            wa.setType( new BigInteger(warning.getType() ) );
            
            this.getResponse().getWarnings().getWarning().add(wa);
        }
   
    }

    /*
    @Override
    public void markSuccess() {
        this.getResponse().setSuccess(new Boolean(true));
    }*/

    @Override
    public void markSuccess() {
        this.getResponse().setSuccess(new String());
    }
}
