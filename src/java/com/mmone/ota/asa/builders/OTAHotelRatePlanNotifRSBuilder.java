/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.ota.asa.builders.extractors.OtaRatePlaneNotifLengthOfStayExtractor;
import com.mmone.ota.asa.builders.extractors.OtaDowArrivalRestrictionsExtractor;
import com.mmone.ota.asa.builders.extractors.OtaDowDepartureRestrictionsExtractor;
import com.mmone.abs.api.rates.AbsBookingRule; 
import com.mmone.abs.api.rates.AbsContextRecord;
import com.mmone.abs.api.rates.AbsRate;
import com.mmone.abs.api.rates.BuildingResources;
import com.mmone.abs.api.rates.DowExtractor;
import com.mmone.abs.api.rates.RatePlanHelper;
import com.mmone.abs.helpers.DayRules;
import com.mmone.abs.helpers.ElaborationResultError;
import com.mmone.abs.helpers.ElaborationResultWarning;
import com.mmone.abs.helpers.ElaborationResults;
import com.mmone.abs.helpers.ErrConsts;
import com.mmone.abs.helpers.ErrTypeConsts;
import com.mmone.abs.helpers.exceptions.BuildErrorException;
import com.mmone.abs.helpers.exceptions.RateNotFoundException;
import com.mmone.abs.helpers.exceptions.RoomIdNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceContext;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.xmlrpc.XmlRpcClient;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRQ;
import org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
/**
 *
 * @author mauro.larese
 */
public class OTAHotelRatePlanNotifRSBuilder extends AbstractResponseBuilder{  
    public static final AbsContextRecord absContextRecord = OtaAbsContextRecordBuilder.build(); 
    public static final DayRules dayRules = new DayRules(); 
    private BuildingResources buildingResources=null;

    public BuildingResources getBuildingResources() throws MalformedURLException, NamingException {
        if(buildingResources==null){
            buildingResources= new BuildingResources();
            buildingResources
                .setRunner(getRunner())
                .setRpcClient(getRpcClient())
                .setHotelCode(getHotelId())
            ;
        }
        return buildingResources;
    }
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
    
    private OTAHotelRatePlanNotifRS response =EmptyResponseFactory.newRatePlanNotifRS() ;
    @Override
    public OTAHotelRatePlanNotifRS getResponse() {
        return response;
    }

    public String[] retrieveRoomCodes(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates rates){
        if(rates==null || rates.getRate()==null) return null;
        
        return retrieveRoomCodes(rates.getRate());
    }
    public String[] retrieveRoomCodes(List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate> rateList){
        String [] ret =new String[rateList.size()];
        
        for (int i = 0; i < rateList.size(); i++) {
            OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate rate = rateList.get(i);
            ret[i] = rate.getInvTypeCode();
        }
        
        return ret;
    }
    
    public void saveBookingRulesByRoomList(
            List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule> bkrulesList,
            String[] roomCodes,
            int rateId,
            int structureId
                    
    ){
        logger.info("[saveBookingRulesByRoomList]" );
        for (int i = 0; i < roomCodes.length; i++) {
            String roomCode = roomCodes[i];
            logger.info("[saveBookingRulesByRoomList] roomCode="+roomCode );
            int roomId;
            try {
                roomId = RatePlanHelper.getRoomId(this.getRunner(), roomCode, structureId);
            } catch (RoomIdNotFoundException ex) {
                logger.info("[buildResponse] room not found " + roomCode);
                continue;
            }
            saveBookingRules(bkrulesList,rateId,roomId);
        }
    }
    
    public void insertPricelist(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan ratePlan) throws MalformedURLException, NamingException, BuildErrorException{     
        List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate> rateList =
                ratePlan.getRates().getRate();
        
            for (OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate rate : rateList) { 
                RatePlanHelper.insertPricelists(
                    getBuildingResources(),
                    absContextRecord, 
                    dayRules, 
                    new RateBuilder(rate,ratePlan, getBuildingResources(), isDebug()).build()
            );
        }
        
        
                
    }
    @Override
    public void buildResponse() {
        //this.setDebug(true); 
        
        List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan> ratePlanList = 
                getRequest().getRatePlans().getRatePlan();
         
        for (OTAHotelRatePlanNotifRQ.RatePlans.RatePlan ratePlan : ratePlanList) { 
            if(ratePlan.getRatePlanNotifType().equals("New"))
                newAction(ratePlan);
            else if(ratePlan.getRatePlanNotifType().equals("Overlay"))
                overlayAction(ratePlan);
            else if(ratePlan.getRatePlanNotifType().equals("Delete"))
                removeAction(ratePlan);
            else{
                getElaborationResults().addError(
                    ErrConsts.ERR_INVALID_VALUE,
                    "Invalid RatePlanNotifType Action" ,
                        ErrTypeConsts.EWT_UNKNOWN
                );
            }
              
        }//for
     
    }
     
    public void saveBookingRules(
            List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule> bkrulesList,
            int listId,
            int roomId
    ){
        for (OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule bkrule : bkrulesList) {
            try {
                AbsBookingRule rule = prepareBookingRule(bkrule);
                if(isDebug()){
                    _pd(
                         " getMinStay="+rule.getMinStay()
                        +" getMaxStay="+rule.getMaxStay()
                        +" getStartDate="+rule.getStartDate()
                        +" getEndDate="+rule.getEndDate()
                    );
                }
                
                RatePlanHelper.setRestrictions(
                   this.getRunner(),
                   this.getElaborationResults(), 
                   listId,
                   this.getHotelId(),
                   roomId,
                   rule
                );
                
            } catch (Exception e) {
                logger.log(Level.SEVERE,"[saveBookingRules] RatePlanHelper.setRestrictions error" ,e);
            } 
        }
    }
    
    public void newAction(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan ratePlan){ }
     
    public void overlayAction(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan ratePlan){ 
        String rateCode = ratePlan.getRatePlanCode();
        int structureId = getHotelId();
        int rateId=-1;
        String[] roomCodes = retrieveRoomCodes(ratePlan.getRates());

        if(roomCodes==null){
            logger.info(" ratePlan " + rateCode +" has no rooms" ); 
            getElaborationResults().addError(
                    ErrConsts.ERR_INVALID_VALUE, 
                    " ratePlan " + rateCode +" has no rooms", 
                    ErrTypeConsts.EWT_REQUIRED_FIELD_MISSING);
            return;
        }

        if(rateCode.equals( absContextRecord.getNormalRateCode()  )){
            rateId=1;
        }else{    
            try {
                rateId=RatePlanHelper.getRateId(this.getRunner(), rateCode, structureId);   
            } catch (RateNotFoundException ex) { 
                logger.info("[buildResponse] rate not found " + rateCode);
                getElaborationResults().addError(
                    ErrConsts.ERR_INVALID_RATE_CODE, 
                    "rate not found " + rateCode, 
                    ErrTypeConsts.EWT_REQUIRED_FIELD_MISSING);
             
                return;
            }
        }

        try {
            insertPricelist(ratePlan);
            saveBookingRulesByRoomList(     
                ratePlan.getBookingRules().getBookingRule(),
                roomCodes,
                rateId,
                structureId
            );

        } catch (MalformedURLException ex) {
            Logger.getLogger(OTAHotelRatePlanNotifRSBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(OTAHotelRatePlanNotifRSBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BuildErrorException ex) {
            Logger.getLogger(OTAHotelRatePlanNotifRSBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void removeAction(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan ratePlan){ }
    
    public AbsBookingRule prepareBookingRule(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule otaBkRule){ 
        return new BookingRuleBuilder(otaBkRule,getElaborationResults(), isDebug()).build();        
    }

 
    @Override
    public void fillErrors() {
        List<ElaborationResultError> el= getElaborationResults().getErrors();
        for (ElaborationResultError error : el) {
            getErrors().add(new ErrorType(error.getType(), error.getCode(), error.getDescription()));
        }
         
    }

    @Override
    public void fillWarnings() {
        List<ElaborationResultWarning> wrs= getElaborationResults().getWarnings();
        for (ElaborationResultWarning war : wrs) {
            getWarning().add(new WarningType(war.getType(), war.getCode(), war.getDescription()));
        }
    }

    @Override
    public void markSuccess() {
        getResponse().setSuccess("");
    }
} 
