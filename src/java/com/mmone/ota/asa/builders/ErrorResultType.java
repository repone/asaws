/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.asa.ports.*;

/**
 *
 * @author mauro.larese
 */
public class ErrorResultType implements ResponseResultType {
    private String message;
    public static final ErrorResultType buildingError = new ErrorResultType("Building error");
    
    public ErrorResultType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
}
