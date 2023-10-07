package com.learn.java_programming.part8.recap;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String word = scanner.nextLine();
            if (word.isEmpty() || word.equalsIgnoreCase("quit")) break;
            String[] split = word.split(" ");
            String choice = split[0];
            int amount = Integer.parseInt(split[1]);

            switch (choice) {
                case "add":
                    if (amount > 0) {
                        firstContainer += amount;
                        if (firstContainer > 100) firstContainer = 100;
                    }
                    break;
                case "remove":
                    if (amount > 0) {
                        secondContainer -= amount;
                        if (secondContainer < 0) secondContainer = 0;
                    }
                    break;
                case "move":
                    secondContainer += amount;
                    firstContainer -= amount;
                    if (amount > firstContainer) firstContainer = 0;
                    if (secondContainer > 100) secondContainer = 100;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
