package com.learn.java_programming.part10.exercise3;

import java.util.List;

public class PositiveNumbers {
    public static void main(String[] args) {

    }
    public static List<Integer> positive(List<Integer> numbers){
        return numbers.stream().filter(num -> num > 0).toList();
    }
}
