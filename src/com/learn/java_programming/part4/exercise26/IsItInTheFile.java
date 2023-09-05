package com.learn.java_programming.part4.exercise26;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = sc.nextLine();
        System.out.println("Search for: ");
        String name = sc.nextLine();
        boolean found = false;

        try (Scanner scanner = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise26/" + fileName))) {
            while (scanner.hasNext()) {
                if (scanner.nextLine().equalsIgnoreCase(name)) {
                    found = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }

    }
}
