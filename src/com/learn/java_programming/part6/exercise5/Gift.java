package com.learn.java_programming.part6.exercise5;

public class Gift {
    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return getName() + " (" + getWeight() + " kg)";
    }
}
