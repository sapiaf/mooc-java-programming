package com.learn.java_programming.part2;

import java.util.Scanner;

public class ComparingValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        if (first == second) {
            System.out.println(first + " is equal to " + second);
        } else {
            System.out.println(first > second ? first + " is greater than " + second : first + " is smaller than " + second);
        }
    }
}
