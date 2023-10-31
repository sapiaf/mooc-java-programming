package com.learn.java_programming.part11.exercise8.logic;

import com.learn.java_programming.part11.exercise8.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface userInterface;

    public ApplicationLogic(UserInterface userInterface) {
        this.userInterface = userInterface;
    }
    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            userInterface.update();
        }
    }
}
