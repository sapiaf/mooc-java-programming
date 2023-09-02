package com.learn.java_programming.part8.exercise1;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("end")) break;

            int num = Integer.parseInt(word);
            System.out.println(num * num * num);

        }
    }
}
