
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.opentravel.org/OTA/2003/05}def_generic_response"/&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errors",
    "success",
    "warnings"
})
@XmlRootElement(name = "OTA_HotelRatePlanNotifRS")
public class OTAHotelRatePlanNotifRS {

    @XmlElement(name = "Errors")
    protected org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Errors errors;
    @XmlElement(name = "Success")
    protected Object success;
    @XmlElement(name = "Warnings")
    protected org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Warnings warnings;
    @XmlAttribute(name = "Version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeStamp;

    /**
     * Recupera il valore della proprietà errors.
     * 
     * @return
     *     possible object is
     *     {@link org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Errors }
     *     
     */
    public org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Errors getErrors() {
        return errors;
    }

    /**
     * Imposta il valore della proprietà errors.
     * 
     * @param value
     *     allowed object is
     *     {@link org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Errors }
     *     
     */
    public void setErrors(org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Errors value) {
        this.errors = value;
    }

    /**
     * Recupera il valore della proprietà success.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSuccess() {
        return success;
    }

    /**
     * Imposta il valore della proprietà success.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSuccess(Object value) {
        this.success = value;
    }

    /**
     * Recupera il valore della proprietà warnings.
     * 
     * @return
     *     possible object is
     *     {@link org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Warnings }
     *     
     */
    public org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Imposta il valore della proprietà warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Warnings }
     *     
     */
    public void setWarnings(org.opentravel.ota._2003._05.OTAHotelAvailNotifRS.Warnings value) {
        this.warnings = value;
    }

    /**
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Recupera il valore della proprietà timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Imposta il valore della proprietà timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

}
