package com.learn.java_programming.part4.exercise25;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise25/" + fileName))) {
            while (scanner2.hasNextLine()) {
                String row = scanner2.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Please make sure the file name is correct and try again.");
            return;
        }

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) break;
            if (list.contains(str)) System.out.println("The name is on the list.");
            else System.out.println("The name is not on the list.");
        }
        System.out.println("Thank you!");
    }
}
