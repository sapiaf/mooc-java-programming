package com.learn.java_programming.part6.exercise2;

import java.util.ArrayList;
public class Stack {
    private ArrayList<String> lista;
    public Stack() {this.lista = new ArrayList<>();}
    public boolean isEmpty() {
        return this.lista.isEmpty();
    }
    public void add(String value) {
        this.lista.add(value);
    }
    public ArrayList<String> values() {
        return this.lista;
    }
    public String take() {
        String lastEl = lista.get(lista.size() - 1);
        lista.remove(lista.size() - 1);
        return lastEl;
    }
}
