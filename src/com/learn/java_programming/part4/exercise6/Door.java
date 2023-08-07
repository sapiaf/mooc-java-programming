package com.learn.java_programming.part4.exercise6;

public class Door {
    public void knock(){
        System.out.println("Who's there?");
    }

    public static void main(String[] args) {
        Door porta = new Door();
        porta.knock();
    }
}
