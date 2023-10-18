package com.learn.java_programming.part3;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int totalBirthYears = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a name and birth year separated by a comma (or press enter to quit):");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            count++;
            String[] strings = input.split(",");
            String name = strings[0];
            int age = Integer.parseInt(strings[1]);
            totalBirthYears += age;
            if (name.length() > longestName.length()) longestName = name;

        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) totalBirthYears / count);

        scanner.close();
    }
}
