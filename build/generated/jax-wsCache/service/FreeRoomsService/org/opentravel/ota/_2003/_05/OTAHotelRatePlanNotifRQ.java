
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element name="RatePlans">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RatePlan" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BookingRules" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BookingRule" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="LengthsOfStay" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="LengthOfStay" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Time" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
 *                                                                   &lt;attribute name="TimeUnit" use="required">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;enumeration value="Day"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="MinMaxMessageType" use="required">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;enumeration value="SetMinLOS"/>
 *                                                                         &lt;enumeration value="SetMaxLOS"/>
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
 *                                                 &lt;element name="DOW_Restrictions" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="DepartureDaysOfWeek" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                   &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RestrictionStatus" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Restriction">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;enumeration value="Master"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="Status">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;enumeration value="Open"/>
 *                                                               &lt;enumeration value="Close"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="CodeContext">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="ROOMTYPE"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                               &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                               &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Rates" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Rate" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BaseByGuestAmts" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="BaseByGuestAmt" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="NumberOfGuests" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                                   &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
 *                                                                   &lt;attribute name="CurrencyCode">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;enumeration value="EUR"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="Type">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;enumeration value="7"/>
 *                                                                         &lt;enumeration value="25"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="AdditionalGuestAmounts" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
 *                                                                   &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                                   &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                                   &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RateDescription" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ListItem" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
 *                                                                   &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
 *                                                                   &lt;attribute name="Language" use="required">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language">
 *                                                                         &lt;pattern value="[a-z][a-z]"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Name" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;enumeration value="included services"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="MealsIncluded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Breakfast" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                         &lt;attribute name="Lunch" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                         &lt;attribute name="Dinner" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                                         &lt;attribute name="MealPlanCodes">
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
 *                                                         &lt;attribute name="MealPlanIndicator">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;enumeration value="1"/>
 *                                                               &lt;enumeration value="true"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="MinGuestApplicable" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                               &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                               &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                               &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                               &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                               &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                               &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                               &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                               &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                               &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                               &lt;attribute name="Duration">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;pattern value="P[0-9]+N"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Supplements" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Supplement" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Text" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
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
 *                                               &lt;attribute name="AddToBasicRateIndicator" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="1"/>
 *                                                     &lt;enumeration value="true"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ChargeTypeCode" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="1"/>
 *                                                     &lt;enumeration value="12"/>
 *                                                     &lt;enumeration value="18"/>
 *                                                     &lt;enumeration value="19"/>
 *                                                     &lt;enumeration value="20"/>
 *                                                     &lt;enumeration value="21"/>
 *                                                     &lt;enumeration value="24"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="SupplementType" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="Extra"/>
 *                                                     &lt;enumeration value="Board"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
 *                                               &lt;attribute name="InvType">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="EXTRA"/>
 *                                                     &lt;enumeration value="ALPINEBITSEXTRA"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
 *                                               &lt;attribute name="MandatoryIndicator" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
 *                                               &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                               &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                               &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                               &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                               &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Offers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Offer" maxOccurs="2">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Discount">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Percent" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;enumeration value="100"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="NightsRequired" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                         &lt;attribute name="NightsDiscounted" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                         &lt;attribute name="DiscountPattern">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;pattern value="0*1*"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Guests" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Guest">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                                   &lt;attribute name="MaxAge" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
 *                                                                   &lt;attribute name="FirstQualifyingPosition" use="required">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;enumeration value="1"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="LastQualifyingPosition" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
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
 *                             &lt;element name="Description" maxOccurs="4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="unbounded">
 *                                       &lt;choice>
 *                                         &lt;element name="Text">
 *                                           &lt;complexType>
 *                                             &lt;simpleContent>
 *                                               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
 *                                                 &lt;attribute name="TextFormat" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="PlainText"/>
 *                                                       &lt;enumeration value="HTML"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
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
 *                                         &lt;element name="ListItem">
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
 *                                         &lt;element name="Image" type="{http://www.opentravel.org/OTA/2003/05}def_url_string"/>
 *                                         &lt;element name="URL" type="{http://www.opentravel.org/OTA/2003/05}def_url_string"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Name" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="title"/>
 *                                           &lt;enumeration value="intro"/>
 *                                           &lt;enumeration value="gallery"/>
 *                                           &lt;enumeration value="details"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="UniqueID" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Type" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="18"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HotelRef" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="HotelCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                     &lt;attribute name="HotelName" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
 *                           &lt;attribute name="RatePlanNotifType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Overlay"/>
 *                                 &lt;enumeration value="New"/>
 *                                 &lt;enumeration value="Remove"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="CurrencyCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="EUR"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
 *                           &lt;attribute name="RatePlanType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="12"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="RatePlanCategory" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
    "ratePlans"
})
@XmlRootElement(name = "OTA_HotelRatePlanNotifRQ")
public class OTAHotelRatePlanNotifRQ {

    @XmlElement(name = "UniqueID")
    protected OTAHotelRatePlanNotifRQ.UniqueID uniqueID;
    @XmlElement(name = "RatePlans", required = true)
    protected OTAHotelRatePlanNotifRQ.RatePlans ratePlans;
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
     *     {@link OTAHotelRatePlanNotifRQ.UniqueID }
     *     
     */
    public OTAHotelRatePlanNotifRQ.UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelRatePlanNotifRQ.UniqueID }
     *     
     */
    public void setUniqueID(OTAHotelRatePlanNotifRQ.UniqueID value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelRatePlanNotifRQ.RatePlans }
     *     
     */
    public OTAHotelRatePlanNotifRQ.RatePlans getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelRatePlanNotifRQ.RatePlans }
     *     
     */
    public void setRatePlans(OTAHotelRatePlanNotifRQ.RatePlans value) {
        this.ratePlans = value;
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
     *         &lt;element name="RatePlan" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BookingRules" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BookingRule" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="LengthsOfStay" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="LengthOfStay" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Time" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
     *                                                         &lt;attribute name="TimeUnit" use="required">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;enumeration value="Day"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="MinMaxMessageType" use="required">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;enumeration value="SetMinLOS"/>
     *                                                               &lt;enumeration value="SetMaxLOS"/>
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
     *                                       &lt;element name="DOW_Restrictions" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="DepartureDaysOfWeek" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                         &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RestrictionStatus" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Restriction">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="Master"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="Status">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="Open"/>
     *                                                     &lt;enumeration value="Close"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="CodeContext">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="ROOMTYPE"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                                     &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                     &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Rates" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Rate" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BaseByGuestAmts" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="BaseByGuestAmt" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="NumberOfGuests" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                                         &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
     *                                                         &lt;attribute name="CurrencyCode">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;enumeration value="EUR"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="Type">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;enumeration value="7"/>
     *                                                               &lt;enumeration value="25"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="AdditionalGuestAmounts" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
     *                                                         &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                                         &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                                         &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RateDescription" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ListItem" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
     *                                                         &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
     *                                               &lt;attribute name="Name" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="included services"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MealsIncluded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Breakfast" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                               &lt;attribute name="Lunch" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                               &lt;attribute name="Dinner" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                               &lt;attribute name="MealPlanCodes">
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
     *                                               &lt;attribute name="MealPlanIndicator">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="1"/>
     *                                                     &lt;enumeration value="true"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="MinGuestApplicable" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                     &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                     &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                     &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                     &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                     &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                     &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                     &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                     &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                     &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                     &lt;attribute name="Duration">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;pattern value="P[0-9]+N"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Supplements" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Supplement" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Text" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
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
     *                                     &lt;attribute name="AddToBasicRateIndicator" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="1"/>
     *                                           &lt;enumeration value="true"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ChargeTypeCode" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="1"/>
     *                                           &lt;enumeration value="12"/>
     *                                           &lt;enumeration value="18"/>
     *                                           &lt;enumeration value="19"/>
     *                                           &lt;enumeration value="20"/>
     *                                           &lt;enumeration value="21"/>
     *                                           &lt;enumeration value="24"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="SupplementType" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="Extra"/>
     *                                           &lt;enumeration value="Board"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
     *                                     &lt;attribute name="InvType">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="EXTRA"/>
     *                                           &lt;enumeration value="ALPINEBITSEXTRA"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
     *                                     &lt;attribute name="MandatoryIndicator" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
     *                                     &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                     &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                     &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                     &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                     &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Offers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Offer" maxOccurs="2">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Discount">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Percent" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="100"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="NightsRequired" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                               &lt;attribute name="NightsDiscounted" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                               &lt;attribute name="DiscountPattern">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;pattern value="0*1*"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Guests" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Guest">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                                         &lt;attribute name="MaxAge" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
     *                                                         &lt;attribute name="FirstQualifyingPosition" use="required">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;enumeration value="1"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="LastQualifyingPosition" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
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
     *                   &lt;element name="Description" maxOccurs="4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded">
     *                             &lt;choice>
     *                               &lt;element name="Text">
     *                                 &lt;complexType>
     *                                   &lt;simpleContent>
     *                                     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
     *                                       &lt;attribute name="TextFormat" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="PlainText"/>
     *                                             &lt;enumeration value="HTML"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
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
     *                               &lt;element name="ListItem">
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
     *                               &lt;element name="Image" type="{http://www.opentravel.org/OTA/2003/05}def_url_string"/>
     *                               &lt;element name="URL" type="{http://www.opentravel.org/OTA/2003/05}def_url_string"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Name" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="title"/>
     *                                 &lt;enumeration value="intro"/>
     *                                 &lt;enumeration value="gallery"/>
     *                                 &lt;enumeration value="details"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="UniqueID" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Type" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="18"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="HotelRef" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="HotelCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                           &lt;attribute name="HotelName" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
     *                 &lt;attribute name="RatePlanNotifType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Overlay"/>
     *                       &lt;enumeration value="New"/>
     *                       &lt;enumeration value="Remove"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="CurrencyCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="EUR"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
     *                 &lt;attribute name="RatePlanType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="12"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="RatePlanCategory" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
        "ratePlan"
    })
    public static class RatePlans {

        @XmlElement(name = "RatePlan", required = true)
        protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan> ratePlan;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;

        /**
         * Gets the value of the ratePlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratePlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatePlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan }
         * 
         * 
         */
        public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan> getRatePlan() {
            if (ratePlan == null) {
                ratePlan = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan>();
            }
            return this.ratePlan;
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
         *         &lt;element name="BookingRules" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BookingRule" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="LengthsOfStay" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="LengthOfStay" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Time" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
         *                                               &lt;attribute name="TimeUnit" use="required">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;enumeration value="Day"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="MinMaxMessageType" use="required">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;enumeration value="SetMinLOS"/>
         *                                                     &lt;enumeration value="SetMaxLOS"/>
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
         *                             &lt;element name="DOW_Restrictions" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="DepartureDaysOfWeek" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                               &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RestrictionStatus" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Restriction">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="Master"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="Status">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="Open"/>
         *                                           &lt;enumeration value="Close"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="CodeContext">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="ROOMTYPE"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Rates" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Rate" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BaseByGuestAmts" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="BaseByGuestAmt" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="NumberOfGuests" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                               &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
         *                                               &lt;attribute name="CurrencyCode">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;enumeration value="EUR"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="Type">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;enumeration value="7"/>
         *                                                     &lt;enumeration value="25"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="AdditionalGuestAmounts" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
         *                                               &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                               &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                               &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RateDescription" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ListItem" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
         *                                               &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
         *                                     &lt;attribute name="Name" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="included services"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MealsIncluded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Breakfast" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                     &lt;attribute name="Lunch" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                     &lt;attribute name="Dinner" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                                     &lt;attribute name="MealPlanCodes">
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
         *                                     &lt;attribute name="MealPlanIndicator">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="1"/>
         *                                           &lt;enumeration value="true"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="MinGuestApplicable" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                           &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                           &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                           &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                           &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                           &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                           &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                           &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                           &lt;attribute name="Duration">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;pattern value="P[0-9]+N"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Supplements" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Supplement" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Text" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
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
         *                           &lt;attribute name="AddToBasicRateIndicator" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="1"/>
         *                                 &lt;enumeration value="true"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ChargeTypeCode" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="1"/>
         *                                 &lt;enumeration value="12"/>
         *                                 &lt;enumeration value="18"/>
         *                                 &lt;enumeration value="19"/>
         *                                 &lt;enumeration value="20"/>
         *                                 &lt;enumeration value="21"/>
         *                                 &lt;enumeration value="24"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="SupplementType" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="Extra"/>
         *                                 &lt;enumeration value="Board"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
         *                           &lt;attribute name="InvType">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="EXTRA"/>
         *                                 &lt;enumeration value="ALPINEBITSEXTRA"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
         *                           &lt;attribute name="MandatoryIndicator" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
         *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                           &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                           &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Offers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Offer" maxOccurs="2">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Discount">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Percent" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="100"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="NightsRequired" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                     &lt;attribute name="NightsDiscounted" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                     &lt;attribute name="DiscountPattern">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;pattern value="0*1*"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Guests" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Guest">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                               &lt;attribute name="MaxAge" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
         *                                               &lt;attribute name="FirstQualifyingPosition" use="required">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;enumeration value="1"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="LastQualifyingPosition" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
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
         *         &lt;element name="Description" maxOccurs="4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded">
         *                   &lt;choice>
         *                     &lt;element name="Text">
         *                       &lt;complexType>
         *                         &lt;simpleContent>
         *                           &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
         *                             &lt;attribute name="TextFormat" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="PlainText"/>
         *                                   &lt;enumeration value="HTML"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
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
         *                     &lt;element name="ListItem">
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
         *                     &lt;element name="Image" type="{http://www.opentravel.org/OTA/2003/05}def_url_string"/>
         *                     &lt;element name="URL" type="{http://www.opentravel.org/OTA/2003/05}def_url_string"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Name" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="title"/>
         *                       &lt;enumeration value="intro"/>
         *                       &lt;enumeration value="gallery"/>
         *                       &lt;enumeration value="details"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="UniqueID" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Type" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="18"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ID" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="HotelRef" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="HotelCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *                 &lt;attribute name="HotelName" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
         *       &lt;attribute name="RatePlanNotifType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Overlay"/>
         *             &lt;enumeration value="New"/>
         *             &lt;enumeration value="Remove"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="CurrencyCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="EUR"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *       &lt;attribute name="RatePlanType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="12"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="RatePlanCategory" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bookingRules",
            "rates",
            "supplements",
            "offers",
            "description",
            "uniqueID",
            "hotelRef"
        })
        public static class RatePlan {

            @XmlElement(name = "BookingRules")
            protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules bookingRules;
            @XmlElement(name = "Rates")
            protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates rates;
            @XmlElement(name = "Supplements")
            protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements supplements;
            @XmlElement(name = "Offers")
            protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers offers;
            @XmlElement(name = "Description")
            protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Description> description;
            @XmlElement(name = "UniqueID")
            protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.UniqueID uniqueID;
            @XmlElement(name = "HotelRef")
            protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.HotelRef hotelRef;
            @XmlAttribute(name = "Start")
            protected XMLGregorianCalendar start;
            @XmlAttribute(name = "End")
            protected XMLGregorianCalendar end;
            @XmlAttribute(name = "RatePlanNotifType")
            protected String ratePlanNotifType;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "RatePlanCode")
            protected String ratePlanCode;
            @XmlAttribute(name = "RatePlanType")
            protected String ratePlanType;
            @XmlAttribute(name = "RatePlanCategory")
            protected String ratePlanCategory;

            /**
             * Gets the value of the bookingRules property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules }
             *     
             */
            public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules getBookingRules() {
                return bookingRules;
            }

            /**
             * Sets the value of the bookingRules property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules }
             *     
             */
            public void setBookingRules(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules value) {
                this.bookingRules = value;
            }

            /**
             * Gets the value of the rates property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates }
             *     
             */
            public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates getRates() {
                return rates;
            }

            /**
             * Sets the value of the rates property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates }
             *     
             */
            public void setRates(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates value) {
                this.rates = value;
            }

            /**
             * Gets the value of the supplements property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements }
             *     
             */
            public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements getSupplements() {
                return supplements;
            }

            /**
             * Sets the value of the supplements property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements }
             *     
             */
            public void setSupplements(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements value) {
                this.supplements = value;
            }

            /**
             * Gets the value of the offers property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers }
             *     
             */
            public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers getOffers() {
                return offers;
            }

            /**
             * Sets the value of the offers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers }
             *     
             */
            public void setOffers(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers value) {
                this.offers = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the description property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Description }
             * 
             * 
             */
            public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Description> getDescription() {
                if (description == null) {
                    description = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Description>();
                }
                return this.description;
            }

            /**
             * Gets the value of the uniqueID property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.UniqueID }
             *     
             */
            public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.UniqueID getUniqueID() {
                return uniqueID;
            }

            /**
             * Sets the value of the uniqueID property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.UniqueID }
             *     
             */
            public void setUniqueID(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.UniqueID value) {
                this.uniqueID = value;
            }

            /**
             * Gets the value of the hotelRef property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.HotelRef }
             *     
             */
            public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.HotelRef getHotelRef() {
                return hotelRef;
            }

            /**
             * Sets the value of the hotelRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.HotelRef }
             *     
             */
            public void setHotelRef(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.HotelRef value) {
                this.hotelRef = value;
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
             * Gets the value of the ratePlanNotifType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRatePlanNotifType() {
                return ratePlanNotifType;
            }

            /**
             * Sets the value of the ratePlanNotifType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRatePlanNotifType(String value) {
                this.ratePlanNotifType = value;
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
             * Gets the value of the ratePlanType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRatePlanType() {
                return ratePlanType;
            }

            /**
             * Sets the value of the ratePlanType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRatePlanType(String value) {
                this.ratePlanType = value;
            }

            /**
             * Gets the value of the ratePlanCategory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRatePlanCategory() {
                return ratePlanCategory;
            }

            /**
             * Sets the value of the ratePlanCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRatePlanCategory(String value) {
                this.ratePlanCategory = value;
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
             *         &lt;element name="BookingRule" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="LengthsOfStay" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="LengthOfStay" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Time" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
             *                                     &lt;attribute name="TimeUnit" use="required">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;enumeration value="Day"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="MinMaxMessageType" use="required">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;enumeration value="SetMinLOS"/>
             *                                           &lt;enumeration value="SetMaxLOS"/>
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
             *                   &lt;element name="DOW_Restrictions" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="DepartureDaysOfWeek" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                     &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RestrictionStatus" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Restriction">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="Master"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="Status">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="Open"/>
             *                                 &lt;enumeration value="Close"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="CodeContext">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="ROOMTYPE"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
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
                "bookingRule"
            })
            public static class BookingRules {

                @XmlElement(name = "BookingRule", required = true)
                protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule> bookingRule;

                /**
                 * Gets the value of the bookingRule property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bookingRule property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBookingRule().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule }
                 * 
                 * 
                 */
                public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule> getBookingRule() {
                    if (bookingRule == null) {
                        bookingRule = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule>();
                    }
                    return this.bookingRule;
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
                 *         &lt;element name="LengthsOfStay" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="LengthOfStay" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Time" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                 *                           &lt;attribute name="TimeUnit" use="required">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;enumeration value="Day"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="MinMaxMessageType" use="required">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;enumeration value="SetMinLOS"/>
                 *                                 &lt;enumeration value="SetMaxLOS"/>
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
                 *         &lt;element name="DOW_Restrictions" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="DepartureDaysOfWeek" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                           &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RestrictionStatus" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Restriction">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="Master"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="Status">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="Open"/>
                 *                       &lt;enumeration value="Close"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="CodeContext">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="ROOMTYPE"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                 *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "lengthsOfStay",
                    "dowRestrictions",
                    "restrictionStatus"
                })
                public static class BookingRule {

                    @XmlElement(name = "LengthsOfStay")
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay lengthsOfStay;
                    @XmlElement(name = "DOW_Restrictions")
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions dowRestrictions;
                    @XmlElement(name = "RestrictionStatus")
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.RestrictionStatus restrictionStatus;
                    @XmlAttribute(name = "CodeContext")
                    protected String codeContext;
                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "Start")
                    protected XMLGregorianCalendar start;
                    @XmlAttribute(name = "End")
                    protected XMLGregorianCalendar end;

                    /**
                     * Gets the value of the lengthsOfStay property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay getLengthsOfStay() {
                        return lengthsOfStay;
                    }

                    /**
                     * Sets the value of the lengthsOfStay property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay }
                     *     
                     */
                    public void setLengthsOfStay(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay value) {
                        this.lengthsOfStay = value;
                    }

                    /**
                     * Gets the value of the dowRestrictions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions getDOWRestrictions() {
                        return dowRestrictions;
                    }

                    /**
                     * Sets the value of the dowRestrictions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions }
                     *     
                     */
                    public void setDOWRestrictions(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions value) {
                        this.dowRestrictions = value;
                    }

                    /**
                     * Gets the value of the restrictionStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.RestrictionStatus }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.RestrictionStatus getRestrictionStatus() {
                        return restrictionStatus;
                    }

                    /**
                     * Sets the value of the restrictionStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.RestrictionStatus }
                     *     
                     */
                    public void setRestrictionStatus(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.RestrictionStatus value) {
                        this.restrictionStatus = value;
                    }

                    /**
                     * Gets the value of the codeContext property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeContext() {
                        return codeContext;
                    }

                    /**
                     * Sets the value of the codeContext property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeContext(String value) {
                        this.codeContext = value;
                    }

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
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="DepartureDaysOfWeek" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *                 &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
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
                        "arrivalDaysOfWeek",
                        "departureDaysOfWeek"
                    })
                    public static class DOWRestrictions {

                        @XmlElement(name = "ArrivalDaysOfWeek")
                        protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.ArrivalDaysOfWeek arrivalDaysOfWeek;
                        @XmlElement(name = "DepartureDaysOfWeek")
                        protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.DepartureDaysOfWeek departureDaysOfWeek;

                        /**
                         * Gets the value of the arrivalDaysOfWeek property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.ArrivalDaysOfWeek }
                         *     
                         */
                        public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.ArrivalDaysOfWeek getArrivalDaysOfWeek() {
                            return arrivalDaysOfWeek;
                        }

                        /**
                         * Sets the value of the arrivalDaysOfWeek property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.ArrivalDaysOfWeek }
                         *     
                         */
                        public void setArrivalDaysOfWeek(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.ArrivalDaysOfWeek value) {
                            this.arrivalDaysOfWeek = value;
                        }

                        /**
                         * Gets the value of the departureDaysOfWeek property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.DepartureDaysOfWeek }
                         *     
                         */
                        public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.DepartureDaysOfWeek getDepartureDaysOfWeek() {
                            return departureDaysOfWeek;
                        }

                        /**
                         * Sets the value of the departureDaysOfWeek property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.DepartureDaysOfWeek }
                         *     
                         */
                        public void setDepartureDaysOfWeek(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.DOWRestrictions.DepartureDaysOfWeek value) {
                            this.departureDaysOfWeek = value;
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
                         *       &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class ArrivalDaysOfWeek {

                            @XmlAttribute(name = "Mon")
                            protected Boolean mon;
                            @XmlAttribute(name = "Tue")
                            protected Boolean tue;
                            @XmlAttribute(name = "Weds")
                            protected Boolean weds;
                            @XmlAttribute(name = "Thur")
                            protected Boolean thur;
                            @XmlAttribute(name = "Fri")
                            protected Boolean fri;
                            @XmlAttribute(name = "Sat")
                            protected Boolean sat;
                            @XmlAttribute(name = "Sun")
                            protected Boolean sun;

                            /**
                             * Gets the value of the mon property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isMon() {
                                return mon;
                            }

                            /**
                             * Sets the value of the mon property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setMon(Boolean value) {
                                this.mon = value;
                            }

                            /**
                             * Gets the value of the tue property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isTue() {
                                return tue;
                            }

                            /**
                             * Sets the value of the tue property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setTue(Boolean value) {
                                this.tue = value;
                            }

                            /**
                             * Gets the value of the weds property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isWeds() {
                                return weds;
                            }

                            /**
                             * Sets the value of the weds property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setWeds(Boolean value) {
                                this.weds = value;
                            }

                            /**
                             * Gets the value of the thur property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isThur() {
                                return thur;
                            }

                            /**
                             * Sets the value of the thur property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setThur(Boolean value) {
                                this.thur = value;
                            }

                            /**
                             * Gets the value of the fri property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isFri() {
                                return fri;
                            }

                            /**
                             * Sets the value of the fri property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setFri(Boolean value) {
                                this.fri = value;
                            }

                            /**
                             * Gets the value of the sat property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isSat() {
                                return sat;
                            }

                            /**
                             * Sets the value of the sat property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setSat(Boolean value) {
                                this.sat = value;
                            }

                            /**
                             * Gets the value of the sun property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isSun() {
                                return sun;
                            }

                            /**
                             * Sets the value of the sun property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setSun(Boolean value) {
                                this.sun = value;
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
                         *       &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *       &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class DepartureDaysOfWeek {

                            @XmlAttribute(name = "Mon")
                            protected Boolean mon;
                            @XmlAttribute(name = "Tue")
                            protected Boolean tue;
                            @XmlAttribute(name = "Weds")
                            protected Boolean weds;
                            @XmlAttribute(name = "Thur")
                            protected Boolean thur;
                            @XmlAttribute(name = "Fri")
                            protected Boolean fri;
                            @XmlAttribute(name = "Sat")
                            protected Boolean sat;
                            @XmlAttribute(name = "Sun")
                            protected Boolean sun;

                            /**
                             * Gets the value of the mon property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isMon() {
                                return mon;
                            }

                            /**
                             * Sets the value of the mon property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setMon(Boolean value) {
                                this.mon = value;
                            }

                            /**
                             * Gets the value of the tue property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isTue() {
                                return tue;
                            }

                            /**
                             * Sets the value of the tue property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setTue(Boolean value) {
                                this.tue = value;
                            }

                            /**
                             * Gets the value of the weds property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isWeds() {
                                return weds;
                            }

                            /**
                             * Sets the value of the weds property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setWeds(Boolean value) {
                                this.weds = value;
                            }

                            /**
                             * Gets the value of the thur property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isThur() {
                                return thur;
                            }

                            /**
                             * Sets the value of the thur property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setThur(Boolean value) {
                                this.thur = value;
                            }

                            /**
                             * Gets the value of the fri property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isFri() {
                                return fri;
                            }

                            /**
                             * Sets the value of the fri property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setFri(Boolean value) {
                                this.fri = value;
                            }

                            /**
                             * Gets the value of the sat property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isSat() {
                                return sat;
                            }

                            /**
                             * Sets the value of the sat property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setSat(Boolean value) {
                                this.sat = value;
                            }

                            /**
                             * Gets the value of the sun property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isSun() {
                                return sun;
                            }

                            /**
                             * Sets the value of the sun property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setSun(Boolean value) {
                                this.sun = value;
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
                     *         &lt;element name="LengthOfStay" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Time" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                     *                 &lt;attribute name="TimeUnit" use="required">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;enumeration value="Day"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="MinMaxMessageType" use="required">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;enumeration value="SetMinLOS"/>
                     *                       &lt;enumeration value="SetMaxLOS"/>
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
                        "lengthOfStay"
                    })
                    public static class LengthsOfStay {

                        @XmlElement(name = "LengthOfStay", required = true)
                        protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay.LengthOfStay> lengthOfStay;

                        /**
                         * Gets the value of the lengthOfStay property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the lengthOfStay property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getLengthOfStay().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay.LengthOfStay }
                         * 
                         * 
                         */
                        public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay.LengthOfStay> getLengthOfStay() {
                            if (lengthOfStay == null) {
                                lengthOfStay = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.BookingRules.BookingRule.LengthsOfStay.LengthOfStay>();
                            }
                            return this.lengthOfStay;
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
                         *       &lt;attribute name="Time" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                         *       &lt;attribute name="TimeUnit" use="required">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;enumeration value="Day"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="MinMaxMessageType" use="required">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;enumeration value="SetMinLOS"/>
                         *             &lt;enumeration value="SetMaxLOS"/>
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
                        public static class LengthOfStay {

                            @XmlAttribute(name = "Time", required = true)
                            protected BigDecimal time;
                            @XmlAttribute(name = "TimeUnit", required = true)
                            protected String timeUnit;
                            @XmlAttribute(name = "MinMaxMessageType", required = true)
                            protected String minMaxMessageType;

                            /**
                             * Gets the value of the time property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getTime() {
                                return time;
                            }

                            /**
                             * Sets the value of the time property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setTime(BigDecimal value) {
                                this.time = value;
                            }

                            /**
                             * Gets the value of the timeUnit property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTimeUnit() {
                                return timeUnit;
                            }

                            /**
                             * Sets the value of the timeUnit property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTimeUnit(String value) {
                                this.timeUnit = value;
                            }

                            /**
                             * Gets the value of the minMaxMessageType property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMinMaxMessageType() {
                                return minMaxMessageType;
                            }

                            /**
                             * Sets the value of the minMaxMessageType property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMinMaxMessageType(String value) {
                                this.minMaxMessageType = value;
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
                     *       &lt;attribute name="Restriction">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="Master"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="Status">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="Open"/>
                     *             &lt;enumeration value="Close"/>
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
                    public static class RestrictionStatus {

                        @XmlAttribute(name = "Restriction")
                        protected String restriction;
                        @XmlAttribute(name = "Status")
                        protected String status;

                        /**
                         * Gets the value of the restriction property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRestriction() {
                            return restriction;
                        }

                        /**
                         * Sets the value of the restriction property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRestriction(String value) {
                            this.restriction = value;
                        }

                        /**
                         * Gets the value of the status property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStatus() {
                            return status;
                        }

                        /**
                         * Sets the value of the status property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStatus(String value) {
                            this.status = value;
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
             *       &lt;sequence maxOccurs="unbounded">
             *         &lt;choice>
             *           &lt;element name="Text">
             *             &lt;complexType>
             *               &lt;simpleContent>
             *                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
             *                   &lt;attribute name="TextFormat" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="PlainText"/>
             *                         &lt;enumeration value="HTML"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
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
             *           &lt;element name="ListItem">
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
             *           &lt;element name="Image" type="{http://www.opentravel.org/OTA/2003/05}def_url_string"/>
             *           &lt;element name="URL" type="{http://www.opentravel.org/OTA/2003/05}def_url_string"/>
             *         &lt;/choice>
             *       &lt;/sequence>
             *       &lt;attribute name="Name" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="title"/>
             *             &lt;enumeration value="intro"/>
             *             &lt;enumeration value="gallery"/>
             *             &lt;enumeration value="details"/>
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
                "textOrListItemOrImage"
            })
            public static class Description {

                @XmlElementRefs({
                    @XmlElementRef(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "URL", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "ListItem", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "Image", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false)
                })
                protected List<JAXBElement<?>> textOrListItemOrImage;
                @XmlAttribute(name = "Name", required = true)
                protected String name;

                /**
                 * Gets the value of the textOrListItemOrImage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the textOrListItemOrImage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTextOrListItemOrImage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Description.Text }{@code >}
                 * {@link JAXBElement }{@code <}{@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Description.ListItem }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<?>> getTextOrListItemOrImage() {
                    if (textOrListItemOrImage == null) {
                        textOrListItemOrImage = new ArrayList<JAXBElement<?>>();
                    }
                    return this.textOrListItemOrImage;
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
                 *             &lt;enumeration value="HTML"/>
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
             *       &lt;attribute name="HotelCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *       &lt;attribute name="HotelName" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class HotelRef {

                @XmlAttribute(name = "HotelCode", required = true)
                protected String hotelCode;
                @XmlAttribute(name = "HotelName", required = true)
                protected String hotelName;

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
             *         &lt;element name="Offer" maxOccurs="2">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Discount">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Percent" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="100"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="NightsRequired" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                           &lt;attribute name="NightsDiscounted" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                           &lt;attribute name="DiscountPattern">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;pattern value="0*1*"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Guests" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Guest">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                                     &lt;attribute name="MaxAge" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                                     &lt;attribute name="FirstQualifyingPosition" use="required">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;enumeration value="1"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="LastQualifyingPosition" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
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
                "offer"
            })
            public static class Offers {

                @XmlElement(name = "Offer", required = true)
                protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer> offer;

                /**
                 * Gets the value of the offer property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offer property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOffer().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer }
                 * 
                 * 
                 */
                public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer> getOffer() {
                    if (offer == null) {
                        offer = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer>();
                    }
                    return this.offer;
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
                 *         &lt;element name="Discount">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Percent" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="100"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="NightsRequired" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                 &lt;attribute name="NightsDiscounted" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                 &lt;attribute name="DiscountPattern">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;pattern value="0*1*"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Guests" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Guest">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                           &lt;attribute name="MaxAge" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                           &lt;attribute name="FirstQualifyingPosition" use="required">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;enumeration value="1"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="LastQualifyingPosition" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
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
                    "discount",
                    "guests"
                })
                public static class Offer {

                    @XmlElement(name = "Discount", required = true)
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Discount discount;
                    @XmlElement(name = "Guests")
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests guests;

                    /**
                     * Gets the value of the discount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Discount }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Discount getDiscount() {
                        return discount;
                    }

                    /**
                     * Sets the value of the discount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Discount }
                     *     
                     */
                    public void setDiscount(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Discount value) {
                        this.discount = value;
                    }

                    /**
                     * Gets the value of the guests property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests getGuests() {
                        return guests;
                    }

                    /**
                     * Sets the value of the guests property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests }
                     *     
                     */
                    public void setGuests(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests value) {
                        this.guests = value;
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
                     *       &lt;attribute name="Percent" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="100"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="NightsRequired" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                     *       &lt;attribute name="NightsDiscounted" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                     *       &lt;attribute name="DiscountPattern">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;pattern value="0*1*"/>
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
                    public static class Discount {

                        @XmlAttribute(name = "Percent", required = true)
                        protected String percent;
                        @XmlAttribute(name = "NightsRequired")
                        protected BigInteger nightsRequired;
                        @XmlAttribute(name = "NightsDiscounted")
                        protected BigInteger nightsDiscounted;
                        @XmlAttribute(name = "DiscountPattern")
                        protected String discountPattern;

                        /**
                         * Gets the value of the percent property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPercent() {
                            return percent;
                        }

                        /**
                         * Sets the value of the percent property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPercent(String value) {
                            this.percent = value;
                        }

                        /**
                         * Gets the value of the nightsRequired property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getNightsRequired() {
                            return nightsRequired;
                        }

                        /**
                         * Sets the value of the nightsRequired property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setNightsRequired(BigInteger value) {
                            this.nightsRequired = value;
                        }

                        /**
                         * Gets the value of the nightsDiscounted property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getNightsDiscounted() {
                            return nightsDiscounted;
                        }

                        /**
                         * Sets the value of the nightsDiscounted property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setNightsDiscounted(BigInteger value) {
                            this.nightsDiscounted = value;
                        }

                        /**
                         * Gets the value of the discountPattern property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDiscountPattern() {
                            return discountPattern;
                        }

                        /**
                         * Sets the value of the discountPattern property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDiscountPattern(String value) {
                            this.discountPattern = value;
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
                     *         &lt;element name="Guest">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                     *                 &lt;attribute name="MaxAge" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                     *                 &lt;attribute name="FirstQualifyingPosition" use="required">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;enumeration value="1"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="LastQualifyingPosition" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
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
                        "guest"
                    })
                    public static class Guests {

                        @XmlElement(name = "Guest", required = true)
                        protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests.Guest guest;

                        /**
                         * Gets the value of the guest property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests.Guest }
                         *     
                         */
                        public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests.Guest getGuest() {
                            return guest;
                        }

                        /**
                         * Sets the value of the guest property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests.Guest }
                         *     
                         */
                        public void setGuest(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Offers.Offer.Guests.Guest value) {
                            this.guest = value;
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
                         *       &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *       &lt;attribute name="MaxAge" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *       &lt;attribute name="FirstQualifyingPosition" use="required">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;enumeration value="1"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="LastQualifyingPosition" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Guest {

                            @XmlAttribute(name = "AgeQualifyingCode", required = true)
                            protected BigInteger ageQualifyingCode;
                            @XmlAttribute(name = "MaxAge", required = true)
                            protected BigInteger maxAge;
                            @XmlAttribute(name = "FirstQualifyingPosition", required = true)
                            protected String firstQualifyingPosition;
                            @XmlAttribute(name = "LastQualifyingPosition", required = true)
                            protected BigInteger lastQualifyingPosition;

                            /**
                             * Gets the value of the ageQualifyingCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getAgeQualifyingCode() {
                                return ageQualifyingCode;
                            }

                            /**
                             * Sets the value of the ageQualifyingCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setAgeQualifyingCode(BigInteger value) {
                                this.ageQualifyingCode = value;
                            }

                            /**
                             * Gets the value of the maxAge property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getMaxAge() {
                                return maxAge;
                            }

                            /**
                             * Sets the value of the maxAge property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setMaxAge(BigInteger value) {
                                this.maxAge = value;
                            }

                            /**
                             * Gets the value of the firstQualifyingPosition property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getFirstQualifyingPosition() {
                                return firstQualifyingPosition;
                            }

                            /**
                             * Sets the value of the firstQualifyingPosition property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setFirstQualifyingPosition(String value) {
                                this.firstQualifyingPosition = value;
                            }

                            /**
                             * Gets the value of the lastQualifyingPosition property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getLastQualifyingPosition() {
                                return lastQualifyingPosition;
                            }

                            /**
                             * Sets the value of the lastQualifyingPosition property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setLastQualifyingPosition(BigInteger value) {
                                this.lastQualifyingPosition = value;
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
             *         &lt;element name="Rate" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BaseByGuestAmts" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="BaseByGuestAmt" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="NumberOfGuests" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                                     &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
             *                                     &lt;attribute name="CurrencyCode">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;enumeration value="EUR"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="Type">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;enumeration value="7"/>
             *                                           &lt;enumeration value="25"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="AdditionalGuestAmounts" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
             *                                     &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                                     &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                                     &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RateDescription" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ListItem" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
             *                                     &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
             *                           &lt;attribute name="Name" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="included services"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MealsIncluded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Breakfast" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                           &lt;attribute name="Lunch" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                           &lt;attribute name="Dinner" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                           &lt;attribute name="MealPlanCodes">
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
             *                           &lt;attribute name="MealPlanIndicator">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="1"/>
             *                                 &lt;enumeration value="true"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="MinGuestApplicable" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                 &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                 &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                 &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                 &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                 &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                 &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                 &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                 &lt;attribute name="Duration">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;pattern value="P[0-9]+N"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
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
                "rate"
            })
            public static class Rates {

                @XmlElement(name = "Rate", required = true)
                protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate> rate;

                /**
                 * Gets the value of the rate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate }
                 * 
                 * 
                 */
                public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate> getRate() {
                    if (rate == null) {
                        rate = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate>();
                    }
                    return this.rate;
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
                 *         &lt;element name="BaseByGuestAmts" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="BaseByGuestAmt" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="NumberOfGuests" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                           &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                 *                           &lt;attribute name="CurrencyCode">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;enumeration value="EUR"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="Type">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;enumeration value="7"/>
                 *                                 &lt;enumeration value="25"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="AdditionalGuestAmounts" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                 *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                           &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                           &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RateDescription" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ListItem" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
                 *                           &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
                 *                 &lt;attribute name="Name" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="included services"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MealsIncluded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Breakfast" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                 &lt;attribute name="Lunch" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                 &lt;attribute name="Dinner" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *                 &lt;attribute name="MealPlanCodes">
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
                 *                 &lt;attribute name="MealPlanIndicator">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="1"/>
                 *                       &lt;enumeration value="true"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="MinGuestApplicable" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *       &lt;attribute name="Mon" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *       &lt;attribute name="Tue" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *       &lt;attribute name="Weds" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *       &lt;attribute name="Thur" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *       &lt;attribute name="Fri" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *       &lt;attribute name="Sat" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *       &lt;attribute name="Sun" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *       &lt;attribute name="Duration">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;pattern value="P[0-9]+N"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="InvTypeCode" type="{http://www.opentravel.org/OTA/2003/05}def_nonempty_string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseByGuestAmts",
                    "additionalGuestAmounts",
                    "rateDescription",
                    "mealsIncluded"
                })
                public static class Rate {

                    @XmlElement(name = "BaseByGuestAmts")
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts baseByGuestAmts;
                    @XmlElement(name = "AdditionalGuestAmounts")
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts additionalGuestAmounts;
                    @XmlElement(name = "RateDescription")
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription rateDescription;
                    @XmlElement(name = "MealsIncluded")
                    protected OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.MealsIncluded mealsIncluded;
                    @XmlAttribute(name = "MinGuestApplicable")
                    protected BigInteger minGuestApplicable;
                    @XmlAttribute(name = "Start")
                    protected XMLGregorianCalendar start;
                    @XmlAttribute(name = "End")
                    protected XMLGregorianCalendar end;
                    @XmlAttribute(name = "Mon")
                    protected Boolean mon;
                    @XmlAttribute(name = "Tue")
                    protected Boolean tue;
                    @XmlAttribute(name = "Weds")
                    protected Boolean weds;
                    @XmlAttribute(name = "Thur")
                    protected Boolean thur;
                    @XmlAttribute(name = "Fri")
                    protected Boolean fri;
                    @XmlAttribute(name = "Sat")
                    protected Boolean sat;
                    @XmlAttribute(name = "Sun")
                    protected Boolean sun;
                    @XmlAttribute(name = "Duration")
                    protected String duration;
                    @XmlAttribute(name = "InvTypeCode")
                    protected String invTypeCode;

                    /**
                     * Gets the value of the baseByGuestAmts property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts getBaseByGuestAmts() {
                        return baseByGuestAmts;
                    }

                    /**
                     * Sets the value of the baseByGuestAmts property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts }
                     *     
                     */
                    public void setBaseByGuestAmts(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts value) {
                        this.baseByGuestAmts = value;
                    }

                    /**
                     * Gets the value of the additionalGuestAmounts property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts getAdditionalGuestAmounts() {
                        return additionalGuestAmounts;
                    }

                    /**
                     * Sets the value of the additionalGuestAmounts property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts }
                     *     
                     */
                    public void setAdditionalGuestAmounts(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts value) {
                        this.additionalGuestAmounts = value;
                    }

                    /**
                     * Gets the value of the rateDescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription getRateDescription() {
                        return rateDescription;
                    }

                    /**
                     * Sets the value of the rateDescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription }
                     *     
                     */
                    public void setRateDescription(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription value) {
                        this.rateDescription = value;
                    }

                    /**
                     * Gets the value of the mealsIncluded property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.MealsIncluded }
                     *     
                     */
                    public OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.MealsIncluded getMealsIncluded() {
                        return mealsIncluded;
                    }

                    /**
                     * Sets the value of the mealsIncluded property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.MealsIncluded }
                     *     
                     */
                    public void setMealsIncluded(OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.MealsIncluded value) {
                        this.mealsIncluded = value;
                    }

                    /**
                     * Gets the value of the minGuestApplicable property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMinGuestApplicable() {
                        return minGuestApplicable;
                    }

                    /**
                     * Sets the value of the minGuestApplicable property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMinGuestApplicable(BigInteger value) {
                        this.minGuestApplicable = value;
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
                     * Gets the value of the mon property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isMon() {
                        return mon;
                    }

                    /**
                     * Sets the value of the mon property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setMon(Boolean value) {
                        this.mon = value;
                    }

                    /**
                     * Gets the value of the tue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isTue() {
                        return tue;
                    }

                    /**
                     * Sets the value of the tue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setTue(Boolean value) {
                        this.tue = value;
                    }

                    /**
                     * Gets the value of the weds property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isWeds() {
                        return weds;
                    }

                    /**
                     * Sets the value of the weds property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setWeds(Boolean value) {
                        this.weds = value;
                    }

                    /**
                     * Gets the value of the thur property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isThur() {
                        return thur;
                    }

                    /**
                     * Sets the value of the thur property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setThur(Boolean value) {
                        this.thur = value;
                    }

                    /**
                     * Gets the value of the fri property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isFri() {
                        return fri;
                    }

                    /**
                     * Sets the value of the fri property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setFri(Boolean value) {
                        this.fri = value;
                    }

                    /**
                     * Gets the value of the sat property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isSat() {
                        return sat;
                    }

                    /**
                     * Sets the value of the sat property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setSat(Boolean value) {
                        this.sat = value;
                    }

                    /**
                     * Gets the value of the sun property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isSun() {
                        return sun;
                    }

                    /**
                     * Sets the value of the sun property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setSun(Boolean value) {
                        this.sun = value;
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
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                     *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                     *                 &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                     *                 &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
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
                        "additionalGuestAmount"
                    })
                    public static class AdditionalGuestAmounts {

                        @XmlElement(name = "AdditionalGuestAmount", required = true)
                        protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts.AdditionalGuestAmount> additionalGuestAmount;

                        /**
                         * Gets the value of the additionalGuestAmount property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAdditionalGuestAmount().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts.AdditionalGuestAmount }
                         * 
                         * 
                         */
                        public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts.AdditionalGuestAmount> getAdditionalGuestAmount() {
                            if (additionalGuestAmount == null) {
                                additionalGuestAmount = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.AdditionalGuestAmounts.AdditionalGuestAmount>();
                            }
                            return this.additionalGuestAmount;
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
                         *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                         *       &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *       &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *       &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class AdditionalGuestAmount {

                            @XmlAttribute(name = "Amount")
                            protected BigDecimal amount;
                            @XmlAttribute(name = "AgeQualifyingCode")
                            protected BigInteger ageQualifyingCode;
                            @XmlAttribute(name = "MinAge")
                            protected BigInteger minAge;
                            @XmlAttribute(name = "MaxAge")
                            protected BigInteger maxAge;

                            /**
                             * Gets the value of the amount property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getAmount() {
                                return amount;
                            }

                            /**
                             * Sets the value of the amount property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setAmount(BigDecimal value) {
                                this.amount = value;
                            }

                            /**
                             * Gets the value of the ageQualifyingCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getAgeQualifyingCode() {
                                return ageQualifyingCode;
                            }

                            /**
                             * Sets the value of the ageQualifyingCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setAgeQualifyingCode(BigInteger value) {
                                this.ageQualifyingCode = value;
                            }

                            /**
                             * Gets the value of the minAge property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getMinAge() {
                                return minAge;
                            }

                            /**
                             * Sets the value of the minAge property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setMinAge(BigInteger value) {
                                this.minAge = value;
                            }

                            /**
                             * Gets the value of the maxAge property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getMaxAge() {
                                return maxAge;
                            }

                            /**
                             * Sets the value of the maxAge property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setMaxAge(BigInteger value) {
                                this.maxAge = value;
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
                     *         &lt;element name="BaseByGuestAmt" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="NumberOfGuests" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                     *                 &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                     *                 &lt;attribute name="CurrencyCode">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;enumeration value="EUR"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="Type">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;enumeration value="7"/>
                     *                       &lt;enumeration value="25"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
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
                        "baseByGuestAmt"
                    })
                    public static class BaseByGuestAmts {

                        @XmlElement(name = "BaseByGuestAmt", required = true)
                        protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts.BaseByGuestAmt> baseByGuestAmt;

                        /**
                         * Gets the value of the baseByGuestAmt property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the baseByGuestAmt property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getBaseByGuestAmt().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts.BaseByGuestAmt }
                         * 
                         * 
                         */
                        public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts.BaseByGuestAmt> getBaseByGuestAmt() {
                            if (baseByGuestAmt == null) {
                                baseByGuestAmt = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.BaseByGuestAmts.BaseByGuestAmt>();
                            }
                            return this.baseByGuestAmt;
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
                         *       &lt;attribute name="NumberOfGuests" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *       &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                         *       &lt;attribute name="CurrencyCode">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;enumeration value="EUR"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="Type">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;enumeration value="7"/>
                         *             &lt;enumeration value="25"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class BaseByGuestAmt {

                            @XmlAttribute(name = "NumberOfGuests")
                            protected BigInteger numberOfGuests;
                            @XmlAttribute(name = "AmountAfterTax")
                            protected BigDecimal amountAfterTax;
                            @XmlAttribute(name = "CurrencyCode")
                            protected String currencyCode;
                            @XmlAttribute(name = "Type")
                            protected String type;
                            @XmlAttribute(name = "AgeQualifyingCode")
                            protected BigInteger ageQualifyingCode;

                            /**
                             * Gets the value of the numberOfGuests property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getNumberOfGuests() {
                                return numberOfGuests;
                            }

                            /**
                             * Sets the value of the numberOfGuests property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setNumberOfGuests(BigInteger value) {
                                this.numberOfGuests = value;
                            }

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
                             * Gets the value of the ageQualifyingCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getAgeQualifyingCode() {
                                return ageQualifyingCode;
                            }

                            /**
                             * Sets the value of the ageQualifyingCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setAgeQualifyingCode(BigInteger value) {
                                this.ageQualifyingCode = value;
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
                     *       &lt;attribute name="Breakfast" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *       &lt;attribute name="Lunch" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *       &lt;attribute name="Dinner" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                     *       &lt;attribute name="MealPlanCodes">
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
                     *       &lt;attribute name="MealPlanIndicator">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="1"/>
                     *             &lt;enumeration value="true"/>
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

                        @XmlAttribute(name = "Breakfast")
                        protected Boolean breakfast;
                        @XmlAttribute(name = "Lunch")
                        protected Boolean lunch;
                        @XmlAttribute(name = "Dinner")
                        protected Boolean dinner;
                        @XmlAttribute(name = "MealPlanCodes")
                        protected String mealPlanCodes;
                        @XmlAttribute(name = "MealPlanIndicator")
                        protected String mealPlanIndicator;

                        /**
                         * Gets the value of the breakfast property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isBreakfast() {
                            return breakfast;
                        }

                        /**
                         * Sets the value of the breakfast property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setBreakfast(Boolean value) {
                            this.breakfast = value;
                        }

                        /**
                         * Gets the value of the lunch property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isLunch() {
                            return lunch;
                        }

                        /**
                         * Sets the value of the lunch property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setLunch(Boolean value) {
                            this.lunch = value;
                        }

                        /**
                         * Gets the value of the dinner property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isDinner() {
                            return dinner;
                        }

                        /**
                         * Sets the value of the dinner property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setDinner(Boolean value) {
                            this.dinner = value;
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
                     *         &lt;element name="ListItem" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
                     *                 &lt;attribute name="ListItem" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
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
                     *       &lt;attribute name="Name" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="included services"/>
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
                        "listItem"
                    })
                    public static class RateDescription {

                        @XmlElement(name = "ListItem", required = true)
                        protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription.ListItem> listItem;
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
                         * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription.ListItem }
                         * 
                         * 
                         */
                        public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription.ListItem> getListItem() {
                            if (listItem == null) {
                                listItem = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Rates.Rate.RateDescription.ListItem>();
                            }
                            return this.listItem;
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
             *         &lt;element name="Supplement" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Text" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
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
             *                 &lt;attribute name="AddToBasicRateIndicator" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="1"/>
             *                       &lt;enumeration value="true"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ChargeTypeCode" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="1"/>
             *                       &lt;enumeration value="12"/>
             *                       &lt;enumeration value="18"/>
             *                       &lt;enumeration value="19"/>
             *                       &lt;enumeration value="20"/>
             *                       &lt;enumeration value="21"/>
             *                       &lt;enumeration value="24"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="SupplementType" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="Extra"/>
             *                       &lt;enumeration value="Board"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
             *                 &lt;attribute name="InvType">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="EXTRA"/>
             *                       &lt;enumeration value="ALPINEBITSEXTRA"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
             *                 &lt;attribute name="MandatoryIndicator" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
             *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                 &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                 &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
             *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
             *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
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
                "supplement"
            })
            public static class Supplements {

                @XmlElement(name = "Supplement", required = true)
                protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement> supplement;

                /**
                 * Gets the value of the supplement property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the supplement property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSupplement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement }
                 * 
                 * 
                 */
                public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement> getSupplement() {
                    if (supplement == null) {
                        supplement = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement>();
                    }
                    return this.supplement;
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
                 *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Text" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
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
                 *       &lt;attribute name="AddToBasicRateIndicator" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="1"/>
                 *             &lt;enumeration value="true"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="ChargeTypeCode" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="1"/>
                 *             &lt;enumeration value="12"/>
                 *             &lt;enumeration value="18"/>
                 *             &lt;enumeration value="19"/>
                 *             &lt;enumeration value="20"/>
                 *             &lt;enumeration value="21"/>
                 *             &lt;enumeration value="24"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="SupplementType" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="Extra"/>
                 *             &lt;enumeration value="Board"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}def_decimal_ge0" />
                 *       &lt;attribute name="InvType">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="EXTRA"/>
                 *             &lt;enumeration value="ALPINEBITSEXTRA"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="InvCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_ge0" />
                 *       &lt;attribute name="MandatoryIndicator" type="{http://www.opentravel.org/OTA/2003/05}def_bool" />
                 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *       &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *       &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}def_int_gt0" />
                 *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}def_date" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "description"
                })
                public static class Supplement {

                    @XmlElement(name = "Description")
                    protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement.Description> description;
                    @XmlAttribute(name = "AddToBasicRateIndicator", required = true)
                    protected String addToBasicRateIndicator;
                    @XmlAttribute(name = "ChargeTypeCode", required = true)
                    protected String chargeTypeCode;
                    @XmlAttribute(name = "SupplementType", required = true)
                    protected String supplementType;
                    @XmlAttribute(name = "Amount", required = true)
                    protected BigDecimal amount;
                    @XmlAttribute(name = "InvType")
                    protected String invType;
                    @XmlAttribute(name = "InvCode")
                    protected BigInteger invCode;
                    @XmlAttribute(name = "MandatoryIndicator")
                    protected Boolean mandatoryIndicator;
                    @XmlAttribute(name = "AgeQualifyingCode")
                    protected BigInteger ageQualifyingCode;
                    @XmlAttribute(name = "MinAge")
                    protected BigInteger minAge;
                    @XmlAttribute(name = "MaxAge")
                    protected BigInteger maxAge;
                    @XmlAttribute(name = "Start")
                    protected XMLGregorianCalendar start;
                    @XmlAttribute(name = "End")
                    protected XMLGregorianCalendar end;

                    /**
                     * Gets the value of the description property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the description property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement.Description }
                     * 
                     * 
                     */
                    public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement.Description> getDescription() {
                        if (description == null) {
                            description = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement.Description>();
                        }
                        return this.description;
                    }

                    /**
                     * Gets the value of the addToBasicRateIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAddToBasicRateIndicator() {
                        return addToBasicRateIndicator;
                    }

                    /**
                     * Sets the value of the addToBasicRateIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAddToBasicRateIndicator(String value) {
                        this.addToBasicRateIndicator = value;
                    }

                    /**
                     * Gets the value of the chargeTypeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChargeTypeCode() {
                        return chargeTypeCode;
                    }

                    /**
                     * Sets the value of the chargeTypeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChargeTypeCode(String value) {
                        this.chargeTypeCode = value;
                    }

                    /**
                     * Gets the value of the supplementType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSupplementType() {
                        return supplementType;
                    }

                    /**
                     * Sets the value of the supplementType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSupplementType(String value) {
                        this.supplementType = value;
                    }

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAmount(BigDecimal value) {
                        this.amount = value;
                    }

                    /**
                     * Gets the value of the invType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInvType() {
                        return invType;
                    }

                    /**
                     * Sets the value of the invType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInvType(String value) {
                        this.invType = value;
                    }

                    /**
                     * Gets the value of the invCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getInvCode() {
                        return invCode;
                    }

                    /**
                     * Sets the value of the invCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setInvCode(BigInteger value) {
                        this.invCode = value;
                    }

                    /**
                     * Gets the value of the mandatoryIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isMandatoryIndicator() {
                        return mandatoryIndicator;
                    }

                    /**
                     * Sets the value of the mandatoryIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setMandatoryIndicator(Boolean value) {
                        this.mandatoryIndicator = value;
                    }

                    /**
                     * Gets the value of the ageQualifyingCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getAgeQualifyingCode() {
                        return ageQualifyingCode;
                    }

                    /**
                     * Sets the value of the ageQualifyingCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setAgeQualifyingCode(BigInteger value) {
                        this.ageQualifyingCode = value;
                    }

                    /**
                     * Gets the value of the minAge property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMinAge() {
                        return minAge;
                    }

                    /**
                     * Sets the value of the minAge property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMinAge(BigInteger value) {
                        this.minAge = value;
                    }

                    /**
                     * Gets the value of the maxAge property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMaxAge() {
                        return maxAge;
                    }

                    /**
                     * Sets the value of the maxAge property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMaxAge(BigInteger value) {
                        this.maxAge = value;
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
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
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
                        "text"
                    })
                    public static class Description {

                        @XmlElement(name = "Text", required = true)
                        protected List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement.Description.Text> text;
                        @XmlAttribute(name = "Language", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        protected String language;

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
                         * {@link OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement.Description.Text }
                         * 
                         * 
                         */
                        public List<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement.Description.Text> getText() {
                            if (text == null) {
                                text = new ArrayList<OTAHotelRatePlanNotifRQ.RatePlans.RatePlan.Supplements.Supplement.Description.Text>();
                            }
                            return this.text;
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
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>def_nonempty_string">
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
             *             &lt;enumeration value="18"/>
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
