package com.learn.java_programming.part1;

import java.util.EventListener;
import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int num = Integer.valueOf(scanner.nextLine());
        if (num < 0) {
            System.out.println("Impossible");
        } else if (num < 49) {
            System.out.println("Failed");
        } else if (num > 49 && num < 60) {
            System.out.println("1");
        } else if (num > 59 && num < 70) {
            System.out.println("2");
        } else if (num > 69 && num < 80) {
            System.out.println("3");
        } else if (num > 79 && num < 90) {
            System.out.println("4");
        } else if (num > 89 && num <= 100) {
            System.out.println("5");
        } else {
            System.out.println("Incredible");
        }
    }
}
