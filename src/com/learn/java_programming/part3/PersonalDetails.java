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

            if (input.trim().isEmpty()) {
                break;
            }

            String[] parts = input.split(",");

            String name = parts[0].trim();
            int birthYear = Integer.parseInt(parts[1].trim());

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            totalBirthYears += birthYear;
            count++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) totalBirthYears / count);

        scanner.close();
    }
}
