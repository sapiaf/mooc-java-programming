package com.learn.java_programming.part9.exercise6;

import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> content;
    private double capacity;

    public Box(double capacity) {
        this.content = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable packable) {
        if (weight() + packable.weight() <= capacity) {
            content.add(packable);
        }
    }

    @Override
    public double weight() {
        double total = 0;
        for (Packable item : content) {
            total += item.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + content.size() + " items, total weight " + weight() + " kg";
    }
}
