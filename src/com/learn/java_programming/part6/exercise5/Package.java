package com.learn.java_programming.part6.exercise5;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    public int totalWeight() {
        int sum = 0;
        for (Gift gift : gifts) {
            sum += gift.getWeight();
        }
        return sum;
    }
}
