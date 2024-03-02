package com.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class StudentDetails {
    String name;
    String id;
    String dob;
    int age;
    StudentMotherDetails studentMotherDetails;
    StudentFatherDetails studentFatherDetails;

}
