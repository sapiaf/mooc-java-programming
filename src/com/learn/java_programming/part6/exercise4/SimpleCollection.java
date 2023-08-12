package com.learn.java_programming.part6.exercise4;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String elementWord = this.elements.size() == 1 ? "element" : "elements";

        StringBuilder output = new StringBuilder("The collection " + this.name + " has " + this.elements.size() + " " + elementWord + ":\n");

        for (String element : this.elements) {
            output.append(element).append("\n");
        }
        return output.toString();
    }
}
