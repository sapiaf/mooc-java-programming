package com.learn.java_programming.part10.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) break;
            numbers.add(number);
        }
        numbers.stream()
                .filter(num -> num >= 1 && num <= 5)
                .forEach(System.out::println);
    }
}
