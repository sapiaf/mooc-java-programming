package com.learn.java_programming.part5.exercise17;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = euros + addition.euros;
        int newCents = cents + addition.cents;

        if (newCents >= 100) {
            newEuros++;
            newCents -= 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int newEuros = euros - decreaser.euros;
        int newCents = cents - decreaser.cents;

        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }

        if (newEuros < 0) {
            return new Money(0, 0);
        }

        return new Money(newEuros, newCents);
    }

}
