package com.learn.java_programming.part7.exercise6;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeBook = new RecipeBook();
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        ArrayList<String> fileLines = new ArrayList<>();

        try (Scanner scanner1 = new Scanner(Paths.get(fileName))) {
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();
                if (line.isEmpty() || !scanner1.hasNextLine()) {
                    String recipeName = fileLines.get(0);
                    int preparationTime = Integer.parseInt(fileLines.get(1));
                    ArrayList<String> ingredientsList = new ArrayList<>();
                    for (int i = 2; i < fileLines.size(); i++) {
                        ingredientsList.add(fileLines.get(i));
                    }
                    recipeBook.addRecipe(new Recipe(recipeName, preparationTime, ingredientsList));
                    fileLines.removeAll(fileLines);
                } else {
                   fileLines.add(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file " + e.getMessage());
        }

        TextUI textUI = new TextUI(recipeBook, scanner);
        textUI.start();
    }
}
