package com.learn.java_programming.part4.exercise15;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }
    public int sum() {
        return this.sum;
    }
    public int getCount() {
        return this.count;
    }
    public double average() {
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
