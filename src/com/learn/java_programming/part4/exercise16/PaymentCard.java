package com.learn.java_programming.part4.exercise16;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance = Math.min(this.balance + amount, 150);
        }
    }

    public void eatAffordably() {
        if (this.balance - 2.60 >= 0) this.balance -= 2.60;
    }

    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) this.balance -= 4.60;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
