package com.learn.java_programming.part2;

import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        for (int i = value; i <= value2; i++) {
            System.out.println(i);
        }
    }
}
