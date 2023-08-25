package com.learn.java_programming.projects.banking.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;
    private Map<String, Customer> customers;

    public Bank() {
        this.accounts = new HashSet<>();
        this.customers = new HashMap<>();
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public Map<String, Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(String accountId) {
        if (customers.containsKey(accountId)) return customers.get(accountId);
        return null;
    }

    public Account getAccount(String accountId) {
        for (Account account : accounts) {
            if (account.getAccountId().equalsIgnoreCase(accountId)) {
                return account;
            }
        }
        return null;
    }


    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addCustomer(Customer customer) {
        String accountId = customer.getAccount().getAccountId();
        customers.put(accountId, customer);
    }
}
