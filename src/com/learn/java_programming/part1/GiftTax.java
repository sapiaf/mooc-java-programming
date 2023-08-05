package com.learn.java_programming.part1;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int price = Integer.valueOf(scanner.nextLine());
        String string = "Tax: ";

        if (price < 5000) {
            System.out.println("no tax");
        } else if (price < 25000) {
            System.out.println(string + (100 + (price - 5000) * 0.08));
        } else if (price < 55000) {
            System.out.println(string + (1700 + (price - 25000) * 0.10));
        } else if (price < 200000) {
            System.out.println(string + (4700 + (price - 55000) * 0.12));
        } else if (price < 1000000) {
            System.out.println(string + (22100 + (price - 200000) * 0.15));
        } else {
            System.out.println(string + (142100 + (price - 1000000) * 0.17));
        }

    }
}
