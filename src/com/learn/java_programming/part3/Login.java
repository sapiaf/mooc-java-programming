package com.learn.java_programming.part3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        if (username.equalsIgnoreCase("alex") && password.equalsIgnoreCase("sunshine") ||
                username.equalsIgnoreCase("emma") && password.equalsIgnoreCase("haskell")) {
            System.out.println("Logged in!");
        } else {
            System.out.println("wrong username or password");
        }
    }
}
