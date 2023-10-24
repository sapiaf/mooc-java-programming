package com.learn.java_programming.part7.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeList gradeBook = new GradeList();
        TextUI textInterface = new TextUI(scanner, gradeBook);
        textInterface.start();
    }
}
