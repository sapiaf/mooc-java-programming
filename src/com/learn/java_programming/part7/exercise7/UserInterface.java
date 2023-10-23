package com.learn.java_programming.part7.exercise7;

import java.util.Scanner;

public class UserInterface {
    private BirdList birdList;
    private Scanner scanner;

    public UserInterface(BirdList birdList, Scanner scanner) {
        this.birdList = birdList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.isEmpty() || userChoice.equalsIgnoreCase("quit")) break;

            switch (userChoice) {
                case "add":
                    System.out.println("Name:");
                    String name = scanner.nextLine();
                    System.out.println("Latin Name:");
                    String latinName = scanner.nextLine();
                    birdList.add(new Bird(name, latinName));
                    break;
                case "observation":
                    System.out.println("Bird:");
                    String birdName = scanner.nextLine();
                    birdList.addObservation(birdName);
                    break;
                case "all":
                    birdList.print();
                    break;
                case "one":
                    System.out.println("Bird:");
                    String chosenBird = scanner.nextLine();
                    birdList.print(chosenBird);
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
    }
}
