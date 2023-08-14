package com.learn.java_programming.part6.exercise10;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> list;

    public ToDoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void remove(int index) {
        list.remove(index - 1);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            int index = i + 1;
            System.out.println(index + ": " + list.get(i));
        }
    }

}
