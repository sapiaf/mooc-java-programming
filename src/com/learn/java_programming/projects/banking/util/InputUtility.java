package com.learn.java_programming.projects.banking.util;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputUtility {
    private static final Scanner scanner = new Scanner(System.in);

    public static BigDecimal readBigDecimal() {
        while (true) {
            try {
                return new BigDecimal(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static String readString() {
        return scanner.nextLine();
    }

    public static int readInt() {
        return Integer.parseInt(scanner.nextLine());
    }
}
