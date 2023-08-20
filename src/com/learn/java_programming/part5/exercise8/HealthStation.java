package com.learn.java_programming.part5.exercise8;

public class HealthStation {

    private static int counter = 0;
    public int weigh(Person person) {
        counter++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return counter;
    }
}
