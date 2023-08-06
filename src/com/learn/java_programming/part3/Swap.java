package com.learn.java_programming.part3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 3, 5, 7, 9};
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("Give two indices to swap: ");
        int firstIndex = Integer.valueOf(scanner.nextLine());
        int secondIndex = Integer.valueOf(scanner.nextLine());

        int helper = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = helper;

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
