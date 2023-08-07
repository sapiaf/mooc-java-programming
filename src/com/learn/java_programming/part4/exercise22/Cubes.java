package com.learn.java_programming.part4.exercise22;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String num = scanner.nextLine();
            if (num.equalsIgnoreCase("end")) break;
            int numero = Integer.parseInt(num);
            System.out.println((int)Math.pow(numero, 3));
        }
    }
}
