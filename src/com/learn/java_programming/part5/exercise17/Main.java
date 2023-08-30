package com.learn.java_programming.part5.exercise17;

public class Main {
    public static void main(String[] args) {
        Money a = new Money(10, 50);
        Money b = new Money(10, 51);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

    }
}
