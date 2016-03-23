/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.asa.helpers;
 

/**
 *
 * @author mauro.larese
 */
public class MealConstants {
    
    public static final int OTA_ALL_INCLUSIVE = 1;
    public static final int OTA_BB = 3; 
    public static final int OTA_FULL_BOARD = 10;
    public static final int OTA_HALF_BOARD = 12;
    public static final int OTA_ROOM_ONLY = 14;
    
    public static final int MM_ROOM_ONLY = 1;
    public static final int MM_BB = 2;
    public static final int MM_HALF_BOARD = 3;
    public static final int MM_FULL_BOARD = 4; 
    public static final int MM_ALL_INCLUSIVE = 5;
    
    
    public static final int[] OTA_TO_MM = {
        /*00*/ MM_ROOM_ONLY,
        /*01*/ MM_ALL_INCLUSIVE,
        /*02*/ MM_BB,
        /*03*/ MM_BB,
        /*04*/ MM_ROOM_ONLY,
        /*05*/ MM_ROOM_ONLY,
        /*06*/ MM_ROOM_ONLY,
        /*07*/ MM_ROOM_ONLY,
        /*08*/ MM_ROOM_ONLY,
        /*09*/ MM_ROOM_ONLY,
        /*10*/ MM_FULL_BOARD,
        /*11*/ MM_ROOM_ONLY,
        /*12*/ MM_HALF_BOARD,
        /*13*/ MM_ROOM_ONLY,
        /*14*/ MM_ROOM_ONLY
    };
}
