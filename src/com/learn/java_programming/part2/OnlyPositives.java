package com.learn.java_programming.part2;

import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            System.out.println(input < 0 ? "Unsuitable number" : input * input);
        }
    }
}
