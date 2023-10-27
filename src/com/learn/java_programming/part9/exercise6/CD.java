package com.learn.java_programming.part9.exercise6;

public class CD implements Packable {
    private String author;
    private String title;
    private int year;
    private double weight;

    public CD(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }
    @Override
    public String toString() {
        return this.author + ": " + this.title + " (" + this.year + ")";
    }

}
