package com.learn.java_programming.part11.exercise11;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private List<Integer> numbers;

    public Statistics() {
        this.numbers = new ArrayList<>();

    }

    public void add(int number) {
        this.numbers.add(number);
    }
    public double average() {
        if (this.numbers.isEmpty()) {
            return 0.0;
        }
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
