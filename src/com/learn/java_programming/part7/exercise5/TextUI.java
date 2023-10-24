package com.learn.java_programming.part7.exercise5;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private GradeList gradeList;

    public TextUI(Scanner scanner, GradeList gradeList) {
        this.scanner = scanner;
        this.gradeList = gradeList;
    }
    public void start() {
        while (true) {
            System.out.println("Enter point totals, -1 stops: ");
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade == -1) break;
            gradeList.addGrade(grade);
        }

        System.out.println("Point average (all): " + gradeList.average());
        System.out.println(gradeList.average(50) > 0 ? "Point average (passing): " + gradeList.average(50) : "-");
        System.out.println("Pass percentage: " + gradeList.passingPercentage(50));
        gradeList.printGradeDistribution();
    }
}
