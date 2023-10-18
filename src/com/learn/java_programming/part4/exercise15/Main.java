package com.learn.java_programming.part4.exercise15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) {
            int userNum = Integer.parseInt(scanner.nextLine());
            if (userNum == - 1) break;
            statistics.addNumber(userNum);
            if (userNum % 2 == 0) even.addNumber(userNum);
            else odd.addNumber(userNum);
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Even: " + even.sum());
        System.out.println("Odd: " + odd.sum());
    }
}
