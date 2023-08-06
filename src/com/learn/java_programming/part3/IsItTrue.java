package com.learn.java_programming.part3;

import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("true")) System.out.println("You got it!");
        else System.out.println("try again");
    }
}
