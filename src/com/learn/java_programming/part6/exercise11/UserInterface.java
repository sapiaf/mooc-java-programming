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
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            int points = Integer.parseInt(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible numbers");
                continue;
            }

            register.addGradeBasedOnPoints(points);
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(i));
        }

        System.out.println("The average of points is: " + register.averageOfPoints());
        System.out.println("The average of grades is: " + register.averageOfGrades());

    }
    public String stars(int grade) {
        String stars = "";
        for (int i = 0; i < register.numberOfGrades(grade); i++) {
            stars += "*";
        }
        return stars;
    }
}
