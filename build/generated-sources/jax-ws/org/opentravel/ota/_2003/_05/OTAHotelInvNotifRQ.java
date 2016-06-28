
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SellableProducts"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SellableProduct" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="GuestRoom"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Quantities" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Occupancy" maxOccurs="2" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
 *                                               &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
 *                                               &lt;attribute name="AgeQualifyingCode"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;enumeration value="8"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Room" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Amenities" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Amenity"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="AmenityCode"&gt;
 *                                                           &lt;simpleType&gt;
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                               &lt;enumeration value="26"/&gt;
 *                                                             &lt;/restriction&gt;
 *                                                           &lt;/simpleType&gt;
 *                                                         &lt;/attribute&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Description" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Text" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
 *                                                         &lt;attribute name="TextFormat" use="required"&gt;
 *                                                           &lt;simpleType&gt;
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                               &lt;enumeration value="PlainText"/&gt;
 *                                                             &lt;/restriction&gt;
 *                                                           &lt;/simpleType&gt;
 *                                                         &lt;/attribute&gt;
 *                                                         &lt;attribute name="Language" use="required"&gt;
 *                                                           &lt;simpleType&gt;
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
 *                                                               &lt;pattern value="[a-z][a-z]"/&gt;
 *                                                             &lt;/restriction&gt;
 *                                                           &lt;/simpleType&gt;
 *                                                         &lt;/attribute&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="InvTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                           &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="HotelCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                 &lt;attribute name="HotelName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
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
    "sellableProducts"
})
@XmlRootElement(name = "OTA_HotelInvNotifRQ")
public class OTAHotelInvNotifRQ {

    @XmlElement(name = "SellableProducts", required = true)
    protected OTAHotelInvNotifRQ.SellableProducts sellableProducts;
    @XmlAttribute(name = "Version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeStamp;

    /**
     * Recupera il valore della proprietà sellableProducts.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelInvNotifRQ.SellableProducts }
     *     
     */
    public OTAHotelInvNotifRQ.SellableProducts getSellableProducts() {
        return sellableProducts;
    }

    /**
     * Imposta il valore della proprietà sellableProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelInvNotifRQ.SellableProducts }
     *     
     */
    public void setSellableProducts(OTAHotelInvNotifRQ.SellableProducts value) {
        this.sellableProducts = value;
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SellableProduct" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GuestRoom"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Quantities" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Occupancy" maxOccurs="2" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
     *                                     &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
     *                                     &lt;attribute name="AgeQualifyingCode"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;enumeration value="8"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Room" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Amenities" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Amenity"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="AmenityCode"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                     &lt;enumeration value="26"/&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Description" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Text" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
     *                                               &lt;attribute name="TextFormat" use="required"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                     &lt;enumeration value="PlainText"/&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                               &lt;attribute name="Language" use="required"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
     *                                                     &lt;pattern value="[a-z][a-z]"/&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="InvTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *                 &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="HotelCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *       &lt;attribute name="HotelName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sellableProduct"
    })
    public static class SellableProducts {

        @XmlElement(name = "SellableProduct")
        protected List<OTAHotelInvNotifRQ.SellableProducts.SellableProduct> sellableProduct;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;

        /**
         * Gets the value of the sellableProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sellableProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSellableProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct }
         * 
         * 
         */
        public List<OTAHotelInvNotifRQ.SellableProducts.SellableProduct> getSellableProduct() {
            if (sellableProduct == null) {
                sellableProduct = new ArrayList<OTAHotelInvNotifRQ.SellableProducts.SellableProduct>();
            }
            return this.sellableProduct;
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
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="GuestRoom"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Quantities" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Occupancy" maxOccurs="2" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
         *                           &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
         *                           &lt;attribute name="AgeQualifyingCode"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;enumeration value="8"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Room" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Amenities" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Amenity"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="AmenityCode"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                           &lt;enumeration value="26"/&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Description" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Text" maxOccurs="unbounded"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
         *                                     &lt;attribute name="TextFormat" use="required"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                           &lt;enumeration value="PlainText"/&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                     &lt;attribute name="Language" use="required"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
         *                                           &lt;pattern value="[a-z][a-z]"/&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="InvTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
         *       &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "guestRoom"
        })
        public static class SellableProduct {

            @XmlElement(name = "GuestRoom", required = true)
            protected OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom guestRoom;
            @XmlAttribute(name = "InvTypeCode", required = true)
            protected String invTypeCode;
            @XmlAttribute(name = "InvCode")
            protected String invCode;

            /**
             * Recupera il valore della proprietà guestRoom.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom }
             *     
             */
            public OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom getGuestRoom() {
                return guestRoom;
            }

            /**
             * Imposta il valore della proprietà guestRoom.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom }
             *     
             */
            public void setGuestRoom(OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom value) {
                this.guestRoom = value;
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


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Quantities" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Occupancy" maxOccurs="2" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
             *                 &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
             *                 &lt;attribute name="AgeQualifyingCode"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;enumeration value="8"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Room" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Amenities" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Amenity"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="AmenityCode"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                 &lt;enumeration value="26"/&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Description" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Text" maxOccurs="unbounded"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
             *                           &lt;attribute name="TextFormat" use="required"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                 &lt;enumeration value="PlainText"/&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                           &lt;attribute name="Language" use="required"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
             *                                 &lt;pattern value="[a-z][a-z]"/&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "quantities",
                "occupancy",
                "room",
                "amenities",
                "description"
            })
            public static class GuestRoom {

                @XmlElement(name = "Quantities")
                protected OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Quantities quantities;
                @XmlElement(name = "Occupancy")
                protected List<OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Occupancy> occupancy;
                @XmlElement(name = "Room")
                protected OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Room room;
                @XmlElement(name = "Amenities")
                protected OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities amenities;
                @XmlElement(name = "Description")
                protected OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description description;

                /**
                 * Recupera il valore della proprietà quantities.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Quantities }
                 *     
                 */
                public OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Quantities getQuantities() {
                    return quantities;
                }

                /**
                 * Imposta il valore della proprietà quantities.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Quantities }
                 *     
                 */
                public void setQuantities(OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Quantities value) {
                    this.quantities = value;
                }

                /**
                 * Gets the value of the occupancy property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the occupancy property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOccupancy().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Occupancy }
                 * 
                 * 
                 */
                public List<OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Occupancy> getOccupancy() {
                    if (occupancy == null) {
                        occupancy = new ArrayList<OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Occupancy>();
                    }
                    return this.occupancy;
                }

                /**
                 * Recupera il valore della proprietà room.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Room }
                 *     
                 */
                public OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Room getRoom() {
                    return room;
                }

                /**
                 * Imposta il valore della proprietà room.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Room }
                 *     
                 */
                public void setRoom(OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Room value) {
                    this.room = value;
                }

                /**
                 * Recupera il valore della proprietà amenities.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities }
                 *     
                 */
                public OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities getAmenities() {
                    return amenities;
                }

                /**
                 * Imposta il valore della proprietà amenities.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities }
                 *     
                 */
                public void setAmenities(OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities value) {
                    this.amenities = value;
                }

                /**
                 * Recupera il valore della proprietà description.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description }
                 *     
                 */
                public OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description getDescription() {
                    return description;
                }

                /**
                 * Imposta il valore della proprietà description.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description }
                 *     
                 */
                public void setDescription(OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description value) {
                    this.description = value;
                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Amenity"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="AmenityCode"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                       &lt;enumeration value="26"/&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "amenity"
                })
                public static class Amenities {

                    @XmlElement(name = "Amenity", required = true)
                    protected OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities.Amenity amenity;

                    /**
                     * Recupera il valore della proprietà amenity.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities.Amenity }
                     *     
                     */
                    public OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities.Amenity getAmenity() {
                        return amenity;
                    }

                    /**
                     * Imposta il valore della proprietà amenity.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities.Amenity }
                     *     
                     */
                    public void setAmenity(OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities.Amenity value) {
                        this.amenity = value;
                    }


                    /**
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="AmenityCode"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *             &lt;enumeration value="26"/&gt;
                     *           &lt;/restriction&gt;
                     *         &lt;/simpleType&gt;
                     *       &lt;/attribute&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Amenity {

                        @XmlAttribute(name = "AmenityCode")
                        protected String amenityCode;

                        /**
                         * Recupera il valore della proprietà amenityCode.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAmenityCode() {
                            return amenityCode;
                        }

                        /**
                         * Imposta il valore della proprietà amenityCode.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAmenityCode(String value) {
                            this.amenityCode = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Text" maxOccurs="unbounded"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
                 *                 &lt;attribute name="TextFormat" use="required"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                       &lt;enumeration value="PlainText"/&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *                 &lt;attribute name="Language" use="required"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                 *                       &lt;pattern value="[a-z][a-z]"/&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class Description {

                    @XmlElement(name = "Text", required = true)
                    protected List<OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description.Text> text;

                    /**
                     * Gets the value of the text property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the text property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getText().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description.Text }
                     * 
                     * 
                     */
                    public List<OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description.Text> getText() {
                        if (text == null) {
                            text = new ArrayList<OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Description.Text>();
                        }
                        return this.text;
                    }


                    /**
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
                     *       &lt;attribute name="TextFormat" use="required"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *             &lt;enumeration value="PlainText"/&gt;
                     *           &lt;/restriction&gt;
                     *         &lt;/simpleType&gt;
                     *       &lt;/attribute&gt;
                     *       &lt;attribute name="Language" use="required"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                     *             &lt;pattern value="[a-z][a-z]"/&gt;
                     *           &lt;/restriction&gt;
                     *         &lt;/simpleType&gt;
                     *       &lt;/attribute&gt;
                     *     &lt;/extension&gt;
                     *   &lt;/simpleContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Text {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "TextFormat", required = true)
                        protected String textFormat;
                        @XmlAttribute(name = "Language", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        protected String language;

                        /**
                         * Recupera il valore della proprietà value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Imposta il valore della proprietà value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Recupera il valore della proprietà textFormat.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTextFormat() {
                            return textFormat;
                        }

                        /**
                         * Imposta il valore della proprietà textFormat.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTextFormat(String value) {
                            this.textFormat = value;
                        }

                        /**
                         * Recupera il valore della proprietà language.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLanguage() {
                            return language;
                        }

                        /**
                         * Imposta il valore della proprietà language.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLanguage(String value) {
                            this.language = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
                 *       &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
                 *       &lt;attribute name="AgeQualifyingCode"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;enumeration value="8"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Occupancy {

                    @XmlAttribute(name = "MinOccupancy")
                    protected BigInteger minOccupancy;
                    @XmlAttribute(name = "MaxOccupancy", required = true)
                    protected BigInteger maxOccupancy;
                    @XmlAttribute(name = "AgeQualifyingCode")
                    protected String ageQualifyingCode;

                    /**
                     * Recupera il valore della proprietà minOccupancy.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMinOccupancy() {
                        return minOccupancy;
                    }

                    /**
                     * Imposta il valore della proprietà minOccupancy.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMinOccupancy(BigInteger value) {
                        this.minOccupancy = value;
                    }

                    /**
                     * Recupera il valore della proprietà maxOccupancy.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMaxOccupancy() {
                        return maxOccupancy;
                    }

                    /**
                     * Imposta il valore della proprietà maxOccupancy.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMaxOccupancy(BigInteger value) {
                        this.maxOccupancy = value;
                    }

                    /**
                     * Recupera il valore della proprietà ageQualifyingCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgeQualifyingCode() {
                        return ageQualifyingCode;
                    }

                    /**
                     * Imposta il valore della proprietà ageQualifyingCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgeQualifyingCode(String value) {
                        this.ageQualifyingCode = value;
                    }

                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Quantities {

                    @XmlAttribute(name = "MaximumAdditionalGuests", required = true)
                    protected BigInteger maximumAdditionalGuests;

                    /**
                     * Recupera il valore della proprietà maximumAdditionalGuests.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMaximumAdditionalGuests() {
                        return maximumAdditionalGuests;
                    }

                    /**
                     * Imposta il valore della proprietà maximumAdditionalGuests.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMaximumAdditionalGuests(BigInteger value) {
                        this.maximumAdditionalGuests = value;
                    }

                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Room {

                    @XmlAttribute(name = "RoomClassificationCode", required = true)
                    protected BigInteger roomClassificationCode;

                    /**
                     * Recupera il valore della proprietà roomClassificationCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRoomClassificationCode() {
                        return roomClassificationCode;
                    }

                    /**
                     * Imposta il valore della proprietà roomClassificationCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRoomClassificationCode(BigInteger value) {
                        this.roomClassificationCode = value;
                    }

                }

            }

        }

    }

}
