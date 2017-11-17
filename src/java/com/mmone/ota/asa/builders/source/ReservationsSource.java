/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.source;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.xmlrpc.XmlRpcClient;
import com.mmone.ota.asa.builders.Facilities;
import com.mmone.ota.asa.builders.ResponseBuilder;
import com.mmone.ota.asa.builders.exceptions.PriorityInventoryException;
import com.mmone.ota.asa.builders.exceptions.ReservationNotFoundException;
import com.mmone.ota.asa.builders.exceptions.RoomIdNotFoundException;
import java.net.URL;
import java.util.Iterator;
import org.apache.xmlrpc.AsyncCallback;
 
public  class  ReservationsSource { 
    private QueryRunner run=null; 
    public ReservationsSource (QueryRunner run,XmlRpcClient client){
          this.run=run;
          this.client=client;
    }
    XmlRpcClient client=null;
    public   String SELECT_RESERVATIONS = ""
            + " SELECT "
            + "   reservation.*, "
            + "   ota_reservation_download.context_id AS context_id, "
            + "    ((SELECT MAX(reservation_status_date) FROM reservation_status"
            + " WHERE reservation_status.reservation_id=reservation.reservation_id)) AS reservation_status_date, "
            + "    ota_reservation_download.last_check_date "
            + " FROM reservation "
            + " LEFT JOIN ota_reservation_download ON ( "
            + "    ota_reservation_download.reservation_id = reservation.reservation_id "
            + "    AND ota_reservation_download.context_id = ? "
            + " ) "
            + " WHERE  ( "
            + "           NOT  ("
            + "               (SELECT MAX(reservation_status_date) FROM reservation_status "
            + "                     WHERE reservation_status.reservation_id=reservation.reservation_id)"   
            + "                     = last_check_date "
            + "           ) "
            + "           OR   (last_check_date IS NULL) "
            + "        ) "
            + "        AND structure_id = ? "
            + "        AND (reservation_type=1) "
            + "        AND (reservation.portal_id>=? OR reservation.portal_id>0)  "
            ;
    
    public   final String SQL_INSERT_RESERVATION_DOWNLOADED_RECORD_AUTO = ""
            + " INSERT INTO ota_reservation_download"
            + " ( context_id, confirmation_number, reservation_id, last_check_date,creation_date )"
            + " VALUES "
            + " ( ?, ?, ?,  (SELECT MAX(reservation_status_date) FROM reservation_status WHERE reservation_status.reservation_id=?)   ,  ?)"
            + "";
    
    public   final String SQL_INSERT_RESERVATION_DOWNLOADED_RECORD = ""
            + " INSERT INTO ota_reservation_download"
            + " ( context_id, confirmation_number, reservation_id, last_check_date,creation_date )"
            + " VALUES "
            + " ( ?, ?, ?, ?, ?)"
            + "";
    
    public   final String SQL_UPDATE_RESERVATION_DOWNLOADED_RECORD = ""
            + " UPDATE ota_reservation_download"
            + " SET "
            + " last_check_date=? "
            + " WHERE "
            + " context_id=? "
            + " AND reservation_id=? "
            + "";
    public   final String SQL_UPDATE_RESERVATION_DOWNLOADED_RECORD_AUTO = ""
            + " UPDATE ota_reservation_download"
            + " SET "
            + " last_check_date=(SELECT MAX(reservation_status_date) FROM reservation_status WHERE reservation_status.reservation_id=?) "
            + " WHERE "
            + " context_id=? "
            + " AND reservation_id=? "
            + "";
    
    public   String SELECT_RESERVATIONS_BY_NUMBER = "reservation_id from reservation where reservation_number = ? ";
    public   String SELECT_RESERVATIONS_FROM_DATE = SELECT_RESERVATIONS + 
            "         AND reservation_opened_date>= ?";
            
    public   List<Map<String, Object>> retrieveReservations(String hotelCode, Object contextId,int portalId,Date fromDate) throws SQLException {         
        Object ret=null;
        if(fromDate==null)
            ret= run.query(SELECT_RESERVATIONS, new MapListHandler(), contextId, hotelCode,portalId);
        else
            ret= run.query(SELECT_RESERVATIONS_FROM_DATE, new MapListHandler(), contextId, hotelCode,portalId,fromDate);
       
        return (List<Map<String, Object>>) ret;
    }
     
    public   List<Map<String, Object>> retrieveReservationDetail( Integer reservationId) throws Exception { 
        List<Map<String, Object>> reservationDetail = null;
        if (reservationId == null) {
            reservationDetail = new ArrayList<Map<String, Object>>(); 
        } else {
            String reservationDetailQry = " SELECT  ifnull(  multirate.multirate_code,'rate' ) as mr_code , reservation_detail.* "
                                         +" FROM reservation_detail "
                                         +" left join multirate on multirate.multirate_id=reservation_detail.reservation_detail_list_id "   
                                         +" WHERE reservation_id=? AND reservation_detail_type='R' "    ;
            
            reservationDetail = run.query( reservationDetailQry , new MapListHandler(), reservationId); 
        }

        return reservationDetail;
    }
    
    public   Integer getReservationIdByNumber(String number ) throws ReservationNotFoundException{
        Integer resId = null;   
        try { 
            resId = (Integer)run.query(SELECT_RESERVATIONS_BY_NUMBER, new ScalarHandler("reservation_number"), number ) ; 
        } catch (Exception ex) { 
            throw new ReservationNotFoundException("Error retrieving reservation id. Message= "+ex.getMessage());
        }   
        
        if (resId == null) {
            throw new ReservationNotFoundException("Error retrieving reservation id. Message= Reservation number not found");
        }  
        return resId;
    }
    public   void insertOrUpdateDownloadRecord( 
            Object contextId, 
            String confirmationNumber, 
            Object reservationId, 
            Timestamp lastCheckDate) throws Exception {
 
        Timestamp today = new Timestamp(new java.util.Date().getTime());

        try {
            if (lastCheckDate == null) {
                run.update(SQL_INSERT_RESERVATION_DOWNLOADED_RECORD_AUTO, contextId, confirmationNumber, reservationId, reservationId, today);
            } else {
                run.update(SQL_INSERT_RESERVATION_DOWNLOADED_RECORD, contextId, confirmationNumber, reservationId, lastCheckDate, today);
            }
            return;
        } catch (SQLException e) { 
        } catch (Exception e) {
            throw e;
        }

        try {
            if (lastCheckDate == null) {
                run.update(SQL_UPDATE_RESERVATION_DOWNLOADED_RECORD_AUTO, reservationId, contextId, reservationId);
            } else {
                run.update(SQL_UPDATE_RESERVATION_DOWNLOADED_RECORD, lastCheckDate, contextId, reservationId);
            }
        } catch (Exception e) {
            throw e;
        }

    }
    
    public   Integer getRoomIdByCode(String invCode,Integer hotelCode) throws RoomIdNotFoundException{  
        String sqlChkRoom = "SELECT room_id FROM room WHERE room_code=? AND structure_id=? ";
        Integer roomId=null; 
        try {
            roomId = (Integer) run.query(sqlChkRoom, new ScalarHandler("room_id"), invCode, hotelCode);
        } catch (Exception ex) {
            throw new RoomIdNotFoundException("Error retrieving room "+invCode+"  message = "+ex.getMessage()); 
        }
        if(roomId == null){
            throw new RoomIdNotFoundException("Error retrieving room "+invCode + " @invcode invalid"); 
        }
        return roomId; 
    }
    
    public   Integer getRoomIdByCode(String invCode,String hotelCode) throws RoomIdNotFoundException{   
        return getRoomIdByCode(invCode,new Integer(hotelCode)); 
    }
    public static final String AVAIL_ACTION_SET = "set";
    
    public static final String INVENTORY_IU = "1";
    public static final String INVENTORY_CM = "2";
    public static final String RATE_PLAN_CODE_NR = "NR";
    public static final String RATE_PLAN_CODE_IU = "IU";
    public static final int XRPC_SET_ALLOTMENT_RESULT_ERROR = -1;
    public static final int XRPC_SET_ALLOTMENT_RESULT_NO_VIRTUAL_ROOM = 1;
    public static final int XRPC_SET_ALLOTMENT_RESULT_VIRTUAL_ROOM_OK = 0;
    
    public static String sqlInsInventory = ""
                    + " INSERT INTO inventory ("
                    + "     room_id, "
                    + "     inventory_type_id, " //1
                    + "     allotment_date, "
                    + "     allotment_number, "
                    + "     minimum_allotment_number, "
                    + "     inventory_modified_date, "
                    + "     inventory_modified_user "
                    + ")"
                    + " VALUES (?,?,?,?,?,?,?) "
                    + " ON DUPLICATE KEY UPDATE "
                    + "     allotment_number=?, "
                    + "     minimum_allotment_number=?, "
                    + "     inventory_modified_date=?, "
                    + "     inventory_modified_user=? "
                    + "";

    public static String sqlInsAllotment  = ""
                + " INSERT INTO allotment (" 
                + " structure_id,"
                + " list_id, "
                + " room_id, "
                + " thedate, " 
                + " availability"
                + ")"
                + " VALUES (?,?,?,?,?) "
                + " ON DUPLICATE KEY UPDATE " 
                + " thedate=?, " 
                + " availability=?"
                + "";
    
    //recupero quanti allotment sono presenti nei listini
    public static String sqlInvent = ""
                    + "SELECT sum(allotment_number) as sum_of_allot "
                    + " FROM inventory "
                    + " WHERE "
                    + " room_id = ? "
                    + " AND allotment_date = ? "
                    + " AND inventory_type_id = ? "
                    + " AND allotment_number IS NOT NULL"
                    + "";

            //recupero quanti allotment sono presenti nei listini
    public static String sqlAllot = ""
                    + "SELECT sum(availability) as sum_of_avail "
                    + " FROM allotment "
                    + " WHERE "
                    + " room_id = ? "
                    + " AND thedate = ? "
                    + "";

    public static String sqlResetAllotment = ""
                    + " INSERT INTO allotment ("
                    + "     structure_id,"
                    + "     list_id, "
                    + "     room_id, "
                    + "     thedate, "
                    + "     availability"
                    + ")"
                    + " VALUES (" + "?, ?, ?, ?, ?" + ") "
                    + " ON DUPLICATE KEY UPDATE "
                    + "     thedate = ?, "
                    + "     availability = ?"
                    + "";
            // DEBUG
            //System.out.println("SqlInsAllotment: "  + sqlInsAllotment);

    public static String sqlInsertInventoryIssues = ""
                    + " INSERT INTO inventory_issues ("
                    + "      structure_id,"
                    + "      room_id,"
                    + "      issue_date,"
                    + "      accomplished"
                    + ")"
                    + " VALUES (" + "?, ?, ?, ?" + ")";

    public static String sqlUpdateInventoryIssues = ""
                    + " UPDATE inventory_issues SET"
                    + "       accomplished = ?"
                    + " WHERE"
                    + "      structure_id = ?"
                    + " AND"
                    + "      room_id = ?"
                    + " AND"
                    + "      issue_date = ?";
    
    public static String sqlUpdateNormalRateRestrictions = ""
                    + " UPDATE allotment SET" 
                    + " thedate = ? "
                    + " WHERE structure_id = ? AND "
                    + "     list_id = ? AND "
                    + "     room_id = ? AND "
                    + "     thedate = ?";
    
    
    public int getPriorityInventory (Integer hotelCode) throws PriorityInventoryException{ 
        String sqlListPri = "SELECT list_id from priority_inventory WHERE structure_id = ? ";
        int priorityInventoryId = -1;

        try {
            priorityInventoryId = (Integer) run.query(sqlListPri, new ScalarHandler("list_id"), hotelCode);
        } catch (Exception e) {
            throw new PriorityInventoryException("System Error: priority inventory not valid"); 
        }

        if (priorityInventoryId <= 0) {
            throw new PriorityInventoryException("System Error: priority inventory not found"); 
        }
        
        return priorityInventoryId;
    }
    
    public void doSave(Integer hotelCode,java.util.Date startDt, java.util.Date endDt, Integer roomId ,int bookingLimit){
         
        try { 
            int iBookingLimit = new Integer(bookingLimit);
         
            int xrpcresult = modifyAllotment(startDt,endDt, AVAIL_ACTION_SET,iBookingLimit,0,roomId,hotelCode); 
            
            Logger.getLogger(this.getClass().getName()).log(Level.INFO, "xrpcresult="+xrpcresult );    
        } catch (Exception e) { 
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
        }  
    }
    public void doSave(int period,Integer hotelCode,java.util.Date startDt,  Integer roomId ,int bookingLimit,int priorityInventoryId) { 
        Connection conn = null; 
 
        try {  
            java.util.Date today = new java.util.Date();
            conn = run.getDataSource().getConnection();
            conn.setAutoCommit(false);
 
            String sqlAllotLp = sqlAllot + " AND list_id = ? ";

            PreparedStatement psSqlInsInventory = conn.prepareStatement(sqlInsInventory);
            PreparedStatement psSqlInsAllotment = conn.prepareStatement(sqlInsAllotment);
            PreparedStatement psSqlResetAllotment = conn.prepareStatement(sqlResetAllotment);
            PreparedStatement psSqlInsInventoryIssues = conn.prepareStatement(sqlInsertInventoryIssues);
            PreparedStatement psSqlUpdInventoryIssues = conn.prepareStatement(sqlUpdateInventoryIssues); 
            PreparedStatement psSqlUpdNormalRateRestrictions = conn.prepareStatement(sqlUpdateNormalRateRestrictions);
     
            StringBuffer track = new StringBuffer();
            
            
            for (int i = 0; i <= period; i++) {
                java.util.Date curDate = DateUtils.addDays(startDt, i);
                
                int sumOfCMAllot = 0;
                try {
                    sumOfCMAllot = new Integer(run.query(sqlInvent, new ScalarHandler("sum_of_allot"), roomId, curDate, INVENTORY_CM).toString());
                } catch (Exception e) {
                    //
                }

                int sumOfAvailTuttiListini = 0;
                try {
                    sumOfAvailTuttiListini = new Integer(run.query(sqlAllot, new ScalarHandler("sum_of_avail"), roomId, curDate).toString());
                } catch (Exception e) {
                    //
                }
                sumOfAvailTuttiListini = sumOfAvailTuttiListini + sumOfCMAllot;

                int sumOfAvailLp = 0;
                try {
                    sumOfAvailLp = new Integer(run.query(sqlAllotLp, new ScalarHandler("sum_of_avail"), roomId, curDate, priorityInventoryId).toString());
                } catch (Exception e) {
                    //
                }
                int sumOfAvailAltriListini = sumOfAvailTuttiListini - sumOfAvailLp;

                int iBookingLimit = new Integer(bookingLimit);
                int curAllotment = iBookingLimit - sumOfAvailAltriListini;

                int onlyIU = 0; // cotrollo in riduzione 
                if (curAllotment < 0 && iBookingLimit != 0) {
                    onlyIU = 1;  
                }
                onlyIU = 0;
                int xrpcresult = modifyAllotment(curDate, AVAIL_ACTION_SET,iBookingLimit,0,roomId,hotelCode); 
                
                track.append("\n<br>xrpcresult");
                 if (xrpcresult == XRPC_SET_ALLOTMENT_RESULT_ERROR) {
                     Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Stop procedure " ); 
                     return;
                 }else if (xrpcresult == XRPC_SET_ALLOTMENT_RESULT_NO_VIRTUAL_ROOM) { //faccio insert a mano
                    if (iBookingLimit == 0) {
                        track.append("\n<br>iBookingLimit == 0");    
                        Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Bookinglimit = 0 " );    
                        // Inventory IU
                        fillInsertInventoryParameters(psSqlInsInventory, curDate, today, INVENTORY_IU, iBookingLimit,roomId);
                        psSqlInsInventory.execute();
                        track.append("\n<br>iBookingLimit == 0 fillInsertInventoryParameters");
                        // Inventory CM
                        fillInsertInventoryParameters(psSqlInsInventory, curDate, today, INVENTORY_CM, iBookingLimit,roomId);
                        psSqlInsInventory.execute();

                        // tutti i listini
                        String listId = "1"; // normal rate
                        fillInsertResetAllotment(psSqlResetAllotment, listId, curDate,hotelCode,roomId);
                        psSqlResetAllotment.execute();
                        track.append("\n<br>iBookingLimit == 0 fillInsertResetAllotment");
                        listId = "2"; // special rate
                        fillInsertResetAllotment(psSqlResetAllotment, listId, curDate,hotelCode,roomId);
                        psSqlResetAllotment.execute();

                        // multilistini
                        List<Map<String, Object>> lMultirate = null;
                        String sqlMultirate = "SELECT multirate_id "
                                + " FROM multirate WHERE structure_id = ?";

                        try {
                            track.append("\n<br>iBookingLimit == 0 lMultirate");
                            lMultirate = run.query(sqlMultirate, new MapListHandler(), hotelCode);
                        } catch (SQLException e) {
                            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
                        }

                        if (lMultirate != null) {
                            for (Map<String, Object> multirate : lMultirate) {
                                listId = multirate.get("multirate_id").toString();
                                fillInsertResetAllotment(psSqlResetAllotment, listId, curDate,hotelCode,roomId);
                                psSqlResetAllotment.execute();
                            }
                        }

                        // ABS GATEWAY
                        
                        try {
                            track.append("\n<br>iBookingLimit == 0 updateAbsGateway");
                            updateAbsGateway(curDate,hotelCode,roomId); // boolean
                        } catch (SQLException e) {
                            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
                            //// addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on update IDS");
                        } catch (Exception e) {
                            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
                            //// addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on update structure " + e.getMessage());
                        }

                        // CM GATEWAY
                        try {
                            track.append("\n<br>iBookingLimit == 0 updateCMGateway");
                            updateCMGateway(curDate,hotelCode);
                        } catch (Exception e) {
                        }
                          
                         
 

                    } else { // solo inventario unico e tariffa prioritaria
                        // Inventory IU
                        track.append("\n<br>iBookingLimit > 0  ");
                        Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Bookinglimit != 0 " );
                        fillInsertInventoryParameters(psSqlInsInventory, curDate, today, INVENTORY_IU, iBookingLimit,roomId);
                        psSqlInsInventory.execute();
                        track.append("\n<br>iBookingLimit > 0  fillInsertInventoryParameters");
                        if (onlyIU == 0) { // Tariffa prioritaria
                            track.append("\n<br>iBookingLimit > 0  onlyIU == 0");
                            fillUpdateInventoryIssues(psSqlUpdInventoryIssues, curDate, 1,hotelCode,roomId);
                            psSqlUpdInventoryIssues.execute();
                            track.append("\n<br>iBookingLimit > 0  onlyIU == 0 fillUpdateInventoryIssues");
                            fillInsertAllotmentParameters(psSqlInsAllotment, curDate, new Integer(priorityInventoryId).toString(), curAllotment,hotelCode,roomId); // listino prioritario
                            psSqlInsAllotment.execute();
                            track.append("\n<br>iBookingLimit > 0  onlyIU == 0 fillInsertAllotmentParameters");
                            // aggiorna eventuali restrictions nel normal rate
                            try {
                                track.append("\n<br>iBookingLimit > 0  onlyIU == 0 fillUpdateNormalRateRestrictions");
                                fillUpdateNormalRateRestrictions(psSqlUpdNormalRateRestrictions, curDate,hotelCode,roomId);
                                psSqlUpdNormalRateRestrictions.execute();
                                track.append("\n<br>iBookingLimit > 0  onlyIU == 0 fillUpdateNormalRateRestrictions -- done");
                            } catch (Exception e) {
                                System.out.println("psSqlUpdNormalRateRestrictions "+e.getMessage()); 
                                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE,"psSqlUpdNormalRateRestrictions error ",e);
                            }
                        } else if (onlyIU == 1) { // aggiorna giorni errati
                            track.append("\n<br>iBookingLimit > 0  onlyIU == 1 fillUpdateInventoryIssues");
                            fillUpdateInventoryIssues(psSqlUpdInventoryIssues, curDate, 1 ,hotelCode,roomId);
                            psSqlUpdInventoryIssues.execute();
                            track.append("\n<br>iBookingLimit > 0  onlyIU == 1 fillInsertInventoryIssues");
                            fillInsertInventoryIssues(psSqlInsInventoryIssues, curDate, 0,hotelCode,roomId);
                            psSqlInsInventoryIssues.execute();
                        }
                    }
                }
            
            }
       
        } catch (Exception e) {
            //// addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "SOAP Server. Insert data failed");
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            DbUtils.rollbackAndCloseQuietly(conn);
        } finally {
            DbUtils.commitAndCloseQuietly(conn);
        }
    }
    
    private String getSqlInsertAllotmentGateway() {
        String sqlIns = ""
                + " INSERT INTO allotment (" 
                + "     structure_id,"
                + "     list_id, "
                + "     room_id, "
                + "     thedate, " 
                + "     availability"
                + ")"
                + " VALUES (" 
                + "?,?,?,?,?) "
                + " ON DUPLICATE KEY UPDATE " 
                + "     thedate=?, " 
                + "     availability=?"
                + "";

        return sqlIns;

    }
    
    private boolean updateAbsGateway( java.util.Date curDate,Integer hotelCode,Integer invCode) throws SQLException {
        // ABS GATEWAY
        List<Map<String, Object>> absGatewayMapUser = null;
        String sqlAbsGatewayMapUser = "SELECT abs_gateway_id, remote_structure_id FROM abs_gateway_map_user WHERE structure_id = ?";

        // recuper abs gateway collegati e id struttura remota
        try {
            absGatewayMapUser = run.query(sqlAbsGatewayMapUser, new MapListHandler(), hotelCode);
        } catch (SQLException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
            return false;
        }

        if (absGatewayMapUser != null) { // esiste almeno un collegamento
            for (Map<String, Object> record : absGatewayMapUser) { // ciclo per ogni gateway collegato
                String absGatewayId = record.get("abs_gateway_id").toString();
                String remoteStructureId = record.get("remote_structure_id").toString();

                Map absGateway = null;
                String sqlAbsGateway = "SELECT abs_host, abs_database, abs_database_user, abs_database_password"
                        + " FROM abs_gateway WHERE abs_gateway_id = ?";

                try {
                    absGateway = run.query(sqlAbsGateway, new MapHandler(), absGatewayId);
                } catch (SQLException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
                    return false;
                }

                // lettura room id
                List<Map<String, Object>> absGatewayRemoteRoom = null;
                String sqlAbsGatewayRemoteRoom = "SELECT abs_gateway_remote_room_id"
                        + " FROM abs_gateway_map_room WHERE abs_gateway_id = ? AND structure_id = ? AND abs_gateway_local_room_id = ?";

                try {
                    absGatewayRemoteRoom = run.query(sqlAbsGatewayRemoteRoom, new MapListHandler(), absGatewayId, hotelCode,invCode);
                } catch (SQLException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
                    return false;
                }

                // connessione DB
                Connection connAbsGateway = jdbcGatewayConnection(absGateway.get("abs_host").toString(), absGateway.get("abs_database").toString(),
                absGateway.get("abs_database_user").toString(), absGateway.get("abs_database_password").toString());

                if (connAbsGateway != null) {
                    connAbsGateway.setAutoCommit(false);

                    for (Map<String, Object> roomRecord : absGatewayRemoteRoom) {
                        
                        String remoteRoomId = roomRecord.get("abs_gateway_remote_room_id").toString();
                        PreparedStatement psSqlInsertAbsGatewayAllotment = connAbsGateway.prepareStatement(getSqlInsertAllotmentGateway());

                        // normal rate
                        fillInsertAbsGatewayAllotmentParameters(psSqlInsertAbsGatewayAllotment, remoteStructureId, curDate, "1", remoteRoomId, 0);
                        psSqlInsertAbsGatewayAllotment.execute();

                        // special rate
                        fillInsertAbsGatewayAllotmentParameters(psSqlInsertAbsGatewayAllotment, remoteStructureId, curDate, "2", remoteRoomId, 0);
                        psSqlInsertAbsGatewayAllotment.execute();
                    }
                    
                    connAbsGateway.commit();
                    connAbsGateway.close();
                } else {
                    // addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on updating remote structure");
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private boolean updateCMGateway(java.util.Date curDate,Integer hotelCode) throws Exception {

        Vector parameters = null;
        String CM_STORAGE_METHOD = "2";

        // recupera i dati dei CM della struttura se presenti
        List<Map<String, Object>> CMGateway = null;
        String sqlCMGateway = ""
                + "SELECT user_id,channel_manager.cm_id,cm_structure_id,cm_storage_method FROM channel_manager_map_user "
                + "LEFT JOIN channel_manager ON channel_manager_map_user.cm_id = channel_manager.cm_id "
                + "WHERE structure_id = ? AND cm_status = ?";

        try {
            CMGateway = run.query(sqlCMGateway, new MapListHandler(), hotelCode, 1);
        } catch (SQLException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
            //// addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on updating CM");
            return false;
        }

        if (CMGateway == null) {
            return false;
        }
        // cicla per ogni CM collegato alla struttura
        for (Map<String, Object> cm : CMGateway) {
            parameters=new Vector();
            String userId = cm.get("user_id").toString();
            String cmStructureId = cm.get("cm_structure_id").toString();
            String cmId = cm.get("cm_id").toString();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            
            try{
                System.out.println(" userId : " + userId);
                System.out.println(" cmStructureId : " + cm.get("cm_structure_id").toString());
                System.out.println(" cm_id : " + cm.get("cm_id").toString() );
                System.out.println(" curDate : " + df.format(curDate).toString() );
            }catch(Exception e){}
            
            
            parameters.add(new Integer(cmId));
            parameters.add(new Integer(hotelCode));
            parameters.add(df.format(curDate).toString());
            parameters.add(df.format(curDate).toString());
            
            try {
                System.out.println(" client.execute .... " );
                Object result = client.execute("backend.resetCMallotment", parameters);
                System.out.println(" client.execute end " );
            } catch (Exception e) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
                //// addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on updating CM resetCMallotment");
                return false;
            }

            // scrive allotment su DB
            if (cm.get("cm_storage_method").toString().equals(CM_STORAGE_METHOD)) {
                // room
                List<Map<String, Object>> CMrooms = null;
                String sqlCMRooms = "SELECT cm_room_id FROM channel_manager_map_room WHERE cm_id = ? AND cm_structure_id = ?";

                try {
                    CMrooms = run.query(sqlCMRooms, new MapListHandler(), cmId, cmStructureId);
                } catch (Exception e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
                    // addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on updating CM");
                    return false;
                }

                // rate
                for (Map<String, Object> CMroom : CMrooms) {
                    
                    String cmRoomId = CMroom.get("cm_room_id").toString();

                    List<Map<String, Object>> CMlists = null;
                    String sqlCMLists = "SELECT cm_pricelist_id FROM channel_manager_map_pricelist WHERE cm_id = ? AND cm_room_id = ?";

                    try {
                        CMlists = run.query(sqlCMLists, new MapListHandler(), cmId, cmRoomId);
                    } catch (Exception e) {
                        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
                        //// addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on updating CM");
                        return false;
                    }

                    for (Map<String, Object> CMlist : CMlists) {
                        String sqlInsertCM = ""
                                + "INSERT INTO channel_manager_allotments ("
                                + "cm_id, "
                                + "cm_structure_id, "
                                + "cm_room_id, "
                                + "cm_list_id, "
                                + "allotment_date, "
                                + "allotment_number, "
                                + "allotment_modified_user) "
                                + "VALUES(?, ?, ?, ?, ?, ?, ?) "
                                + "ON DUPLICATE KEY UPDATE "
                                + "cm_id = ?, "
                                + "cm_structure_id = ?, "
                                + "cm_room_id = ?, "
                                + "cm_list_id = ?, "
                                + "allotment_date = ?, "
                                + "allotment_number = ?, "
                                + "allotment_modified_user = ?";

                        try {
                            run.update(sqlInsertCM,
                                    cmId, cmStructureId,
                                    cmRoomId,
                                    CMlist.get("cm_pricelist_id").toString(),
                                    curDate, 0, -1,
                                    cmId, cmStructureId,
                                    cmRoomId,
                                    CMlist.get("cm_pricelist_id").toString(),
                                    curDate, 0, -1);
                        } catch (SQLException e) {
                            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
                            // addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on updating CM");
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    // Connette al database dei gateway
    private Connection jdbcGatewayConnection(String host, String dbName, String userName, String password) {
        Connection conn = null;
 
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + dbName, userName, password);
            //conn = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + dbName + "?user=" + userName + "&password=" + password);
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
        }

        return conn;
    }

    private int modifyAllotment(
            java.util.Date dateStart,
            java.util.Date dateEnd,
            String action,
            int availability,
            int reservation,
            Integer invCode,
            Integer hotelCode){
        
        Vector parameters=new Vector();   
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        parameters.add(new Integer(hotelCode)); //1
        parameters.add(new Integer(invCode)); //2
        //todo gestire con inventario unico -1
        int rate = 1; ///fisso nr da verificare per iu
        parameters.add(new Integer(rate)); //3 offerta
        parameters.add(new Integer(availability)); //4 disponibilità
        parameters.add(new Integer(reservation)); //5 prenotazione
        parameters.add(action); //6  Azione : set,increase,decrease
        parameters.add(df.format(dateStart).toString());  //7
        parameters.add(df.format(dateEnd).toString());  //8
        Vector result = new Vector();
        int ret = XRPC_SET_ALLOTMENT_RESULT_ERROR;
        
        String logData = 
                        "hotelCode="+hotelCode
                    +   " - invCode="+invCode
                    +   " - offerta="+rate
                    +   " - availability="+availability
                    +   " - reservation="+reservation
                    +   " - action="+action
                    +   " - dateStart="+df.format(dateStart).toString()
                    +   " - dateEnd="+df.format(dateEnd).toString()
                    
                    
            ;        
            Logger.getLogger(this.getClass().getName()).log(Level.INFO, logData);
            
        try { 
            
            AsyncCallback handler = new AsyncCallback() {
                @Override
                public void handleResult(Object o, URL url, String string) {
                    Logger.getLogger(this.getClass().getName()).log(Level.INFO, "--- handleResult " + o.toString());
                }

                @Override
                public void handleError(Exception excptn, URL url, String string) {
                   Logger.getLogger(this.getClass().getName()).log(Level.INFO, "--- handleError");
                }
            };
            
            client.executeAsync("backend.modifyAllotment", parameters, handler); 
            if(true) {
                return 0;
            }
            
            
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
            // addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on updating  allotment (modifyAllotment)");
            return ret ;
        }
        
        try{
            Map hret = (Map)result.get(0); 
            ret = new Integer(  (String)hret.get("unique_allotment_service_response") );  
            
        }catch(Exception e){
                        

        }
        try { 
            Map hret = (Map)result.get(0); 
            ret = new Integer(  (String)hret.get("unique_allotment_service_response") );  
            Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Xrpc done " );
             
            Logger.getLogger(this.getClass().getName()).log(Level.INFO, "ret value " + ret );     
        } catch (NullPointerException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);    
            return XRPC_SET_ALLOTMENT_RESULT_NO_VIRTUAL_ROOM ;
        } catch (ClassCastException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
            return XRPC_SET_ALLOTMENT_RESULT_NO_VIRTUAL_ROOM ;    
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
            return XRPC_SET_ALLOTMENT_RESULT_NO_VIRTUAL_ROOM ;
        }
        
        return ret;
    }
    
    private int modifyAllotment(
            java.util.Date curDate,
            String action,
            int availability,
            int reservation,
            Integer invCode,
            Integer hotelCode){
        
        Vector parameters=new Vector();   
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        parameters.add(new Integer(hotelCode)); //1
        parameters.add(new Integer(invCode)); //2
        parameters.add(new Integer(-1)); //3 offerta
        parameters.add(new Integer(availability)); //4 disponibilità
        parameters.add(new Integer(reservation)); //5 prenotazione
        parameters.add(action); //6  Azione : set,increase,decrease
        parameters.add(df.format(curDate).toString());  //7
        parameters.add(df.format(curDate).toString());  //8
        Vector result = new Vector();
        int ret = XRPC_SET_ALLOTMENT_RESULT_ERROR;
        try { 
            AsyncCallback handler = new AsyncCallback() {
                @Override
                public void handleResult(Object o, URL url, String string) {
                    Logger.getLogger(this.getClass().getName()).log(Level.INFO, "--- handleResult");
                }

                @Override
                public void handleError(Exception excptn, URL url, String string) {
                   Logger.getLogger(this.getClass().getName()).log(Level.INFO, "--- handleError");
                }
            };
            
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "-------------- backend.modifyAllotment executeAsync");
            client.executeAsync("backend.modifyAllotment", parameters, handler); 
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "----------------backend.modifyAllotment executeAsync");
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
            // addError(ResponseBuilder.EWT_UNKNOWN, ResponseBuilder.ERR_SYSTEM_ERROR, "Error on updating  allotment (modifyAllotment)");
            return ret ;
        }
        
        if(true){
            return 0;
        }
        try { 
            Map hret = (Map)result.get(0); 
            ret = new Integer(  (String)hret.get("unique_allotment_service_response") );  
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Xrpc done " );
             
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "ret value " + ret );     
        } catch (NullPointerException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);    
            return XRPC_SET_ALLOTMENT_RESULT_NO_VIRTUAL_ROOM ;
        } catch (ClassCastException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
            return XRPC_SET_ALLOTMENT_RESULT_NO_VIRTUAL_ROOM ;    
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "", e);
            return XRPC_SET_ALLOTMENT_RESULT_NO_VIRTUAL_ROOM ;
        }
        
        return ret;
    }
    
    private void fillInsertResetAllotment(PreparedStatement ps, String rplan, java.util.Date curDate,Integer hotelCode,Integer invCode) throws SQLException {
        int j = 1;

        ps.setObject(j++, hotelCode);
        ps.setObject(j++, rplan);
        ps.setObject(j++, invCode);
        ps.setObject(j++, curDate);
        ps.setObject(j++, "0");

        //---------------- UPDATE  ---------------------------
        ps.setObject(j++, curDate);
        ps.setObject(j++, "0");

    }

    private void fillInsertAllotmentParameters(PreparedStatement ps, java.util.Date curDate, String rplan, int curAllotment,Integer hotelCode,Integer invCode) throws SQLException {
        int j = 1;
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, 
                ps.toString() 
        ); 
        ps.setObject(1, hotelCode);
        ps.setObject(2, rplan);
        ps.setObject(3, invCode);
        ps.setObject(4, curDate);  
        ps.setObject(5, curAllotment);
        ps.setObject(6, curDate); 
        ps.setObject(7, curAllotment);
          
    }

    private void fillUpdateNormalRateRestrictions(PreparedStatement ps, java.util.Date curDate,Integer hotelCode,Integer invCode) throws SQLException {
        int j = 1;
        
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "[fillUpdateNormalRateRestrictions] 1- " + ps.toString());
          
        ps.setObject(j++, curDate);
        ps.setObject(j++, hotelCode);
        ps.setObject(j++, "1");
        ps.setObject(j++, invCode);
        ps.setObject(j++, curDate);
    }

    private void fillInsertAbsGatewayAllotmentParameters(PreparedStatement ps, String remoteHotelCode, java.util.Date curDate, String rplan, String remoteRoomId, int curAllotment) throws SQLException {
        int j = 1;
 
        ps.setObject(j++, remoteHotelCode);
        ps.setObject(j++, rplan);
        ps.setObject(j++, remoteRoomId);
        ps.setObject(j++, curDate);
         
        ps.setObject(j++, curAllotment);
          
        
        ps.setObject(j++, curDate); 
        ps.setObject(j++, curAllotment);
    }

     
    private void fillInsertInventoryParameters(PreparedStatement psSqlInsInventory, java.util.Date curDate, java.util.Date today, String inventoryTypeId, int curAllotment,Integer invCode) throws SQLException {

        int j = 1;
        psSqlInsInventory.setObject(j++, invCode); //room_id
        psSqlInsInventory.setObject(j++, inventoryTypeId);     //inventory_type_id
        psSqlInsInventory.setObject(j++, curDate); //allotment_date
        psSqlInsInventory.setObject(j++, curAllotment); //allotment_number BookingLimit
        psSqlInsInventory.setObject(j++, 0); //minimum_allotment_number  a 0 momentaneamente
        psSqlInsInventory.setObject(j++, today); //inventory_modified_date
        psSqlInsInventory.setObject(j++, -1); //inventory_modified_user
        //-----------------------------------------------------
        psSqlInsInventory.setObject(j++, curAllotment); //allotment_number
        psSqlInsInventory.setObject(j++, 0); //minimum_allotment_number
        psSqlInsInventory.setObject(j++, today); //inventory_modified_date
        psSqlInsInventory.setObject(j++, -1); //inventory_modified_user
    }

    private void fillInsertInventoryIssues(PreparedStatement psSqlInsInventoryIssues, java.util.Date curDate, int accomplished,Integer hotelCode,Integer invCode) throws SQLException {
        int j = 1;
        
        psSqlInsInventoryIssues.setObject(j++, hotelCode);
        psSqlInsInventoryIssues.setObject(j++, invCode);
        psSqlInsInventoryIssues.setObject(j++, curDate);
        psSqlInsInventoryIssues.setObject(j++, accomplished);
    }

    private void fillUpdateInventoryIssues(PreparedStatement psSqlInsInventoryIssues, java.util.Date curDate, int accomplished,Integer hotelCode,Integer invCode) throws SQLException {
        int j = 1;

        psSqlInsInventoryIssues.setObject(j++, accomplished);
        psSqlInsInventoryIssues.setObject(j++, hotelCode);
        psSqlInsInventoryIssues.setObject(j++, invCode);
        psSqlInsInventoryIssues.setObject(j++, curDate);
    }

    
    
    
}

 