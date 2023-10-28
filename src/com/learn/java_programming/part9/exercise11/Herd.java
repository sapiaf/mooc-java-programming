package com.learn.java_programming.part9.exercise11;

import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> movables;
    public Herd() {
        this.movables = new ArrayList<>();
    }
    public void addToHerd(Movable movable) {
        movables.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Movable movable : movables) {
            stringBuilder.append(movable).append("\n");
        }
        return stringBuilder.toString();
    }
}
