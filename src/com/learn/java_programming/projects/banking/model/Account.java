package com.learn.java_programming.projects.banking.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Account {
    private BigDecimal balance;
    private LocalDate creationDate;
    private String accountId;

    public Account(BigDecimal balance, LocalDate creationDate, String accountId) {
        this.balance = balance;
        this.creationDate = creationDate;
        this.accountId = accountId;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }


    public LocalDate getCreationDate() {
        return creationDate;
    }

    public String getAccountId() {
        return accountId;
    }

    // METHODS
    public abstract boolean deposit(BigDecimal amount);

    public abstract boolean withdraw(BigDecimal amount) throws InsufficientFundsException;


    @Override
    public String toString() {
        return "Account Details:\n" +
                "Balance: " + balance + "\n" +
                "Creation Date: " + creationDate + "\n" +
                "Account ID: " + accountId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Account account = (Account) object;
        return accountId.equalsIgnoreCase(account.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }
}
