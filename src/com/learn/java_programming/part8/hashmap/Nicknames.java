package com.learn.java_programming.part8.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        Set<String> keys = nicknames.keySet();
        for (String name : keys) {
            System.out.println(name + "'s nickname is " + nicknames.get(name));
        }
    }
}
