package com.learn.java_programming.part2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int sum = 1;
        for (int i = 1; i <= value; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
