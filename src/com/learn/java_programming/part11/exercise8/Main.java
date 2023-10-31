package com.learn.java_programming.part11.exercise8;

import com.learn.java_programming.part11.exercise8.logic.ApplicationLogic;
import com.learn.java_programming.part11.exercise8.ui.TextInterface;
import com.learn.java_programming.part11.exercise8.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
