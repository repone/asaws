/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmone.ota.asa.builders.resretrieve;

import java.util.Map;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;

/**
 *
 * @author mauro.larese
 */
public class Profiles {
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile
        Profile(Map<String, Object> reservation){  
            OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile profile = 
                    new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile();
                    profile.setCustomer(Customer.init(reservation));
            return profile;
        }
    private static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo 
        ProfileInfo(Map<String, Object> reservation){  
            OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo profileInfo = 
                    new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo();
            
            profileInfo.setProfile(Profile(reservation));
            return profileInfo;
        }
    public static OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles 
        init(Map<String, Object> reservation){ 
        OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles profiles = 
                new OTAResRetrieveRS.ReservationsList.HotelReservation.ResGuests.ResGuest.Profiles();
        profiles.setProfileInfo(ProfileInfo(reservation));
        return profiles;
    }
}
