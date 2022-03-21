package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonProcessor {
    // A method to check if the age is valid
    public void ageValidator() {
        boolean endApplication = false;
        while(endApplication == false){

            System.out.println("Please provide your age");
            Scanner scan = new Scanner(System.in);
            String age = scan.nextLine().toUpperCase();

            //Validation of the age

            List <String> output = new ArrayList();
            output.add(age);
            for( String ages : output){
                //boolean ageMatch = Pattern.compile("\\d").matcher((age)).matches();
                if(Character.isLetter(ages)){
                        if (Character.toString(ages).equals("E")) {
                            System.out.println("Thank you for using our system, Bye bye");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Please type a valid age or type e to exit the application");
                            System.out.println();
                        }
                    }
                else if (Character.isDigit(ages) && ages > 0) {

                        System.out.println("Thank you your age has been confirmed");
                        Person user = new Person();
                        user.setAge(Integer.parseInt(age));
                        endApplication = true;
                    }

                }
            }



        }




    // A method to check if the name was typed correctly
    public void nameValidator() {
        boolean endApplication = false;
        while(endApplication == false) {
            System.out.println("Please provide your name");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine().toUpperCase();
            boolean checkName = Pattern.compile("(.*)\\s(.*)").matcher(name).matches();
            if (checkName == true && name.length() > 5) {
                System.out.println("Name confirmed");
                System.out.println();
                Person confirmedName = new Person();
                confirmedName.setName(name);
                endApplication = true;
            }
            else if (name.equals("E")) {
                System.exit(0);
                System.out.println("Thank you for using our system, Bye bye");
            }
            else {
                System.out.println("Please make sure your name are in letters only and they should more than 5 characters or type e to exit the application");
                System.out.println();
            }

        }

    }


    // A method to check if the phone number was typed in correctly
    public void phoneNumberValidator() {
        boolean endApplication = false;
        while(endApplication == false) {
            System.out.println("Your phone number must be greater than 8 digits and less than 11 digits");
            System.out.println("Please provide your phone number");
            Scanner scan = new Scanner(System.in);
            String phoneNumber = scan.nextLine();

            boolean checkPhoneNumber = Pattern.compile("\\d").matcher(phoneNumber).matches();
            if (checkPhoneNumber == true || phoneNumber.length() > 8 && phoneNumber.length() <= 10) {
                System.out.println("phoneNumber confirmed");
                Person phoneNumberConfirmed = new Person();
                phoneNumberConfirmed.setPhoneNumber(Long.parseLong(phoneNumber));
                endApplication = true;
            }
            else if (phoneNumber.equals("E")) {
                System.out.println("Bye bye");
                System.exit(0);
            }
            else {
                System.out.println();
                System.out.println("Please type in your phoneNumber correctly or type e to exit the application");
            }
        }
    }

    //to display your information
    public void display(String name, int age, long phoneNumber){
        System.out.println("Your name is "+name+ " and you are "+age+" years old and this is ur phone number: "+phoneNumber);
    }
}
