package com.learn.java_programming.part6.exercise12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        JokeManager manager = new JokeManager();
        UserInterfacee user = new UserInterfacee(manager, scanner);
        user.start();
    }
}
