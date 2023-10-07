package com.learn.java_programming.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            nums.add(num);
        }

        System.out.println("Search for: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == num) System.out.println(num + " is at index " + i);
        }


    }
}
