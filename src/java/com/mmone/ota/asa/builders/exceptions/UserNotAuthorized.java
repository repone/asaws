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
public class UserNotAuthorized extends Exception {

    /**
     * Creates a new instance of <code>UserNotAuthorized</code> without detail
     * message.
     */
    public UserNotAuthorized() {
    }

    /**
     * Constructs an instance of <code>UserNotAuthorized</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UserNotAuthorized(String msg) {
        super(msg);
    }
}
