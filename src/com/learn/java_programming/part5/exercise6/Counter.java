package com.learn.java_programming.part5.exercise6;

public class Counter {
    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter() {
        this(0);
    }

    public int getStartValue() {
        return this.startValue;
    }

    public void increase() {
        this.startValue++;
    }
    public void increase(int amount) {
        if (amount > 0) this.startValue += amount;
    }
    public void decrease() {
        this.startValue--;
    }
    public void decrease(int amount) {
        if (amount > 0) this.startValue -= amount;
    }
}
