package com.learn.java_programming.part4.exercise1;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false; // insufficient funds
        } else {
            this.balance -= amount;
            return true; // withdrawal successful
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return this.accountName + ", balance: " + this.balance;
    }
}
