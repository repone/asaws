/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

/**
 *
 * @author mauro.larese
 */
public class ErrorType {
    private String type;
    private String code; 
    private String message;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    public ErrorType(String type, String code, String message){
        this.type=type;
        this.code=code;
        this.message=message;
    }
}
