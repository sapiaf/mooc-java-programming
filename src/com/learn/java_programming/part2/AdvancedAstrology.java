package com.learn.java_programming.part2;

public class AdvancedAstrology {
    public static void main(String[] args) {
        printTree(4);
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle(int height) {
        for (int i = 0; i <= height; i++) {
            printSpaces(height - i);
            StarSign.printStars(i);
        }
    }
    public static void printTree(int height) {
        for (int i = 0; i <= height; i++) {
            printSpaces(height - i);
            StarSign.printStars(i + i - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            StarSign.printStars(3);
        }
    }
}
