package com.learn.java_programming.part6.exercise7;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }
    public void add(Person person) {
        this.people.add(person);
    }
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    public Person shortest() {
        if (isEmpty()) return null;

        Person shortest = this.people.get(0);

        for (Person person : this.people) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    public Person take() {
        if (isEmpty()) return null;
        Person shortestPerson = shortest();
        this.people.remove(shortestPerson);
        return shortestPerson;
    }
}
