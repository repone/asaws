/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.time.DateUtils;
import com.mmone.ota.asa.builders.source.ReservationsSource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author mauro.larese
 */
public class Facilities {
    public static final String[] dateParsers = new String[]{"yyyyMMdd", "yyyy-MM-dd"};
    public static java.sql.Date xmlGregorianCalendarToSqlDate(XMLGregorianCalendar date){
        java.util.Date dt = date.toGregorianCalendar().getTime(); 
        return new java.sql.Date(dt.getTime());
    }
    
    public static XMLGregorianCalendar dateToXMLGregorianCalendarFormatted(Date sqlDate,String format){
        XMLGregorianCalendar xmlgcDate=null;  
        try{ 
            DateFormat dateFormat=new SimpleDateFormat(format);
            DatatypeFactory df = DatatypeFactory.newInstance();
            
            String strDate=dateFormat.format(sqlDate); 
            xmlgcDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(strDate);  
        } catch (Exception ex1) {   }
        return xmlgcDate;    
    }
    public static XMLGregorianCalendar dateToXMLGregorianCalendarFormatted(Date sqlDate){
        XMLGregorianCalendar xmlgcDate=null;
        String format="yyyy-MM-dd";
        return dateToXMLGregorianCalendarFormatted(sqlDate, format);    
    }
    public static XMLGregorianCalendar dateToXMLGregorianCalendar(Date sqlDate){
        XMLGregorianCalendar xmlgcDate=null;  
        try{
            DatatypeFactory df = DatatypeFactory.newInstance(); 
            GregorianCalendar gc =  new GregorianCalendar(); 
            gc.setTimeInMillis(sqlDate.getTime());
            xmlgcDate = df.newXMLGregorianCalendar(gc);
              
        } catch (Exception ex1) {

        }
        return xmlgcDate;    
    }
    
    public static long dateDiff(String date1, String date2) throws Exception {
        long diff = DateUtils.parseDate(date2, dateParsers).getTime() - DateUtils.parseDate(date1, dateParsers).getTime();
        return (diff / (1000 * 60 * 60 * 24));
    }
    
    public static long dateDiff(Date date1, Date date2) throws Exception {
        long diff = date2.getTime() - date1.getTime();
        return (diff / (1000 * 60 * 60 * 24));
    }
    
}
