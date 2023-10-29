package com.learn.java_programming.part10.exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String choice = scanner.nextLine();
            if (isBreak(choice)) break;
            System.out.println("Input first name:");
            String firstName = scanner.nextLine();
            if (isBreak(firstName)) break;
            System.out.println("Input last name:");
            String lastName = scanner.nextLine();
            if (isBreak(lastName)) break;
            System.out.println("Input the year of birth:");
            String year = scanner.nextLine();
            if (isBreak(year)) break;
            int yearOfBirth = Integer.parseInt(year);

            persons.add(new Person(firstName, lastName, yearOfBirth));
        }
        System.out.println("Unique last names in alphabetical order:");
        persons.stream().map(Person::getLastName).sorted().distinct().forEach(System.out::println);
    }
    public static boolean isBreak(String choice) {
        return choice.equalsIgnoreCase("quit");
    }
}
