package com.learn.java_programming.part9.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }
    public static int returnSize(List<String> names) {
        return names.size();
    }
}
