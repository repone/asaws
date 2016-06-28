
package https.webservices_asa_one_com.asaconnectservice._1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRQ;
import org.opentravel.ota._2003._05.OTAHotelAvailNotifRS;
import org.opentravel.ota._2003._05.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FreeRoomsPort", targetNamespace = "https://webservices.Asa-one.com/AsaConnectService/1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FreeRoomsPort {


    /**
     * 
     * @param hotelAvailNotifRQMsg
     * @return
     *     returns org.opentravel.ota._2003._05.OTAHotelAvailNotifRS
     */
    @WebMethod(operationName = "OTA_HotelAvailNotif", action = "urn:OTA_HotelAvailNotif")
    @WebResult(name = "OTA_HotelAvailNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "HotelAvailNotifRS_msg")
    public OTAHotelAvailNotifRS otaHotelAvailNotif(
        @WebParam(name = "OTA_HotelAvailNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "HotelAvailNotifRQ_msg")
        OTAHotelAvailNotifRQ hotelAvailNotifRQMsg);

}
