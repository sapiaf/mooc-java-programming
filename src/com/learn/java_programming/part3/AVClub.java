package com.learn.java_programming.part3;

import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            String[] splitted = str.split(" ");
            for (String string : splitted) {
                if (string.contains("av")) {
                    System.out.println(string);
                }
            }
        }

    }
}
