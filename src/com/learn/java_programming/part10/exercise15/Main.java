package com.learn.java_programming.part10.exercise15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker testChecker = new Checker();
        System.out.println("Enter a String:");
        String userInput = scanner.nextLine();
        if(testChecker.timeOfDay(userInput)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
