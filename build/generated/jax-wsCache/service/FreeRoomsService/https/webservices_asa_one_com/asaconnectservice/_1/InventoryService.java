
package https.webservices_asa_one_com.asaconnectservice._1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Interfaccia OTA2009A Asa
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InventoryService", targetNamespace = "https://webservices.Asa-one.com/AsaConnectService/1.0", wsdlLocation = "file:/C:/Users/mauro.larese/Documents/NetBeansProjects/asaws/src/conf/xml-resources/web-services/FreeRoomsService/wsdl/alpinebits.wsdl")
public class InventoryService
    extends Service
{

    private final static URL INVENTORYSERVICE_WSDL_LOCATION;
    private final static WebServiceException INVENTORYSERVICE_EXCEPTION;
    private final static QName INVENTORYSERVICE_QNAME = new QName("https://webservices.Asa-one.com/AsaConnectService/1.0", "InventoryService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/mauro.larese/Documents/NetBeansProjects/asaws/src/conf/xml-resources/web-services/FreeRoomsService/wsdl/alpinebits.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INVENTORYSERVICE_WSDL_LOCATION = url;
        INVENTORYSERVICE_EXCEPTION = e;
    }

    public InventoryService() {
        super(__getWsdlLocation(), INVENTORYSERVICE_QNAME);
    }

    public InventoryService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INVENTORYSERVICE_QNAME, features);
    }

    public InventoryService(URL wsdlLocation) {
        super(wsdlLocation, INVENTORYSERVICE_QNAME);
    }

    public InventoryService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INVENTORYSERVICE_QNAME, features);
    }

    public InventoryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InventoryService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InventoryPort
     */
    @WebEndpoint(name = "InventoryPort")
    public InventoryPort getInventoryPort() {
        return super.getPort(new QName("https://webservices.Asa-one.com/AsaConnectService/1.0", "InventoryPort"), InventoryPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InventoryPort
     */
    @WebEndpoint(name = "InventoryPort")
    public InventoryPort getInventoryPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://webservices.Asa-one.com/AsaConnectService/1.0", "InventoryPort"), InventoryPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INVENTORYSERVICE_EXCEPTION!= null) {
            throw INVENTORYSERVICE_EXCEPTION;
        }
        return INVENTORYSERVICE_WSDL_LOCATION;
    }

}
