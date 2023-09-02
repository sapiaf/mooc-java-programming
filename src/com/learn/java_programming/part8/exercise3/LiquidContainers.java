package com.learn.java_programming.part8.exercise3;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100\nSecond: " + secondContainer + "/100");

            String choice = scanner.nextLine();
            if (choice.isEmpty() || choice.equalsIgnoreCase("quit")) break;

            try {
                String[] splittedChoice = choice.split(" ");
                String command = splittedChoice[0];
                int amount = Integer.parseInt(splittedChoice[1]);

                if (amount <= 0) {
                    System.out.println("Amount should be greater than 0.");
                    continue;
                }

                switch (command) {
                    case "add":
                        firstContainer = Math.min(firstContainer + amount, 100);
                        break;
                    case "move":
                        firstContainer = Math.max(firstContainer - amount, 0);
                        secondContainer = Math.min(secondContainer + amount, 100);
                        break;
                    case "remove":
                        secondContainer = Math.max(secondContainer - amount, 0);
                        break;
                    default:
                        System.out.println("Invalid command");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input format. Please provide a command followed by an amount.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount provided. Please enter a valid integer.");
            }
        }
    }
}
