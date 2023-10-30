package com.learn.java_programming.part10.exercise12;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareToIgnoreCase(o.getName());
//        Ordine inverso
//        return o.getName().compareTo(this.name);
    }
}
