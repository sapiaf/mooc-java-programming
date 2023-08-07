package com.learn.java_programming.part4.exercise18;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> nomi = new ArrayList<>();
        while (true) {
            System.out.println("first name");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) break;
            System.out.println("last name");
            String lastName = scanner.nextLine();
            System.out.println("codice");
            String number = scanner.nextLine();
            PersonalInformation persona = new PersonalInformation(firstName, lastName, number);
            nomi.add(persona);
        }
        for (PersonalInformation persona : nomi) {
            System.out.println(persona.getFirstName() +  " " + persona.getLastName());
        }
    }
}
