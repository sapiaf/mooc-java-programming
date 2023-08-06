package com.learn.java_programming.part2;

import java.util.Scanner;

public class SquaredRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        int sum = first + second;
        System.out.println((int) Math.sqrt(sum));
    }
}
