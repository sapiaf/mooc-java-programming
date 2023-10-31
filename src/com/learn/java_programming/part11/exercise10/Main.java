package com.learn.java_programming.part11.exercise10;

import com.learn.java_programming.part11.exercise10.logic.FlightControl;
import com.learn.java_programming.part11.exercise10.ui.TextUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightControl testFC = new FlightControl();
        Scanner sc = new Scanner(System.in);
        TextUI ui = new TextUI(testFC, sc);
        ui.start();
    }
}
