package com.learn.java_programming.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomi = new ArrayList<>();
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("")){
                break;
            }
            nomi.add(nome);
        }
        System.out.println(nomi.get(2));
    }
}
