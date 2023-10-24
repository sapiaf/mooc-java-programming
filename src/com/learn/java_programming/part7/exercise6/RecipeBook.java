package com.learn.java_programming.part7.exercise6;

import java.util.ArrayList;

public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void printRecipeBook() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void printByName(String name) {
        System.out.println("Recipes with the name '" + name + "':");
        for (Recipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void printByTime(int time) {
        System.out.println("Recipes with cooking time less than or equal to " + time + " minutes:");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void printByIngredient(String ingredient) {
        System.out.println("Recipes containing '" + ingredient + "':");
        for (Recipe recipe : recipes) {
            ArrayList<String> ingredients = recipe.getIngredients();
            for (String item : ingredients) {
                if (item.contains(ingredient)) {
                    System.out.println(recipe);
                    break;
                }
            }
        }
    }
}