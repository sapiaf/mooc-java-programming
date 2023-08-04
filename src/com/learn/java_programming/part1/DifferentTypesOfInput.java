package com.learn.java_programming.part1;

import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String stringa = scanner.nextLine();
        System.out.println("Give an integer: ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double num2 = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean booleano = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave: " + stringa + " " + num +  " " + num2 + " " + booleano + ".");
    }
}
