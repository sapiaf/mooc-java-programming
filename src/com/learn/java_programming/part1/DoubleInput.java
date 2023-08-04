package com.learn.java_programming.part1;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        double num = scanner.nextDouble();
        System.out.println("You game the number " + num);
    }
}
