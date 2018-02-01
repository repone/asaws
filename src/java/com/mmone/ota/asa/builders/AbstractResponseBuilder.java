/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import com.mmone.abs.api.rates.Debuggable;
import com.mmone.abs.helpers.ElaborationResults;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceContext;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.xmlrpc.XmlRpcClient; 
import com.mmone.ota.asa.builders.exceptions.HotelCodeException;
import com.mmone.ota.asa.builders.exceptions.UserNotAuthorized;
import com.mmone.ota.asa.builders.source.ReservationsSource;
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRS;

/**
 *
 * @author mauro.larese
 */
public abstract class AbstractResponseBuilder  extends Debuggable implements ResponseBuilder  {
    private ReservationsSource serviceSource=null;
    private Object request;
    private ArrayList<ErrorType>errors=new ArrayList<ErrorType>();
    private ArrayList<WarningType>warning=new ArrayList<WarningType>();
    private QueryRunner runner=null;
    private String user;
     
    public ElaborationResults getElaborationResults() {
        return elaborationResults;
    }

    public void setElaborationResults(ElaborationResults elaborationResults) {
        this.elaborationResults = elaborationResults;
    }

    public InitialContext getInitialContext() {
        return initialContext;
    }

    public void setInitialContext(InitialContext initialContext) {
        this.initialContext = initialContext;
    }
    private ElaborationResults elaborationResults= new ElaborationResults(); 
    XmlRpcClient rpcClient = null;
    
    public java.sql.Date xmlGregorianCalendarToSqlDate(XMLGregorianCalendar date){ 
        return Facilities.xmlGregorianCalendarToSqlDate(date );
    }
    
    public XMLGregorianCalendar dateToXMLGregorianCalendar(Date sqlDate){ 
        return dateToXMLGregorianCalendar(sqlDate);    
    }
    public String getUser() {
        return user;
    }
    public QueryRunner getRunner() {
        if(runner==null){
            try {
                runner = new QueryRunner(getDataSource());
            } catch (NamingException ex) {
                Logger.getLogger(AbstractResponseBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return runner;
    }
    private InitialContext initialContext = null;  
    
    
    
    public AbstractResponseBuilder(Object request,WebServiceContext webServiceContext,InitialContext initialContext){
        this.request=request;   
        this.initialContext=initialContext;
        try {
            if (webServiceContext != null && webServiceContext.getUserPrincipal()!=null) {
                this.user = webServiceContext.getUserPrincipal().getName();
            }
        } catch (Exception e) {    }
        
        try {
            this.serviceSource=new ReservationsSource(getRunner(),getRpcClient());
        } catch (MalformedURLException ex) {
            Logger.getLogger(AbstractResponseBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(AbstractResponseBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    public ReservationsSource getServiceSource() {
        return serviceSource;
    }
    
    private String hotelCode=null;
    
    private void validate(){
        InitialContext context= getContext();
        hotelCode=null;
        
        if(context==null)
            addError(EWT_UNKNOWN, ERR_SYSTEM_ERROR, "System error");
        
        try {
            getRpcClient();
            getDataSource();
            hotelCode=getHotelCodeFromRequest();
        } catch (HotelCodeException ex) {
            Logger.getLogger(AbstractResponseBuilder.class.getName()).log(Level.SEVERE, null, ex);            
        } catch (MalformedURLException ex) {
            addError(EWT_UNKNOWN, ERR_SYSTEM_ERROR, "System error" );
            Logger.getLogger(AbstractResponseBuilder.class.getName()).log(Level.SEVERE, null, ex);            
        } catch (NamingException ex) {
            addError(EWT_UNKNOWN, ERR_SYSTEM_ERROR, "System error" );
            Logger.getLogger(AbstractResponseBuilder.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
        if (hotelCode == null) {
            addError(EWT_REQUIRED_FIELD_MISSING, ERR_INVALID_HOTEL_CODE, "HotelCode null"); 
        }
    }

    public String getHotelCode() {
        return hotelCode;
    }
    public int getHotelId() {
        return new Integer(hotelCode);
    }
    
    public abstract String getHotelCodeFromRequest() throws HotelCodeException;
    public abstract void buildResponse();
    public abstract void fillErrors();
    public abstract void fillWarnings();
    public abstract void markSuccess();
    
    @Override
    public final Object build(){
        validate();
        
        if(!hasErrors() && !getHotelCode().equals(HOTEL_CODE_NOT_REQUIRED))             
            try {
                authentication();
            } catch (HotelCodeException ex) {
                Logger.getLogger(AbstractResponseBuilder.class.getName()).log(Level.SEVERE, null, ex);
                addError(EWT_REQUIRED_FIELD_MISSING, ERR_INVALID_HOTEL_CODE, "HotelCode error"); 
            }catch (UserNotAuthorized ex) {
                Logger.getLogger(AbstractResponseBuilder.class.getName()).log(Level.SEVERE, null, ex);
                addError(EWT_UNKNOWN, ERR_SYSTEM_ERROR, "SOAP Client. Authorization Error: You don't have permission to select the structure " + hotelCode);
            }
        
        if(!hasErrors() )
            buildResponse(); 
        
        if(hasErrors() ) 
            fillErrors(); 
        else
            markSuccess();
        
        if(hasWarnings() ) 
            fillWarnings();
        
        return getResponse();
    };
         
    public boolean hasErrors(){
        return this.getErrors().size()>0;
    }
    public boolean hasWarnings(){
        return this.getWarning().size()>0;
    }
    private InitialContext getContext()  {
        return initialContext; 
    }    
    public DataSource getDataSource() throws NamingException { 
        DataSource ds = null; 
        ds = (DataSource) getContext().lookup("jdbc/reservation" );       
        return ds;
    }      
    
    public static XmlRpcClient getRpcClient(InitialContext context) throws MalformedURLException, NamingException  {
     
        String rpcServerUrl = (String) context.lookup("cr/rpcreservation" + "url");
        String rpcUsername = (String) context.lookup("cr/rpcreservation"   + "username");
        String rpcPassword = (String) context.lookup("cr/rpcreservation"  + "password");


        XmlRpcClient rpcClient = new XmlRpcClient(rpcServerUrl);
        rpcClient.setBasicAuthentication(rpcUsername, rpcPassword);
 
        return rpcClient; 
    }
    
    public XmlRpcClient getRpcClient() throws MalformedURLException, NamingException  {
            if(this.rpcClient==null){    
                rpcClient = getRpcClient(getContext());
            }
            return this.rpcClient; 
    }     
    public ArrayList<WarningType> getWarning() {
        return warning;
    }
    public ArrayList<ErrorType> getErrors() {
        return errors;
    }
    public Object getRequest() {
        return request;
    }
    public void setRequest(Object request) {
        this.request = request;
    }

    private DataSource dataSource;       
    public void addError(String type, String code, String message) { 
        ErrorType et = new ErrorType(code,type,message);
        this.getErrors().add(et);
    }
    public void addWarning(String type, String code, String message) {
        WarningType wa = new WarningType(code,type,message);
        this.getWarning().add(wa);
    }
    protected void authentication() throws UserNotAuthorized, HotelCodeException {  
        if(true)return;
        
        String hotelCode=getHotelCodeFromRequest();
        String sqlChkUser = "SELECT permissions,user FROM ota_users WHERE user like ? AND structure_id=? AND deleted=?";
        String sUser = "%"+this.user; 
        
        Map permission = null;

        try {
            permission = runner.query(sqlChkUser, new MapHandler(), sUser, hotelCode, 0);
             
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
        }
        
        if(permission==null) throw new UserNotAuthorized("User not authorized");
    }    
    public abstract java.lang.Object getResponse();
    
    
}
