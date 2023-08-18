package com.learn.java_programming.part3;

import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String sentence = scanner.nextLine();

            if (sentence.isEmpty()) break;

            String[] splitted = sentence.split(" ");

            for (String word : splitted) {
                if (word.contains("av")) System.out.println(word);
            }

        }

    }
}
