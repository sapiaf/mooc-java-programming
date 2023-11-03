package com.learn.java_programming.part12.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> list;
    public Pipe() {
        this.list = new ArrayList<>();
    }
    public void putIntoPipe(T value) {
        list.add(value);
    }
    public T takeFromPipe() {
        if (list.isEmpty()) return null;
        T last = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return last;
    }
    public boolean isInPipe() {
        return !list.isEmpty();
    }
}
