package com.learn.java_programming.part2;

import java.util.Scanner;

public class SumOfASequenceSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = value; i <= value2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
