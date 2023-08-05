package com.learn.java_programming.part1;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num1 == num2) System.out.println("equal");
        else if (num1 > num2) System.out.println(num1);
        else System.out.println(num2);

    }
}
