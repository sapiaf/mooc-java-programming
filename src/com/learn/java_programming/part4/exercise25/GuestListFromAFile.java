package com.learn.java_programming.part4.exercise25;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner scanner1 = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise25/" + fileName))) {
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();
                if (line.isEmpty()) continue;
                list.add(line);
            }
        } catch (NoSuchFileException noSuchFileException) {
            System.out.println("Error: The file " + fileName + " was not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            if (list.contains(name)) System.out.println("The name is on the list.");
            else System.out.println("The name is not on the list.");
        }
    }
}
