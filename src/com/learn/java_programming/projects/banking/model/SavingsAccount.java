package com.learn.java_programming.projects.banking.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SavingsAccount extends Account{
    private BigDecimal interestRate;
    public SavingsAccount(BigDecimal balance, LocalDate creationDate, String accountId, BigDecimal interestRate) {
        super(balance, creationDate, accountId);
        this.interestRate = interestRate;
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
        if (amount.compareTo(getBalance()) > 0) throw new InsufficientFundsException("Insufficent Funds");
        setBalance(getBalance().subtract(amount));
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Interest Rate: " + interestRate;
    }
}
