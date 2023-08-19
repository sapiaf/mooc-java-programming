package com.learn.java_programming.part4.exercise27;

import java.nio.file.NoSuchFileException;
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
                String row = scanner2.nextLine();
                if (row.isEmpty()) continue;
                int num = Integer.parseInt(row);
                if (num >= lowerBound && num <= upperBound) counter++;
            }
            System.out.println("Numbers: " + counter);
        } catch (NoSuchFileException noSuchFileException) {
            System.out.println("file " + fileName + " not found");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
