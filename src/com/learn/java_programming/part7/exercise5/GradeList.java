package com.learn.java_programming.part7.exercise5;

import java.util.ArrayList;

public class GradeList {
    private ArrayList<Integer> grades;

    public GradeList() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) grades.add(grade);
    }
    public double average() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public double average(int passingNum) {
        double sum = 0;
        for (int grade : grades) {
            if (grade >= passingNum) {
                sum += grade;
            }
        }
        return sum == 0 ? 0 : sum / grades.size();
    }
    public double passingPercentage(int passingNum) {
        double count = 0;
        for (int grade : grades) {
            if (grade >= passingNum) count++;
        }
        return 100 * (count / grades.size());
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
