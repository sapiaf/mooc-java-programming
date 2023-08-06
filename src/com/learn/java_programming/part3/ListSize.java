package com.learn.java_programming.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomi = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            nomi.add(name);
        }

        System.out.println("In total: " + nomi.size());

    }
}
