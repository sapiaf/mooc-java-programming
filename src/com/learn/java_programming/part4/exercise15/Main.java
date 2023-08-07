package com.learn.java_programming.part4.exercise15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Statistics stats = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) break;
            stats.addNumber(num);
            if (num % 2 == 0) even.addNumber(num);
            else odd.addNumber(num);
        }
        System.out.println("The sum is " + stats.sum());
        System.out.println("The even sum is " + even.sum());
        System.out.println("The odd sum is " + odd.sum());
    }
}
