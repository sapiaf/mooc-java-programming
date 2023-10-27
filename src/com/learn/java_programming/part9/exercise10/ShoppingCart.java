package com.learn.java_programming.part9.exercise10;

import com.learn.java_programming.part5.exercise5.Product;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    public void add(String product, int price) {
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
        } else {
            items.put(product, new Item(product, 1, price));
        }
    }
    public void print() {
        for (Item product : items.values()) {
            System.out.println(product);
        }
    }
    public int price() {
        int total = 0;
        for (Item product : items.values()) {
            total += product.price();
        }
        return total;
    }
}
