package com.learn.java_programming.part9.exercise12;

public class Cat extends Animal implements NoiseCapable{
    public Cat(String name) {
        super(name);
    }
    public Cat() {
        super("Cat");
    }
    private void purr() {
        System.out.println(getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
