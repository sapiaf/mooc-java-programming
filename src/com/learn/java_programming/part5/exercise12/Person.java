package com.learn.java_programming.part5.exercise12;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;
        Person comparedPerson = (Person) object;
        return comparedPerson.name.equalsIgnoreCase(this.name) &&
                comparedPerson.birthday.equals(this.birthday) &&
                comparedPerson.height == this.height &&
                comparedPerson.weight == this.weight;

    }
}
