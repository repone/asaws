
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
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà uniqueID.
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
     * Imposta il valore della proprietà uniqueID.
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
     * Recupera il valore della proprietà availStatusMessages.
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
     * Imposta il valore della proprietà availStatusMessages.
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
         * Recupera il valore della proprietà hotelCode.
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
         * Imposta il valore della proprietà hotelCode.
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
         * Recupera il valore della proprietà hotelName.
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
         * Imposta il valore della proprietà hotelName.
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
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
             * Recupera il valore della proprietà statusApplicationControl.
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
             * Imposta il valore della proprietà statusApplicationControl.
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
             * Recupera il valore della proprietà bookingLimitMessageType.
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
             * Imposta il valore della proprietà bookingLimitMessageType.
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
             * Recupera il valore della proprietà bookingLimit.
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
             * Imposta il valore della proprietà bookingLimit.
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
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
                 * Recupera il valore della proprietà start.
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
                 * Imposta il valore della proprietà start.
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
                 * Recupera il valore della proprietà end.
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
                 * Imposta il valore della proprietà end.
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
                 * Recupera il valore della proprietà invTypeCode.
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
                 * Imposta il valore della proprietà invTypeCode.
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
                 * Recupera il valore della proprietà invCode.
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
                 * Imposta il valore della proprietà invCode.
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
         * Recupera il valore della proprietà id.
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
         * Imposta il valore della proprietà id.
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
         * Recupera il valore della proprietà instance.
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
         * Imposta il valore della proprietà instance.
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
