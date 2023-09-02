package com.learn.java_programming.part8.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        UserInterface userInterface = new UserInterface(todoList, scanner);
        userInterface.start();
    }
}
