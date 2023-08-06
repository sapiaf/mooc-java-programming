package com.learn.java_programming.part2;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers");
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            sum += value;
            if (value == - 1) {
                break;
            }
            count++;
            if (value % 2 == 0) {
                even++;
            } else odd++;
        }
        System.out.println("Thanks Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + (double)sum/count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
