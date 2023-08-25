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
        switch (choice) {
            case 1:
                // Logic to create account
                break;
            case 2:
                // Logic to deposit
                break;
            case 3:
                // Logic to withdraw
                break;
            case 4:
                // Logic to print statement
                break;
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
