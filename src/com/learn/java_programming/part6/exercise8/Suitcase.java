package com.learn.java_programming.part6.exercise8;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() < this.maxWeight) {
            this.items.add(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) return null;
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) heaviest = item;
        }
        return heaviest;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getWeight();
        }
        return sum;
    }
    public String toString() {
        if (this.items.size() <= 0) return "no items (" + this.totalWeight()  + " kg)";
        if (this.items.size() == 1) return this.items.size() + " item (" + this.totalWeight()  + " kg)";
        return this.items.size() + " items (" + this.totalWeight()  + " kg)";
    }
}
