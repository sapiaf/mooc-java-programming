package com.learn.java_programming.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyTheseNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            nums.add(num);
        }
        int max = Integer.MIN_VALUE;
        for (int number : nums) {
            if (number > max) max = number;
        }
        System.out.println("The greatest number: " + max);
    }
}
