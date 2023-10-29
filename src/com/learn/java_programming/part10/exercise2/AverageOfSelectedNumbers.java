package com.learn.java_programming.part10.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        boolean isNegative = choice.equalsIgnoreCase("n");
        double average = inputs.stream()
                    .mapToInt(Integer::parseInt)
                    .filter(num -> isNegative ? num < 0 : num > 0)
                    .average().orElse(0.0);

        System.out.println("average of the numbers: " + average);
    }
}
