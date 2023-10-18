package com.learn.java_programming.part5.exercise9;

public class PaymentCard {
    private double balance;
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    public double balance() {
        return this.balance;
    }
    public void addMoney(double increase) {
        this.balance += increase;
    }
    public boolean takeMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
