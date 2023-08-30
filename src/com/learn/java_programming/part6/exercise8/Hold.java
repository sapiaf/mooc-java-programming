package com.learn.java_programming.part6.exercise8;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) suitcases.add(suitcase);
    }

    public int totalWeight() {
        int sum = 0;
        for (Suitcase suitcase : suitcases) {
            sum += suitcase.totalWeight();
        }
        return sum;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
