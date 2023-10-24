package com.learn.java_programming.part9.exercise2;

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tsalary " + salary + " euro/month";
    }
}
