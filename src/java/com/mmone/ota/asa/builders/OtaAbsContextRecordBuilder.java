/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.abs.api.rates.AbsContextRecord;
import com.mmone.asa.helpers.MealConstants;

/**
 *
 * @author mauro.larese
 */
public class OtaAbsContextRecordBuilder {
    private static final AbsContextRecord buildInstance(){
        AbsContextRecord acr= new AbsContextRecord();
        
        acr .setNormalRateCode("normal-rate")
            .setSpecialRateCode("special-rate")
            .setUiCode("IU")
            .setTreatmentOBId(MealConstants.MM_ROOM_ONLY)
            .setTreatmentBBId(MealConstants.MM_BB)
            .setTreatmentHBId(MealConstants.MM_HALF_BOARD)
            .setTreatmentFBId(MealConstants.MM_FULL_BOARD)
            .setTreatmentP3Id(6)
            .setTreatmentAIId(MealConstants.MM_ALL_INCLUSIVE);
                
        
        return acr;
    }
    private static final AbsContextRecord instance = buildInstance();
            
    public static AbsContextRecord build(){ 
        return instance;
    }
}