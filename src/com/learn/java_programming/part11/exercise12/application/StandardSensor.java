package com.learn.java_programming.part11.exercise12.application;

public class StandardSensor implements Sensor {
    private int number;
    public StandardSensor(int number) {
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return number;
    }
}
