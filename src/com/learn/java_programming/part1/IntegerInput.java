package com.learn.java_programming.part1;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int num = scanner.nextInt();
        System.out.println("You game the number " + num);
    }
}
