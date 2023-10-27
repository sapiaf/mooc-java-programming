package com.learn.java_programming.part9.exercise10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return products.getOrDefault(product, -99);
    }
    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }
    public Set<String> products() {
        return products.keySet();
    }
    public boolean take(String product) {
        if (stock(product) > 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false;
    }
}
