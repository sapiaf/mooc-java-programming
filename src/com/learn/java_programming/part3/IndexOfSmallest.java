package com.learn.java_programming.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) break;
            nums.add(num);
        }
        for (int num : nums) {
            if (num < min) min = num;
        }
        System.out.println("Smallest number: " + min);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == min) {
                System.out.println("Found at index: " + i);
            }
        }

    }

}
