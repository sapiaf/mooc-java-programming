package com.learn.java_programming.part4.exercise26;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> list = new ArrayList<>();
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        System.out.println("Search for: ");
        String str = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise25/" + fileName))) {
            while (scanner2.hasNextLine()) {
                String row = scanner2.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Reading the file " + fileName + " failed.");
            return;
        }

            if (list.contains(str)) System.out.println("Found!");
            else System.out.println("Not Found!");
    }
}
