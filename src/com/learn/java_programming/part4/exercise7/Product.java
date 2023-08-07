package com.learn.java_programming.part4.exercise7;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", Price " + this.price + ", " + this.quantity + " pcs" );
    }

    public static void main(String[] args) {
        Product prodotto = new Product("Banana", 10, 3);
        prodotto.printProduct();
    }
}
