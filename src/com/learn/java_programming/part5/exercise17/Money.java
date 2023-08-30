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
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition) {
        int euros = euros() + addition.euros();
        int cents = cents() + addition.cents();

        if (cents > 100) {
            euros++;
            cents -= 100;
        }
        return new Money(euros, cents);
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros()) return true;
        return euros == compared.euros() && cents < compared.cents();
    }
    public Money minus(Money decreaser) {
        int euros = euros() - decreaser.euros();
        int cents = cents() - decreaser.cents();
        if (cents < 0) {
            cents += 100;
            euros--;
        }
        if (euros < 0) return new Money(0, 0);
        return new Money(euros, cents);
    }

}
