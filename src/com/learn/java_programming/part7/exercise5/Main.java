package com.learn.java_programming.part7.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");
        double sum = 0;
        double passingSum = 0;
        int counter = 0;
        int passingCounter = 0;
        int[] grades = new int[6];
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) break;
            if (num >= 0 && num <= 100) {
                int grade = getGrade(num);
                grades[grade]++;

                if (num >= 50) {
                    passingSum += num;
                    passingCounter++;
                }
                sum += num;
                counter++;
            }
        }

        double average = sum / counter;
        System.out.println("Point average (all): " + average);

        if (passingCounter > 0) {
            double passingAverage = passingSum / passingCounter;
            System.out.println("Point average (passing): " + passingAverage);
        } else {
            System.out.println("Point average (passing): -");
        }

        double passingPercenteage = 100 * ((double) passingCounter / counter);
        System.out.println("Point average (all): " + passingPercenteage);

        System.out.println("Grade distribution:");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    private static int getGrade(int num) {
        if (num < 50) return 0;
        if (num < 60) return 1;
        if (num < 70) return 2;
        if (num < 80) return 3;
        if (num < 90) return 4;
        return 5;
    }
}
