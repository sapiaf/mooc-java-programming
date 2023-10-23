package com.learn.java_programming.part7.exercise7;

import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> birds;
    public BirdList() {
        this.birds = new ArrayList<>();
    }
    public void add(Bird bird) {
        birds.add(bird);
    }
    public void print() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    public boolean print(String birdName) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(birdName)) {
                System.out.println(bird);
                return true;
            }
        }
        System.out.println("Not a bird!");
        return false;
    }
    public void addObservation(String birdName) {
        boolean found = false;
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(birdName)) {
                bird.addObservation();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }
}
