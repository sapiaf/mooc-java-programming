package com.learn.java_programming.part1;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        num = num * 24 * 60 * 60;
        System.out.println("The num in seconds is : " + num);
    }
}
