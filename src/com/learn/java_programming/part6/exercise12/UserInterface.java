package com.learn.java_programming.part6.exercise12;

import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            menuChoices();
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "1":
                    System.out.println("Write the joke to be added: ");
                    String joke = scanner.nextLine();
                    jokeManager.addJoke(joke);
                    break;
                case "2":
                    jokeManager.drawJokes();
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    jokeManager.printJokes();
                    break;
                case "X":
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    private void menuChoices() {
        System.out.println("Commands");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
}
