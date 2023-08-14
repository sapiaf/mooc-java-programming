package com.learn.java_programming.part6.exercise9;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine().toLowerCase();
                System.out.println("Translation: ");
                String translatedWord = scanner.nextLine().toLowerCase();
                dictionary.add(word, translatedWord);
                System.out.println("Word added successfully!");
                continue;
            } else if (command.equalsIgnoreCase("search")) {
                System.out.println("To be translated: ");
                String wordToSearch = scanner.nextLine();
                String translation = dictionary.translate(wordToSearch.toLowerCase());
                if (translation == null) {
                    System.out.println("Word " + wordToSearch + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
