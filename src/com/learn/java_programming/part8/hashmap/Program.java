package com.learn.java_programming.part8.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
        // Test your program here!

    }
    public static void printKeys(HashMap<String,String> hashmap) {
        Set<String> keys = hashmap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        Set<String> keys = hashmap.keySet();
        for (String key : keys) {
            if (key.contains(text)) System.out.println(key);
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        Set<String> keys = hashmap.keySet();
        for (String key : keys) {
            if (key.contains(text)) System.out.println(hashmap.get(key));
        }
    }
}

