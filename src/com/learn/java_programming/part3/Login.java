package com.learn.java_programming.part3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("alex", "sunshine");
        credentials.put("emma", "haskell");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter username: ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase("quit")) break;
            System.out.println("Enter password: ");
            String password = scanner.nextLine();
            if (password.equalsIgnoreCase("quit")) break;

            if (credentials.getOrDefault(username, "").equalsIgnoreCase(password)) {
                System.out.println("Logged in!");
                break;
            } else {
                System.out.println("wrong username or password");
            }

        }
    }
}
