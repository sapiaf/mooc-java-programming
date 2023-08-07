package com.learn.java_programming.part3;

import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int max = Integer.MIN_VALUE;
        String nome = "";
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            String[] nomi = name.split(",");
            if (Integer.parseInt(nomi[1]) > max) {
                max = Integer.parseInt(nomi[1]);
                nome = nomi[0];
            }
        }
        System.out.println("Name of the oldest: " + nome);
    }
}
