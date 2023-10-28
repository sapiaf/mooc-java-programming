package com.learn.java_programming.part9.exercise12;

public class Dog extends Animal implements NoiseCapable{
    public Dog(String name) {
        super(name);
    }
    public Dog() {
        super("Dog");
    }
    private void bark() {
        System.out.println(getName() + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
