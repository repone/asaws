
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
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Errors"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Error" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Type" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="13"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="ReservationsList"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="UniqueID"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="Type" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="14"/&gt;
 *                                             &lt;enumeration value="15"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="RoomStays" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="RoomStay" maxOccurs="unbounded"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="RoomTypes" minOccurs="0"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;element name="RoomType"&gt;
 *                                                               &lt;complexType&gt;
 *                                                                 &lt;complexContent&gt;
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                     &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                                                                   &lt;/restriction&gt;
 *                                                                 &lt;/complexContent&gt;
 *                                                               &lt;/complexType&gt;
 *                                                             &lt;/element&gt;
 *                                                           &lt;/sequence&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                   &lt;element name="RatePlans" minOccurs="0"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;element name="RatePlan"&gt;
 *                                                               &lt;complexType&gt;
 *                                                                 &lt;complexContent&gt;
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                     &lt;sequence&gt;
 *                                                                       &lt;element name="MealsIncluded" minOccurs="0"&gt;
 *                                                                         &lt;complexType&gt;
 *                                                                           &lt;complexContent&gt;
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                               &lt;attribute name="MealPlanIndicator" use="required"&gt;
 *                                                                                 &lt;simpleType&gt;
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                                     &lt;enumeration value="1"/&gt;
 *                                                                                     &lt;enumeration value="true"/&gt;
 *                                                                                   &lt;/restriction&gt;
 *                                                                                 &lt;/simpleType&gt;
 *                                                                               &lt;/attribute&gt;
 *                                                                               &lt;attribute name="MealPlanCodes" use="required"&gt;
 *                                                                                 &lt;simpleType&gt;
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                                     &lt;enumeration value="1"/&gt;
 *                                                                                     &lt;enumeration value="3"/&gt;
 *                                                                                     &lt;enumeration value="10"/&gt;
 *                                                                                     &lt;enumeration value="12"/&gt;
 *                                                                                     &lt;enumeration value="14"/&gt;
 *                                                                                   &lt;/restriction&gt;
 *                                                                                 &lt;/simpleType&gt;
 *                                                                               &lt;/attribute&gt;
 *                                                                             &lt;/restriction&gt;
 *                                                                           &lt;/complexContent&gt;
 *                                                                         &lt;/complexType&gt;
 *                                                                       &lt;/element&gt;
 *                                                                     &lt;/sequence&gt;
 *                                                                     &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                                                                   &lt;/restriction&gt;
 *                                                                 &lt;/complexContent&gt;
 *                                                               &lt;/complexType&gt;
 *                                                             &lt;/element&gt;
 *                                                           &lt;/sequence&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                   &lt;element name="GuestCounts" minOccurs="0"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;element name="GuestCount" maxOccurs="unbounded"&gt;
 *                                                               &lt;complexType&gt;
 *                                                                 &lt;complexContent&gt;
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                     &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
 *                                                                     &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
 *                                                                   &lt;/restriction&gt;
 *                                                                 &lt;/complexContent&gt;
 *                                                               &lt;/complexType&gt;
 *                                                             &lt;/element&gt;
 *                                                           &lt;/sequence&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                   &lt;element name="TimeSpan"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;element name="StartDateWindow" minOccurs="0"&gt;
 *                                                               &lt;complexType&gt;
 *                                                                 &lt;complexContent&gt;
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                     &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
 *                                                                     &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
 *                                                                   &lt;/restriction&gt;
 *                                                                 &lt;/complexContent&gt;
 *                                                               &lt;/complexType&gt;
 *                                                             &lt;/element&gt;
 *                                                           &lt;/sequence&gt;
 *                                                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
 *                                                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
 *                                                           &lt;attribute name="Duration"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                 &lt;pattern value="P[0-9]+N"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/attribute&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                   &lt;element name="Total" minOccurs="0"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" /&gt;
 *                                                           &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ResGuests" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="ResGuest"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="Profiles"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;element name="ProfileInfo"&gt;
 *                                                               &lt;complexType&gt;
 *                                                                 &lt;complexContent&gt;
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                     &lt;sequence&gt;
 *                                                                       &lt;element name="Profile"&gt;
 *                                                                         &lt;complexType&gt;
 *                                                                           &lt;complexContent&gt;
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                               &lt;sequence&gt;
 *                                                                                 &lt;element name="Customer"&gt;
 *                                                                                   &lt;complexType&gt;
 *                                                                                     &lt;complexContent&gt;
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                                         &lt;sequence&gt;
 *                                                                                           &lt;element name="PersonName"&gt;
 *                                                                                             &lt;complexType&gt;
 *                                                                                               &lt;complexContent&gt;
 *                                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                                                   &lt;sequence&gt;
 *                                                                                                     &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
 *                                                                                                     &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
 *                                                                                                     &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
 *                                                                                                     &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
 *                                                                                                   &lt;/sequence&gt;
 *                                                                                                 &lt;/restriction&gt;
 *                                                                                               &lt;/complexContent&gt;
 *                                                                                             &lt;/complexType&gt;
 *                                                                                           &lt;/element&gt;
 *                                                                                           &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                                                             &lt;complexType&gt;
 *                                                                                               &lt;complexContent&gt;
 *                                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                                                   &lt;attribute name="PhoneTechType" use="required"&gt;
 *                                                                                                     &lt;simpleType&gt;
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                                                         &lt;pattern value="(1|3|5)"/&gt;
 *                                                                                                       &lt;/restriction&gt;
 *                                                                                                     &lt;/simpleType&gt;
 *                                                                                                   &lt;/attribute&gt;
 *                                                                                                   &lt;attribute name="PhoneNumber" use="required"&gt;
 *                                                                                                     &lt;simpleType&gt;
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                                                         &lt;pattern value="\+?[0-9]+"/&gt;
 *                                                                                                       &lt;/restriction&gt;
 *                                                                                                     &lt;/simpleType&gt;
 *                                                                                                   &lt;/attribute&gt;
 *                                                                                                 &lt;/restriction&gt;
 *                                                                                               &lt;/complexContent&gt;
 *                                                                                             &lt;/complexType&gt;
 *                                                                                           &lt;/element&gt;
 *                                                                                           &lt;element name="Email" minOccurs="0"&gt;
 *                                                                                             &lt;complexType&gt;
 *                                                                                               &lt;simpleContent&gt;
 *                                                                                                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
 *                                                                                                   &lt;attribute name="Remark"&gt;
 *                                                                                                     &lt;simpleType&gt;
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                                                         &lt;pattern value="newsletter:(no|yes)"/&gt;
 *                                                                                                       &lt;/restriction&gt;
 *                                                                                                     &lt;/simpleType&gt;
 *                                                                                                   &lt;/attribute&gt;
 *                                                                                                 &lt;/extension&gt;
 *                                                                                               &lt;/simpleContent&gt;
 *                                                                                             &lt;/complexType&gt;
 *                                                                                           &lt;/element&gt;
 *                                                                                           &lt;element name="Address" minOccurs="0"&gt;
 *                                                                                             &lt;complexType&gt;
 *                                                                                               &lt;complexContent&gt;
 *                                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                                                   &lt;sequence&gt;
 *                                                                                                     &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
 *                                                                                                     &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
 *                                                                                                     &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
 *                                                                                                     &lt;element name="CountryName"&gt;
 *                                                                                                       &lt;complexType&gt;
 *                                                                                                         &lt;complexContent&gt;
 *                                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                                                             &lt;attribute name="Code" use="required"&gt;
 *                                                                                                               &lt;simpleType&gt;
 *                                                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                                                                   &lt;pattern value="[A-Z][A-Z]"/&gt;
 *                                                                                                                 &lt;/restriction&gt;
 *                                                                                                               &lt;/simpleType&gt;
 *                                                                                                             &lt;/attribute&gt;
 *                                                                                                           &lt;/restriction&gt;
 *                                                                                                         &lt;/complexContent&gt;
 *                                                                                                       &lt;/complexType&gt;
 *                                                                                                     &lt;/element&gt;
 *                                                                                                   &lt;/sequence&gt;
 *                                                                                                   &lt;attribute name="Remark"&gt;
 *                                                                                                     &lt;simpleType&gt;
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                                                         &lt;pattern value="catalog:(no|yes)"/&gt;
 *                                                                                                       &lt;/restriction&gt;
 *                                                                                                     &lt;/simpleType&gt;
 *                                                                                                   &lt;/attribute&gt;
 *                                                                                                 &lt;/restriction&gt;
 *                                                                                               &lt;/complexContent&gt;
 *                                                                                             &lt;/complexType&gt;
 *                                                                                           &lt;/element&gt;
 *                                                                                         &lt;/sequence&gt;
 *                                                                                         &lt;attribute name="Gender" use="required"&gt;
 *                                                                                           &lt;simpleType&gt;
 *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                                               &lt;pattern value="(Unknown|Male|Female)"/&gt;
 *                                                                                             &lt;/restriction&gt;
 *                                                                                           &lt;/simpleType&gt;
 *                                                                                         &lt;/attribute&gt;
 *                                                                                         &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
 *                                                                                         &lt;attribute name="Language" use="required"&gt;
 *                                                                                           &lt;simpleType&gt;
 *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
 *                                                                                               &lt;pattern value="[a-z][a-z]"/&gt;
 *                                                                                             &lt;/restriction&gt;
 *                                                                                           &lt;/simpleType&gt;
 *                                                                                         &lt;/attribute&gt;
 *                                                                                       &lt;/restriction&gt;
 *                                                                                     &lt;/complexContent&gt;
 *                                                                                   &lt;/complexType&gt;
 *                                                                                 &lt;/element&gt;
 *                                                                               &lt;/sequence&gt;
 *                                                                             &lt;/restriction&gt;
 *                                                                           &lt;/complexContent&gt;
 *                                                                         &lt;/complexType&gt;
 *                                                                       &lt;/element&gt;
 *                                                                     &lt;/sequence&gt;
 *                                                                   &lt;/restriction&gt;
 *                                                                 &lt;/complexContent&gt;
 *                                                               &lt;/complexType&gt;
 *                                                             &lt;/element&gt;
 *                                                           &lt;/sequence&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ResGlobalInfo" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Comments" minOccurs="0"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="Comment" maxOccurs="2"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;choice&gt;
 *                                                               &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                                 &lt;complexType&gt;
 *                                                                   &lt;simpleContent&gt;
 *                                                                     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
 *                                                                       &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
 *                                                                       &lt;attribute name="Language" use="required"&gt;
 *                                                                         &lt;simpleType&gt;
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
 *                                                                             &lt;pattern value="[a-z][a-z]"/&gt;
 *                                                                           &lt;/restriction&gt;
 *                                                                         &lt;/simpleType&gt;
 *                                                                       &lt;/attribute&gt;
 *                                                                     &lt;/extension&gt;
 *                                                                   &lt;/simpleContent&gt;
 *                                                                 &lt;/complexType&gt;
 *                                                               &lt;/element&gt;
 *                                                               &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
 *                                                             &lt;/choice&gt;
 *                                                           &lt;/sequence&gt;
 *                                                           &lt;attribute name="Name" use="required"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                 &lt;enumeration value="included services"/&gt;
 *                                                                 &lt;enumeration value="customer comment"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/attribute&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="CancelPenalties" minOccurs="0"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="CancelPenalty"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;element name="PenaltyDescription"&gt;
 *                                                               &lt;complexType&gt;
 *                                                                 &lt;complexContent&gt;
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                     &lt;sequence&gt;
 *                                                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
 *                                                                     &lt;/sequence&gt;
 *                                                                   &lt;/restriction&gt;
 *                                                                 &lt;/complexContent&gt;
 *                                                               &lt;/complexType&gt;
 *                                                             &lt;/element&gt;
 *                                                           &lt;/sequence&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="HotelReservationIDs" minOccurs="0"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="HotelReservationID"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;attribute name="ResID_Type" use="required"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                 &lt;enumeration value="13"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/attribute&gt;
 *                                                           &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                                                           &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                                                           &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="CreateDateTime" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" /&gt;
 *                             &lt;attribute name="ResStatus" use="required"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Requested"/&gt;
 *                                   &lt;enumeration value="Reserved"/&gt;
 *                                   &lt;enumeration value="Cancelled"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
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
     * Recupera il valore della proprietà errors.
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
     * Imposta il valore della proprietà errors.
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
     * Recupera il valore della proprietà reservationsList.
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
     * Imposta il valore della proprietà reservationsList.
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
     *         &lt;element name="Error" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Type" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="13"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
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
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Type" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="13"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="UniqueID"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Type" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="14"/&gt;
     *                                 &lt;enumeration value="15"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RoomStays" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="RoomStay" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="RoomTypes" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="RoomType"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="RatePlans" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="RatePlan"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="MealsIncluded" minOccurs="0"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;complexContent&gt;
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                   &lt;attribute name="MealPlanIndicator" use="required"&gt;
     *                                                                     &lt;simpleType&gt;
     *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                         &lt;enumeration value="1"/&gt;
     *                                                                         &lt;enumeration value="true"/&gt;
     *                                                                       &lt;/restriction&gt;
     *                                                                     &lt;/simpleType&gt;
     *                                                                   &lt;/attribute&gt;
     *                                                                   &lt;attribute name="MealPlanCodes" use="required"&gt;
     *                                                                     &lt;simpleType&gt;
     *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                         &lt;enumeration value="1"/&gt;
     *                                                                         &lt;enumeration value="3"/&gt;
     *                                                                         &lt;enumeration value="10"/&gt;
     *                                                                         &lt;enumeration value="12"/&gt;
     *                                                                         &lt;enumeration value="14"/&gt;
     *                                                                       &lt;/restriction&gt;
     *                                                                     &lt;/simpleType&gt;
     *                                                                   &lt;/attribute&gt;
     *                                                                 &lt;/restriction&gt;
     *                                                               &lt;/complexContent&gt;
     *                                                             &lt;/complexType&gt;
     *                                                           &lt;/element&gt;
     *                                                         &lt;/sequence&gt;
     *                                                         &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="GuestCounts" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="GuestCount" maxOccurs="unbounded"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
     *                                                         &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="TimeSpan"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="StartDateWindow" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
     *                                                         &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
     *                                               &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
     *                                               &lt;attribute name="Duration"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                     &lt;pattern value="P[0-9]+N"/&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Total" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" /&gt;
     *                                               &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ResGuests" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ResGuest"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Profiles"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="ProfileInfo"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="Profile"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;complexContent&gt;
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                   &lt;sequence&gt;
     *                                                                     &lt;element name="Customer"&gt;
     *                                                                       &lt;complexType&gt;
     *                                                                         &lt;complexContent&gt;
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                             &lt;sequence&gt;
     *                                                                               &lt;element name="PersonName"&gt;
     *                                                                                 &lt;complexType&gt;
     *                                                                                   &lt;complexContent&gt;
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                                       &lt;sequence&gt;
     *                                                                                         &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
     *                                                                                         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
     *                                                                                         &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
     *                                                                                         &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
     *                                                                                       &lt;/sequence&gt;
     *                                                                                     &lt;/restriction&gt;
     *                                                                                   &lt;/complexContent&gt;
     *                                                                                 &lt;/complexType&gt;
     *                                                                               &lt;/element&gt;
     *                                                                               &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                                                 &lt;complexType&gt;
     *                                                                                   &lt;complexContent&gt;
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                                       &lt;attribute name="PhoneTechType" use="required"&gt;
     *                                                                                         &lt;simpleType&gt;
     *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                                             &lt;pattern value="(1|3|5)"/&gt;
     *                                                                                           &lt;/restriction&gt;
     *                                                                                         &lt;/simpleType&gt;
     *                                                                                       &lt;/attribute&gt;
     *                                                                                       &lt;attribute name="PhoneNumber" use="required"&gt;
     *                                                                                         &lt;simpleType&gt;
     *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                                             &lt;pattern value="\+?[0-9]+"/&gt;
     *                                                                                           &lt;/restriction&gt;
     *                                                                                         &lt;/simpleType&gt;
     *                                                                                       &lt;/attribute&gt;
     *                                                                                     &lt;/restriction&gt;
     *                                                                                   &lt;/complexContent&gt;
     *                                                                                 &lt;/complexType&gt;
     *                                                                               &lt;/element&gt;
     *                                                                               &lt;element name="Email" minOccurs="0"&gt;
     *                                                                                 &lt;complexType&gt;
     *                                                                                   &lt;simpleContent&gt;
     *                                                                                     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
     *                                                                                       &lt;attribute name="Remark"&gt;
     *                                                                                         &lt;simpleType&gt;
     *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                                             &lt;pattern value="newsletter:(no|yes)"/&gt;
     *                                                                                           &lt;/restriction&gt;
     *                                                                                         &lt;/simpleType&gt;
     *                                                                                       &lt;/attribute&gt;
     *                                                                                     &lt;/extension&gt;
     *                                                                                   &lt;/simpleContent&gt;
     *                                                                                 &lt;/complexType&gt;
     *                                                                               &lt;/element&gt;
     *                                                                               &lt;element name="Address" minOccurs="0"&gt;
     *                                                                                 &lt;complexType&gt;
     *                                                                                   &lt;complexContent&gt;
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                                       &lt;sequence&gt;
     *                                                                                         &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
     *                                                                                         &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
     *                                                                                         &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
     *                                                                                         &lt;element name="CountryName"&gt;
     *                                                                                           &lt;complexType&gt;
     *                                                                                             &lt;complexContent&gt;
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                                                 &lt;attribute name="Code" use="required"&gt;
     *                                                                                                   &lt;simpleType&gt;
     *                                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                                                       &lt;pattern value="[A-Z][A-Z]"/&gt;
     *                                                                                                     &lt;/restriction&gt;
     *                                                                                                   &lt;/simpleType&gt;
     *                                                                                                 &lt;/attribute&gt;
     *                                                                                               &lt;/restriction&gt;
     *                                                                                             &lt;/complexContent&gt;
     *                                                                                           &lt;/complexType&gt;
     *                                                                                         &lt;/element&gt;
     *                                                                                       &lt;/sequence&gt;
     *                                                                                       &lt;attribute name="Remark"&gt;
     *                                                                                         &lt;simpleType&gt;
     *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                                             &lt;pattern value="catalog:(no|yes)"/&gt;
     *                                                                                           &lt;/restriction&gt;
     *                                                                                         &lt;/simpleType&gt;
     *                                                                                       &lt;/attribute&gt;
     *                                                                                     &lt;/restriction&gt;
     *                                                                                   &lt;/complexContent&gt;
     *                                                                                 &lt;/complexType&gt;
     *                                                                               &lt;/element&gt;
     *                                                                             &lt;/sequence&gt;
     *                                                                             &lt;attribute name="Gender" use="required"&gt;
     *                                                                               &lt;simpleType&gt;
     *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                                   &lt;pattern value="(Unknown|Male|Female)"/&gt;
     *                                                                                 &lt;/restriction&gt;
     *                                                                               &lt;/simpleType&gt;
     *                                                                             &lt;/attribute&gt;
     *                                                                             &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
     *                                                                             &lt;attribute name="Language" use="required"&gt;
     *                                                                               &lt;simpleType&gt;
     *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
     *                                                                                   &lt;pattern value="[a-z][a-z]"/&gt;
     *                                                                                 &lt;/restriction&gt;
     *                                                                               &lt;/simpleType&gt;
     *                                                                             &lt;/attribute&gt;
     *                                                                           &lt;/restriction&gt;
     *                                                                         &lt;/complexContent&gt;
     *                                                                       &lt;/complexType&gt;
     *                                                                     &lt;/element&gt;
     *                                                                   &lt;/sequence&gt;
     *                                                                 &lt;/restriction&gt;
     *                                                               &lt;/complexContent&gt;
     *                                                             &lt;/complexType&gt;
     *                                                           &lt;/element&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
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
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ResGlobalInfo" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Comments" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Comment" maxOccurs="2"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;choice&gt;
     *                                                   &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                     &lt;complexType&gt;
     *                                                       &lt;simpleContent&gt;
     *                                                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
     *                                                           &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
     *                                                           &lt;attribute name="Language" use="required"&gt;
     *                                                             &lt;simpleType&gt;
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
     *                                                                 &lt;pattern value="[a-z][a-z]"/&gt;
     *                                                               &lt;/restriction&gt;
     *                                                             &lt;/simpleType&gt;
     *                                                           &lt;/attribute&gt;
     *                                                         &lt;/extension&gt;
     *                                                       &lt;/simpleContent&gt;
     *                                                     &lt;/complexType&gt;
     *                                                   &lt;/element&gt;
     *                                                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
     *                                                 &lt;/choice&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attribute name="Name" use="required"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                     &lt;enumeration value="included services"/&gt;
     *                                                     &lt;enumeration value="customer comment"/&gt;
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
     *                             &lt;element name="CancelPenalties" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CancelPenalty"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="PenaltyDescription"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
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
     *                             &lt;element name="HotelReservationIDs" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="HotelReservationID"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="ResID_Type" use="required"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                     &lt;enumeration value="13"/&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                               &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *                                               &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
     *                                               &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="CreateDateTime" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" /&gt;
     *                 &lt;attribute name="ResStatus" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Requested"/&gt;
     *                       &lt;enumeration value="Reserved"/&gt;
     *                       &lt;enumeration value="Cancelled"/&gt;
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
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="UniqueID"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Type" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;enumeration value="14"/&gt;
         *                       &lt;enumeration value="15"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RoomStays" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="RoomStay" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="RoomTypes" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="RoomType"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="RatePlans" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="RatePlan"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="MealsIncluded" minOccurs="0"&gt;
         *                                                   &lt;complexType&gt;
         *                                                     &lt;complexContent&gt;
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                         &lt;attribute name="MealPlanIndicator" use="required"&gt;
         *                                                           &lt;simpleType&gt;
         *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                               &lt;enumeration value="1"/&gt;
         *                                                               &lt;enumeration value="true"/&gt;
         *                                                             &lt;/restriction&gt;
         *                                                           &lt;/simpleType&gt;
         *                                                         &lt;/attribute&gt;
         *                                                         &lt;attribute name="MealPlanCodes" use="required"&gt;
         *                                                           &lt;simpleType&gt;
         *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                               &lt;enumeration value="1"/&gt;
         *                                                               &lt;enumeration value="3"/&gt;
         *                                                               &lt;enumeration value="10"/&gt;
         *                                                               &lt;enumeration value="12"/&gt;
         *                                                               &lt;enumeration value="14"/&gt;
         *                                                             &lt;/restriction&gt;
         *                                                           &lt;/simpleType&gt;
         *                                                         &lt;/attribute&gt;
         *                                                       &lt;/restriction&gt;
         *                                                     &lt;/complexContent&gt;
         *                                                   &lt;/complexType&gt;
         *                                                 &lt;/element&gt;
         *                                               &lt;/sequence&gt;
         *                                               &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="GuestCounts" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="GuestCount" maxOccurs="unbounded"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
         *                                               &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="TimeSpan"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="StartDateWindow" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
         *                                               &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                     &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
         *                                     &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
         *                                     &lt;attribute name="Duration"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                           &lt;pattern value="P[0-9]+N"/&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Total" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" /&gt;
         *                                     &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ResGuests" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ResGuest"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Profiles"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="ProfileInfo"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="Profile"&gt;
         *                                                   &lt;complexType&gt;
         *                                                     &lt;complexContent&gt;
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                         &lt;sequence&gt;
         *                                                           &lt;element name="Customer"&gt;
         *                                                             &lt;complexType&gt;
         *                                                               &lt;complexContent&gt;
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                                   &lt;sequence&gt;
         *                                                                     &lt;element name="PersonName"&gt;
         *                                                                       &lt;complexType&gt;
         *                                                                         &lt;complexContent&gt;
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                                             &lt;sequence&gt;
         *                                                                               &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
         *                                                                               &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
         *                                                                               &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
         *                                                                               &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
         *                                                                             &lt;/sequence&gt;
         *                                                                           &lt;/restriction&gt;
         *                                                                         &lt;/complexContent&gt;
         *                                                                       &lt;/complexType&gt;
         *                                                                     &lt;/element&gt;
         *                                                                     &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                                                       &lt;complexType&gt;
         *                                                                         &lt;complexContent&gt;
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                                             &lt;attribute name="PhoneTechType" use="required"&gt;
         *                                                                               &lt;simpleType&gt;
         *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                                                   &lt;pattern value="(1|3|5)"/&gt;
         *                                                                                 &lt;/restriction&gt;
         *                                                                               &lt;/simpleType&gt;
         *                                                                             &lt;/attribute&gt;
         *                                                                             &lt;attribute name="PhoneNumber" use="required"&gt;
         *                                                                               &lt;simpleType&gt;
         *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                                                   &lt;pattern value="\+?[0-9]+"/&gt;
         *                                                                                 &lt;/restriction&gt;
         *                                                                               &lt;/simpleType&gt;
         *                                                                             &lt;/attribute&gt;
         *                                                                           &lt;/restriction&gt;
         *                                                                         &lt;/complexContent&gt;
         *                                                                       &lt;/complexType&gt;
         *                                                                     &lt;/element&gt;
         *                                                                     &lt;element name="Email" minOccurs="0"&gt;
         *                                                                       &lt;complexType&gt;
         *                                                                         &lt;simpleContent&gt;
         *                                                                           &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
         *                                                                             &lt;attribute name="Remark"&gt;
         *                                                                               &lt;simpleType&gt;
         *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                                                   &lt;pattern value="newsletter:(no|yes)"/&gt;
         *                                                                                 &lt;/restriction&gt;
         *                                                                               &lt;/simpleType&gt;
         *                                                                             &lt;/attribute&gt;
         *                                                                           &lt;/extension&gt;
         *                                                                         &lt;/simpleContent&gt;
         *                                                                       &lt;/complexType&gt;
         *                                                                     &lt;/element&gt;
         *                                                                     &lt;element name="Address" minOccurs="0"&gt;
         *                                                                       &lt;complexType&gt;
         *                                                                         &lt;complexContent&gt;
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                                             &lt;sequence&gt;
         *                                                                               &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
         *                                                                               &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
         *                                                                               &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
         *                                                                               &lt;element name="CountryName"&gt;
         *                                                                                 &lt;complexType&gt;
         *                                                                                   &lt;complexContent&gt;
         *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                                                       &lt;attribute name="Code" use="required"&gt;
         *                                                                                         &lt;simpleType&gt;
         *                                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                                                             &lt;pattern value="[A-Z][A-Z]"/&gt;
         *                                                                                           &lt;/restriction&gt;
         *                                                                                         &lt;/simpleType&gt;
         *                                                                                       &lt;/attribute&gt;
         *                                                                                     &lt;/restriction&gt;
         *                                                                                   &lt;/complexContent&gt;
         *                                                                                 &lt;/complexType&gt;
         *                                                                               &lt;/element&gt;
         *                                                                             &lt;/sequence&gt;
         *                                                                             &lt;attribute name="Remark"&gt;
         *                                                                               &lt;simpleType&gt;
         *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                                                   &lt;pattern value="catalog:(no|yes)"/&gt;
         *                                                                                 &lt;/restriction&gt;
         *                                                                               &lt;/simpleType&gt;
         *                                                                             &lt;/attribute&gt;
         *                                                                           &lt;/restriction&gt;
         *                                                                         &lt;/complexContent&gt;
         *                                                                       &lt;/complexType&gt;
         *                                                                     &lt;/element&gt;
         *                                                                   &lt;/sequence&gt;
         *                                                                   &lt;attribute name="Gender" use="required"&gt;
         *                                                                     &lt;simpleType&gt;
         *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                                         &lt;pattern value="(Unknown|Male|Female)"/&gt;
         *                                                                       &lt;/restriction&gt;
         *                                                                     &lt;/simpleType&gt;
         *                                                                   &lt;/attribute&gt;
         *                                                                   &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
         *                                                                   &lt;attribute name="Language" use="required"&gt;
         *                                                                     &lt;simpleType&gt;
         *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
         *                                                                         &lt;pattern value="[a-z][a-z]"/&gt;
         *                                                                       &lt;/restriction&gt;
         *                                                                     &lt;/simpleType&gt;
         *                                                                   &lt;/attribute&gt;
         *                                                                 &lt;/restriction&gt;
         *                                                               &lt;/complexContent&gt;
         *                                                             &lt;/complexType&gt;
         *                                                           &lt;/element&gt;
         *                                                         &lt;/sequence&gt;
         *                                                       &lt;/restriction&gt;
         *                                                     &lt;/complexContent&gt;
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
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ResGlobalInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Comments" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Comment" maxOccurs="2"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;choice&gt;
         *                                         &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                           &lt;complexType&gt;
         *                                             &lt;simpleContent&gt;
         *                                               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
         *                                                 &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
         *                                                 &lt;attribute name="Language" use="required"&gt;
         *                                                   &lt;simpleType&gt;
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
         *                                                       &lt;pattern value="[a-z][a-z]"/&gt;
         *                                                     &lt;/restriction&gt;
         *                                                   &lt;/simpleType&gt;
         *                                                 &lt;/attribute&gt;
         *                                               &lt;/extension&gt;
         *                                             &lt;/simpleContent&gt;
         *                                           &lt;/complexType&gt;
         *                                         &lt;/element&gt;
         *                                         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
         *                                       &lt;/choice&gt;
         *                                     &lt;/sequence&gt;
         *                                     &lt;attribute name="Name" use="required"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                           &lt;enumeration value="included services"/&gt;
         *                                           &lt;enumeration value="customer comment"/&gt;
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
         *                   &lt;element name="CancelPenalties" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CancelPenalty"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="PenaltyDescription"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
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
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="HotelReservationIDs" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="HotelReservationID"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="ResID_Type" use="required"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                           &lt;enumeration value="13"/&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                     &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
         *                                     &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
         *                                     &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CreateDateTime" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_datetime" /&gt;
         *       &lt;attribute name="ResStatus" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Requested"/&gt;
         *             &lt;enumeration value="Reserved"/&gt;
         *             &lt;enumeration value="Cancelled"/&gt;
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
             * Recupera il valore della proprietà uniqueID.
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
             * Imposta il valore della proprietà uniqueID.
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
             * Recupera il valore della proprietà roomStays.
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
             * Imposta il valore della proprietà roomStays.
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
             * Recupera il valore della proprietà resGuests.
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
             * Imposta il valore della proprietà resGuests.
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
             * Recupera il valore della proprietà resGlobalInfo.
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
             * Imposta il valore della proprietà resGlobalInfo.
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
             * Recupera il valore della proprietà createDateTime.
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
             * Imposta il valore della proprietà createDateTime.
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
             * Recupera il valore della proprietà resStatus.
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
             * Imposta il valore della proprietà resStatus.
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
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Comments" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Comment" maxOccurs="2"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;choice&gt;
             *                               &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0"&gt;
             *                                 &lt;complexType&gt;
             *                                   &lt;simpleContent&gt;
             *                                     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
             *                                       &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
             *                                       &lt;attribute name="Language" use="required"&gt;
             *                                         &lt;simpleType&gt;
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
             *                                             &lt;pattern value="[a-z][a-z]"/&gt;
             *                                           &lt;/restriction&gt;
             *                                         &lt;/simpleType&gt;
             *                                       &lt;/attribute&gt;
             *                                     &lt;/extension&gt;
             *                                   &lt;/simpleContent&gt;
             *                                 &lt;/complexType&gt;
             *                               &lt;/element&gt;
             *                               &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
             *                             &lt;/choice&gt;
             *                           &lt;/sequence&gt;
             *                           &lt;attribute name="Name" use="required"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                 &lt;enumeration value="included services"/&gt;
             *                                 &lt;enumeration value="customer comment"/&gt;
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
             *         &lt;element name="CancelPenalties" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CancelPenalty"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="PenaltyDescription"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
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
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="HotelReservationIDs" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="HotelReservationID"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="ResID_Type" use="required"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                 &lt;enumeration value="13"/&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                           &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
             *                           &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
             *                           &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * Recupera il valore della proprietà comments.
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
                 * Imposta il valore della proprietà comments.
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
                 * Recupera il valore della proprietà cancelPenalties.
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
                 * Imposta il valore della proprietà cancelPenalties.
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
                 * Recupera il valore della proprietà hotelReservationIDs.
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
                 * Imposta il valore della proprietà hotelReservationIDs.
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
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="CancelPenalty"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="PenaltyDescription"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
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
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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
                     * Recupera il valore della proprietà cancelPenalty.
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
                     * Imposta il valore della proprietà cancelPenalty.
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="PenaltyDescription"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
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
                        "penaltyDescription"
                    })
                    public static class CancelPenalty {

                        @XmlElement(name = "PenaltyDescription", required = true)
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.CancelPenalties.CancelPenalty.PenaltyDescription penaltyDescription;

                        /**
                         * Recupera il valore della proprietà penaltyDescription.
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
                         * Imposta il valore della proprietà penaltyDescription.
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
                         * <p>Classe Java per anonymous complex type.
                         * 
                         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;sequence&gt;
                         *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
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
                        public static class PenaltyDescription {

                            @XmlElement(name = "Text", required = true)
                            protected String text;

                            /**
                             * Recupera il valore della proprietà text.
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
                             * Imposta il valore della proprietà text.
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
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Comment" maxOccurs="2"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;choice&gt;
                 *                     &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                       &lt;complexType&gt;
                 *                         &lt;simpleContent&gt;
                 *                           &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
                 *                             &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
                 *                             &lt;attribute name="Language" use="required"&gt;
                 *                               &lt;simpleType&gt;
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                 *                                   &lt;pattern value="[a-z][a-z]"/&gt;
                 *                                 &lt;/restriction&gt;
                 *                               &lt;/simpleType&gt;
                 *                             &lt;/attribute&gt;
                 *                           &lt;/extension&gt;
                 *                         &lt;/simpleContent&gt;
                 *                       &lt;/complexType&gt;
                 *                     &lt;/element&gt;
                 *                     &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                 *                   &lt;/choice&gt;
                 *                 &lt;/sequence&gt;
                 *                 &lt;attribute name="Name" use="required"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                       &lt;enumeration value="included services"/&gt;
                 *                       &lt;enumeration value="customer comment"/&gt;
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;choice&gt;
                     *           &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0"&gt;
                     *             &lt;complexType&gt;
                     *               &lt;simpleContent&gt;
                     *                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
                     *                   &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
                     *                   &lt;attribute name="Language" use="required"&gt;
                     *                     &lt;simpleType&gt;
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                     *                         &lt;pattern value="[a-z][a-z]"/&gt;
                     *                       &lt;/restriction&gt;
                     *                     &lt;/simpleType&gt;
                     *                   &lt;/attribute&gt;
                     *                 &lt;/extension&gt;
                     *               &lt;/simpleContent&gt;
                     *             &lt;/complexType&gt;
                     *           &lt;/element&gt;
                     *           &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                     *         &lt;/choice&gt;
                     *       &lt;/sequence&gt;
                     *       &lt;attribute name="Name" use="required"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *             &lt;enumeration value="included services"/&gt;
                     *             &lt;enumeration value="customer comment"/&gt;
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
                         * Recupera il valore della proprietà text.
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
                         * Imposta il valore della proprietà text.
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
                         * Recupera il valore della proprietà name.
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
                         * Imposta il valore della proprietà name.
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
                         * <p>Classe Java per anonymous complex type.
                         * 
                         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;simpleContent&gt;
                         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_nonempty_string"&gt;
                         *       &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
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
                        public static class ListItem {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "ListItem", required = true)
                            protected BigInteger listItem;
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
                             * Recupera il valore della proprietà listItem.
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
                             * Imposta il valore della proprietà listItem.
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
                 *         &lt;element name="HotelReservationID"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="ResID_Type" use="required"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                       &lt;enumeration value="13"/&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *                 &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                 *                 &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                 *                 &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
                    "hotelReservationID"
                })
                public static class HotelReservationIDs {

                    @XmlElement(name = "HotelReservationID", required = true)
                    protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID hotelReservationID;

                    /**
                     * Recupera il valore della proprietà hotelReservationID.
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
                     * Imposta il valore della proprietà hotelReservationID.
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="ResID_Type" use="required"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *             &lt;enumeration value="13"/&gt;
                     *           &lt;/restriction&gt;
                     *         &lt;/simpleType&gt;
                     *       &lt;/attribute&gt;
                     *       &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                     *       &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                     *       &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
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
                         * Recupera il valore della proprietà resIDType.
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
                         * Imposta il valore della proprietà resIDType.
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
                         * Recupera il valore della proprietà resIDValue.
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
                         * Imposta il valore della proprietà resIDValue.
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
                         * Recupera il valore della proprietà resIDSource.
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
                         * Imposta il valore della proprietà resIDSource.
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
                         * Recupera il valore della proprietà resIDSourceContext.
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
                         * Imposta il valore della proprietà resIDSourceContext.
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
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ResGuest"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Profiles"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="ProfileInfo"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="Profile"&gt;
             *                                         &lt;complexType&gt;
             *                                           &lt;complexContent&gt;
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                               &lt;sequence&gt;
             *                                                 &lt;element name="Customer"&gt;
             *                                                   &lt;complexType&gt;
             *                                                     &lt;complexContent&gt;
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                                         &lt;sequence&gt;
             *                                                           &lt;element name="PersonName"&gt;
             *                                                             &lt;complexType&gt;
             *                                                               &lt;complexContent&gt;
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                                                   &lt;sequence&gt;
             *                                                                     &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
             *                                                                     &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
             *                                                                     &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
             *                                                                     &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
             *                                                                   &lt;/sequence&gt;
             *                                                                 &lt;/restriction&gt;
             *                                                               &lt;/complexContent&gt;
             *                                                             &lt;/complexType&gt;
             *                                                           &lt;/element&gt;
             *                                                           &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
             *                                                             &lt;complexType&gt;
             *                                                               &lt;complexContent&gt;
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                                                   &lt;attribute name="PhoneTechType" use="required"&gt;
             *                                                                     &lt;simpleType&gt;
             *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                                                         &lt;pattern value="(1|3|5)"/&gt;
             *                                                                       &lt;/restriction&gt;
             *                                                                     &lt;/simpleType&gt;
             *                                                                   &lt;/attribute&gt;
             *                                                                   &lt;attribute name="PhoneNumber" use="required"&gt;
             *                                                                     &lt;simpleType&gt;
             *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                                                         &lt;pattern value="\+?[0-9]+"/&gt;
             *                                                                       &lt;/restriction&gt;
             *                                                                     &lt;/simpleType&gt;
             *                                                                   &lt;/attribute&gt;
             *                                                                 &lt;/restriction&gt;
             *                                                               &lt;/complexContent&gt;
             *                                                             &lt;/complexType&gt;
             *                                                           &lt;/element&gt;
             *                                                           &lt;element name="Email" minOccurs="0"&gt;
             *                                                             &lt;complexType&gt;
             *                                                               &lt;simpleContent&gt;
             *                                                                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
             *                                                                   &lt;attribute name="Remark"&gt;
             *                                                                     &lt;simpleType&gt;
             *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                                                         &lt;pattern value="newsletter:(no|yes)"/&gt;
             *                                                                       &lt;/restriction&gt;
             *                                                                     &lt;/simpleType&gt;
             *                                                                   &lt;/attribute&gt;
             *                                                                 &lt;/extension&gt;
             *                                                               &lt;/simpleContent&gt;
             *                                                             &lt;/complexType&gt;
             *                                                           &lt;/element&gt;
             *                                                           &lt;element name="Address" minOccurs="0"&gt;
             *                                                             &lt;complexType&gt;
             *                                                               &lt;complexContent&gt;
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                                                   &lt;sequence&gt;
             *                                                                     &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
             *                                                                     &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
             *                                                                     &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
             *                                                                     &lt;element name="CountryName"&gt;
             *                                                                       &lt;complexType&gt;
             *                                                                         &lt;complexContent&gt;
             *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                                                             &lt;attribute name="Code" use="required"&gt;
             *                                                                               &lt;simpleType&gt;
             *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                                                                   &lt;pattern value="[A-Z][A-Z]"/&gt;
             *                                                                                 &lt;/restriction&gt;
             *                                                                               &lt;/simpleType&gt;
             *                                                                             &lt;/attribute&gt;
             *                                                                           &lt;/restriction&gt;
             *                                                                         &lt;/complexContent&gt;
             *                                                                       &lt;/complexType&gt;
             *                                                                     &lt;/element&gt;
             *                                                                   &lt;/sequence&gt;
             *                                                                   &lt;attribute name="Remark"&gt;
             *                                                                     &lt;simpleType&gt;
             *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                                                         &lt;pattern value="catalog:(no|yes)"/&gt;
             *                                                                       &lt;/restriction&gt;
             *                                                                     &lt;/simpleType&gt;
             *                                                                   &lt;/attribute&gt;
             *                                                                 &lt;/restriction&gt;
             *                                                               &lt;/complexContent&gt;
             *                                                             &lt;/complexType&gt;
             *                                                           &lt;/element&gt;
             *                                                         &lt;/sequence&gt;
             *                                                         &lt;attribute name="Gender" use="required"&gt;
             *                                                           &lt;simpleType&gt;
             *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                                               &lt;pattern value="(Unknown|Male|Female)"/&gt;
             *                                                             &lt;/restriction&gt;
             *                                                           &lt;/simpleType&gt;
             *                                                         &lt;/attribute&gt;
             *                                                         &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
             *                                                         &lt;attribute name="Language" use="required"&gt;
             *                                                           &lt;simpleType&gt;
             *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
             *                                                               &lt;pattern value="[a-z][a-z]"/&gt;
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
                "resGuest"
            })
            public static class ResGuests {

                @XmlElement(name = "ResGuest", required = true)
                protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest resGuest;

                /**
                 * Recupera il valore della proprietà resGuest.
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
                 * Imposta il valore della proprietà resGuest.
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
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Profiles"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="ProfileInfo"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="Profile"&gt;
                 *                               &lt;complexType&gt;
                 *                                 &lt;complexContent&gt;
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                     &lt;sequence&gt;
                 *                                       &lt;element name="Customer"&gt;
                 *                                         &lt;complexType&gt;
                 *                                           &lt;complexContent&gt;
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                               &lt;sequence&gt;
                 *                                                 &lt;element name="PersonName"&gt;
                 *                                                   &lt;complexType&gt;
                 *                                                     &lt;complexContent&gt;
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                                         &lt;sequence&gt;
                 *                                                           &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                 *                                                           &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                 *                                                           &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                 *                                                           &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                 *                                                         &lt;/sequence&gt;
                 *                                                       &lt;/restriction&gt;
                 *                                                     &lt;/complexContent&gt;
                 *                                                   &lt;/complexType&gt;
                 *                                                 &lt;/element&gt;
                 *                                                 &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                                                   &lt;complexType&gt;
                 *                                                     &lt;complexContent&gt;
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                                         &lt;attribute name="PhoneTechType" use="required"&gt;
                 *                                                           &lt;simpleType&gt;
                 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                                               &lt;pattern value="(1|3|5)"/&gt;
                 *                                                             &lt;/restriction&gt;
                 *                                                           &lt;/simpleType&gt;
                 *                                                         &lt;/attribute&gt;
                 *                                                         &lt;attribute name="PhoneNumber" use="required"&gt;
                 *                                                           &lt;simpleType&gt;
                 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                                               &lt;pattern value="\+?[0-9]+"/&gt;
                 *                                                             &lt;/restriction&gt;
                 *                                                           &lt;/simpleType&gt;
                 *                                                         &lt;/attribute&gt;
                 *                                                       &lt;/restriction&gt;
                 *                                                     &lt;/complexContent&gt;
                 *                                                   &lt;/complexType&gt;
                 *                                                 &lt;/element&gt;
                 *                                                 &lt;element name="Email" minOccurs="0"&gt;
                 *                                                   &lt;complexType&gt;
                 *                                                     &lt;simpleContent&gt;
                 *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
                 *                                                         &lt;attribute name="Remark"&gt;
                 *                                                           &lt;simpleType&gt;
                 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                                               &lt;pattern value="newsletter:(no|yes)"/&gt;
                 *                                                             &lt;/restriction&gt;
                 *                                                           &lt;/simpleType&gt;
                 *                                                         &lt;/attribute&gt;
                 *                                                       &lt;/extension&gt;
                 *                                                     &lt;/simpleContent&gt;
                 *                                                   &lt;/complexType&gt;
                 *                                                 &lt;/element&gt;
                 *                                                 &lt;element name="Address" minOccurs="0"&gt;
                 *                                                   &lt;complexType&gt;
                 *                                                     &lt;complexContent&gt;
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                                         &lt;sequence&gt;
                 *                                                           &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                 *                                                           &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                 *                                                           &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                 *                                                           &lt;element name="CountryName"&gt;
                 *                                                             &lt;complexType&gt;
                 *                                                               &lt;complexContent&gt;
                 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                                                   &lt;attribute name="Code" use="required"&gt;
                 *                                                                     &lt;simpleType&gt;
                 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                                                         &lt;pattern value="[A-Z][A-Z]"/&gt;
                 *                                                                       &lt;/restriction&gt;
                 *                                                                     &lt;/simpleType&gt;
                 *                                                                   &lt;/attribute&gt;
                 *                                                                 &lt;/restriction&gt;
                 *                                                               &lt;/complexContent&gt;
                 *                                                             &lt;/complexType&gt;
                 *                                                           &lt;/element&gt;
                 *                                                         &lt;/sequence&gt;
                 *                                                         &lt;attribute name="Remark"&gt;
                 *                                                           &lt;simpleType&gt;
                 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                                               &lt;pattern value="catalog:(no|yes)"/&gt;
                 *                                                             &lt;/restriction&gt;
                 *                                                           &lt;/simpleType&gt;
                 *                                                         &lt;/attribute&gt;
                 *                                                       &lt;/restriction&gt;
                 *                                                     &lt;/complexContent&gt;
                 *                                                   &lt;/complexType&gt;
                 *                                                 &lt;/element&gt;
                 *                                               &lt;/sequence&gt;
                 *                                               &lt;attribute name="Gender" use="required"&gt;
                 *                                                 &lt;simpleType&gt;
                 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                                     &lt;pattern value="(Unknown|Male|Female)"/&gt;
                 *                                                   &lt;/restriction&gt;
                 *                                                 &lt;/simpleType&gt;
                 *                                               &lt;/attribute&gt;
                 *                                               &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                 *                                               &lt;attribute name="Language" use="required"&gt;
                 *                                                 &lt;simpleType&gt;
                 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                 *                                                     &lt;pattern value="[a-z][a-z]"/&gt;
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
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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
                     * Recupera il valore della proprietà profiles.
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
                     * Imposta il valore della proprietà profiles.
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="ProfileInfo"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="Profile"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;complexContent&gt;
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                           &lt;sequence&gt;
                     *                             &lt;element name="Customer"&gt;
                     *                               &lt;complexType&gt;
                     *                                 &lt;complexContent&gt;
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                                     &lt;sequence&gt;
                     *                                       &lt;element name="PersonName"&gt;
                     *                                         &lt;complexType&gt;
                     *                                           &lt;complexContent&gt;
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                                               &lt;sequence&gt;
                     *                                                 &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                     *                                                 &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                     *                                                 &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                     *                                                 &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                     *                                               &lt;/sequence&gt;
                     *                                             &lt;/restriction&gt;
                     *                                           &lt;/complexContent&gt;
                     *                                         &lt;/complexType&gt;
                     *                                       &lt;/element&gt;
                     *                                       &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
                     *                                         &lt;complexType&gt;
                     *                                           &lt;complexContent&gt;
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                                               &lt;attribute name="PhoneTechType" use="required"&gt;
                     *                                                 &lt;simpleType&gt;
                     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                                                     &lt;pattern value="(1|3|5)"/&gt;
                     *                                                   &lt;/restriction&gt;
                     *                                                 &lt;/simpleType&gt;
                     *                                               &lt;/attribute&gt;
                     *                                               &lt;attribute name="PhoneNumber" use="required"&gt;
                     *                                                 &lt;simpleType&gt;
                     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                                                     &lt;pattern value="\+?[0-9]+"/&gt;
                     *                                                   &lt;/restriction&gt;
                     *                                                 &lt;/simpleType&gt;
                     *                                               &lt;/attribute&gt;
                     *                                             &lt;/restriction&gt;
                     *                                           &lt;/complexContent&gt;
                     *                                         &lt;/complexType&gt;
                     *                                       &lt;/element&gt;
                     *                                       &lt;element name="Email" minOccurs="0"&gt;
                     *                                         &lt;complexType&gt;
                     *                                           &lt;simpleContent&gt;
                     *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
                     *                                               &lt;attribute name="Remark"&gt;
                     *                                                 &lt;simpleType&gt;
                     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                                                     &lt;pattern value="newsletter:(no|yes)"/&gt;
                     *                                                   &lt;/restriction&gt;
                     *                                                 &lt;/simpleType&gt;
                     *                                               &lt;/attribute&gt;
                     *                                             &lt;/extension&gt;
                     *                                           &lt;/simpleContent&gt;
                     *                                         &lt;/complexType&gt;
                     *                                       &lt;/element&gt;
                     *                                       &lt;element name="Address" minOccurs="0"&gt;
                     *                                         &lt;complexType&gt;
                     *                                           &lt;complexContent&gt;
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                                               &lt;sequence&gt;
                     *                                                 &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                     *                                                 &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                     *                                                 &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                     *                                                 &lt;element name="CountryName"&gt;
                     *                                                   &lt;complexType&gt;
                     *                                                     &lt;complexContent&gt;
                     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                                                         &lt;attribute name="Code" use="required"&gt;
                     *                                                           &lt;simpleType&gt;
                     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                                                               &lt;pattern value="[A-Z][A-Z]"/&gt;
                     *                                                             &lt;/restriction&gt;
                     *                                                           &lt;/simpleType&gt;
                     *                                                         &lt;/attribute&gt;
                     *                                                       &lt;/restriction&gt;
                     *                                                     &lt;/complexContent&gt;
                     *                                                   &lt;/complexType&gt;
                     *                                                 &lt;/element&gt;
                     *                                               &lt;/sequence&gt;
                     *                                               &lt;attribute name="Remark"&gt;
                     *                                                 &lt;simpleType&gt;
                     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                                                     &lt;pattern value="catalog:(no|yes)"/&gt;
                     *                                                   &lt;/restriction&gt;
                     *                                                 &lt;/simpleType&gt;
                     *                                               &lt;/attribute&gt;
                     *                                             &lt;/restriction&gt;
                     *                                           &lt;/complexContent&gt;
                     *                                         &lt;/complexType&gt;
                     *                                       &lt;/element&gt;
                     *                                     &lt;/sequence&gt;
                     *                                     &lt;attribute name="Gender" use="required"&gt;
                     *                                       &lt;simpleType&gt;
                     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                                           &lt;pattern value="(Unknown|Male|Female)"/&gt;
                     *                                         &lt;/restriction&gt;
                     *                                       &lt;/simpleType&gt;
                     *                                     &lt;/attribute&gt;
                     *                                     &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                     *                                     &lt;attribute name="Language" use="required"&gt;
                     *                                       &lt;simpleType&gt;
                     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                     *                                           &lt;pattern value="[a-z][a-z]"/&gt;
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
                        "profileInfo"
                    })
                    public static class Profiles {

                        @XmlElement(name = "ProfileInfo", required = true)
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo profileInfo;

                        /**
                         * Recupera il valore della proprietà profileInfo.
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
                         * Imposta il valore della proprietà profileInfo.
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
                         * <p>Classe Java per anonymous complex type.
                         * 
                         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;sequence&gt;
                         *         &lt;element name="Profile"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;complexContent&gt;
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                 &lt;sequence&gt;
                         *                   &lt;element name="Customer"&gt;
                         *                     &lt;complexType&gt;
                         *                       &lt;complexContent&gt;
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                           &lt;sequence&gt;
                         *                             &lt;element name="PersonName"&gt;
                         *                               &lt;complexType&gt;
                         *                                 &lt;complexContent&gt;
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                                     &lt;sequence&gt;
                         *                                       &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                         *                                       &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                         *                                       &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                         *                                       &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                         *                                     &lt;/sequence&gt;
                         *                                   &lt;/restriction&gt;
                         *                                 &lt;/complexContent&gt;
                         *                               &lt;/complexType&gt;
                         *                             &lt;/element&gt;
                         *                             &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
                         *                               &lt;complexType&gt;
                         *                                 &lt;complexContent&gt;
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                                     &lt;attribute name="PhoneTechType" use="required"&gt;
                         *                                       &lt;simpleType&gt;
                         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *                                           &lt;pattern value="(1|3|5)"/&gt;
                         *                                         &lt;/restriction&gt;
                         *                                       &lt;/simpleType&gt;
                         *                                     &lt;/attribute&gt;
                         *                                     &lt;attribute name="PhoneNumber" use="required"&gt;
                         *                                       &lt;simpleType&gt;
                         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *                                           &lt;pattern value="\+?[0-9]+"/&gt;
                         *                                         &lt;/restriction&gt;
                         *                                       &lt;/simpleType&gt;
                         *                                     &lt;/attribute&gt;
                         *                                   &lt;/restriction&gt;
                         *                                 &lt;/complexContent&gt;
                         *                               &lt;/complexType&gt;
                         *                             &lt;/element&gt;
                         *                             &lt;element name="Email" minOccurs="0"&gt;
                         *                               &lt;complexType&gt;
                         *                                 &lt;simpleContent&gt;
                         *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
                         *                                     &lt;attribute name="Remark"&gt;
                         *                                       &lt;simpleType&gt;
                         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *                                           &lt;pattern value="newsletter:(no|yes)"/&gt;
                         *                                         &lt;/restriction&gt;
                         *                                       &lt;/simpleType&gt;
                         *                                     &lt;/attribute&gt;
                         *                                   &lt;/extension&gt;
                         *                                 &lt;/simpleContent&gt;
                         *                               &lt;/complexType&gt;
                         *                             &lt;/element&gt;
                         *                             &lt;element name="Address" minOccurs="0"&gt;
                         *                               &lt;complexType&gt;
                         *                                 &lt;complexContent&gt;
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                                     &lt;sequence&gt;
                         *                                       &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                         *                                       &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                         *                                       &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                         *                                       &lt;element name="CountryName"&gt;
                         *                                         &lt;complexType&gt;
                         *                                           &lt;complexContent&gt;
                         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                                               &lt;attribute name="Code" use="required"&gt;
                         *                                                 &lt;simpleType&gt;
                         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *                                                     &lt;pattern value="[A-Z][A-Z]"/&gt;
                         *                                                   &lt;/restriction&gt;
                         *                                                 &lt;/simpleType&gt;
                         *                                               &lt;/attribute&gt;
                         *                                             &lt;/restriction&gt;
                         *                                           &lt;/complexContent&gt;
                         *                                         &lt;/complexType&gt;
                         *                                       &lt;/element&gt;
                         *                                     &lt;/sequence&gt;
                         *                                     &lt;attribute name="Remark"&gt;
                         *                                       &lt;simpleType&gt;
                         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *                                           &lt;pattern value="catalog:(no|yes)"/&gt;
                         *                                         &lt;/restriction&gt;
                         *                                       &lt;/simpleType&gt;
                         *                                     &lt;/attribute&gt;
                         *                                   &lt;/restriction&gt;
                         *                                 &lt;/complexContent&gt;
                         *                               &lt;/complexType&gt;
                         *                             &lt;/element&gt;
                         *                           &lt;/sequence&gt;
                         *                           &lt;attribute name="Gender" use="required"&gt;
                         *                             &lt;simpleType&gt;
                         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *                                 &lt;pattern value="(Unknown|Male|Female)"/&gt;
                         *                               &lt;/restriction&gt;
                         *                             &lt;/simpleType&gt;
                         *                           &lt;/attribute&gt;
                         *                           &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                         *                           &lt;attribute name="Language" use="required"&gt;
                         *                             &lt;simpleType&gt;
                         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                         *                                 &lt;pattern value="[a-z][a-z]"/&gt;
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
                            "profile"
                        })
                        public static class ProfileInfo {

                            @XmlElement(name = "Profile", required = true)
                            protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile profile;

                            /**
                             * Recupera il valore della proprietà profile.
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
                             * Imposta il valore della proprietà profile.
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
                             * <p>Classe Java per anonymous complex type.
                             * 
                             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                             * 
                             * <pre>
                             * &lt;complexType&gt;
                             *   &lt;complexContent&gt;
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *       &lt;sequence&gt;
                             *         &lt;element name="Customer"&gt;
                             *           &lt;complexType&gt;
                             *             &lt;complexContent&gt;
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *                 &lt;sequence&gt;
                             *                   &lt;element name="PersonName"&gt;
                             *                     &lt;complexType&gt;
                             *                       &lt;complexContent&gt;
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *                           &lt;sequence&gt;
                             *                             &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                             *                             &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                             *                             &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                             *                             &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                             *                           &lt;/sequence&gt;
                             *                         &lt;/restriction&gt;
                             *                       &lt;/complexContent&gt;
                             *                     &lt;/complexType&gt;
                             *                   &lt;/element&gt;
                             *                   &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
                             *                     &lt;complexType&gt;
                             *                       &lt;complexContent&gt;
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *                           &lt;attribute name="PhoneTechType" use="required"&gt;
                             *                             &lt;simpleType&gt;
                             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                             *                                 &lt;pattern value="(1|3|5)"/&gt;
                             *                               &lt;/restriction&gt;
                             *                             &lt;/simpleType&gt;
                             *                           &lt;/attribute&gt;
                             *                           &lt;attribute name="PhoneNumber" use="required"&gt;
                             *                             &lt;simpleType&gt;
                             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                             *                                 &lt;pattern value="\+?[0-9]+"/&gt;
                             *                               &lt;/restriction&gt;
                             *                             &lt;/simpleType&gt;
                             *                           &lt;/attribute&gt;
                             *                         &lt;/restriction&gt;
                             *                       &lt;/complexContent&gt;
                             *                     &lt;/complexType&gt;
                             *                   &lt;/element&gt;
                             *                   &lt;element name="Email" minOccurs="0"&gt;
                             *                     &lt;complexType&gt;
                             *                       &lt;simpleContent&gt;
                             *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
                             *                           &lt;attribute name="Remark"&gt;
                             *                             &lt;simpleType&gt;
                             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                             *                                 &lt;pattern value="newsletter:(no|yes)"/&gt;
                             *                               &lt;/restriction&gt;
                             *                             &lt;/simpleType&gt;
                             *                           &lt;/attribute&gt;
                             *                         &lt;/extension&gt;
                             *                       &lt;/simpleContent&gt;
                             *                     &lt;/complexType&gt;
                             *                   &lt;/element&gt;
                             *                   &lt;element name="Address" minOccurs="0"&gt;
                             *                     &lt;complexType&gt;
                             *                       &lt;complexContent&gt;
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *                           &lt;sequence&gt;
                             *                             &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                             *                             &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                             *                             &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                             *                             &lt;element name="CountryName"&gt;
                             *                               &lt;complexType&gt;
                             *                                 &lt;complexContent&gt;
                             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *                                     &lt;attribute name="Code" use="required"&gt;
                             *                                       &lt;simpleType&gt;
                             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                             *                                           &lt;pattern value="[A-Z][A-Z]"/&gt;
                             *                                         &lt;/restriction&gt;
                             *                                       &lt;/simpleType&gt;
                             *                                     &lt;/attribute&gt;
                             *                                   &lt;/restriction&gt;
                             *                                 &lt;/complexContent&gt;
                             *                               &lt;/complexType&gt;
                             *                             &lt;/element&gt;
                             *                           &lt;/sequence&gt;
                             *                           &lt;attribute name="Remark"&gt;
                             *                             &lt;simpleType&gt;
                             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                             *                                 &lt;pattern value="catalog:(no|yes)"/&gt;
                             *                               &lt;/restriction&gt;
                             *                             &lt;/simpleType&gt;
                             *                           &lt;/attribute&gt;
                             *                         &lt;/restriction&gt;
                             *                       &lt;/complexContent&gt;
                             *                     &lt;/complexType&gt;
                             *                   &lt;/element&gt;
                             *                 &lt;/sequence&gt;
                             *                 &lt;attribute name="Gender" use="required"&gt;
                             *                   &lt;simpleType&gt;
                             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                             *                       &lt;pattern value="(Unknown|Male|Female)"/&gt;
                             *                     &lt;/restriction&gt;
                             *                   &lt;/simpleType&gt;
                             *                 &lt;/attribute&gt;
                             *                 &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                             *                 &lt;attribute name="Language" use="required"&gt;
                             *                   &lt;simpleType&gt;
                             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                             *                       &lt;pattern value="[a-z][a-z]"/&gt;
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
                                "customer"
                            })
                            public static class Profile {

                                @XmlElement(name = "Customer", required = true)
                                protected OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer customer;

                                /**
                                 * Recupera il valore della proprietà customer.
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
                                 * Imposta il valore della proprietà customer.
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
                                 * <p>Classe Java per anonymous complex type.
                                 * 
                                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                                 * 
                                 * <pre>
                                 * &lt;complexType&gt;
                                 *   &lt;complexContent&gt;
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                 *       &lt;sequence&gt;
                                 *         &lt;element name="PersonName"&gt;
                                 *           &lt;complexType&gt;
                                 *             &lt;complexContent&gt;
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                 *                 &lt;sequence&gt;
                                 *                   &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                                 *                   &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                 *                   &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                 *                   &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                                 *                 &lt;/sequence&gt;
                                 *               &lt;/restriction&gt;
                                 *             &lt;/complexContent&gt;
                                 *           &lt;/complexType&gt;
                                 *         &lt;/element&gt;
                                 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
                                 *           &lt;complexType&gt;
                                 *             &lt;complexContent&gt;
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                 *                 &lt;attribute name="PhoneTechType" use="required"&gt;
                                 *                   &lt;simpleType&gt;
                                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                 *                       &lt;pattern value="(1|3|5)"/&gt;
                                 *                     &lt;/restriction&gt;
                                 *                   &lt;/simpleType&gt;
                                 *                 &lt;/attribute&gt;
                                 *                 &lt;attribute name="PhoneNumber" use="required"&gt;
                                 *                   &lt;simpleType&gt;
                                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                 *                       &lt;pattern value="\+?[0-9]+"/&gt;
                                 *                     &lt;/restriction&gt;
                                 *                   &lt;/simpleType&gt;
                                 *                 &lt;/attribute&gt;
                                 *               &lt;/restriction&gt;
                                 *             &lt;/complexContent&gt;
                                 *           &lt;/complexType&gt;
                                 *         &lt;/element&gt;
                                 *         &lt;element name="Email" minOccurs="0"&gt;
                                 *           &lt;complexType&gt;
                                 *             &lt;simpleContent&gt;
                                 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
                                 *                 &lt;attribute name="Remark"&gt;
                                 *                   &lt;simpleType&gt;
                                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                 *                       &lt;pattern value="newsletter:(no|yes)"/&gt;
                                 *                     &lt;/restriction&gt;
                                 *                   &lt;/simpleType&gt;
                                 *                 &lt;/attribute&gt;
                                 *               &lt;/extension&gt;
                                 *             &lt;/simpleContent&gt;
                                 *           &lt;/complexType&gt;
                                 *         &lt;/element&gt;
                                 *         &lt;element name="Address" minOccurs="0"&gt;
                                 *           &lt;complexType&gt;
                                 *             &lt;complexContent&gt;
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                 *                 &lt;sequence&gt;
                                 *                   &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                 *                   &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                 *                   &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                 *                   &lt;element name="CountryName"&gt;
                                 *                     &lt;complexType&gt;
                                 *                       &lt;complexContent&gt;
                                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                 *                           &lt;attribute name="Code" use="required"&gt;
                                 *                             &lt;simpleType&gt;
                                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                 *                                 &lt;pattern value="[A-Z][A-Z]"/&gt;
                                 *                               &lt;/restriction&gt;
                                 *                             &lt;/simpleType&gt;
                                 *                           &lt;/attribute&gt;
                                 *                         &lt;/restriction&gt;
                                 *                       &lt;/complexContent&gt;
                                 *                     &lt;/complexType&gt;
                                 *                   &lt;/element&gt;
                                 *                 &lt;/sequence&gt;
                                 *                 &lt;attribute name="Remark"&gt;
                                 *                   &lt;simpleType&gt;
                                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                 *                       &lt;pattern value="catalog:(no|yes)"/&gt;
                                 *                     &lt;/restriction&gt;
                                 *                   &lt;/simpleType&gt;
                                 *                 &lt;/attribute&gt;
                                 *               &lt;/restriction&gt;
                                 *             &lt;/complexContent&gt;
                                 *           &lt;/complexType&gt;
                                 *         &lt;/element&gt;
                                 *       &lt;/sequence&gt;
                                 *       &lt;attribute name="Gender" use="required"&gt;
                                 *         &lt;simpleType&gt;
                                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                 *             &lt;pattern value="(Unknown|Male|Female)"/&gt;
                                 *           &lt;/restriction&gt;
                                 *         &lt;/simpleType&gt;
                                 *       &lt;/attribute&gt;
                                 *       &lt;attribute name="BirthDate" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                                 *       &lt;attribute name="Language" use="required"&gt;
                                 *         &lt;simpleType&gt;
                                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
                                 *             &lt;pattern value="[a-z][a-z]"/&gt;
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
                                     * Recupera il valore della proprietà personName.
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
                                     * Imposta il valore della proprietà personName.
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
                                     * Recupera il valore della proprietà email.
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
                                     * Imposta il valore della proprietà email.
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
                                     * Recupera il valore della proprietà address.
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
                                     * Imposta il valore della proprietà address.
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
                                     * Recupera il valore della proprietà gender.
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
                                     * Imposta il valore della proprietà gender.
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
                                     * Recupera il valore della proprietà birthDate.
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
                                     * Imposta il valore della proprietà birthDate.
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
                                     *         &lt;element name="AddressLine" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                     *         &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                     *         &lt;element name="PostalCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                     *         &lt;element name="CountryName"&gt;
                                     *           &lt;complexType&gt;
                                     *             &lt;complexContent&gt;
                                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                     *                 &lt;attribute name="Code" use="required"&gt;
                                     *                   &lt;simpleType&gt;
                                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                     *                       &lt;pattern value="[A-Z][A-Z]"/&gt;
                                     *                     &lt;/restriction&gt;
                                     *                   &lt;/simpleType&gt;
                                     *                 &lt;/attribute&gt;
                                     *               &lt;/restriction&gt;
                                     *             &lt;/complexContent&gt;
                                     *           &lt;/complexType&gt;
                                     *         &lt;/element&gt;
                                     *       &lt;/sequence&gt;
                                     *       &lt;attribute name="Remark"&gt;
                                     *         &lt;simpleType&gt;
                                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                     *             &lt;pattern value="catalog:(no|yes)"/&gt;
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
                                         * Recupera il valore della proprietà addressLine.
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
                                         * Imposta il valore della proprietà addressLine.
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
                                         * Recupera il valore della proprietà cityName.
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
                                         * Imposta il valore della proprietà cityName.
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
                                         * Recupera il valore della proprietà postalCode.
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
                                         * Imposta il valore della proprietà postalCode.
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
                                         * Recupera il valore della proprietà countryName.
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
                                         * Imposta il valore della proprietà countryName.
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
                                         * Recupera il valore della proprietà remark.
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
                                         * Imposta il valore della proprietà remark.
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
                                         * <p>Classe Java per anonymous complex type.
                                         * 
                                         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                                         * 
                                         * <pre>
                                         * &lt;complexType&gt;
                                         *   &lt;complexContent&gt;
                                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                         *       &lt;attribute name="Code" use="required"&gt;
                                         *         &lt;simpleType&gt;
                                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                         *             &lt;pattern value="[A-Z][A-Z]"/&gt;
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
                                        public static class CountryName {

                                            @XmlAttribute(name = "Code", required = true)
                                            protected String code;

                                            /**
                                             * Recupera il valore della proprietà code.
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
                                             * Imposta il valore della proprietà code.
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
                                     * <p>Classe Java per anonymous complex type.
                                     * 
                                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                                     * 
                                     * <pre>
                                     * &lt;complexType&gt;
                                     *   &lt;simpleContent&gt;
                                     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;def_email_string"&gt;
                                     *       &lt;attribute name="Remark"&gt;
                                     *         &lt;simpleType&gt;
                                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                     *             &lt;pattern value="newsletter:(no|yes)"/&gt;
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
                                    public static class Email {

                                        @XmlValue
                                        protected String value;
                                        @XmlAttribute(name = "Remark")
                                        protected String remark;

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
                                         * Recupera il valore della proprietà remark.
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
                                         * Imposta il valore della proprietà remark.
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
                                     * <p>Classe Java per anonymous complex type.
                                     * 
                                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                                     * 
                                     * <pre>
                                     * &lt;complexType&gt;
                                     *   &lt;complexContent&gt;
                                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                     *       &lt;sequence&gt;
                                     *         &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
                                     *         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                     *         &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string"/&gt;
                                     *         &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" minOccurs="0"/&gt;
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
                                         * Recupera il valore della proprietà namePrefix.
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
                                         * Imposta il valore della proprietà namePrefix.
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
                                         * Recupera il valore della proprietà givenName.
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
                                         * Imposta il valore della proprietà givenName.
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
                                         * Recupera il valore della proprietà surname.
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
                                         * Imposta il valore della proprietà surname.
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
                                         * Recupera il valore della proprietà nameTitle.
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
                                         * Imposta il valore della proprietà nameTitle.
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
                                     * <p>Classe Java per anonymous complex type.
                                     * 
                                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                                     * 
                                     * <pre>
                                     * &lt;complexType&gt;
                                     *   &lt;complexContent&gt;
                                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                                     *       &lt;attribute name="PhoneTechType" use="required"&gt;
                                     *         &lt;simpleType&gt;
                                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                     *             &lt;pattern value="(1|3|5)"/&gt;
                                     *           &lt;/restriction&gt;
                                     *         &lt;/simpleType&gt;
                                     *       &lt;/attribute&gt;
                                     *       &lt;attribute name="PhoneNumber" use="required"&gt;
                                     *         &lt;simpleType&gt;
                                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                                     *             &lt;pattern value="\+?[0-9]+"/&gt;
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
                                    public static class Telephone {

                                        @XmlAttribute(name = "PhoneTechType", required = true)
                                        protected String phoneTechType;
                                        @XmlAttribute(name = "PhoneNumber", required = true)
                                        protected String phoneNumber;

                                        /**
                                         * Recupera il valore della proprietà phoneTechType.
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
                                         * Imposta il valore della proprietà phoneTechType.
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
                                         * Recupera il valore della proprietà phoneNumber.
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
                                         * Imposta il valore della proprietà phoneNumber.
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
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="RoomStay" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="RoomTypes" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="RoomType"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="RatePlans" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="RatePlan"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="MealsIncluded" minOccurs="0"&gt;
             *                                         &lt;complexType&gt;
             *                                           &lt;complexContent&gt;
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                               &lt;attribute name="MealPlanIndicator" use="required"&gt;
             *                                                 &lt;simpleType&gt;
             *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                                     &lt;enumeration value="1"/&gt;
             *                                                     &lt;enumeration value="true"/&gt;
             *                                                   &lt;/restriction&gt;
             *                                                 &lt;/simpleType&gt;
             *                                               &lt;/attribute&gt;
             *                                               &lt;attribute name="MealPlanCodes" use="required"&gt;
             *                                                 &lt;simpleType&gt;
             *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                                     &lt;enumeration value="1"/&gt;
             *                                                     &lt;enumeration value="3"/&gt;
             *                                                     &lt;enumeration value="10"/&gt;
             *                                                     &lt;enumeration value="12"/&gt;
             *                                                     &lt;enumeration value="14"/&gt;
             *                                                   &lt;/restriction&gt;
             *                                                 &lt;/simpleType&gt;
             *                                               &lt;/attribute&gt;
             *                                             &lt;/restriction&gt;
             *                                           &lt;/complexContent&gt;
             *                                         &lt;/complexType&gt;
             *                                       &lt;/element&gt;
             *                                     &lt;/sequence&gt;
             *                                     &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="GuestCounts" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="GuestCount" maxOccurs="unbounded"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
             *                                     &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="TimeSpan"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="StartDateWindow" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
             *                                     &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
             *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
             *                           &lt;attribute name="Duration"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                 &lt;pattern value="P[0-9]+N"/&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Total" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" /&gt;
             *                           &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="RoomTypes" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="RoomType"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="RatePlans" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="RatePlan"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="MealsIncluded" minOccurs="0"&gt;
                 *                               &lt;complexType&gt;
                 *                                 &lt;complexContent&gt;
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                     &lt;attribute name="MealPlanIndicator" use="required"&gt;
                 *                                       &lt;simpleType&gt;
                 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                           &lt;enumeration value="1"/&gt;
                 *                                           &lt;enumeration value="true"/&gt;
                 *                                         &lt;/restriction&gt;
                 *                                       &lt;/simpleType&gt;
                 *                                     &lt;/attribute&gt;
                 *                                     &lt;attribute name="MealPlanCodes" use="required"&gt;
                 *                                       &lt;simpleType&gt;
                 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                           &lt;enumeration value="1"/&gt;
                 *                                           &lt;enumeration value="3"/&gt;
                 *                                           &lt;enumeration value="10"/&gt;
                 *                                           &lt;enumeration value="12"/&gt;
                 *                                           &lt;enumeration value="14"/&gt;
                 *                                         &lt;/restriction&gt;
                 *                                       &lt;/simpleType&gt;
                 *                                     &lt;/attribute&gt;
                 *                                   &lt;/restriction&gt;
                 *                                 &lt;/complexContent&gt;
                 *                               &lt;/complexType&gt;
                 *                             &lt;/element&gt;
                 *                           &lt;/sequence&gt;
                 *                           &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="GuestCounts" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="GuestCount" maxOccurs="unbounded"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
                 *                           &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="TimeSpan"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="StartDateWindow" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                 *                           &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                 *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                 *                 &lt;attribute name="Duration"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                       &lt;pattern value="P[0-9]+N"/&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Total" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" /&gt;
                 *                 &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
                     * Recupera il valore della proprietà roomTypes.
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
                     * Imposta il valore della proprietà roomTypes.
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
                     * Recupera il valore della proprietà ratePlans.
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
                     * Imposta il valore della proprietà ratePlans.
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
                     * Recupera il valore della proprietà guestCounts.
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
                     * Imposta il valore della proprietà guestCounts.
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
                     * Recupera il valore della proprietà timeSpan.
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
                     * Imposta il valore della proprietà timeSpan.
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
                     * Recupera il valore della proprietà total.
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
                     * Imposta il valore della proprietà total.
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="GuestCount" maxOccurs="unbounded"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
                     *                 &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
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
                         * <p>Classe Java per anonymous complex type.
                         * 
                         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;attribute name="Count" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" /&gt;
                         *       &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
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
                             * Recupera il valore della proprietà count.
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
                             * Imposta il valore della proprietà count.
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
                             * Recupera il valore della proprietà age.
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
                             * Imposta il valore della proprietà age.
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="RatePlan"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="MealsIncluded" minOccurs="0"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;complexContent&gt;
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                           &lt;attribute name="MealPlanIndicator" use="required"&gt;
                     *                             &lt;simpleType&gt;
                     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                                 &lt;enumeration value="1"/&gt;
                     *                                 &lt;enumeration value="true"/&gt;
                     *                               &lt;/restriction&gt;
                     *                             &lt;/simpleType&gt;
                     *                           &lt;/attribute&gt;
                     *                           &lt;attribute name="MealPlanCodes" use="required"&gt;
                     *                             &lt;simpleType&gt;
                     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                                 &lt;enumeration value="1"/&gt;
                     *                                 &lt;enumeration value="3"/&gt;
                     *                                 &lt;enumeration value="10"/&gt;
                     *                                 &lt;enumeration value="12"/&gt;
                     *                                 &lt;enumeration value="14"/&gt;
                     *                               &lt;/restriction&gt;
                     *                             &lt;/simpleType&gt;
                     *                           &lt;/attribute&gt;
                     *                         &lt;/restriction&gt;
                     *                       &lt;/complexContent&gt;
                     *                     &lt;/complexType&gt;
                     *                   &lt;/element&gt;
                     *                 &lt;/sequence&gt;
                     *                 &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
                        "ratePlan"
                    })
                    public static class RatePlans {

                        @XmlElement(name = "RatePlan", required = true)
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan ratePlan;

                        /**
                         * Recupera il valore della proprietà ratePlan.
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
                         * Imposta il valore della proprietà ratePlan.
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
                         * <p>Classe Java per anonymous complex type.
                         * 
                         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;sequence&gt;
                         *         &lt;element name="MealsIncluded" minOccurs="0"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;complexContent&gt;
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                 &lt;attribute name="MealPlanIndicator" use="required"&gt;
                         *                   &lt;simpleType&gt;
                         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *                       &lt;enumeration value="1"/&gt;
                         *                       &lt;enumeration value="true"/&gt;
                         *                     &lt;/restriction&gt;
                         *                   &lt;/simpleType&gt;
                         *                 &lt;/attribute&gt;
                         *                 &lt;attribute name="MealPlanCodes" use="required"&gt;
                         *                   &lt;simpleType&gt;
                         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *                       &lt;enumeration value="1"/&gt;
                         *                       &lt;enumeration value="3"/&gt;
                         *                       &lt;enumeration value="10"/&gt;
                         *                       &lt;enumeration value="12"/&gt;
                         *                       &lt;enumeration value="14"/&gt;
                         *                     &lt;/restriction&gt;
                         *                   &lt;/simpleType&gt;
                         *                 &lt;/attribute&gt;
                         *               &lt;/restriction&gt;
                         *             &lt;/complexContent&gt;
                         *           &lt;/complexType&gt;
                         *         &lt;/element&gt;
                         *       &lt;/sequence&gt;
                         *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
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
                             * Recupera il valore della proprietà mealsIncluded.
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
                             * Imposta il valore della proprietà mealsIncluded.
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
                             * Recupera il valore della proprietà ratePlanCode.
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
                             * Imposta il valore della proprietà ratePlanCode.
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
                             * <p>Classe Java per anonymous complex type.
                             * 
                             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                             * 
                             * <pre>
                             * &lt;complexType&gt;
                             *   &lt;complexContent&gt;
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *       &lt;attribute name="MealPlanIndicator" use="required"&gt;
                             *         &lt;simpleType&gt;
                             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                             *             &lt;enumeration value="1"/&gt;
                             *             &lt;enumeration value="true"/&gt;
                             *           &lt;/restriction&gt;
                             *         &lt;/simpleType&gt;
                             *       &lt;/attribute&gt;
                             *       &lt;attribute name="MealPlanCodes" use="required"&gt;
                             *         &lt;simpleType&gt;
                             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                             *             &lt;enumeration value="1"/&gt;
                             *             &lt;enumeration value="3"/&gt;
                             *             &lt;enumeration value="10"/&gt;
                             *             &lt;enumeration value="12"/&gt;
                             *             &lt;enumeration value="14"/&gt;
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
                            public static class MealsIncluded {

                                @XmlAttribute(name = "MealPlanIndicator", required = true)
                                protected String mealPlanIndicator;
                                @XmlAttribute(name = "MealPlanCodes", required = true)
                                protected String mealPlanCodes;

                                /**
                                 * Recupera il valore della proprietà mealPlanIndicator.
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
                                 * Imposta il valore della proprietà mealPlanIndicator.
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
                                 * Recupera il valore della proprietà mealPlanCodes.
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
                                 * Imposta il valore della proprietà mealPlanCodes.
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="RoomType"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
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
                        "roomType"
                    })
                    public static class RoomTypes {

                        @XmlElement(name = "RoomType", required = true)
                        protected OTAResRetrieveRS.ReservationsList.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType roomType;

                        /**
                         * Recupera il valore della proprietà roomType.
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
                         * Imposta il valore della proprietà roomType.
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
                         * <p>Classe Java per anonymous complex type.
                         * 
                         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;attribute name="RoomTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
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
                             * Recupera il valore della proprietà roomTypeCode.
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
                             * Imposta il valore della proprietà roomTypeCode.
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="StartDateWindow" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                     *                 &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *       &lt;/sequence&gt;
                     *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                     *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                     *       &lt;attribute name="Duration"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *             &lt;pattern value="P[0-9]+N"/&gt;
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
                         * Recupera il valore della proprietà startDateWindow.
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
                         * Imposta il valore della proprietà startDateWindow.
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
                         * Recupera il valore della proprietà duration.
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
                         * Imposta il valore della proprietà duration.
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
                         * <p>Classe Java per anonymous complex type.
                         * 
                         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;attribute name="EarliestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                         *       &lt;attribute name="LatestDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_date" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
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
                             * Recupera il valore della proprietà earliestDate.
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
                             * Imposta il valore della proprietà earliestDate.
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
                             * Recupera il valore della proprietà latestDate.
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
                             * Imposta il valore della proprietà latestDate.
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
                     * <p>Classe Java per anonymous complex type.
                     * 
                     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="AmountAfterTax" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" /&gt;
                     *       &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
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
                         * Recupera il valore della proprietà amountAfterTax.
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
                         * Imposta il valore della proprietà amountAfterTax.
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
                         * Recupera il valore della proprietà currencyCode.
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
                         * Imposta il valore della proprietà currencyCode.
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
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="Type" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;enumeration value="14"/&gt;
             *             &lt;enumeration value="15"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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

            }

        }

    }

}
