package com.learn.java_programming.part4.exercise9;

public class Debt {
    private double initialBalance;
    private double initialInterestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.initialBalance = initialBalance;
        this.initialInterestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.initialBalance);
    }

    public void waitOneYear() {
        this.initialBalance = this.initialBalance * this.initialInterestRate;
    }

    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 1.20);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
