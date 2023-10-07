package com.learn.java_programming.part8.recap;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("end")) break;
            System.out.println((int) Math.pow(Integer.parseInt(word), 3));
        }
    }
}
