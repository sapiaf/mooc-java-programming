package com.learn.java_programming.part6.exercise8;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return getName() + " (" + getWeight() + " kg)";
    }
}
