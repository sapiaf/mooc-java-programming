package com.learn.java_programming.projects.banking.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CurrentAccount extends Account{
    private BigDecimal overdraftLimit;
    public CurrentAccount(BigDecimal balance, LocalDate creationDate, String accountId, BigDecimal overdraftLimit) {
        super(balance, creationDate, accountId);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean deposit(BigDecimal amount) {
        if (amount.signum() <= 0) return false;
        setBalance(getBalance().add(amount));
        return true;
    }

    @Override
    public boolean withdraw(BigDecimal amount) throws InsufficientFundsException {
        if (amount.signum() <= 0) return false;
        if (amount.compareTo(getBalance().add(overdraftLimit)) > 0) throw new InsufficientFundsException("Insufficent Funds");
        setBalance(getBalance().subtract(amount));
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Overdraft Limit: " + overdraftLimit;
    }

}
