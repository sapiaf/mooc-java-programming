package com.learn.java_programming.part2;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
            if (input == 0) {
                System.out.println((double) sum / count);
                break;
            }
            count++;
        }
    }
}
