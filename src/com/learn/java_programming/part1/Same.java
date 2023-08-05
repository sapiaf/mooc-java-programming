package com.learn.java_programming.part1;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        if (first.equalsIgnoreCase(second)){
            System.out.println("same");
        } else{
            System.out.println("different");
        }
    }
}
