package com.learn.java_programming.part1;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println(num >= 18 ? "You are an adult" : "You are not an adult");
    }
}
