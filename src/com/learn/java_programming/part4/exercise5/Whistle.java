package com.learn.java_programming.part4.exercise5;

public class Whistle {
        private String sound;
        public Whistle(String whistleSound) {
            this.sound = whistleSound;
        }
        public void sound() {
            System.out.println(sound);
        }

    public static void main(String[] args) {
        Whistle canarino = new Whistle("Booooo");
        canarino.sound();
    }
}
