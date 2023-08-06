package com.learn.java_programming.part3;

public class PrintNeatly {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            System.out.print(num);
            if (i != array.length - 1) {
                System.out.print(",");
            }

        }
    }
}
