/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.source;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.apache.xmlrpc.XmlRpcClient;
import org.opentravel.ota._2003._05.OTAHotelInvNotifRQ;

/**
 *
 * @author mauro.larese
 */
public class RoomsSource {
    private QueryRunner run=null; 
    private final XmlRpcClient client;
    public RoomsSource (QueryRunner run,XmlRpcClient client){
          this.run=run;
          this.client=client;
    }
    
    public boolean roomExist(Integer hotelCode, String roomCode ){
        try {   
            Object res = run.query(
                    "select room_code from room  where room_code=? and structure_id=?",
                    new ScalarHandler("room_code"),
                    roomCode,
                    hotelCode
            );
              
            return (res!=null);
        } catch (SQLException ex) {
            Logger.getLogger(RoomsSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }
    
    public void insertOrUpdateRoom(OTAHotelInvNotifRQ.SellableProducts.SellableProduct sellableProduct,Integer hotelCode){
        boolean roomExist =  roomExist(hotelCode, sellableProduct.getInvTypeCode()) ;
        if(roomExist){
            
        }else{
        
        }
    }
}
