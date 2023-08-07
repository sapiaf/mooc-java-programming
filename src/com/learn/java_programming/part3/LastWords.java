package com.learn.java_programming.part3;

import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            String[] splitted = str.split(" ");
            System.out.println(splitted[splitted.length - 1]);
            System.out.println("Length: " + splitted.length);
        }

    }
}
