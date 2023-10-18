package com.learn.java_programming.part2;

public class AdvancedAstrology {
    public static void main(String[] args) {
        christmasTree(6);
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }
    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i);
            printStars(i - 1);
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
            System.out.println();

        }
    }

}
