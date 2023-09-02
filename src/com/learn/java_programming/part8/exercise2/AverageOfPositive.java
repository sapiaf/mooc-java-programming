package com.learn.java_programming.part8.exercise2;

import java.util.Scanner;

public class AverageOfPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) break;
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        System.out.println(count > 0 ? sum / count : "Cannot calculate the average");
    }
}
