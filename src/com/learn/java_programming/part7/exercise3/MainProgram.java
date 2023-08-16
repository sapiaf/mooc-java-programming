package com.learn.java_programming.part7.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }
    public static int indexOfSmallest(int[] array){
        int min = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) return i;
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int minIndex = startIndex;
        int min = table[startIndex];

        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {

        int swapping = array[index1];
        array[index1] = array[index2];
        array[index2] = swapping;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int min = indexOfSmallestFrom(array, i);
            swap(array, i, min);
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
