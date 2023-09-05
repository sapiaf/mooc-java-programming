package com.learn.java_programming.part4.exercise25;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Name of the file: ");
        String fileName = sc.nextLine();

        try (Scanner scanner = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise25/" + fileName))) {
            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                names.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        while (true) {
            System.out.println("Enter names, an empty line quits.");
            String name = sc.nextLine().toLowerCase();
            if (name.isEmpty()) break;
            if (names.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

    }
}
