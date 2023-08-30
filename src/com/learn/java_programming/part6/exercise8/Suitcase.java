package com.learn.java_programming.part6.exercise8;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) items.add(item);
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public Item sort() {
        Item heaviest = heaviestItem();
        items.remove(heaviest);
        return heaviest;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) return "0 items (0 kg)";
        String isPlural = items.size() == 1 ? "item" : "items";
        return items.size() + " " + isPlural + " (" + totalWeight() + " kg)";
    }
}
