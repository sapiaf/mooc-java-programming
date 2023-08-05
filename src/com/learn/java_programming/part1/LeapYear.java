package com.learn.java_programming.part1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.valueOf(scanner.nextLine());

        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("not a leap year");
        } else {
            System.out.println("leap year");
        }
    }
}
