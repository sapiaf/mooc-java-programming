package com.learn.java_programming.part6.exercise12;

import java.util.Scanner;

public class UserInterfacee {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterfacee(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("x")) {
                break;
            }
            if (choice.equalsIgnoreCase("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            } else if (choice.equalsIgnoreCase("2")) {
                System.out.println(jokeManager.drawJokes());
            } else if (choice.equalsIgnoreCase("3")) {
                System.out.println("Printing jokes...");
                jokeManager.printJokes();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
