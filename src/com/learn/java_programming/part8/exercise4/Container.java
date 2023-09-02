package com.learn.java_programming.part8.exercise4;

public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }

    private boolean isValidAmount(int amount) {
        return amount > 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (isValidAmount(amount)) {
            this.amount = Math.min(this.amount + amount, 100);
        }
    }

    public void remove(int amount) {
        if (isValidAmount(amount)) {
            this.amount = Math.max(this.amount - amount, 0);
        }
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }
}
