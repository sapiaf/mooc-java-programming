package com.learn.java_programming.part8.exercise4;

import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer + "\n" + "Second: " + secondContainer);

            String choice = scanner.nextLine();
            if (choice.isEmpty() || choice.equalsIgnoreCase("quit")) break;

            try {
                String[] splittedChoice = choice.split(" ");
                String command = splittedChoice[0];
                int amount = Integer.parseInt(splittedChoice[1]);

                if (amount <=  0) {
                    System.out.println("Amount should be greater than 0.");
                    continue;
                }

                switch (command) {
                    case "add":
                        firstContainer.add(amount);
                        break;
                    case "move":
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                        break;
                    case "remove":
                        secondContainer.remove(amount);
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
