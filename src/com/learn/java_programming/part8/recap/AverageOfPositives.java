package com.learn.java_programming.part8.recap;

import java.util.Scanner;

public class AverageOfPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) break;
            if (num > 0) {
                sum += num;
                counter++;
            }
        }
        System.out.println(counter > 0 ? sum / counter : "Cannot calculate the average");
    }
}
