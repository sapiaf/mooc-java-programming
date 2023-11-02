package com.learn.java_programming.part10.exercise16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }
    public void add(Person personToAdd) {
        people.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            people.add(iterator.next());
        }
    }
    public void print() {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
    public void print(Education education) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                System.out.println(iterator.next());
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
