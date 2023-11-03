package com.inci.onlineAcademy.entities.concretes;

import com.inci.onlineAcademy.entities.abstracts.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student extends Person {
    private int studentId;
    private int studentIdentificationNumber;
}
