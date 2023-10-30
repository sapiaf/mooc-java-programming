package com.learn.java_programming.part10.exercise12;

import com.learn.java_programming.part10.exercise11.Human;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> humans = new ArrayList<>();
        humans.add(new Student("John"));
        humans.add(new Student("Carlo"));
        humans.add(new Student("Andrea"));
        humans.add(new Student("Francesco"));
        humans.add(new Student("Samuel"));
        humans.add(new Student("Mirko"));
        humans.add(new Student("Francesco"));

        System.out.println(humans);
        Collections.sort(humans);
        System.out.println(humans);
    }
}
