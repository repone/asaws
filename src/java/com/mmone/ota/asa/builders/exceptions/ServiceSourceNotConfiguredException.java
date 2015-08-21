/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.exceptions;

/**
 *
 * @author mauro.larese
 */
public class ServiceSourceNotConfiguredException extends Exception {

    /**
     * Creates a new instance of
     * <code>ServiceSourceNotConfiguredException</code> without detail message.
     */
    public ServiceSourceNotConfiguredException() {
    }

    /**
     * Constructs an instance of
     * <code>ServiceSourceNotConfiguredException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ServiceSourceNotConfiguredException(String msg) {
        super(msg);
    }
}
