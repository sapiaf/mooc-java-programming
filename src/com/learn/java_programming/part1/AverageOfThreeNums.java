package com.learn.java_programming.part1;

import java.util.Scanner;

public class AverageOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int third = Integer.valueOf(scanner.nextLine());
        System.out.println((double) (first + second + third) / 3);
    }
}
