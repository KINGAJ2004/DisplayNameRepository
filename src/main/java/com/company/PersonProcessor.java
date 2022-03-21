package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonProcessor {

    private Integer MAX_VALUE = 2147483647;
    // A method to check if the age is valid

    public void ageValidator(Person person) throws Exception {
        boolean endApplication = false;
        while (endApplication == false) {

            System.out.println("Please provide your age between 1 and 200");
            Scanner scan = new Scanner(System.in);
            String age = scan.nextLine().toUpperCase();
            List<String> verifiedAge = new ArrayList<>();
            verifiedAge.add(age);
            for (String newAge : verifiedAge) {
                boolean ageMatch = Pattern.compile("[0-9]+").matcher(newAge).matches();

                if (ageMatch){
                    try {
                        Integer length = String.valueOf(newAge).length();
                        if(length > 10){
                            System.out.println("You have entered a number greater than an integer");
                            System.exit(0);
                        }
                        Long longValue = Long.parseLong(newAge);
                        if(longValue > MAX_VALUE.longValue()){
                            System.out.println("You have entered a number greater than an integer exiting the application");
                            System.exit(0);
                        }

                        if(Integer.parseInt(newAge) > 0 &&  Integer.parseInt(newAge) <= 200) {
                            System.out.println("Thank you your age has been confirmed");
                            person.setAge(Integer.parseInt(age));
                            endApplication = true;
                        }
                        else if (newAge.equals("E")) {
                            System.out.println("Thank you for using our system, Bye bye");
                            System.exit(0);
                        }
                        else{
                            System.out.println("You have entered an age greater than 200, exiting the application");
                            System.exit(0);
                        }
                    }
                    catch (Exception exception){
                        throw new NumberFormatException("Please type a valid age between the values of 0 and " + MAX_VALUE);
                    }
                } else {
                    if (newAge.equals("E")) {
                        System.out.println("Thank you for using our system, Bye bye");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Please type a valid age or type e to exit the application");
                        System.out.println();
                    }
                }

            }
        }


    }


    // A method to check if the name was typed correctly
    public void nameValidator(Person person) {
        boolean endApplication = false;
        while (endApplication == false) {
            System.out.println();
            System.out.println("Please provide your name");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine().toUpperCase();

            List<String> verifiedNames = new ArrayList<>();
            verifiedNames.add(name);
                for (String newNames: verifiedNames) {
                    boolean verifiedName = Pattern.compile("[a-zA-Z]*(\\s)[a-zA-Z]+").matcher(newNames).matches();

                    if (verifiedName == true && name.length() >= 4 && name.length() <= 30) {
                        System.out.println("Name confirmed");
                        System.out.println();
                        person.setName(name);
                        endApplication = true;
                    } else if (name.equals("E")) {
                        System.out.println("Thank you for using our system, Bye bye");
                        System.exit(0);
                    } else {
                        System.out.println("Please make sure your first name and your lastname are included and also make sure they are in letters only and the minimum should be 3 characters while the maximum should be 30 characters, exiting the application");
                        System.exit(0);
                    }
                }


        }

    }


    // A method to check if the phone number was typed in correctly
    public void phoneNumberValidator(Person person) {
        boolean endApplication = false;
        System.out.println("Your phone number must be greater than 7 digits and less than 11 digits");
        while (endApplication == false) {
            System.out.println();
            System.out.println("Please provide your phone number");
            Scanner scan = new Scanner(System.in);
            String phoneNumber = scan.nextLine();

            List<String> verifiedPhoneNumbers = new ArrayList();
            verifiedPhoneNumbers.add(phoneNumber);

            for (String newPhoneNumber : verifiedPhoneNumbers) {
                boolean checkPhoneNumber = Pattern.compile("[0-9]+").matcher(newPhoneNumber).matches();

                if (checkPhoneNumber == true ){
                    if( newPhoneNumber.length() > 7 && newPhoneNumber.length() <= 10) {
                        System.out.println("phone number confirmed");
                        System.out.println();
                        person.setPhoneNumber(Long.parseLong(phoneNumber));
                        endApplication = true;
                    }
                    else if (newPhoneNumber.equals("E")) {
                        System.out.println("Thank you for using our system, Bye bye");
                        System.exit(0);
                    }
                    else {
                        System.out.println("maximum of 10 digits and minimum of 7 digits, exiting the application");
                        System.exit(0);
                    }
                }
                else{
                    if (newPhoneNumber.equals("E")) {
                        System.out.println("Thank you for using our system, Bye bye");
                        System.exit(0);
                    }
                    else {
                        System.out.println("maximum of 10 digits and minimum of 7 digits, exiting the application");
                        System.exit(0);
                    }
                }

            }
        }
    }

        //to display your information
        public void display(Person person){
            System.out.println("Your name is " + person.getName() + " " +
                              "and you are " + person.getAge() + " years old and " +
                              "this is ur phone number: " + person.getPhoneNumber());
        }
    }


