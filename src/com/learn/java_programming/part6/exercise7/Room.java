package com.learn.java_programming.part6.exercise7;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }
    public boolean isEmpty() {
        return people.isEmpty();
    }

    public void add(Person person) {
        people.add(person);
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if (isEmpty()) return null;
        Person dwarf = people.get(0);
        for (Person person : getPersons()) {
            if (person.getHeight() < dwarf.getHeight()) dwarf = person;
        }
        return dwarf;
    }
    public Person take() {
        Person dwarf = shortest();
        if (dwarf != null) people.remove(dwarf);
        return dwarf;
    }
}
