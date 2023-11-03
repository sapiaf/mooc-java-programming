package com.learn.java_programming.part11.exercise12.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> integers;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.integers = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException();
        }

        double average = sensors.stream()
                .mapToInt(Sensor::read)
                .average()
                .orElseThrow(IllegalStateException::new);

        int roundedAverage = (int) Math.floor(average);
        integers.add(roundedAverage);

        return roundedAverage;
    }
    public List<Integer> readings() {

        return integers;

    }
}
