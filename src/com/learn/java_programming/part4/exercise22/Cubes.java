package com.learn.java_programming.part4.exercise22;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("end")) break;
            int num = Integer.parseInt(word);
            System.out.println((int)Math.pow(num, 3));
        }
    }
}
