
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
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà readRequests.
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
     * Imposta il valore della proprietà readRequests.
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
         * Recupera il valore della proprietà hotelReadRequest.
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
         * Imposta il valore della proprietà hotelReadRequest.
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
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
             * Recupera il valore della proprietà selectionCriteria.
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
             * Imposta il valore della proprietà selectionCriteria.
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

            }

        }

    }

}
