package com.learn.java_programming.part11.exercise12.application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        if (!isOn) isOn = true;
    }

    @Override
    public void setOff() {
        if (isOn) isOn = false;
    }

    @Override
    public int read() {
        Random random = new Random();
        if (isOn()) {
            return random.nextInt(-30,30);
        } else throw new IllegalStateException();
    }
}
