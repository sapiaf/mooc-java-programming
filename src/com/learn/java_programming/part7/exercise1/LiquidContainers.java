package com.learn.java_programming.part7.exercise1;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("First: " + firstContainer + "/100\n" + "Second: " + secondContainer + "/100 \n");
            String userInput = scanner.nextLine();

            if (userInput.equals("quit")) {
                break;
            }

            String[] parts = userInput.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (amount < 0) continue;

            switch (command) {
                case "add":
                    if (amount + firstContainer >= 100) firstContainer = 100;
                    else firstContainer += amount;
                    break;
                case "move":
                    if (amount <= firstContainer) {
                        if (amount + secondContainer >= 100) {
                            int spaceInSecondContainer = 100 - secondContainer;
                            int actualMoveAmount = Math.min(amount, spaceInSecondContainer);
                            firstContainer -= amount;
                            secondContainer += actualMoveAmount;
                        }
                        else {
                            int amountToMove = firstContainer;
                            secondContainer += amountToMove;
                            if (secondContainer > 100) secondContainer = 100;
                            firstContainer = 0;
                        }
                    }
                break;
                case "remove":
                    if (amount > secondContainer) secondContainer = 0;
                    else secondContainer -= amount;
                    break;
            }
        }
    }
}
