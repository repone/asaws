
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.opentravel.org/OTA/2003/05}def_generic_response"/>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
@XmlRootElement(name = "OTA_HotelInvNotifRS")
public class OTAHotelInvNotifRS {

    @XmlElement(name = "Errors")
    protected org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Errors errors;
    @XmlElement(name = "Success")
    protected Object success;
    @XmlElement(name = "Warnings")
    protected org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Warnings warnings;
    @XmlAttribute(name = "Version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeStamp;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Errors }
     *     
     */
    public org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Errors }
     *     
     */
    public void setErrors(org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the success property.
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
     * Sets the value of the success property.
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
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Warnings }
     *     
     */
    public org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Warnings }
     *     
     */
    public void setWarnings(org.opentravel.ota._2003._05.OTAHotelRatePlanNotifRS.Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the version property.
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
     * Sets the value of the version property.
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
     * Gets the value of the timeStamp property.
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
     * Sets the value of the timeStamp property.
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
