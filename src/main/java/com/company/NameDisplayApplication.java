package com.company;


public class NameDisplayApplication{

    public static void main(String[] args) throws Exception {
        PersonProcessor personProcessor = new PersonProcessor();
        System.out.println("Welcome to NameDisplay Application");
        System.out.println();
        Person person = new Person();
        personProcessor.nameValidator(person);
        personProcessor.ageValidator(person);
        personProcessor.phoneNumberValidator(person);

        personProcessor.display(person);

    }



}




