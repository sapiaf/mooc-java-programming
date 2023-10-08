package com.learn.java_programming.part8.recap.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> list;
    public TodoList() {
        this.list = new ArrayList<>();
    }
    public void add(String task) {
        list.add(task);
    }
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ": " + list.get(i));
        }
    }
    public void remove(int number) {
        list.remove(number - 1);
    }

    public static void main(String[] args) {
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();
    }


}
