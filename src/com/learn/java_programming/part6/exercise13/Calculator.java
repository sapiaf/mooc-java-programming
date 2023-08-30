package com.learn.java_programming.part6.exercise13;

public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int number) {
        this.value = this.value + number;
    }

    public void subtract(int number) {
        this.value = this.value - number;
    }

    public int getValue() {
        return this.value;
    }
}
