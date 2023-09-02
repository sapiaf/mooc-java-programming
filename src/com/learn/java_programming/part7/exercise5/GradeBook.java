package com.learn.java_programming.part7.exercise5;

import java.util.ArrayList;

public class GradeBook {
    private ArrayList<Integer> grades;
    public GradeBook() {
        this.grades = new ArrayList<>();
    }
    public void addGrade(int gradeToAdd) {
        if (gradeToAdd >= 0 && gradeToAdd <= 100) this.grades.add(gradeToAdd);
    }

    public double average() {
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public double average(int passingNum) {
        double sum = 0;
        int count = 0;
        for (int grade : this.grades) {
            if (grade >= passingNum) {
                sum += grade;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public double passingPercentage() {
        double count = 0;
        for (int grade : this.grades) {
            if (grade >= 50) count++;
        }
        return 100 * (count / this.grades.size());
    }

    private int gradeToPoints(int point) {
        if (point < 50) return 0;
        if (point < 60) return 1;
        if (point < 70) return 2;
        if (point < 80) return 3;
        if (point < 90) return 4;
        return 5;
    }

    private int[] gradeDistribution() {
        int[] distribution = new int[6];
        for (int grade : grades) {
            distribution[gradeToPoints(grade)]++;
        }
        return distribution;
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = gradeDistribution().length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeDistribution()[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
