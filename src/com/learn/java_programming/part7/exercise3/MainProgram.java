package com.learn.java_programming.part7.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 8};
        try {
            System.out.println("Original array: " + Arrays.toString(numbers));

            System.out.println("\nFinding the smallest value in the array:");
            System.out.println("Smallest: " + MainProgram.smallest(numbers));

            System.out.println("\nFinding the index of the smallest value in the array:");
            System.out.println("Smallest Index: " + MainProgram.indexOfSmallest(numbers));

            System.out.println("\nFinding the index of the smallest value from index 1 onwards:");
            System.out.println("Smallest Index from 1: " + MainProgram.indexOfSmallestFrom(numbers, 2));

            System.out.println("\nSwapping elements at index 1 and 0:");
            MainProgram.swap(numbers, 1, 0);
            System.out.println("After swap: " + Arrays.toString(numbers));

            System.out.println("\nSwapping elements at index 0 and 3:");
            MainProgram.swap(numbers, 0, 3);
            System.out.println("After swap: " + Arrays.toString(numbers));

            System.out.println("\nSorting the array using selection sort:");
            MainProgram.sort(numbers);
            System.out.println("Sorted array: " + Arrays.toString(numbers));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkArray(int[] array) {
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array can't be empty.");
    }

    private static void checkIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) throw new IllegalArgumentException("Index out of bounds.");
    }
    public static int smallest(int[] array){
        checkArray(array);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        checkArray(array);
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) index = i;
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        checkArray(array);
        checkIndex(array, startIndex);
        int index = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[index]) index = i;
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        checkArray(array);
        checkIndex(array, index1);
        checkIndex(array, index2);
        int temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;
    }

    public static void sort(int[] array) {
        checkArray(array);
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
