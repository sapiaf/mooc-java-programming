package com.learn.java_programming.part12.exercise8;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] twoDimensionalArray = new int[rows][columns];

        System.out.println(twoDimensionalArray.length);
        System.out.println("row, column, value");
        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int column = 0; column < twoDimensionalArray[row].length; column++) {
                int value = twoDimensionalArray[row][column];
                System.out.println("" + row + ", " + column + ", " + value);
            }
        }
    }
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        // Tests whether the number is already among the randomized numbers
        return numbers.contains(number);
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the randomization of the numbers by using the method containsNumber() here
        Random random = new Random();
        while (numbers.size() != 7) {
            int randomNum = random.nextInt(40) + 1;
            if (!containsNumber(randomNum)) numbers.add(randomNum);
        }
    }
    public boolean equals(Object other) {
        return false;
    }
}
