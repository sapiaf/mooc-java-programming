package com.learn.java_programming.part7.exercise2;

import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.print("First: " + firstContainer + "\n" + "Second: " + secondContainer + "\n");
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
                    firstContainer.add(amount);
                    break;
                case "move":
                    int moveAmount = Math.min(amount, firstContainer.contains());
                    int spaceInSecondContainer = 100 - secondContainer.contains();
                    int actualMoveAmount = Math.min(moveAmount, spaceInSecondContainer);
                    firstContainer.remove(actualMoveAmount);
                    secondContainer.add(actualMoveAmount);
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
            }
        }
    }
}
