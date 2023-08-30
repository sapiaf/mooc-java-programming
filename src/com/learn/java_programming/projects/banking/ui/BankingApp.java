package com.learn.java_programming.projects.banking.ui;

import com.learn.java_programming.projects.banking.model.Bank;
import com.learn.java_programming.projects.banking.util.InputUtility;
public class BankingApp {
    private Bank bank;

    public BankingApp() {
        this.bank = new Bank();
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = InputUtility.readInt();
            handleChoice(choice);
        }
    }

    private void displayMenu() {
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Print Statement");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private void handleChoice(int choice) {
        outerSwitch:
        // This is the label for the outer switch
        switch (choice) {
            case 1:
                while (true) {
                    System.out.println("1. Create Saving Account");
                    System.out.println("2. Create Current Account");
                    System.out.println("3. Exit");
                    int choiceOne = InputUtility.readInt();
                    switch (choiceOne) {
                        case 1:
                            // Logic for creating saving account
                            break;
                        case 2:
                            // Logic for creating current account
                            break;
                        case 3:
                            break outerSwitch; // This will break out of the outer switch as well

                    }
                }
            case 2:
                while (true) {
                    // I believe you had the wrong menu here, correct it as per your requirements
                    System.out.println("Menu for Deposit option");
                    int choiceTwo = InputUtility.readInt();
                    // Handle choiceTwo as needed
                }

            case 3:
                while (true) {
                    // I believe you had the wrong menu here, correct it as per your requirements
                    System.out.println("Menu for Withdraw option");
                    int choiceThree = InputUtility.readInt();
                    // Handle choiceThree as needed
                }
            case 4:
                // Logic to print statement
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    }