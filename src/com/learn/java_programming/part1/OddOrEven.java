package com.learn.java_programming.part1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        String dry = "Number " + num;
        System.out.println(num % 2 == 0 ? dry + " is even." : dry + " is odd.");
    }
}
