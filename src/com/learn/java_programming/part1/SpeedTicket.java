package com.learn.java_programming.part1;

import java.util.Scanner;

public class SpeedTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed: ");
        int num = Integer.valueOf(scanner.nextLine());
        if (num > 120) {
            System.out.println("Speeding ticket!");
        }

    }
}
