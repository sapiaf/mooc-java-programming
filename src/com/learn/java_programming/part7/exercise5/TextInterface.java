package com.learn.java_programming.part7.exercise5;

import java.util.Scanner;

public class TextInterface {
    private GradeBook gradeBook;
    private Scanner scanner;
    public TextInterface(GradeBook gradeBook, Scanner scanner) {
        this.gradeBook = gradeBook;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Enter point totals, -1 stops: ");
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade == -1) break;
            gradeBook.addGrade(grade);
        }

        System.out.println("Point average (all): " + gradeBook.average());
        System.out.println(gradeBook.average(50) > 0 ? "Point average (passing): " + gradeBook.average(50) : "-");
        System.out.println("Pass percentage: " + gradeBook.passingPercentage());
        gradeBook.printGradeDistribution();
    }
}
