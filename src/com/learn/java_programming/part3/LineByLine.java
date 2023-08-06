package com.learn.java_programming.part3;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        String [] array = answer.split(" ");
        for (String el : array) {
            System.out.println(el);
        }
    }
}
