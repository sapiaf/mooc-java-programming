package com.learn.java_programming.part4.exercise24;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise24/" + fileName))) {
            while (scanner2.hasNextLine()) {
                String row = scanner2.nextLine();
                System.out.println(row);
            }
        } catch (NoSuchFileException nsfe) {
            System.out.println("Error: The file " + fileName + " was not found.");
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
