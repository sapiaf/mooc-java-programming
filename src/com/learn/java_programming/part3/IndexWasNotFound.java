package com.learn.java_programming.part3;

import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        int[] array = {6, 2, 8, 1, 3, 0, 9, 7, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for?");
        int searchNum = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNum) {
                System.out.println(searchNum + " is at index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchNum + " was not found.");
        }
    }
}
