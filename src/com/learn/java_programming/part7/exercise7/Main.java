package com.learn.java_programming.part7.exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdList birdList = new BirdList();
        UserInterface userInterface = new UserInterface(birdList, scanner);
        userInterface.start();

    }
}
