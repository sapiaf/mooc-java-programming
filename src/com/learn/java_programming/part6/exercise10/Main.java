package com.learn.java_programming.part6.exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        UserInterface ui = new UserInterface(todoList, scanner);
        ui.start();
    }
}
