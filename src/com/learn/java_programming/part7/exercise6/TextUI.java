package com.learn.java_programming.part7.exercise6;

import java.util.Scanner;

public class TextUI {
    private RecipeBook recipeBook;
    private Scanner scanner;

    public TextUI(RecipeBook recipeBook, Scanner scanner) {
        this.recipeBook = recipeBook;
        this.scanner = scanner;
    }
    public void start() {
        showOptions();
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break;
                case "list":
                    System.out.println("Recipes:");
                    recipeBook.printRecipeBook();
                    break;
                case "find name":
                    System.out.print("Search word: ");
                    String name = scanner.nextLine();
                    recipeBook.printByName(name);
                    break;
                case "find cooking time":
                    System.out.print("Search word: ");
                    int time = Integer.parseInt(scanner.nextLine());
                    recipeBook.printByTime(time);
                    break;
                case "find ingredient":
                    System.out.print("Search word: ");
                    String ingredient = scanner.nextLine();
                    recipeBook.printByIngredient(ingredient);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
    private void showOptions() {
        System.out.println("Commands:" + "\n"
                + "list - list the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
    }
}
