package com.learn.java_programming.part6.exercise10;

import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String choice = scanner.nextLine().toLowerCase();
            switch (choice) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add: ");
                    String task = scanner.nextLine();
                    todo.add(task);
                    break;
                case "list":
                    todo.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int index = Integer.parseInt(scanner.nextLine());
                    todo.remove(index);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
