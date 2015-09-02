
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReadRequests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelReadRequest">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SelectionCriteria" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Start" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="HotelCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                           &lt;attribute name="HotelName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
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
    "readRequests"
})
@XmlRootElement(name = "OTA_ReadRQ")
public class OTAReadRQ {

    @XmlElement(name = "ReadRequests", required = true)
    protected OTAReadRQ.ReadRequests readRequests;
    @XmlAttribute(name = "Version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeStamp;

    /**
     * Gets the value of the readRequests property.
     * 
     * @return
     *     possible object is
     *     {@link OTAReadRQ.ReadRequests }
     *     
     */
    public OTAReadRQ.ReadRequests getReadRequests() {
        return readRequests;
    }

    /**
     * Sets the value of the readRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAReadRQ.ReadRequests }
     *     
     */
    public void setReadRequests(OTAReadRQ.ReadRequests value) {
        this.readRequests = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HotelReadRequest">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SelectionCriteria" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Start" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="HotelCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                 &lt;attribute name="HotelName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
        "hotelReadRequest"
    })
    public static class ReadRequests {

        @XmlElement(name = "HotelReadRequest", required = true)
        protected OTAReadRQ.ReadRequests.HotelReadRequest hotelReadRequest;

        /**
         * Gets the value of the hotelReadRequest property.
         * 
         * @return
         *     possible object is
         *     {@link OTAReadRQ.ReadRequests.HotelReadRequest }
         *     
         */
        public OTAReadRQ.ReadRequests.HotelReadRequest getHotelReadRequest() {
            return hotelReadRequest;
        }

        /**
         * Sets the value of the hotelReadRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAReadRQ.ReadRequests.HotelReadRequest }
         *     
         */
        public void setHotelReadRequest(OTAReadRQ.ReadRequests.HotelReadRequest value) {
            this.hotelReadRequest = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SelectionCriteria" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Start" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="HotelCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *       &lt;attribute name="HotelName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "selectionCriteria"
        })
        public static class HotelReadRequest {

            @XmlElement(name = "SelectionCriteria")
            protected OTAReadRQ.ReadRequests.HotelReadRequest.SelectionCriteria selectionCriteria;
            @XmlAttribute(name = "HotelCode")
            protected String hotelCode;
            @XmlAttribute(name = "HotelName")
            protected String hotelName;

            /**
             * Gets the value of the selectionCriteria property.
             * 
             * @return
             *     possible object is
             *     {@link OTAReadRQ.ReadRequests.HotelReadRequest.SelectionCriteria }
             *     
             */
            public OTAReadRQ.ReadRequests.HotelReadRequest.SelectionCriteria getSelectionCriteria() {
                return selectionCriteria;
            }

            /**
             * Sets the value of the selectionCriteria property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAReadRQ.ReadRequests.HotelReadRequest.SelectionCriteria }
             *     
             */
            public void setSelectionCriteria(OTAReadRQ.ReadRequests.HotelReadRequest.SelectionCriteria value) {
                this.selectionCriteria = value;
            }

            /**
             * Gets the value of the hotelCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCode() {
                return hotelCode;
            }

            /**
             * Sets the value of the hotelCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCode(String value) {
                this.hotelCode = value;
            }

            /**
             * Gets the value of the hotelName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelName() {
                return hotelName;
            }

            /**
             * Sets the value of the hotelName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelName(String value) {
                this.hotelName = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Start" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SelectionCriteria {

                @XmlAttribute(name = "Start", required = true)
                protected XMLGregorianCalendar start;

                /**
                 * Gets the value of the start property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getStart() {
                    return start;
                }

                /**
                 * Sets the value of the start property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setStart(XMLGregorianCalendar value) {
                    this.start = value;
                }

            }

        }

    }

}
