package com.learn.java_programming.part6.exercise11;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        while (true) {
            System.out.println("Points: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            try {
                int points = Integer.parseInt(input);
                if (points < 0 || points > 100) {
                    System.out.println("Impossible number");
                    continue;
                }
                register.addGradeBasedOnPoints(points);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        printGrades();
        printAverages();
    }

    private void printGrades() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + printStars(i));
        }
    }

    private String printStars(int grades) {
        StringBuilder stars = new StringBuilder();
        for (int i = 1; i <= register.numberOfGrades(grades); i++) {
            stars.append("*");
        }
        return stars.toString();
    }
    private void printAverages() {
        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());
    }
}
