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
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    return;
                case "add":
                    System.out.println("Word: ");
                    String wordToTranslate = scanner.nextLine();
                    System.out.println("Translation: ");
                    String translatedWord = scanner.nextLine();
                    dictionary.add(wordToTranslate, translatedWord);
                    break;
                case "search":
                    System.out.println("To be translated: ");
                    String searchedWord = scanner.nextLine();
                    String translation = dictionary.translate(searchedWord);
                    System.out.println(translation != null ? "Translation: " + translation : "Word " + searchedWord + " was not found");
                    break;
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
        }
    }
}