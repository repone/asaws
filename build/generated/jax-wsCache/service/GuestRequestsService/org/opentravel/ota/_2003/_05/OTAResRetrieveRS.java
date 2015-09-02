
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
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
 *       &lt;choice>
 *         &lt;element name="Errors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Error" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="13"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *           &lt;element name="ReservationsList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="UniqueID">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="Type" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="14"/>
 *                                             &lt;enumeration value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="RoomStays" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="RoomStay" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="RoomTypes" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="RoomType">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="RatePlans" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="RatePlan">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="MealsIncluded" minOccurs="0">
 *                                                                         &lt;complexType>
 *                                                                           &lt;complexContent>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                               &lt;attribute name="MealPlanIndicator" use="required">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;enumeration value="1"/>
 *                                                                                     &lt;enumeration value="true"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/attribute>
 *                                                                               &lt;attribute name="MealPlanCodes" use="required">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;enumeration value="1"/>
 *                                                                                     &lt;enumeration value="3"/>
 *                                                                                     &lt;enumeration value="10"/>
 *                                                                                     &lt;enumeration value="12"/>
 *                                                                                     &lt;enumeration value="14"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/attribute>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/complexContent>
 *                                                                         &lt;/complexType>
 *                                                                       &lt;/element>
 *                                                                     &lt;/sequence>
 *                                                                     &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="GuestCounts" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="GuestCount" maxOccurs="unbounded">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                                     &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="TimeSpan">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="StartDateWindow" minOccurs="0">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                                                     &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                                           &lt;attribute name="Duration">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="P[0-9]+N"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="Total" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
 *                                                           &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ResGuests" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ResGuest">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Profiles">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="ProfileInfo">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="Profile">
 *                                                                         &lt;complexType>
 *                                                                           &lt;complexContent>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                               &lt;sequence>
 *                                                                                 &lt;element name="Customer">
 *                                                                                   &lt;complexType>
 *                                                                                     &lt;complexContent>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                         &lt;sequence>
 *                                                                                           &lt;element name="PersonName">
 *                                                                                             &lt;complexType>
 *                                                                                               &lt;complexContent>
 *                                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                   &lt;sequence>
 *                                                                                                     &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
 *                                                                                                     &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
 *                                                                                                     &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
 *                                                                                                     &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
 *                                                                                                   &lt;/sequence>
 *                                                                                                 &lt;/restriction>
 *                                                                                               &lt;/complexContent>
 *                                                                                             &lt;/complexType>
 *                                                                                           &lt;/element>
 *                                                                                           &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
 *                                                                                             &lt;complexType>
 *                                                                                               &lt;complexContent>
 *                                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                   &lt;attribute name="PhoneTechType" use="required">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                         &lt;pattern value="(1|3|5)"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/attribute>
 *                                                                                                   &lt;attribute name="PhoneNumber" use="required">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                         &lt;pattern value="\+?[0-9]+"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/attribute>
 *                                                                                                 &lt;/restriction>
 *                                                                                               &lt;/complexContent>
 *                                                                                             &lt;/complexType>
 *                                                                                           &lt;/element>
 *                                                                                           &lt;element name="Email" minOccurs="0">
 *                                                                                             &lt;complexType>
 *                                                                                               &lt;simpleContent>
 *                                                                                                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
 *                                                                                                   &lt;attribute name="Remark">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                         &lt;pattern value="newsletter:(no|yes)"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/attribute>
 *                                                                                                 &lt;/extension>
 *                                                                                               &lt;/simpleContent>
 *                                                                                             &lt;/complexType>
 *                                                                                           &lt;/element>
 *                                                                                           &lt;element name="Address" minOccurs="0">
 *                                                                                             &lt;complexType>
 *                                                                                               &lt;complexContent>
 *                                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                   &lt;sequence>
 *                                                                                                     &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
 *                                                                                                     &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
 *                                                                                                     &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
 *                                                                                                     &lt;element name="CountryName">
 *                                                                                                       &lt;complexType>
 *                                                                                                         &lt;complexContent>
 *                                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                             &lt;attribute name="Code" use="required">
 *                                                                                                               &lt;simpleType>
 *                                                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                                   &lt;pattern value="[A-Z][A-Z]"/>
 *                                                                                                                 &lt;/restriction>
 *                                                                                                               &lt;/simpleType>
 *                                                                                                             &lt;/attribute>
 *                                                                                                           &lt;/restriction>
 *                                                                                                         &lt;/complexContent>
 *                                                                                                       &lt;/complexType>
 *                                                                                                     &lt;/element>
 *                                                                                                   &lt;/sequence>
 *                                                                                                   &lt;attribute name="Remark">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                         &lt;pattern value="catalog:(no|yes)"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/attribute>
 *                                                                                                 &lt;/restriction>
 *                                                                                               &lt;/complexContent>
 *                                                                                             &lt;/complexType>
 *                                                                                           &lt;/element>
 *                                                                                         &lt;/sequence>
 *                                                                                         &lt;attribute name="Gender" use="required">
 *                                                                                           &lt;simpleType>
 *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                               &lt;pattern value="(Unknown|Male|Female)"/>
 *                                                                                             &lt;/restriction>
 *                                                                                           &lt;/simpleType>
 *                                                                                         &lt;/attribute>
 *                                                                                         &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                                                                         &lt;attribute name="Language" use="required">
 *                                                                                           &lt;simpleType>
 *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
 *                                                                                               &lt;pattern value="[a-z][a-z]"/>
 *                                                                                             &lt;/restriction>
 *                                                                                           &lt;/simpleType>
 *                                                                                         &lt;/attribute>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/complexContent>
 *                                                                                   &lt;/complexType>
 *                                                                                 &lt;/element>
 *                                                                               &lt;/sequence>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/complexContent>
 *                                                                         &lt;/complexType>
 *                                                                       &lt;/element>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ResGlobalInfo" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Comments" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Comment" maxOccurs="2">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;choice>
 *                                                               &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
 *                                                                 &lt;complexType>
 *                                                                   &lt;simpleContent>
 *                                                                     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
 *                                                                       &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
 *                                                                       &lt;attribute name="Language" use="required">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
 *                                                                             &lt;pattern value="[a-z][a-z]"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/attribute>
 *                                                                     &lt;/extension>
 *                                                                   &lt;/simpleContent>
 *                                                                 &lt;/complexType>
 *                                                               &lt;/element>
 *                                                               &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
 *                                                             &lt;/choice>
 *                                                           &lt;/sequence>
 *                                                           &lt;attribute name="Name" use="required">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value="included services"/>
 *                                                                 &lt;enumeration value="customer comment"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="CancelPenalties" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="CancelPenalty">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="PenaltyDescription">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="HotelReservationIDs" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="HotelReservationID">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="ResID_Type" use="required">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value="13"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                                           &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                                           &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="CreateDateTime" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" />
 *                             &lt;attribute name="ResStatus" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Requested"/>
 *                                   &lt;enumeration value="Reserved"/>
 *                                   &lt;enumeration value="Cancelled"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/choice>
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
    "reservationsList"
})
@XmlRootElement(name = "OTA_ResRetrieveRS")
public class OTAResRetrieveRS {

    @XmlElement(name = "Errors")
    protected OTAResRetrieveRS.Errors errors;
    @XmlElement(name = "Success")
    protected Object success;
    @XmlElement(name = "ReservationsList")
    protected OTAResRetrieveRS.ReservationsList reservationsList;
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
     *     {@link OTAResRetrieveRS.Errors }
     *     
     */
    public OTAResRetrieveRS.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAResRetrieveRS.Errors }
     *     
     */
    public void setErrors(OTAResRetrieveRS.Errors value) {
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
     * Gets the value of the reservationsList property.
     * 
     * @return
     *     possible object is
     *     {@link OTAResRetrieveRS.ReservationsList }
     *     
     */
    public OTAResRetrieveRS.ReservationsList getReservationsList() {
        return reservationsList;
    }

    /**
     * Sets the value of the reservationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAResRetrieveRS.ReservationsList }
     *     
     */
    public void setReservationsList(OTAResRetrieveRS.ReservationsList value) {
        this.reservationsList = value;
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
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
        protected List<OTAResRetrieveRS.Errors.Error> error;

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
         * {@link OTAResRetrieveRS.Errors.Error }
         * 
         * 
         */
        public List<OTAResRetrieveRS.Errors.Error> getError() {
            if (error == null) {
                error = new ArrayList<OTAResRetrieveRS.Errors.Error>();
            }
            return this.error;
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
         *             &lt;enumeration value="13"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
             * Gets the value of the content property.
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
             * Sets the value of the content property.
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
             * Gets the value of the code property.
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
             * Sets the value of the code property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UniqueID">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Type" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="14"/>
     *                                 &lt;enumeration value="15"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RoomStays" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RoomStay" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RoomTypes" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RoomType">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RatePlans" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RatePlan">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="MealsIncluded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="MealPlanIndicator" use="required">
     *                                                                     &lt;simpleType>
     *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                         &lt;enumeration value="1"/>
     *                                                                         &lt;enumeration value="true"/>
     *                                                                       &lt;/restriction>
     *                                                                     &lt;/simpleType>
     *                                                                   &lt;/attribute>
     *                                                                   &lt;attribute name="MealPlanCodes" use="required">
     *                                                                     &lt;simpleType>
     *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                         &lt;enumeration value="1"/>
     *                                                                         &lt;enumeration value="3"/>
     *                                                                         &lt;enumeration value="10"/>
     *                                                                         &lt;enumeration value="12"/>
     *                                                                         &lt;enumeration value="14"/>
     *                                                                       &lt;/restriction>
     *                                                                     &lt;/simpleType>
     *                                                                   &lt;/attribute>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="GuestCounts" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="GuestCount" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                                         &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TimeSpan">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="StartDateWindow" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                                         &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                               &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                               &lt;attribute name="Duration">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;pattern value="P[0-9]+N"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Total" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
     *                                               &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ResGuests" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ResGuest">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Profiles">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ProfileInfo">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Profile">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Customer">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="PersonName">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
     *                                                                                         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
     *                                                                                         &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
     *                                                                                         &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;attribute name="PhoneTechType" use="required">
     *                                                                                         &lt;simpleType>
     *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                             &lt;pattern value="(1|3|5)"/>
     *                                                                                           &lt;/restriction>
     *                                                                                         &lt;/simpleType>
     *                                                                                       &lt;/attribute>
     *                                                                                       &lt;attribute name="PhoneNumber" use="required">
     *                                                                                         &lt;simpleType>
     *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                             &lt;pattern value="\+?[0-9]+"/>
     *                                                                                           &lt;/restriction>
     *                                                                                         &lt;/simpleType>
     *                                                                                       &lt;/attribute>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="Email" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;simpleContent>
     *                                                                                     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
     *                                                                                       &lt;attribute name="Remark">
     *                                                                                         &lt;simpleType>
     *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                             &lt;pattern value="newsletter:(no|yes)"/>
     *                                                                                           &lt;/restriction>
     *                                                                                         &lt;/simpleType>
     *                                                                                       &lt;/attribute>
     *                                                                                     &lt;/extension>
     *                                                                                   &lt;/simpleContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="Address" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
     *                                                                                         &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
     *                                                                                         &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
     *                                                                                         &lt;element name="CountryName">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;attribute name="Code" use="required">
     *                                                                                                   &lt;simpleType>
     *                                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                                       &lt;pattern value="[A-Z][A-Z]"/>
     *                                                                                                     &lt;/restriction>
     *                                                                                                   &lt;/simpleType>
     *                                                                                                 &lt;/attribute>
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                       &lt;/sequence>
     *                                                                                       &lt;attribute name="Remark">
     *                                                                                         &lt;simpleType>
     *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                             &lt;pattern value="catalog:(no|yes)"/>
     *                                                                                           &lt;/restriction>
     *                                                                                         &lt;/simpleType>
     *                                                                                       &lt;/attribute>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="Gender" use="required">
     *                                                                               &lt;simpleType>
     *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                   &lt;pattern value="(Unknown|Male|Female)"/>
     *                                                                                 &lt;/restriction>
     *                                                                               &lt;/simpleType>
     *                                                                             &lt;/attribute>
     *                                                                             &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                                                             &lt;attribute name="Language" use="required">
     *                                                                               &lt;simpleType>
     *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
     *                                                                                   &lt;pattern value="[a-z][a-z]"/>
     *                                                                                 &lt;/restriction>
     *                                                                               &lt;/simpleType>
     *                                                                             &lt;/attribute>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
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
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ResGlobalInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Comments" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Comment" maxOccurs="2">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;choice>
     *                                                   &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
     *                                                     &lt;complexType>
     *                                                       &lt;simpleContent>
     *                                                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
     *                                                           &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
     *                                                           &lt;attribute name="Language" use="required">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
     *                                                                 &lt;pattern value="[a-z][a-z]"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/attribute>
     *                                                         &lt;/extension>
     *                                                       &lt;/simpleContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
     *                                                 &lt;/choice>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Name" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="included services"/>
     *                                                     &lt;enumeration value="customer comment"/>
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
     *                             &lt;element name="CancelPenalties" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CancelPenalty">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PenaltyDescription">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
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
     *                             &lt;element name="HotelReservationIDs" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="HotelReservationID">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="ResID_Type" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="13"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                                               &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                                               &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CreateDateTime" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" />
     *                 &lt;attribute name="ResStatus" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Requested"/>
     *                       &lt;enumeration value="Reserved"/>
     *                       &lt;enumeration value="Cancelled"/>
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
        "hotelReservation"
    })
    public static class ReservationsList {

        @XmlElement(name = "HotelReservation")
        protected List<OTAResRetrieveRS.ReservationsList.HotelReservation> hotelReservation;

        /**
         * Gets the value of the hotelReservation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelReservation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelReservation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAResRetrieveRS.ReservationsList.HotelReservation }
         * 
         * 
         */
        public List<OTAResRetrieveRS.ReservationsList.HotelReservation> getHotelReservation() {
            if (hotelReservation == null) {
                hotelReservation = new ArrayList<OTAResRetrieveRS.ReservationsList.HotelReservation>();
            }
            return this.hotelReservation;
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
         *         &lt;element name="UniqueID">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Type" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="14"/>
         *                       &lt;enumeration value="15"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RoomStays" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RoomStay" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="RoomTypes" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="RoomType">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RatePlans" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="RatePlan">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="MealsIncluded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="MealPlanIndicator" use="required">
         *                                                           &lt;simpleType>
         *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                               &lt;enumeration value="1"/>
         *                                                               &lt;enumeration value="true"/>
         *                                                             &lt;/restriction>
         *                                                           &lt;/simpleType>
         *                                                         &lt;/attribute>
         *                                                         &lt;attribute name="MealPlanCodes" use="required">
         *                                                           &lt;simpleType>
         *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                               &lt;enumeration value="1"/>
         *                                                               &lt;enumeration value="3"/>
         *                                                               &lt;enumeration value="10"/>
         *                                                               &lt;enumeration value="12"/>
         *                                                               &lt;enumeration value="14"/>
         *                                                             &lt;/restriction>
         *                                                           &lt;/simpleType>
         *                                                         &lt;/attribute>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="GuestCounts" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="GuestCount" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                               &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TimeSpan">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="StartDateWindow" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                                               &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                                     &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                                     &lt;attribute name="Duration">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;pattern value="P[0-9]+N"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Total" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
         *                                     &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ResGuests" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ResGuest">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Profiles">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ProfileInfo">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Profile">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Customer">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="PersonName">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
         *                                                                               &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
         *                                                                               &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
         *                                                                               &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;attribute name="PhoneTechType" use="required">
         *                                                                               &lt;simpleType>
         *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                   &lt;pattern value="(1|3|5)"/>
         *                                                                                 &lt;/restriction>
         *                                                                               &lt;/simpleType>
         *                                                                             &lt;/attribute>
         *                                                                             &lt;attribute name="PhoneNumber" use="required">
         *                                                                               &lt;simpleType>
         *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                   &lt;pattern value="\+?[0-9]+"/>
         *                                                                                 &lt;/restriction>
         *                                                                               &lt;/simpleType>
         *                                                                             &lt;/attribute>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="Email" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;simpleContent>
         *                                                                           &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
         *                                                                             &lt;attribute name="Remark">
         *                                                                               &lt;simpleType>
         *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                   &lt;pattern value="newsletter:(no|yes)"/>
         *                                                                                 &lt;/restriction>
         *                                                                               &lt;/simpleType>
         *                                                                             &lt;/attribute>
         *                                                                           &lt;/extension>
         *                                                                         &lt;/simpleContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="Address" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
         *                                                                               &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
         *                                                                               &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
         *                                                                               &lt;element name="CountryName">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;complexContent>
         *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                                       &lt;attribute name="Code" use="required">
         *                                                                                         &lt;simpleType>
         *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                             &lt;pattern value="[A-Z][A-Z]"/>
         *                                                                                           &lt;/restriction>
         *                                                                                         &lt;/simpleType>
         *                                                                                       &lt;/attribute>
         *                                                                                     &lt;/restriction>
         *                                                                                   &lt;/complexContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                             &lt;/sequence>
         *                                                                             &lt;attribute name="Remark">
         *                                                                               &lt;simpleType>
         *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                   &lt;pattern value="catalog:(no|yes)"/>
         *                                                                                 &lt;/restriction>
         *                                                                               &lt;/simpleType>
         *                                                                             &lt;/attribute>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                   &lt;attribute name="Gender" use="required">
         *                                                                     &lt;simpleType>
         *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                         &lt;pattern value="(Unknown|Male|Female)"/>
         *                                                                       &lt;/restriction>
         *                                                                     &lt;/simpleType>
         *                                                                   &lt;/attribute>
         *                                                                   &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                                                                   &lt;attribute name="Language" use="required">
         *                                                                     &lt;simpleType>
         *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
         *                                                                         &lt;pattern value="[a-z][a-z]"/>
         *                                                                       &lt;/restriction>
         *                                                                     &lt;/simpleType>
         *                                                                   &lt;/attribute>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
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
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ResGlobalInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Comments" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Comment" maxOccurs="2">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;choice>
         *                                         &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
         *                                           &lt;complexType>
         *                                             &lt;simpleContent>
         *                                               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
         *                                                 &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
         *                                                 &lt;attribute name="Language" use="required">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
         *                                                       &lt;pattern value="[a-z][a-z]"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/attribute>
         *                                               &lt;/extension>
         *                                             &lt;/simpleContent>
         *                                           &lt;/complexType>
         *                                         &lt;/element>
         *                                         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
         *                                       &lt;/choice>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Name" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="included services"/>
         *                                           &lt;enumeration value="customer comment"/>
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
         *                   &lt;element name="CancelPenalties" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CancelPenalty">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PenaltyDescription">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
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
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="HotelReservationIDs" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="HotelReservationID">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="ResID_Type" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="13"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *                                     &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *                                     &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CreateDateTime" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" />
         *       &lt;attribute name="ResStatus" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Requested"/>
         *             &lt;enumeration value="Reserved"/>
         *             &lt;enumeration value="Cancelled"/>
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
        @XmlType(name = "", propOrder = {
            "uniqueID",
            "roomStays",
            "resGuests",
            "resGlobalInfo"
        })
        public static class HotelReservation {

            @XmlElement(name = "UniqueID", required = true)
            protected OTAResRetrieveRS.ReservationsList.HotelReservation.UniqueID uniqueID;
            @XmlElement(name = "RoomStays")
            protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays roomStays;
            @XmlElement(name = "ResGuests")
            protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests resGuests;
            @XmlElement(name = "ResGlobalInfo")
            protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo resGlobalInfo;
            @XmlAttribute(name = "CreateDateTime", required = true)
            protected XMLGregorianCalendar createDateTime;
            @XmlAttribute(name = "ResStatus", required = true)
            protected String resStatus;

            /**
             * Gets the value of the uniqueID property.
             * 
             * @return
             *     possible object is
             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.UniqueID }
             *     
             */
            public OTAResRetrieveRS.ReservationsList.HotelReservation.UniqueID getUniqueID() {
                return uniqueID;
            }

            /**
             * Sets the value of the uniqueID property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.UniqueID }
             *     
             */
            public void setUniqueID(OTAResRetrieveRS.ReservationsList.HotelReservation.UniqueID value) {
                this.uniqueID = value;
            }

            /**
             * Gets the value of the roomStays property.
             * 
             * @return
             *     possible object is
             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays }
             *     
             */
            public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays getRoomStays() {
                return roomStays;
            }

            /**
             * Sets the value of the roomStays property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays }
             *     
             */
            public void setRoomStays(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays value) {
                this.roomStays = value;
            }

            /**
             * Gets the value of the resGuests property.
             * 
             * @return
             *     possible object is
             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests }
             *     
             */
            public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests getResGuests() {
                return resGuests;
            }

            /**
             * Sets the value of the resGuests property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests }
             *     
             */
            public void setResGuests(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests value) {
                this.resGuests = value;
            }

            /**
             * Gets the value of the resGlobalInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo }
             *     
             */
            public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo getResGlobalInfo() {
                return resGlobalInfo;
            }

            /**
             * Sets the value of the resGlobalInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo }
             *     
             */
            public void setResGlobalInfo(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo value) {
                this.resGlobalInfo = value;
            }

            /**
             * Gets the value of the createDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreateDateTime() {
                return createDateTime;
            }

            /**
             * Sets the value of the createDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreateDateTime(XMLGregorianCalendar value) {
                this.createDateTime = value;
            }

            /**
             * Gets the value of the resStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResStatus() {
                return resStatus;
            }

            /**
             * Sets the value of the resStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResStatus(String value) {
                this.resStatus = value;
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
             *         &lt;element name="Comments" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Comment" maxOccurs="2">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;choice>
             *                               &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
             *                                 &lt;complexType>
             *                                   &lt;simpleContent>
             *                                     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
             *                                       &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
             *                                       &lt;attribute name="Language" use="required">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
             *                                             &lt;pattern value="[a-z][a-z]"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/attribute>
             *                                     &lt;/extension>
             *                                   &lt;/simpleContent>
             *                                 &lt;/complexType>
             *                               &lt;/element>
             *                               &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
             *                             &lt;/choice>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Name" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="included services"/>
             *                                 &lt;enumeration value="customer comment"/>
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
             *         &lt;element name="CancelPenalties" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CancelPenalty">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PenaltyDescription">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
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
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="HotelReservationIDs" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="HotelReservationID">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ResID_Type" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="13"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *                           &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *                           &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "comments",
                "cancelPenalties",
                "hotelReservationIDs"
            })
            public static class ResGlobalInfo {

                @XmlElement(name = "Comments")
                protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments comments;
                @XmlElement(name = "CancelPenalties")
                protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties cancelPenalties;
                @XmlElement(name = "HotelReservationIDs")
                protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs hotelReservationIDs;

                /**
                 * Gets the value of the comments property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments }
                 *     
                 */
                public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments getComments() {
                    return comments;
                }

                /**
                 * Sets the value of the comments property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments }
                 *     
                 */
                public void setComments(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments value) {
                    this.comments = value;
                }

                /**
                 * Gets the value of the cancelPenalties property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties }
                 *     
                 */
                public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties getCancelPenalties() {
                    return cancelPenalties;
                }

                /**
                 * Sets the value of the cancelPenalties property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties }
                 *     
                 */
                public void setCancelPenalties(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties value) {
                    this.cancelPenalties = value;
                }

                /**
                 * Gets the value of the hotelReservationIDs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs }
                 *     
                 */
                public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs getHotelReservationIDs() {
                    return hotelReservationIDs;
                }

                /**
                 * Sets the value of the hotelReservationIDs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs }
                 *     
                 */
                public void setHotelReservationIDs(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs value) {
                    this.hotelReservationIDs = value;
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
                 *         &lt;element name="CancelPenalty">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PenaltyDescription">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
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
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "cancelPenalty"
                })
                public static class CancelPenalties {

                    @XmlElement(name = "CancelPenalty", required = true)
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty cancelPenalty;

                    /**
                     * Gets the value of the cancelPenalty property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty }
                     *     
                     */
                    public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty getCancelPenalty() {
                        return cancelPenalty;
                    }

                    /**
                     * Sets the value of the cancelPenalty property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty }
                     *     
                     */
                    public void setCancelPenalty(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty value) {
                        this.cancelPenalty = value;
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
                     *         &lt;element name="PenaltyDescription">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
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
                        "penaltyDescription"
                    })
                    public static class CancelPenalty {

                        @XmlElement(name = "PenaltyDescription", required = true)
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty.PenaltyDescription penaltyDescription;

                        /**
                         * Gets the value of the penaltyDescription property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty.PenaltyDescription }
                         *     
                         */
                        public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty.PenaltyDescription getPenaltyDescription() {
                            return penaltyDescription;
                        }

                        /**
                         * Sets the value of the penaltyDescription property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty.PenaltyDescription }
                         *     
                         */
                        public void setPenaltyDescription(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty.PenaltyDescription value) {
                            this.penaltyDescription = value;
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
                         *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
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
                        public static class PenaltyDescription {

                            @XmlElement(name = "Text", required = true)
                            protected String text;

                            /**
                             * Gets the value of the text property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getText() {
                                return text;
                            }

                            /**
                             * Sets the value of the text property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setText(String value) {
                                this.text = value;
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
                 *       &lt;sequence>
                 *         &lt;element name="Comment" maxOccurs="2">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;choice>
                 *                     &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
                 *                       &lt;complexType>
                 *                         &lt;simpleContent>
                 *                           &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
                 *                             &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
                 *                             &lt;attribute name="Language" use="required">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                 *                                   &lt;pattern value="[a-z][a-z]"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/attribute>
                 *                           &lt;/extension>
                 *                         &lt;/simpleContent>
                 *                       &lt;/complexType>
                 *                     &lt;/element>
                 *                     &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                 *                   &lt;/choice>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Name" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="included services"/>
                 *                       &lt;enumeration value="customer comment"/>
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
                    "comment"
                })
                public static class Comments {

                    @XmlElement(name = "Comment", required = true)
                    protected List<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments.Comment> comment;

                    /**
                     * Gets the value of the comment property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the comment property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getComment().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments.Comment }
                     * 
                     * 
                     */
                    public List<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments.Comment> getComment() {
                        if (comment == null) {
                            comment = new ArrayList<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments.Comment>();
                        }
                        return this.comment;
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
                     *         &lt;choice>
                     *           &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
                     *             &lt;complexType>
                     *               &lt;simpleContent>
                     *                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
                     *                   &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
                     *                   &lt;attribute name="Language" use="required">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                     *                         &lt;pattern value="[a-z][a-z]"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/attribute>
                     *                 &lt;/extension>
                     *               &lt;/simpleContent>
                     *             &lt;/complexType>
                     *           &lt;/element>
                     *           &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                     *         &lt;/choice>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Name" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="included services"/>
                     *             &lt;enumeration value="customer comment"/>
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
                    @XmlType(name = "", propOrder = {
                        "listItem",
                        "text"
                    })
                    public static class Comment {

                        @XmlElement(name = "ListItem")
                        protected List<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments.Comment.ListItem> listItem;
                        @XmlElement(name = "Text")
                        protected String text;
                        @XmlAttribute(name = "Name", required = true)
                        protected String name;

                        /**
                         * Gets the value of the listItem property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the listItem property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getListItem().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments.Comment.ListItem }
                         * 
                         * 
                         */
                        public List<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments.Comment.ListItem> getListItem() {
                            if (listItem == null) {
                                listItem = new ArrayList<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.Comments.Comment.ListItem>();
                            }
                            return this.listItem;
                        }

                        /**
                         * Gets the value of the text property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getText() {
                            return text;
                        }

                        /**
                         * Sets the value of the text property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setText(String value) {
                            this.text = value;
                        }

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
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
                         *       &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
                        public static class ListItem {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "ListItem", required = true)
                            protected BigInteger listItem;
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
                             * Gets the value of the listItem property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getListItem() {
                                return listItem;
                            }

                            /**
                             * Sets the value of the listItem property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setListItem(BigInteger value) {
                                this.listItem = value;
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
                 *         &lt;element name="HotelReservationID">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ResID_Type" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="13"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                 *                 &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                 *                 &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
                    "hotelReservationID"
                })
                public static class HotelReservationIDs {

                    @XmlElement(name = "HotelReservationID", required = true)
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID hotelReservationID;

                    /**
                     * Gets the value of the hotelReservationID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID }
                     *     
                     */
                    public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID getHotelReservationID() {
                        return hotelReservationID;
                    }

                    /**
                     * Sets the value of the hotelReservationID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID }
                     *     
                     */
                    public void setHotelReservationID(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID value) {
                        this.hotelReservationID = value;
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
                     *       &lt;attribute name="ResID_Type" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="13"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                     *       &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                     *       &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class HotelReservationID {

                        @XmlAttribute(name = "ResID_Type", required = true)
                        protected String resIDType;
                        @XmlAttribute(name = "ResID_Value")
                        protected String resIDValue;
                        @XmlAttribute(name = "ResID_Source")
                        protected String resIDSource;
                        @XmlAttribute(name = "ResID_SourceContext")
                        protected String resIDSourceContext;

                        /**
                         * Gets the value of the resIDType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getResIDType() {
                            return resIDType;
                        }

                        /**
                         * Sets the value of the resIDType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setResIDType(String value) {
                            this.resIDType = value;
                        }

                        /**
                         * Gets the value of the resIDValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getResIDValue() {
                            return resIDValue;
                        }

                        /**
                         * Sets the value of the resIDValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setResIDValue(String value) {
                            this.resIDValue = value;
                        }

                        /**
                         * Gets the value of the resIDSource property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getResIDSource() {
                            return resIDSource;
                        }

                        /**
                         * Sets the value of the resIDSource property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setResIDSource(String value) {
                            this.resIDSource = value;
                        }

                        /**
                         * Gets the value of the resIDSourceContext property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getResIDSourceContext() {
                            return resIDSourceContext;
                        }

                        /**
                         * Sets the value of the resIDSourceContext property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setResIDSourceContext(String value) {
                            this.resIDSourceContext = value;
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
             *       &lt;sequence>
             *         &lt;element name="ResGuest">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Profiles">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ProfileInfo">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Profile">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Customer">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="PersonName">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
             *                                                                     &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
             *                                                                     &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
             *                                                                     &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;attribute name="PhoneTechType" use="required">
             *                                                                     &lt;simpleType>
             *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                         &lt;pattern value="(1|3|5)"/>
             *                                                                       &lt;/restriction>
             *                                                                     &lt;/simpleType>
             *                                                                   &lt;/attribute>
             *                                                                   &lt;attribute name="PhoneNumber" use="required">
             *                                                                     &lt;simpleType>
             *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                         &lt;pattern value="\+?[0-9]+"/>
             *                                                                       &lt;/restriction>
             *                                                                     &lt;/simpleType>
             *                                                                   &lt;/attribute>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="Email" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;simpleContent>
             *                                                                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
             *                                                                   &lt;attribute name="Remark">
             *                                                                     &lt;simpleType>
             *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                         &lt;pattern value="newsletter:(no|yes)"/>
             *                                                                       &lt;/restriction>
             *                                                                     &lt;/simpleType>
             *                                                                   &lt;/attribute>
             *                                                                 &lt;/extension>
             *                                                               &lt;/simpleContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="Address" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
             *                                                                     &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
             *                                                                     &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
             *                                                                     &lt;element name="CountryName">
             *                                                                       &lt;complexType>
             *                                                                         &lt;complexContent>
             *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                             &lt;attribute name="Code" use="required">
             *                                                                               &lt;simpleType>
             *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                                   &lt;pattern value="[A-Z][A-Z]"/>
             *                                                                                 &lt;/restriction>
             *                                                                               &lt;/simpleType>
             *                                                                             &lt;/attribute>
             *                                                                           &lt;/restriction>
             *                                                                         &lt;/complexContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                   &lt;/sequence>
             *                                                                   &lt;attribute name="Remark">
             *                                                                     &lt;simpleType>
             *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                         &lt;pattern value="catalog:(no|yes)"/>
             *                                                                       &lt;/restriction>
             *                                                                     &lt;/simpleType>
             *                                                                   &lt;/attribute>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                         &lt;attribute name="Gender" use="required">
             *                                                           &lt;simpleType>
             *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                               &lt;pattern value="(Unknown|Male|Female)"/>
             *                                                             &lt;/restriction>
             *                                                           &lt;/simpleType>
             *                                                         &lt;/attribute>
             *                                                         &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                                                         &lt;attribute name="Language" use="required">
             *                                                           &lt;simpleType>
             *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
             *                                                               &lt;pattern value="[a-z][a-z]"/>
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
                "resGuest"
            })
            public static class ResGuests {

                @XmlElement(name = "ResGuest", required = true)
                protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest resGuest;

                /**
                 * Gets the value of the resGuest property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest }
                 *     
                 */
                public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest getResGuest() {
                    return resGuest;
                }

                /**
                 * Sets the value of the resGuest property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest }
                 *     
                 */
                public void setResGuest(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest value) {
                    this.resGuest = value;
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
                 *         &lt;element name="Profiles">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ProfileInfo">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Profile">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Customer">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="PersonName">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                 *                                                           &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                 *                                                           &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                 *                                                           &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;attribute name="PhoneTechType" use="required">
                 *                                                           &lt;simpleType>
                 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                               &lt;pattern value="(1|3|5)"/>
                 *                                                             &lt;/restriction>
                 *                                                           &lt;/simpleType>
                 *                                                         &lt;/attribute>
                 *                                                         &lt;attribute name="PhoneNumber" use="required">
                 *                                                           &lt;simpleType>
                 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                               &lt;pattern value="\+?[0-9]+"/>
                 *                                                             &lt;/restriction>
                 *                                                           &lt;/simpleType>
                 *                                                         &lt;/attribute>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="Email" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;simpleContent>
                 *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
                 *                                                         &lt;attribute name="Remark">
                 *                                                           &lt;simpleType>
                 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                               &lt;pattern value="newsletter:(no|yes)"/>
                 *                                                             &lt;/restriction>
                 *                                                           &lt;/simpleType>
                 *                                                         &lt;/attribute>
                 *                                                       &lt;/extension>
                 *                                                     &lt;/simpleContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="Address" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                 *                                                           &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                 *                                                           &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                 *                                                           &lt;element name="CountryName">
                 *                                                             &lt;complexType>
                 *                                                               &lt;complexContent>
                 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                                   &lt;attribute name="Code" use="required">
                 *                                                                     &lt;simpleType>
                 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                                         &lt;pattern value="[A-Z][A-Z]"/>
                 *                                                                       &lt;/restriction>
                 *                                                                     &lt;/simpleType>
                 *                                                                   &lt;/attribute>
                 *                                                                 &lt;/restriction>
                 *                                                               &lt;/complexContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                         &lt;/sequence>
                 *                                                         &lt;attribute name="Remark">
                 *                                                           &lt;simpleType>
                 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                               &lt;pattern value="catalog:(no|yes)"/>
                 *                                                             &lt;/restriction>
                 *                                                           &lt;/simpleType>
                 *                                                         &lt;/attribute>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                               &lt;attribute name="Gender" use="required">
                 *                                                 &lt;simpleType>
                 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                     &lt;pattern value="(Unknown|Male|Female)"/>
                 *                                                   &lt;/restriction>
                 *                                                 &lt;/simpleType>
                 *                                               &lt;/attribute>
                 *                                               &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *                                               &lt;attribute name="Language" use="required">
                 *                                                 &lt;simpleType>
                 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                 *                                                     &lt;pattern value="[a-z][a-z]"/>
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
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "profiles"
                })
                public static class ResGuest {

                    @XmlElement(name = "Profiles", required = true)
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles profiles;

                    /**
                     * Gets the value of the profiles property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles }
                     *     
                     */
                    public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles getProfiles() {
                        return profiles;
                    }

                    /**
                     * Sets the value of the profiles property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles }
                     *     
                     */
                    public void setProfiles(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles value) {
                        this.profiles = value;
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
                     *         &lt;element name="ProfileInfo">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Profile">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Customer">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="PersonName">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                     *                                                 &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                     *                                                 &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                     *                                                 &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                     *                                               &lt;/sequence>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                       &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;attribute name="PhoneTechType" use="required">
                     *                                                 &lt;simpleType>
                     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                     &lt;pattern value="(1|3|5)"/>
                     *                                                   &lt;/restriction>
                     *                                                 &lt;/simpleType>
                     *                                               &lt;/attribute>
                     *                                               &lt;attribute name="PhoneNumber" use="required">
                     *                                                 &lt;simpleType>
                     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                     &lt;pattern value="\+?[0-9]+"/>
                     *                                                   &lt;/restriction>
                     *                                                 &lt;/simpleType>
                     *                                               &lt;/attribute>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                       &lt;element name="Email" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;simpleContent>
                     *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
                     *                                               &lt;attribute name="Remark">
                     *                                                 &lt;simpleType>
                     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                     &lt;pattern value="newsletter:(no|yes)"/>
                     *                                                   &lt;/restriction>
                     *                                                 &lt;/simpleType>
                     *                                               &lt;/attribute>
                     *                                             &lt;/extension>
                     *                                           &lt;/simpleContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                       &lt;element name="Address" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                     *                                                 &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                     *                                                 &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                     *                                                 &lt;element name="CountryName">
                     *                                                   &lt;complexType>
                     *                                                     &lt;complexContent>
                     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                                         &lt;attribute name="Code" use="required">
                     *                                                           &lt;simpleType>
                     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                               &lt;pattern value="[A-Z][A-Z]"/>
                     *                                                             &lt;/restriction>
                     *                                                           &lt;/simpleType>
                     *                                                         &lt;/attribute>
                     *                                                       &lt;/restriction>
                     *                                                     &lt;/complexContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                               &lt;/sequence>
                     *                                               &lt;attribute name="Remark">
                     *                                                 &lt;simpleType>
                     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                     &lt;pattern value="catalog:(no|yes)"/>
                     *                                                   &lt;/restriction>
                     *                                                 &lt;/simpleType>
                     *                                               &lt;/attribute>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                     &lt;/sequence>
                     *                                     &lt;attribute name="Gender" use="required">
                     *                                       &lt;simpleType>
                     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                           &lt;pattern value="(Unknown|Male|Female)"/>
                     *                                         &lt;/restriction>
                     *                                       &lt;/simpleType>
                     *                                     &lt;/attribute>
                     *                                     &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                     *                                     &lt;attribute name="Language" use="required">
                     *                                       &lt;simpleType>
                     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                     *                                           &lt;pattern value="[a-z][a-z]"/>
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
                        "profileInfo"
                    })
                    public static class Profiles {

                        @XmlElement(name = "ProfileInfo", required = true)
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo profileInfo;

                        /**
                         * Gets the value of the profileInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo }
                         *     
                         */
                        public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo getProfileInfo() {
                            return profileInfo;
                        }

                        /**
                         * Sets the value of the profileInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo }
                         *     
                         */
                        public void setProfileInfo(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo value) {
                            this.profileInfo = value;
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
                         *         &lt;element name="Profile">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Customer">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="PersonName">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                         *                                       &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                         *                                       &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                         *                                       &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                         *                                     &lt;/sequence>
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                             &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;attribute name="PhoneTechType" use="required">
                         *                                       &lt;simpleType>
                         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                           &lt;pattern value="(1|3|5)"/>
                         *                                         &lt;/restriction>
                         *                                       &lt;/simpleType>
                         *                                     &lt;/attribute>
                         *                                     &lt;attribute name="PhoneNumber" use="required">
                         *                                       &lt;simpleType>
                         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                           &lt;pattern value="\+?[0-9]+"/>
                         *                                         &lt;/restriction>
                         *                                       &lt;/simpleType>
                         *                                     &lt;/attribute>
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                             &lt;element name="Email" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;simpleContent>
                         *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
                         *                                     &lt;attribute name="Remark">
                         *                                       &lt;simpleType>
                         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                           &lt;pattern value="newsletter:(no|yes)"/>
                         *                                         &lt;/restriction>
                         *                                       &lt;/simpleType>
                         *                                     &lt;/attribute>
                         *                                   &lt;/extension>
                         *                                 &lt;/simpleContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                             &lt;element name="Address" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                         *                                       &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                         *                                       &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                         *                                       &lt;element name="CountryName">
                         *                                         &lt;complexType>
                         *                                           &lt;complexContent>
                         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                               &lt;attribute name="Code" use="required">
                         *                                                 &lt;simpleType>
                         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                                     &lt;pattern value="[A-Z][A-Z]"/>
                         *                                                   &lt;/restriction>
                         *                                                 &lt;/simpleType>
                         *                                               &lt;/attribute>
                         *                                             &lt;/restriction>
                         *                                           &lt;/complexContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                     &lt;/sequence>
                         *                                     &lt;attribute name="Remark">
                         *                                       &lt;simpleType>
                         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                           &lt;pattern value="catalog:(no|yes)"/>
                         *                                         &lt;/restriction>
                         *                                       &lt;/simpleType>
                         *                                     &lt;/attribute>
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                           &lt;/sequence>
                         *                           &lt;attribute name="Gender" use="required">
                         *                             &lt;simpleType>
                         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                 &lt;pattern value="(Unknown|Male|Female)"/>
                         *                               &lt;/restriction>
                         *                             &lt;/simpleType>
                         *                           &lt;/attribute>
                         *                           &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                         *                           &lt;attribute name="Language" use="required">
                         *                             &lt;simpleType>
                         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                         *                                 &lt;pattern value="[a-z][a-z]"/>
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
                            "profile"
                        })
                        public static class ProfileInfo {

                            @XmlElement(name = "Profile", required = true)
                            protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile profile;

                            /**
                             * Gets the value of the profile property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile }
                             *     
                             */
                            public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile getProfile() {
                                return profile;
                            }

                            /**
                             * Sets the value of the profile property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile }
                             *     
                             */
                            public void setProfile(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile value) {
                                this.profile = value;
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
                             *         &lt;element name="Customer">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="PersonName">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                             *                             &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                             *                             &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                             *                             &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                             *                           &lt;/sequence>
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                   &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;attribute name="PhoneTechType" use="required">
                             *                             &lt;simpleType>
                             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                 &lt;pattern value="(1|3|5)"/>
                             *                               &lt;/restriction>
                             *                             &lt;/simpleType>
                             *                           &lt;/attribute>
                             *                           &lt;attribute name="PhoneNumber" use="required">
                             *                             &lt;simpleType>
                             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                 &lt;pattern value="\+?[0-9]+"/>
                             *                               &lt;/restriction>
                             *                             &lt;/simpleType>
                             *                           &lt;/attribute>
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                   &lt;element name="Email" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;simpleContent>
                             *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
                             *                           &lt;attribute name="Remark">
                             *                             &lt;simpleType>
                             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                 &lt;pattern value="newsletter:(no|yes)"/>
                             *                               &lt;/restriction>
                             *                             &lt;/simpleType>
                             *                           &lt;/attribute>
                             *                         &lt;/extension>
                             *                       &lt;/simpleContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                   &lt;element name="Address" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                             *                             &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                             *                             &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                             *                             &lt;element name="CountryName">
                             *                               &lt;complexType>
                             *                                 &lt;complexContent>
                             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                                     &lt;attribute name="Code" use="required">
                             *                                       &lt;simpleType>
                             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                           &lt;pattern value="[A-Z][A-Z]"/>
                             *                                         &lt;/restriction>
                             *                                       &lt;/simpleType>
                             *                                     &lt;/attribute>
                             *                                   &lt;/restriction>
                             *                                 &lt;/complexContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                           &lt;/sequence>
                             *                           &lt;attribute name="Remark">
                             *                             &lt;simpleType>
                             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                 &lt;pattern value="catalog:(no|yes)"/>
                             *                               &lt;/restriction>
                             *                             &lt;/simpleType>
                             *                           &lt;/attribute>
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                 &lt;/sequence>
                             *                 &lt;attribute name="Gender" use="required">
                             *                   &lt;simpleType>
                             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                       &lt;pattern value="(Unknown|Male|Female)"/>
                             *                     &lt;/restriction>
                             *                   &lt;/simpleType>
                             *                 &lt;/attribute>
                             *                 &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                             *                 &lt;attribute name="Language" use="required">
                             *                   &lt;simpleType>
                             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                             *                       &lt;pattern value="[a-z][a-z]"/>
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
                                "customer"
                            })
                            public static class Profile {

                                @XmlElement(name = "Customer", required = true)
                                protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer customer;

                                /**
                                 * Gets the value of the customer property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer }
                                 *     
                                 */
                                public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer getCustomer() {
                                    return customer;
                                }

                                /**
                                 * Sets the value of the customer property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer }
                                 *     
                                 */
                                public void setCustomer(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer value) {
                                    this.customer = value;
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
                                 *         &lt;element name="PersonName">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                                 *                   &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                 *                   &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                 *                   &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                                 *                 &lt;/sequence>
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;attribute name="PhoneTechType" use="required">
                                 *                   &lt;simpleType>
                                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                       &lt;pattern value="(1|3|5)"/>
                                 *                     &lt;/restriction>
                                 *                   &lt;/simpleType>
                                 *                 &lt;/attribute>
                                 *                 &lt;attribute name="PhoneNumber" use="required">
                                 *                   &lt;simpleType>
                                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                       &lt;pattern value="\+?[0-9]+"/>
                                 *                     &lt;/restriction>
                                 *                   &lt;/simpleType>
                                 *                 &lt;/attribute>
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *         &lt;element name="Email" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;simpleContent>
                                 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
                                 *                 &lt;attribute name="Remark">
                                 *                   &lt;simpleType>
                                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                       &lt;pattern value="newsletter:(no|yes)"/>
                                 *                     &lt;/restriction>
                                 *                   &lt;/simpleType>
                                 *                 &lt;/attribute>
                                 *               &lt;/extension>
                                 *             &lt;/simpleContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *         &lt;element name="Address" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                 *                   &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                 *                   &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                 *                   &lt;element name="CountryName">
                                 *                     &lt;complexType>
                                 *                       &lt;complexContent>
                                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                           &lt;attribute name="Code" use="required">
                                 *                             &lt;simpleType>
                                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                                 &lt;pattern value="[A-Z][A-Z]"/>
                                 *                               &lt;/restriction>
                                 *                             &lt;/simpleType>
                                 *                           &lt;/attribute>
                                 *                         &lt;/restriction>
                                 *                       &lt;/complexContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                 &lt;/sequence>
                                 *                 &lt;attribute name="Remark">
                                 *                   &lt;simpleType>
                                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                       &lt;pattern value="catalog:(no|yes)"/>
                                 *                     &lt;/restriction>
                                 *                   &lt;/simpleType>
                                 *                 &lt;/attribute>
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *       &lt;/sequence>
                                 *       &lt;attribute name="Gender" use="required">
                                 *         &lt;simpleType>
                                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *             &lt;pattern value="(Unknown|Male|Female)"/>
                                 *           &lt;/restriction>
                                 *         &lt;/simpleType>
                                 *       &lt;/attribute>
                                 *       &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                                 *       &lt;attribute name="Language" use="required">
                                 *         &lt;simpleType>
                                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
                                 *             &lt;pattern value="[a-z][a-z]"/>
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
                                @XmlType(name = "", propOrder = {
                                    "personName",
                                    "telephone",
                                    "email",
                                    "address"
                                })
                                public static class Customer {

                                    @XmlElement(name = "PersonName", required = true)
                                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName personName;
                                    @XmlElement(name = "Telephone")
                                    protected List<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Telephone> telephone;
                                    @XmlElement(name = "Email")
                                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Email email;
                                    @XmlElement(name = "Address")
                                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address address;
                                    @XmlAttribute(name = "Gender", required = true)
                                    protected String gender;
                                    @XmlAttribute(name = "BirthDate")
                                    protected XMLGregorianCalendar birthDate;
                                    @XmlAttribute(name = "Language", required = true)
                                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                                    protected String language;

                                    /**
                                     * Gets the value of the personName property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName }
                                     *     
                                     */
                                    public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName getPersonName() {
                                        return personName;
                                    }

                                    /**
                                     * Sets the value of the personName property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName }
                                     *     
                                     */
                                    public void setPersonName(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName value) {
                                        this.personName = value;
                                    }

                                    /**
                                     * Gets the value of the telephone property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the telephone property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getTelephone().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Telephone }
                                     * 
                                     * 
                                     */
                                    public List<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Telephone> getTelephone() {
                                        if (telephone == null) {
                                            telephone = new ArrayList<OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Telephone>();
                                        }
                                        return this.telephone;
                                    }

                                    /**
                                     * Gets the value of the email property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Email }
                                     *     
                                     */
                                    public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Email getEmail() {
                                        return email;
                                    }

                                    /**
                                     * Sets the value of the email property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Email }
                                     *     
                                     */
                                    public void setEmail(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Email value) {
                                        this.email = value;
                                    }

                                    /**
                                     * Gets the value of the address property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address }
                                     *     
                                     */
                                    public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address getAddress() {
                                        return address;
                                    }

                                    /**
                                     * Sets the value of the address property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address }
                                     *     
                                     */
                                    public void setAddress(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address value) {
                                        this.address = value;
                                    }

                                    /**
                                     * Gets the value of the gender property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getGender() {
                                        return gender;
                                    }

                                    /**
                                     * Sets the value of the gender property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setGender(String value) {
                                        this.gender = value;
                                    }

                                    /**
                                     * Gets the value of the birthDate property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link XMLGregorianCalendar }
                                     *     
                                     */
                                    public XMLGregorianCalendar getBirthDate() {
                                        return birthDate;
                                    }

                                    /**
                                     * Sets the value of the birthDate property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link XMLGregorianCalendar }
                                     *     
                                     */
                                    public void setBirthDate(XMLGregorianCalendar value) {
                                        this.birthDate = value;
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
                                     *         &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                     *         &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                     *         &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                     *         &lt;element name="CountryName">
                                     *           &lt;complexType>
                                     *             &lt;complexContent>
                                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *                 &lt;attribute name="Code" use="required">
                                     *                   &lt;simpleType>
                                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *                       &lt;pattern value="[A-Z][A-Z]"/>
                                     *                     &lt;/restriction>
                                     *                   &lt;/simpleType>
                                     *                 &lt;/attribute>
                                     *               &lt;/restriction>
                                     *             &lt;/complexContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *       &lt;/sequence>
                                     *       &lt;attribute name="Remark">
                                     *         &lt;simpleType>
                                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *             &lt;pattern value="catalog:(no|yes)"/>
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
                                    @XmlType(name = "", propOrder = {
                                        "addressLine",
                                        "cityName",
                                        "postalCode",
                                        "countryName"
                                    })
                                    public static class Address {

                                        @XmlElement(name = "AddressLine", required = true)
                                        protected String addressLine;
                                        @XmlElement(name = "CityName", required = true)
                                        protected String cityName;
                                        @XmlElement(name = "PostalCode", required = true)
                                        protected String postalCode;
                                        @XmlElement(name = "CountryName", required = true)
                                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address.CountryName countryName;
                                        @XmlAttribute(name = "Remark")
                                        protected String remark;

                                        /**
                                         * Gets the value of the addressLine property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getAddressLine() {
                                            return addressLine;
                                        }

                                        /**
                                         * Sets the value of the addressLine property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setAddressLine(String value) {
                                            this.addressLine = value;
                                        }

                                        /**
                                         * Gets the value of the cityName property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getCityName() {
                                            return cityName;
                                        }

                                        /**
                                         * Sets the value of the cityName property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setCityName(String value) {
                                            this.cityName = value;
                                        }

                                        /**
                                         * Gets the value of the postalCode property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getPostalCode() {
                                            return postalCode;
                                        }

                                        /**
                                         * Sets the value of the postalCode property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setPostalCode(String value) {
                                            this.postalCode = value;
                                        }

                                        /**
                                         * Gets the value of the countryName property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address.CountryName }
                                         *     
                                         */
                                        public OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address.CountryName getCountryName() {
                                            return countryName;
                                        }

                                        /**
                                         * Sets the value of the countryName property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address.CountryName }
                                         *     
                                         */
                                        public void setCountryName(OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address.CountryName value) {
                                            this.countryName = value;
                                        }

                                        /**
                                         * Gets the value of the remark property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getRemark() {
                                            return remark;
                                        }

                                        /**
                                         * Sets the value of the remark property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setRemark(String value) {
                                            this.remark = value;
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
                                         *       &lt;attribute name="Code" use="required">
                                         *         &lt;simpleType>
                                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                         *             &lt;pattern value="[A-Z][A-Z]"/>
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
                                        public static class CountryName {

                                            @XmlAttribute(name = "Code", required = true)
                                            protected String code;

                                            /**
                                             * Gets the value of the code property.
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *     
                                             */
                                            public String getCode() {
                                                return code;
                                            }

                                            /**
                                             * Sets the value of the code property.
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *     
                                             */
                                            public void setCode(String value) {
                                                this.code = value;
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
                                     *   &lt;simpleContent>
                                     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_email_string">
                                     *       &lt;attribute name="Remark">
                                     *         &lt;simpleType>
                                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *             &lt;pattern value="newsletter:(no|yes)"/>
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
                                    public static class Email {

                                        @XmlValue
                                        protected String value;
                                        @XmlAttribute(name = "Remark")
                                        protected String remark;

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
                                         * Gets the value of the remark property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getRemark() {
                                            return remark;
                                        }

                                        /**
                                         * Sets the value of the remark property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setRemark(String value) {
                                            this.remark = value;
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
                                     *         &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
                                     *         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                     *         &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/>
                                     *         &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/>
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
                                        "namePrefix",
                                        "givenName",
                                        "surname",
                                        "nameTitle"
                                    })
                                    public static class PersonName {

                                        @XmlElement(name = "NamePrefix")
                                        protected String namePrefix;
                                        @XmlElement(name = "GivenName", required = true)
                                        protected String givenName;
                                        @XmlElement(name = "Surname", required = true)
                                        protected String surname;
                                        @XmlElement(name = "NameTitle")
                                        protected String nameTitle;

                                        /**
                                         * Gets the value of the namePrefix property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getNamePrefix() {
                                            return namePrefix;
                                        }

                                        /**
                                         * Sets the value of the namePrefix property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setNamePrefix(String value) {
                                            this.namePrefix = value;
                                        }

                                        /**
                                         * Gets the value of the givenName property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getGivenName() {
                                            return givenName;
                                        }

                                        /**
                                         * Sets the value of the givenName property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setGivenName(String value) {
                                            this.givenName = value;
                                        }

                                        /**
                                         * Gets the value of the surname property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getSurname() {
                                            return surname;
                                        }

                                        /**
                                         * Sets the value of the surname property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setSurname(String value) {
                                            this.surname = value;
                                        }

                                        /**
                                         * Gets the value of the nameTitle property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getNameTitle() {
                                            return nameTitle;
                                        }

                                        /**
                                         * Sets the value of the nameTitle property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setNameTitle(String value) {
                                            this.nameTitle = value;
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
                                     *       &lt;attribute name="PhoneTechType" use="required">
                                     *         &lt;simpleType>
                                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *             &lt;pattern value="(1|3|5)"/>
                                     *           &lt;/restriction>
                                     *         &lt;/simpleType>
                                     *       &lt;/attribute>
                                     *       &lt;attribute name="PhoneNumber" use="required">
                                     *         &lt;simpleType>
                                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *             &lt;pattern value="\+?[0-9]+"/>
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
                                    public static class Telephone {

                                        @XmlAttribute(name = "PhoneTechType", required = true)
                                        protected String phoneTechType;
                                        @XmlAttribute(name = "PhoneNumber", required = true)
                                        protected String phoneNumber;

                                        /**
                                         * Gets the value of the phoneTechType property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getPhoneTechType() {
                                            return phoneTechType;
                                        }

                                        /**
                                         * Sets the value of the phoneTechType property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setPhoneTechType(String value) {
                                            this.phoneTechType = value;
                                        }

                                        /**
                                         * Gets the value of the phoneNumber property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getPhoneNumber() {
                                            return phoneNumber;
                                        }

                                        /**
                                         * Sets the value of the phoneNumber property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setPhoneNumber(String value) {
                                            this.phoneNumber = value;
                                        }

                                    }

                                }

                            }

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
             *       &lt;sequence>
             *         &lt;element name="RoomStay" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="RoomTypes" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="RoomType">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RatePlans" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="RatePlan">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="MealsIncluded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="MealPlanIndicator" use="required">
             *                                                 &lt;simpleType>
             *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                     &lt;enumeration value="1"/>
             *                                                     &lt;enumeration value="true"/>
             *                                                   &lt;/restriction>
             *                                                 &lt;/simpleType>
             *                                               &lt;/attribute>
             *                                               &lt;attribute name="MealPlanCodes" use="required">
             *                                                 &lt;simpleType>
             *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                     &lt;enumeration value="1"/>
             *                                                     &lt;enumeration value="3"/>
             *                                                     &lt;enumeration value="10"/>
             *                                                     &lt;enumeration value="12"/>
             *                                                     &lt;enumeration value="14"/>
             *                                                   &lt;/restriction>
             *                                                 &lt;/simpleType>
             *                                               &lt;/attribute>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="GuestCounts" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="GuestCount" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                                     &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TimeSpan">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="StartDateWindow" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                                     &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                           &lt;attribute name="Duration">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;pattern value="P[0-9]+N"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Total" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
             *                           &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "roomStay"
            })
            public static class RoomStays {

                @XmlElement(name = "RoomStay", required = true)
                protected List<OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay> roomStay;

                /**
                 * Gets the value of the roomStay property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the roomStay property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRoomStay().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay }
                 * 
                 * 
                 */
                public List<OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay> getRoomStay() {
                    if (roomStay == null) {
                        roomStay = new ArrayList<OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay>();
                    }
                    return this.roomStay;
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
                 *         &lt;element name="RoomTypes" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="RoomType">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RatePlans" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="RatePlan">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="MealsIncluded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="MealPlanIndicator" use="required">
                 *                                       &lt;simpleType>
                 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                           &lt;enumeration value="1"/>
                 *                                           &lt;enumeration value="true"/>
                 *                                         &lt;/restriction>
                 *                                       &lt;/simpleType>
                 *                                     &lt;/attribute>
                 *                                     &lt;attribute name="MealPlanCodes" use="required">
                 *                                       &lt;simpleType>
                 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                           &lt;enumeration value="1"/>
                 *                                           &lt;enumeration value="3"/>
                 *                                           &lt;enumeration value="10"/>
                 *                                           &lt;enumeration value="12"/>
                 *                                           &lt;enumeration value="14"/>
                 *                                         &lt;/restriction>
                 *                                       &lt;/simpleType>
                 *                                     &lt;/attribute>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="GuestCounts" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="GuestCount" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                           &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TimeSpan">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="StartDateWindow" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *                           &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *                 &lt;attribute name="Duration">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;pattern value="P[0-9]+N"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Total" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                 *                 &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
                    "roomTypes",
                    "ratePlans",
                    "guestCounts",
                    "timeSpan",
                    "total"
                })
                public static class RoomStay {

                    @XmlElement(name = "RoomTypes")
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes roomTypes;
                    @XmlElement(name = "RatePlans")
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans ratePlans;
                    @XmlElement(name = "GuestCounts")
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts guestCounts;
                    @XmlElement(name = "TimeSpan", required = true)
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan timeSpan;
                    @XmlElement(name = "Total")
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.Total total;

                    /**
                     * Gets the value of the roomTypes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes }
                     *     
                     */
                    public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes getRoomTypes() {
                        return roomTypes;
                    }

                    /**
                     * Sets the value of the roomTypes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes }
                     *     
                     */
                    public void setRoomTypes(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes value) {
                        this.roomTypes = value;
                    }

                    /**
                     * Gets the value of the ratePlans property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans }
                     *     
                     */
                    public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans getRatePlans() {
                        return ratePlans;
                    }

                    /**
                     * Sets the value of the ratePlans property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans }
                     *     
                     */
                    public void setRatePlans(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans value) {
                        this.ratePlans = value;
                    }

                    /**
                     * Gets the value of the guestCounts property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts }
                     *     
                     */
                    public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts getGuestCounts() {
                        return guestCounts;
                    }

                    /**
                     * Sets the value of the guestCounts property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts }
                     *     
                     */
                    public void setGuestCounts(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts value) {
                        this.guestCounts = value;
                    }

                    /**
                     * Gets the value of the timeSpan property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan }
                     *     
                     */
                    public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan getTimeSpan() {
                        return timeSpan;
                    }

                    /**
                     * Sets the value of the timeSpan property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan }
                     *     
                     */
                    public void setTimeSpan(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan value) {
                        this.timeSpan = value;
                    }

                    /**
                     * Gets the value of the total property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.Total }
                     *     
                     */
                    public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.Total getTotal() {
                        return total;
                    }

                    /**
                     * Sets the value of the total property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.Total }
                     *     
                     */
                    public void setTotal(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.Total value) {
                        this.total = value;
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
                     *         &lt;element name="GuestCount" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                     *                 &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
                        "guestCount"
                    })
                    public static class GuestCounts {

                        @XmlElement(name = "GuestCount", required = true)
                        protected List<OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts.GuestCount> guestCount;

                        /**
                         * Gets the value of the guestCount property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the guestCount property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getGuestCount().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts.GuestCount }
                         * 
                         * 
                         */
                        public List<OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts.GuestCount> getGuestCount() {
                            if (guestCount == null) {
                                guestCount = new ArrayList<OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.GuestCounts.GuestCount>();
                            }
                            return this.guestCount;
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
                         *       &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *       &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class GuestCount {

                            @XmlAttribute(name = "Count", required = true)
                            protected BigInteger count;
                            @XmlAttribute(name = "Age")
                            protected BigInteger age;

                            /**
                             * Gets the value of the count property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getCount() {
                                return count;
                            }

                            /**
                             * Sets the value of the count property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setCount(BigInteger value) {
                                this.count = value;
                            }

                            /**
                             * Gets the value of the age property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getAge() {
                                return age;
                            }

                            /**
                             * Sets the value of the age property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setAge(BigInteger value) {
                                this.age = value;
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
                     *         &lt;element name="RatePlan">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="MealsIncluded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="MealPlanIndicator" use="required">
                     *                             &lt;simpleType>
                     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                 &lt;enumeration value="1"/>
                     *                                 &lt;enumeration value="true"/>
                     *                               &lt;/restriction>
                     *                             &lt;/simpleType>
                     *                           &lt;/attribute>
                     *                           &lt;attribute name="MealPlanCodes" use="required">
                     *                             &lt;simpleType>
                     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                 &lt;enumeration value="1"/>
                     *                                 &lt;enumeration value="3"/>
                     *                                 &lt;enumeration value="10"/>
                     *                                 &lt;enumeration value="12"/>
                     *                                 &lt;enumeration value="14"/>
                     *                               &lt;/restriction>
                     *                             &lt;/simpleType>
                     *                           &lt;/attribute>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
                        "ratePlan"
                    })
                    public static class RatePlans {

                        @XmlElement(name = "RatePlan", required = true)
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan ratePlan;

                        /**
                         * Gets the value of the ratePlan property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan }
                         *     
                         */
                        public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan getRatePlan() {
                            return ratePlan;
                        }

                        /**
                         * Sets the value of the ratePlan property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan }
                         *     
                         */
                        public void setRatePlan(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan value) {
                            this.ratePlan = value;
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
                         *         &lt;element name="MealsIncluded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="MealPlanIndicator" use="required">
                         *                   &lt;simpleType>
                         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                       &lt;enumeration value="1"/>
                         *                       &lt;enumeration value="true"/>
                         *                     &lt;/restriction>
                         *                   &lt;/simpleType>
                         *                 &lt;/attribute>
                         *                 &lt;attribute name="MealPlanCodes" use="required">
                         *                   &lt;simpleType>
                         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                       &lt;enumeration value="1"/>
                         *                       &lt;enumeration value="3"/>
                         *                       &lt;enumeration value="10"/>
                         *                       &lt;enumeration value="12"/>
                         *                       &lt;enumeration value="14"/>
                         *                     &lt;/restriction>
                         *                   &lt;/simpleType>
                         *                 &lt;/attribute>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "mealsIncluded"
                        })
                        public static class RatePlan {

                            @XmlElement(name = "MealsIncluded")
                            protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded mealsIncluded;
                            @XmlAttribute(name = "RatePlanCode")
                            protected String ratePlanCode;

                            /**
                             * Gets the value of the mealsIncluded property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded }
                             *     
                             */
                            public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded getMealsIncluded() {
                                return mealsIncluded;
                            }

                            /**
                             * Sets the value of the mealsIncluded property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded }
                             *     
                             */
                            public void setMealsIncluded(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded value) {
                                this.mealsIncluded = value;
                            }

                            /**
                             * Gets the value of the ratePlanCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getRatePlanCode() {
                                return ratePlanCode;
                            }

                            /**
                             * Sets the value of the ratePlanCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setRatePlanCode(String value) {
                                this.ratePlanCode = value;
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
                             *       &lt;attribute name="MealPlanIndicator" use="required">
                             *         &lt;simpleType>
                             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *             &lt;enumeration value="1"/>
                             *             &lt;enumeration value="true"/>
                             *           &lt;/restriction>
                             *         &lt;/simpleType>
                             *       &lt;/attribute>
                             *       &lt;attribute name="MealPlanCodes" use="required">
                             *         &lt;simpleType>
                             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *             &lt;enumeration value="1"/>
                             *             &lt;enumeration value="3"/>
                             *             &lt;enumeration value="10"/>
                             *             &lt;enumeration value="12"/>
                             *             &lt;enumeration value="14"/>
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
                            public static class MealsIncluded {

                                @XmlAttribute(name = "MealPlanIndicator", required = true)
                                protected String mealPlanIndicator;
                                @XmlAttribute(name = "MealPlanCodes", required = true)
                                protected String mealPlanCodes;

                                /**
                                 * Gets the value of the mealPlanIndicator property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMealPlanIndicator() {
                                    return mealPlanIndicator;
                                }

                                /**
                                 * Sets the value of the mealPlanIndicator property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMealPlanIndicator(String value) {
                                    this.mealPlanIndicator = value;
                                }

                                /**
                                 * Gets the value of the mealPlanCodes property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMealPlanCodes() {
                                    return mealPlanCodes;
                                }

                                /**
                                 * Sets the value of the mealPlanCodes property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMealPlanCodes(String value) {
                                    this.mealPlanCodes = value;
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
                     *       &lt;sequence>
                     *         &lt;element name="RoomType">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
                        "roomType"
                    })
                    public static class RoomTypes {

                        @XmlElement(name = "RoomType", required = true)
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType roomType;

                        /**
                         * Gets the value of the roomType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType }
                         *     
                         */
                        public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType getRoomType() {
                            return roomType;
                        }

                        /**
                         * Sets the value of the roomType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType }
                         *     
                         */
                        public void setRoomType(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType value) {
                            this.roomType = value;
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
                         *       &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class RoomType {

                            @XmlAttribute(name = "RoomTypeCode", required = true)
                            protected String roomTypeCode;

                            /**
                             * Gets the value of the roomTypeCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getRoomTypeCode() {
                                return roomTypeCode;
                            }

                            /**
                             * Sets the value of the roomTypeCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setRoomTypeCode(String value) {
                                this.roomTypeCode = value;
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
                     *         &lt;element name="StartDateWindow" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                     *                 &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                     *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                     *       &lt;attribute name="Duration">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;pattern value="P[0-9]+N"/>
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
                    @XmlType(name = "", propOrder = {
                        "startDateWindow"
                    })
                    public static class TimeSpan {

                        @XmlElement(name = "StartDateWindow")
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan.StartDateWindow startDateWindow;
                        @XmlAttribute(name = "Start")
                        protected XMLGregorianCalendar start;
                        @XmlAttribute(name = "End")
                        protected XMLGregorianCalendar end;
                        @XmlAttribute(name = "Duration")
                        protected String duration;

                        /**
                         * Gets the value of the startDateWindow property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan.StartDateWindow }
                         *     
                         */
                        public OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan.StartDateWindow getStartDateWindow() {
                            return startDateWindow;
                        }

                        /**
                         * Sets the value of the startDateWindow property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan.StartDateWindow }
                         *     
                         */
                        public void setStartDateWindow(OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.TimeSpan.StartDateWindow value) {
                            this.startDateWindow = value;
                        }

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
                         * Gets the value of the duration property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDuration() {
                            return duration;
                        }

                        /**
                         * Sets the value of the duration property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDuration(String value) {
                            this.duration = value;
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
                         *       &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                         *       &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class StartDateWindow {

                            @XmlAttribute(name = "EarliestDate", required = true)
                            protected XMLGregorianCalendar earliestDate;
                            @XmlAttribute(name = "LatestDate", required = true)
                            protected XMLGregorianCalendar latestDate;

                            /**
                             * Gets the value of the earliestDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public XMLGregorianCalendar getEarliestDate() {
                                return earliestDate;
                            }

                            /**
                             * Sets the value of the earliestDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public void setEarliestDate(XMLGregorianCalendar value) {
                                this.earliestDate = value;
                            }

                            /**
                             * Gets the value of the latestDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public XMLGregorianCalendar getLatestDate() {
                                return latestDate;
                            }

                            /**
                             * Sets the value of the latestDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public void setLatestDate(XMLGregorianCalendar value) {
                                this.latestDate = value;
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
                     *       &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                     *       &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Total {

                        @XmlAttribute(name = "AmountAfterTax", required = true)
                        protected BigDecimal amountAfterTax;
                        @XmlAttribute(name = "CurrencyCode", required = true)
                        protected String currencyCode;

                        /**
                         * Gets the value of the amountAfterTax property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getAmountAfterTax() {
                            return amountAfterTax;
                        }

                        /**
                         * Sets the value of the amountAfterTax property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setAmountAfterTax(BigDecimal value) {
                            this.amountAfterTax = value;
                        }

                        /**
                         * Gets the value of the currencyCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCurrencyCode() {
                            return currencyCode;
                        }

                        /**
                         * Sets the value of the currencyCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCurrencyCode(String value) {
                            this.currencyCode = value;
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
             *             &lt;enumeration value="14"/>
             *             &lt;enumeration value="15"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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

            }

        }

    }

}
