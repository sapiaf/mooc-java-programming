package com.learn.java_programming.part4.exercise2;

import com.learn.java_programming.part4.exercise1.Account;

public class YourFirstBankTransfer {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("Pino account", 0);


        System.out.println("Initial state");
        System.out.println(myAccount);
        System.out.println(matthewsAccount);


        matthewsAccount.withdraw(100);
        System.out.println("The balance of Matthews's account is now: " + myAccount.getBalance());
        myAccount.deposit(100);

        System.out.println("End state");
        System.out.println(myAccount);
        System.out.println(matthewsAccount);

    }
}
