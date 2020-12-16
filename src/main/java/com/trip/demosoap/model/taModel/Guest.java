package com.trip.demosoap.model.taModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

    private String language;
    private String email;
    private String phone;
    private String address;
    private String postalCode;
    private String state;
    private String country;
    private String customerType;
    private String contactPreferences;
    private String loyaltyPrograms;

}
