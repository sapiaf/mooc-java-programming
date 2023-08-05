package com.learn.java_programming.part1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Caput Draconis")){
            System.out.println("Welcome");
        } else {
            System.out.println("Off with you");
        }
    }
}
