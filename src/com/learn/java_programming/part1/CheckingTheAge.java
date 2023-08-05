package com.learn.java_programming.part1;

import java.util.Scanner;

public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you");
        int answer = Integer.valueOf(scanner.nextLine());
        if (answer <= 120 && answer > 0) {
            System.out.println("ok");
        } else {
            System.out.println("impossible");
        }
    }
}
