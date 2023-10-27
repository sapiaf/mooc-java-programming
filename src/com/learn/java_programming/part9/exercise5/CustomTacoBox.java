package com.learn.java_programming.part9.exercise5;

public class CustomTacoBox implements TacoBox{
    private int tacos;
    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos > 0) tacos--;
    }
}
