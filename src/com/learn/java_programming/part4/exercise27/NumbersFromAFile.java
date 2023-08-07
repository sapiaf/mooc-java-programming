package com.learn.java_programming.part4.exercise27;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        System.out.println("Lower bound: ");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.println("Upper bound: ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        try (Scanner scanner2 = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise27/" + fileName))) {
            while (scanner2.hasNextLine()) {
                int row = Integer.valueOf(scanner2.nextLine());
                if (row >= lowerBound && row <= upperBound) counter++;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Reading the file " + fileName + " failed.");
            return;
        }

        System.out.println("Numbers: " + counter);
    }
}
