package com.learn.java_programming.part10.exercise16;

public class Person {
    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
    private String name;
    private Education education;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    @Override
    public String toString() {
        return name + ", " + education;
    }

    public String getName() {
        return name;
    }

    public Education getEducation() {
        return education;
    }
}
