
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
 *         &lt;element name="UniqueID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="16"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Instance" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="CompleteSet"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AvailStatusMessages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailStatusMessage" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="StatusApplicationControl" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Start" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                     &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                     &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                     &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BookingLimitMessageType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="SetLimit"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="BookingLimit" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
    "uniqueID",
    "availStatusMessages"
})
@XmlRootElement(name = "OTA_HotelAvailNotifRQ")
public class OTAHotelAvailNotifRQ {

    @XmlElement(name = "UniqueID")
    protected OTAHotelAvailNotifRQ.UniqueID uniqueID;
    @XmlElement(name = "AvailStatusMessages", required = true)
    protected OTAHotelAvailNotifRQ.AvailStatusMessages availStatusMessages;
    @XmlAttribute(name = "Version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeStamp;

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailNotifRQ.UniqueID }
     *     
     */
    public OTAHotelAvailNotifRQ.UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailNotifRQ.UniqueID }
     *     
     */
    public void setUniqueID(OTAHotelAvailNotifRQ.UniqueID value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the availStatusMessages property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailNotifRQ.AvailStatusMessages }
     *     
     */
    public OTAHotelAvailNotifRQ.AvailStatusMessages getAvailStatusMessages() {
        return availStatusMessages;
    }

    /**
     * Sets the value of the availStatusMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailNotifRQ.AvailStatusMessages }
     *     
     */
    public void setAvailStatusMessages(OTAHotelAvailNotifRQ.AvailStatusMessages value) {
        this.availStatusMessages = value;
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
     *         &lt;element name="AvailStatusMessage" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="StatusApplicationControl" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Start" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                           &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                           &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                           &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BookingLimitMessageType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="SetLimit"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="BookingLimit" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
        "availStatusMessage"
    })
    public static class AvailStatusMessages {

        @XmlElement(name = "AvailStatusMessage", required = true)
        protected List<OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage> availStatusMessage;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;

        /**
         * Gets the value of the availStatusMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availStatusMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailStatusMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage }
         * 
         * 
         */
        public List<OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage> getAvailStatusMessage() {
            if (availStatusMessage == null) {
                availStatusMessage = new ArrayList<OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage>();
            }
            return this.availStatusMessage;
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
         *       &lt;sequence>
         *         &lt;element name="StatusApplicationControl" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Start" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                 &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                 &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *                 &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="BookingLimitMessageType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="SetLimit"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="BookingLimit" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "statusApplicationControl"
        })
        public static class AvailStatusMessage {

            @XmlElement(name = "StatusApplicationControl")
            protected OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage.StatusApplicationControl statusApplicationControl;
            @XmlAttribute(name = "BookingLimitMessageType")
            protected String bookingLimitMessageType;
            @XmlAttribute(name = "BookingLimit")
            protected BigInteger bookingLimit;

            /**
             * Gets the value of the statusApplicationControl property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage.StatusApplicationControl }
             *     
             */
            public OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage.StatusApplicationControl getStatusApplicationControl() {
                return statusApplicationControl;
            }

            /**
             * Sets the value of the statusApplicationControl property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage.StatusApplicationControl }
             *     
             */
            public void setStatusApplicationControl(OTAHotelAvailNotifRQ.AvailStatusMessages.AvailStatusMessage.StatusApplicationControl value) {
                this.statusApplicationControl = value;
            }

            /**
             * Gets the value of the bookingLimitMessageType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingLimitMessageType() {
                return bookingLimitMessageType;
            }

            /**
             * Sets the value of the bookingLimitMessageType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingLimitMessageType(String value) {
                this.bookingLimitMessageType = value;
            }

            /**
             * Gets the value of the bookingLimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBookingLimit() {
                return bookingLimit;
            }

            /**
             * Sets the value of the bookingLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBookingLimit(BigInteger value) {
                this.bookingLimit = value;
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
             *       &lt;attribute name="Start" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *       &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *       &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *       &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class StatusApplicationControl {

                @XmlAttribute(name = "Start", required = true)
                protected XMLGregorianCalendar start;
                @XmlAttribute(name = "End", required = true)
                protected XMLGregorianCalendar end;
                @XmlAttribute(name = "InvTypeCode")
                protected String invTypeCode;
                @XmlAttribute(name = "InvCode")
                protected String invCode;

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

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEnd() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEnd(XMLGregorianCalendar value) {
                    this.end = value;
                }

                /**
                 * Gets the value of the invTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInvTypeCode() {
                    return invTypeCode;
                }

                /**
                 * Sets the value of the invTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInvTypeCode(String value) {
                    this.invTypeCode = value;
                }

                /**
                 * Gets the value of the invCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInvCode() {
                    return invCode;
                }

                /**
                 * Sets the value of the invCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInvCode(String value) {
                    this.invCode = value;
                }

            }

        }

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
     *       &lt;attribute name="Type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="16"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Instance" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="CompleteSet"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UniqueID {

        @XmlAttribute(name = "Type", required = true)
        protected String type;
        @XmlAttribute(name = "ID", required = true)
        protected String id;
        @XmlAttribute(name = "Instance", required = true)
        protected String instance;

        /**
         * Gets the value of the type property.
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
         * Sets the value of the type property.
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
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the instance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstance() {
            return instance;
        }

        /**
         * Sets the value of the instance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstance(String value) {
            this.instance = value;
        }

    }

}
