package com.learn.java_programming.part8.recap;
import java.util.Scanner;

public class LiquidContainers2 {
    private int amount;

    public LiquidContainers2() {
        this.amount = 0;
    }

    public void add(int amount) {
        if (amount < 0) return;
        this.amount = Math.min(this.amount + amount, 100);
    }

    public void remove(int amount) {
        if (amount < 0) return;
        this.amount = Math.max(this.amount - amount, 0);
    }

    public int contains() {
        return amount;
    }

    @Override
    public String toString() {
        return amount + "/100";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LiquidContainers2 firstContainer = new LiquidContainers2();
        LiquidContainers2 secondContainer = new LiquidContainers2();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String word = scanner.nextLine();
            if (word.isEmpty() || word.equalsIgnoreCase("quit")) break;
            String[] split = word.split(" ");
            String choice = split[0];
            int amount = Integer.parseInt(split[1]);

            switch (choice) {
                case "add":
                    firstContainer.add(amount);
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
                case "move":
                    int actualMoveAmount = Math.min(firstContainer.contains(), amount);
                    firstContainer.remove(actualMoveAmount);
                    secondContainer.add(actualMoveAmount);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}






