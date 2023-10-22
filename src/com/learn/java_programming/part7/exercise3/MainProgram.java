package com.learn.java_programming.part7.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        try {
            MainProgram.sort(numbers);
            System.out.println(Arrays.toString(numbers));
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
    public static int indexOfSmallest(int[] array){
        checkArray(array);
        int index = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                index = i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        checkIndex(table, startIndex);
        int min = table[startIndex];
        int index = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
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
