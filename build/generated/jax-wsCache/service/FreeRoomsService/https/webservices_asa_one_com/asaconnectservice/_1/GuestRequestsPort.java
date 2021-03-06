
package https.webservices_asa_one_com.asaconnectservice._1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.opentravel.ota._2003._05.OTANotifReportRQ;
import org.opentravel.ota._2003._05.OTANotifReportRS;
import org.opentravel.ota._2003._05.OTAReadRQ;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import org.opentravel.ota._2003._05.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GuestRequestsPort", targetNamespace = "https://webservices.Asa-one.com/AsaConnectService/1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GuestRequestsPort {


    /**
     * 
     * @param readRQMsg
     * @return
     *     returns org.opentravel.ota._2003._05.OTAResRetrieveRS
     */
    @WebMethod(operationName = "OTA_Read", action = "urn:OTA_Read")
    @WebResult(name = "OTA_ResRetrieveRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "ResRetrieveRS_msg")
    public OTAResRetrieveRS otaRead(
        @WebParam(name = "OTA_ReadRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "ReadRQ_msg")
        OTAReadRQ readRQMsg);

    /**
     * 
     * @param notifReportRQMsg
     * @return
     *     returns org.opentravel.ota._2003._05.OTANotifReportRS
     */
    @WebMethod(operationName = "OTA_NotifReport", action = "urn:OTA_NotifReport")
    @WebResult(name = "OTA_NotifReportRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "NotifReportRS_msg")
    public OTANotifReportRS otaNotifReport(
        @WebParam(name = "OTA_NotifReportRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "NotifReportRQ_msg")
        OTANotifReportRQ notifReportRQMsg);

}
