package com.learn.java_programming.part2;

public class StarSign {
    public static void main(String[] args) {
        printStars(-1);
    }
    public static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
         System.out.println();
    }
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
        System.out.println();
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
        System.out.println();
    }
    public static void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            printStars(i);
        }
        System.out.println();
    }
}
