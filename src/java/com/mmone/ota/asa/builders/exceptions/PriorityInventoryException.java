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
public class PriorityInventoryException extends Exception {

    /**
     * Creates a new instance of <code>PriorityInventoryException</code> without
     * detail message.
     */
    public PriorityInventoryException() {
    }

    /**
     * Constructs an instance of <code>PriorityInventoryException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public PriorityInventoryException(String msg) {
        super(msg);
    }
}
