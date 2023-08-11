package com.learn.java_programming.part5.exercise15;

public class Item {
    private String name;
    private String identifier;
    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item converted = (Item) obj;
        if (this.name.equals(converted.name) && this.identifier.equals(converted.identifier)) return true;
        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
