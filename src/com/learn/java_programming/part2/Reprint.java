package com.learn.java_programming.part2;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int count = 0;
        while (count < value) {
            printText();
            count++;
        }
    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
        System.out.println();
    }
}
