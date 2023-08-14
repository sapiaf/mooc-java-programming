package com.learn.java_programming.part6.exercise10;

import java.util.Scanner;

public class UserInterface {
    private ToDoList todo;
    private Scanner scanner;

    public UserInterface(ToDoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("stop")) {
                break;
            } else if (choice.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todo.add(task);
            } else if (choice.equalsIgnoreCase("list")) {
                todo.print();
            } else if (choice.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                try {
                    int taskIndex = Integer.parseInt(scanner.nextLine());
                    todo.remove(taskIndex);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid task number.");
                }
            } else {
                System.out.println("Unknown Command");
            }
        }
    }
}
