package com.learn.java_programming.part2;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
