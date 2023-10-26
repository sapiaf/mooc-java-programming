package com.learn.java_programming.part9.exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> historyList;

    public ChangeHistory() {
        this.historyList = new ArrayList<>();
    }
    public void add(double status) {
        historyList.add(status);
    }
    public void clear() {
        historyList.clear();
    }
    public double maxValue() {
        if (historyList.isEmpty()) return 0;
        return Collections.max(historyList);
    }
    public double minValue() {
        if (historyList.isEmpty()) return 0;
        return Collections.min(historyList);
    }
    public double average() {
        if (historyList.isEmpty()) return 0;
        double sum = 0;
        for (double num : historyList) {
            sum += num;
        }
        return sum / historyList.size();
    }
    @Override
    public String toString() {
        return historyList.toString();
    }
}
