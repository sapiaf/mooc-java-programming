package com.learn.java_programming.part1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());

        // SOLUTION
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) System.out.println("The year is not a leap year.");
        else System.out.println("The year is a leap year.");

        // ALTERNATIVE SOLUTION
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
        // TERNARY OPERATOR
        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "The year is a leap year." : "The year is not a leap year.";
        System.out.println(result);
    }
}
