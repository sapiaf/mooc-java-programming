package com.learn.java_programming.part4.exercise21;

import java.util.List;
import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true) {
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("end")) break;
            count++;
        }
        System.out.println(count);
    }
}
