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
public class DateStartNotSetException extends Exception {

    /**
     * Creates a new instance of <code>DateStartNotSetException</code> without
     * detail message.
     */
    public DateStartNotSetException() {
    }

    /**
     * Constructs an instance of <code>DateStartNotSetException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DateStartNotSetException(String msg) {
        super(msg);
    }
}
