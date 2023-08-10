package com.learn.java_programming.part5.exercise1;

public class ClockHand {
    private int value;
    private final int limit;

    public ClockHand(int limit) {
        this.value = 0;
        this.limit = limit;
    }
    public void advance() {
        this.value++;
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (this.value < 10) return "0" + this.value;
        return String.valueOf(this.value);
    }
}
