package com.learn.java_programming.part11.exercise10.domain;

public class Place {

    private String ID;

    public Place(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return this.ID;
    }
}
