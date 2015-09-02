
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellableProducts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SellableProduct" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GuestRoom">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Quantities" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Occupancy" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                               &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                               &lt;attribute name="AgeQualifyingCode">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="8"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Room" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Amenities" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Amenity">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="AmenityCode">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;enumeration value="26"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Description" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Text" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
 *                                                         &lt;attribute name="TextFormat" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;enumeration value="PlainText"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="Language" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
 *                                                               &lt;pattern value="[a-z][a-z]"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="InvTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                           &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
     * Gets the value of the sellableProducts property.
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
     * Sets the value of the sellableProducts property.
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
     *         &lt;element name="SellableProduct" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GuestRoom">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Quantities" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Occupancy" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                     &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                     &lt;attribute name="AgeQualifyingCode">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="8"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Room" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Amenities" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Amenity">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="AmenityCode">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="26"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Description" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
     *                                               &lt;attribute name="TextFormat" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="PlainText"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="Language" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
     *                                                     &lt;pattern value="[a-z][a-z]"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="InvTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                 &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
         *         &lt;element name="GuestRoom">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Quantities" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Occupancy" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                           &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                           &lt;attribute name="AgeQualifyingCode">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="8"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Room" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Amenities" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Amenity">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="AmenityCode">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="26"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Description" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
         *                                     &lt;attribute name="TextFormat" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="PlainText"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="Language" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
         *                                           &lt;pattern value="[a-z][a-z]"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
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
         *       &lt;attribute name="InvTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *       &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
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
             * Gets the value of the guestRoom property.
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
             * Sets the value of the guestRoom property.
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
             *         &lt;element name="Quantities" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Occupancy" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                 &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                 &lt;attribute name="AgeQualifyingCode">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="8"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Room" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Amenities" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Amenity">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="AmenityCode">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="26"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Description" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
             *                           &lt;attribute name="TextFormat" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="PlainText"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="Language" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
             *                                 &lt;pattern value="[a-z][a-z]"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
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
                 * Gets the value of the quantities property.
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
                 * Sets the value of the quantities property.
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
                 * Gets the value of the room property.
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
                 * Sets the value of the room property.
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
                 * Gets the value of the amenities property.
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
                 * Sets the value of the amenities property.
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
                 * Gets the value of the description property.
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
                 * Sets the value of the description property.
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Amenity">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="AmenityCode">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="26"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
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
                    "amenity"
                })
                public static class Amenities {

                    @XmlElement(name = "Amenity", required = true)
                    protected OTAHotelInvNotifRQ.SellableProducts.SellableProduct.GuestRoom.Amenities.Amenity amenity;

                    /**
                     * Gets the value of the amenity property.
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
                     * Sets the value of the amenity property.
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
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="AmenityCode">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="26"/>
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
                    public static class Amenity {

                        @XmlAttribute(name = "AmenityCode")
                        protected String amenityCode;

                        /**
                         * Gets the value of the amenityCode property.
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
                         * Sets the value of the amenityCode property.
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Text" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
                 *                 &lt;attribute name="TextFormat" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="PlainText"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="Language" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                 *                       &lt;pattern value="[a-z][a-z]"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
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
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
                     *       &lt;attribute name="TextFormat" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="PlainText"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="Language" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                     *             &lt;pattern value="[a-z][a-z]"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
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
                         * Gets the value of the value property.
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
                         * Sets the value of the value property.
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
                         * Gets the value of the textFormat property.
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
                         * Sets the value of the textFormat property.
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
                         * Gets the value of the language property.
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
                         * Sets the value of the language property.
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="MinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *       &lt;attribute name="MaxOccupancy" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *       &lt;attribute name="AgeQualifyingCode">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="8"/>
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
                public static class Occupancy {

                    @XmlAttribute(name = "MinOccupancy")
                    protected BigInteger minOccupancy;
                    @XmlAttribute(name = "MaxOccupancy", required = true)
                    protected BigInteger maxOccupancy;
                    @XmlAttribute(name = "AgeQualifyingCode")
                    protected String ageQualifyingCode;

                    /**
                     * Gets the value of the minOccupancy property.
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
                     * Sets the value of the minOccupancy property.
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
                     * Gets the value of the maxOccupancy property.
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
                     * Sets the value of the maxOccupancy property.
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
                     * Gets the value of the ageQualifyingCode property.
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
                     * Sets the value of the ageQualifyingCode property.
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="MaximumAdditionalGuests" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
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
                     * Gets the value of the maximumAdditionalGuests property.
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
                     * Sets the value of the maximumAdditionalGuests property.
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="RoomClassificationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
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
                     * Gets the value of the roomClassificationCode property.
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
                     * Sets the value of the roomClassificationCode property.
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
