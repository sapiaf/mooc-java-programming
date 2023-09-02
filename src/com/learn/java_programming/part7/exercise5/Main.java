package com.learn.java_programming.part7.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        TextInterface textInterface = new TextInterface(gradeBook, scanner);
        textInterface.start();
    }
}
