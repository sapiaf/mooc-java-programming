package com.learn.java_programming.part6.exercise8;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        if (name == null || name.isEmpty()) throw new RuntimeException("Error");
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
