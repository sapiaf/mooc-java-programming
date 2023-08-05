package com.learn.java_programming.part1;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println(num > 0 ? "The number is positive." : "The number is negative");
    }
}
