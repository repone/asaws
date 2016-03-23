/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.abs.helpers.exceptions.BuildErrorException;

/**
 *
 * @author mauro.larese
 */
public interface Builder<T> {
    T build( )throws BuildErrorException; 
}
