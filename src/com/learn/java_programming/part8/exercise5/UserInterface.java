package com.learn.java_programming.part8.exercise5;

import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "add":
                    System.out.println("To add:");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    break;
                case "remove":
                    System.out.println("Which one is removed?");

                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        todoList.remove(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index. Task not found.");
                    }
                    break;
                case "stop":
                    return;
                case "list":
                    todoList.print();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
