package com.company;

import java.util.Scanner;

public class NameDisplayApplication{

    public static void main(String[] args) {
        Person user = new Person();
        PersonProcessor personProcessor = new PersonProcessor();
        System.out.println("Welcome to NameDisplay Application");
        System.out.println();

        // personProcessor.nameValidator();
        personProcessor.ageValidator();
        // personProcessor.phoneNumberValidator();

       // personProcessor.display(user.getName(), user.getAge(), user.getPhoneNumber());

    }



}




