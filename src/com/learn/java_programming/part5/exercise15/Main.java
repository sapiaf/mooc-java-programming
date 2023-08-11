package com.learn.java_programming.part5.exercise15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Item> lista = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            System.out.println("Name? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) break;
            Item item = new Item(name, identifier);
            if (!(lista.contains(item))) lista.add(item);
        }

        System.out.println("==Items==");
        for (Item item : lista) {
            System.out.println(item);
        }
    }
}
