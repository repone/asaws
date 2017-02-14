
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
@XmlRootElement(name = "OTA_HotelRatePlanNotifRS")
public class OTAHotelRatePlanNotifRS {

    @XmlElement(name = "Errors")
    protected OTAHotelRatePlanNotifRS.Errors errors;
    @XmlElement(name = "Success")
    protected Object success;
    @XmlElement(name = "Warnings")
    protected OTAHotelRatePlanNotifRS.Warnings warnings;
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
     *     {@link OTAHotelRatePlanNotifRS.Errors }
     *     
     */
    public OTAHotelRatePlanNotifRS.Errors getErrors() {
        return errors;
    }

    /**
     * Imposta il valore della proprietà errors.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelRatePlanNotifRS.Errors }
     *     
     */
    public void setErrors(OTAHotelRatePlanNotifRS.Errors value) {
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
     *     {@link OTAHotelRatePlanNotifRS.Warnings }
     *     
     */
    public OTAHotelRatePlanNotifRS.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Imposta il valore della proprietà warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelRatePlanNotifRS.Warnings }
     *     
     */
    public void setWarnings(OTAHotelRatePlanNotifRS.Warnings value) {
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Error" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="13"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "error"
    })
    public static class Errors {

        @XmlElement(name = "Error", required = true)
        protected List<OTAHotelRatePlanNotifRS.Errors.Error> error;

        /**
         * Gets the value of the error property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the error property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelRatePlanNotifRS.Errors.Error }
         * 
         * 
         */
        public List<OTAHotelRatePlanNotifRS.Errors.Error> getError() {
            if (error == null) {
                error = new ArrayList<OTAHotelRatePlanNotifRS.Errors.Error>();
            }
            return this.error;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="13"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Error {

            @XmlValue
            protected String content;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "Code", required = true)
            protected BigInteger code;

            /**
             * Recupera il valore della proprietà content.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContent() {
                return content;
            }

            /**
             * Imposta il valore della proprietà content.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContent(String value) {
                this.content = value;
            }

            /**
             * Recupera il valore della proprietà type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Imposta il valore della proprietà type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Recupera il valore della proprietà code.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCode() {
                return code;
            }

            /**
             * Imposta il valore della proprietà code.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCode(BigInteger value) {
                this.code = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Warning" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                 &lt;attribute name="RecordID" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "warning"
    })
    public static class Warnings {

        @XmlElement(name = "Warning", required = true)
        protected List<OTAHotelRatePlanNotifRS.Warnings.Warning> warning;

        /**
         * Gets the value of the warning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelRatePlanNotifRS.Warnings.Warning }
         * 
         * 
         */
        public List<OTAHotelRatePlanNotifRS.Warnings.Warning> getWarning() {
            if (warning == null) {
                warning = new ArrayList<OTAHotelRatePlanNotifRS.Warnings.Warning>();
            }
            return this.warning;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *       &lt;attribute name="RecordID" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Warning {

            @XmlValue
            protected String content;
            @XmlAttribute(name = "Type", required = true)
            protected BigInteger type;
            @XmlAttribute(name = "RecordID")
            protected String recordID;

            /**
             * Recupera il valore della proprietà content.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContent() {
                return content;
            }

            /**
             * Imposta il valore della proprietà content.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContent(String value) {
                this.content = value;
            }

            /**
             * Recupera il valore della proprietà type.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getType() {
                return type;
            }

            /**
             * Imposta il valore della proprietà type.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setType(BigInteger value) {
                this.type = value;
            }

            /**
             * Recupera il valore della proprietà recordID.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecordID() {
                return recordID;
            }

            /**
             * Imposta il valore della proprietà recordID.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecordID(String value) {
                this.recordID = value;
            }

        }

    }

}
