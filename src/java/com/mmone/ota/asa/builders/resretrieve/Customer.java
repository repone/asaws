/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import java.util.Map;
import org.opentravel.ota._2003._05.OTAResRetrieveRS ;
import static com.mmone.ota.asa.builders.OTAResRetrieveRSBuilder.CUSTOMER_GENDER_UNKNOWN;
import static com.mmone.ota.asa.builders.OTAResRetrieveRSBuilder.CUSTOMER_LANGUAGE_DE;

/**
 *
 * @author mauro.larese
 */
public class Customer {
    private static org.opentravel.ota._2003._05.OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Telephone 
        Telephone(Map<String, Object> reservation){ 
            OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Telephone t = 
                    new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Telephone();
            
            String phone = (String) reservation.get("reservation_phone") ;
            
            try { 
                if(phone!=null && !phone.equals("") && !phone.equals("-")){
                    t.setPhoneNumber(     (String) reservation.get("reservation_phone")       );  
                    t.setPhoneTechType(   "1"  );  
                }else{
                    return null;
                }    
            } catch (Exception e) {  
                return null;
            }
            
            return t;
        }
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address.CountryName 
        CountryName(String code){  
        OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address.CountryName cn = 
                new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address.CountryName();
                
                if(code!=null) code=code.toUpperCase();
                cn.setCode(code);
                return cn;
    }
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address 
        Address(Map<String, Object> reservation){  
            OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address address=
                    new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Address();
            String postalCode =(String) reservation.get("reservation_zipcode")  ;
            if(postalCode==null || postalCode.equals("")) 
                postalCode="--";
            
            try { address.setCityName(      (String) reservation.get("reservation_city")       );  } catch (Exception e) { }
            try { address.setCountryName(   CountryName((String) reservation.get("reservation_country") )  );  } catch (Exception e) { }
            try { address.setPostalCode(   postalCode    );  } catch (Exception e) { }
            try { address.setAddressLine((String) reservation.get("reservation_address")       );  } catch (Exception e) { }
             
            return address;
        }
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName 
        PersonName(Map<String, Object> reservation){  
            OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName personName = 
                    new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName();          
            try { personName.setGivenName( (String) reservation.get("reservation_name") ); } catch (Exception e) { }
            try { personName.setSurname( (String) reservation.get("reservation_surname") ); } catch (Exception e) { }
            return personName;
        }
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Email 
        Email(String email){
                OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Email em =
                        new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.Email();
                em.setValue(email);
                //em.setRemark("newsletter:no");
                return em;
            }
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer 
        init(Map<String, Object> reservation){  
            OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer customer=
                new org.opentravel.ota._2003._05.OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer();
            customer.setAddress(Address(reservation));
            customer.setGender(CUSTOMER_GENDER_UNKNOWN);
            try { customer.setEmail( Email( (String) reservation.get("reservation_email") ) )  ;   } catch (Exception e) { }
            
            String language = CUSTOMER_LANGUAGE_DE;
            try {
                if (reservation.get("reservation_guest_language") != null)  
                    language = (String) reservation.get("reservation_guest_language") ; 
            } catch (Exception e) {  } 
            customer.setLanguage(language);
            customer.getTelephone().add(Telephone(reservation));
            customer.setPersonName(PersonName(reservation));
            return customer;        
        }
    
        
}