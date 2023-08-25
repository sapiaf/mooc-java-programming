package com.learn.java_programming.projects.banking.model;

public class Customer implements Printable {
    private final String name;
    private final Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public void printStatement() {
        System.out.println("Account Statement: \n" + "Name: " + name + "\n" + account.toString());
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

}
