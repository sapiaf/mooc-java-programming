package com.learn.java_programming.part12.exercise6;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int userNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < userNum; i++) {
            System.out.println(random.nextInt(0, 10));
        }
    }
}
