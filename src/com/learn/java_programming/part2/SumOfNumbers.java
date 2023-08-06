package com.learn.java_programming.part2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());
            counter += input;
            if (input == 0) {
                System.out.println(counter);
                break;
            }
        }
    }
}
