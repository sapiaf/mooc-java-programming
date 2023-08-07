package com.learn.java_programming.part4.exercise28;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner sc = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise28/" + fileName))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int year = Integer.parseInt(parts[1]);
                System.out.println(name + ", age: " + year + " year.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
