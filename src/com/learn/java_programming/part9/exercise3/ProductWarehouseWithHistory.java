package com.learn.java_programming.part9.exercise3;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }
    public String history() {
        return changeHistory.toString();
    }
    public void addToWarehouse(double amount) {
        double newBalance = super.getBalance() + amount;
        super.addToWarehouse(amount);
        changeHistory.add(newBalance);
    }

    public double takeFromWarehouse(double amount) {
        double newBalance = super.getBalance() - amount;
        double actualAmountTaken = super.takeFromWarehouse(amount);
        changeHistory.add(newBalance);
        return actualAmountTaken;
    }

    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + changeHistory);
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product:" + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }
}
