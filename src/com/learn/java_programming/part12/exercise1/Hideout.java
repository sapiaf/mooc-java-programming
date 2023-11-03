package com.learn.java_programming.part12.exercise1;

import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> list;

    public Hideout() {
        this.list = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (!list.isEmpty()) list.clear();
        list.add(toHide);
    }
    public T takeFromHideout() {
        T value = list.get(0);
        list.clear();
        return value;
    }
    public boolean isInHideout() {
        return !list.isEmpty();
    }
}
