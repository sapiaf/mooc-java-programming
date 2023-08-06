package com.learn.java_programming.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            nums.add(num);
        }
        System.out.println(nums.get(1) + nums.get(2));
    }
}
