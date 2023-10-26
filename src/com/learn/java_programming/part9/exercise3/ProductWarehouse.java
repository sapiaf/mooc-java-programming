package com.learn.java_programming.part9.exercise3;

public class ProductWarehouse extends Warehouse{
    private String name;
    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  getName() + ": balance = " + super.getBalance() +", space left " + super.howMuchSpaceLeft();
    }
}
