package com.learn.java_programming.part4.exercise29;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("filename: ");
        String file = scanner.nextLine();
        ArrayList<Person> persons = readRecordsFromFile(file);
        System.out.println("Persons: " + persons.size());
        System.out.println("Persons:");
        for (Person person : persons) {
            System.out.println(person);
        }

    }
    private static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner sc = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise29/" + file))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.isEmpty()) continue;
                String[] splitted = line.split(",");
                String name = splitted[0];
                int age = Integer.parseInt(splitted[1]);
                Person person = new Person(name, age);
                persons.add(person);
            }
        } catch (NoSuchFileException noSuchFileException) {
            System.out.println("file " + file + " not found");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return persons;
    }
}
