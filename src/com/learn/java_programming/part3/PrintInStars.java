package com.learn.java_programming.part3;

public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            for (int j = 0; j < index; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
