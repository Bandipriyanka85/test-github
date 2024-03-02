package com.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MailDetails {

    String firstName;
    String lastName;
    String suggestedMail;
    String passWord;
    String confirmPassWord;
    int age;
    String dateOfBirth;

}
