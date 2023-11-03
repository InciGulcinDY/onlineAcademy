package com.inci.onlineAcademy.entities.abstracts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Person {
    private int personId;
    private String firstname;
    private String surname;
    private String nationalIdentificationNumber;
    private int birthYear;
    private String email;
    private String address;
    private String phone;

}
