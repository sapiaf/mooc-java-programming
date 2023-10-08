package com.learn.java_programming.part8.recap.todolist;

import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("stop")) break;
            switch (userChoice) {
                case "add":
                    System.out.println("To add:");
                    String task = scanner.nextLine();
                    list.add(task);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int toRemove = Integer.parseInt(scanner.nextLine());
                    list.remove(toRemove);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
