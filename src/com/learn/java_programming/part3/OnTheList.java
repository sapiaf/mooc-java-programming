package com.learn.java_programming.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> names = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }
        System.out.println("Search: ");
        String nameS = scanner.nextLine();

        if (names.contains(nameS)) System.out.println(nameS + " was found");
        else System.out.println(nameS + " wasn't found");
    }
}
