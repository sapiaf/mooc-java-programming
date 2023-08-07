package com.learn.java_programming.part4.exercise16;

public class Main {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // Paul eats heartily
        paulsCard.eatHeartily();

        // Matt eats affordably
        mattsCard.eatAffordably();

        // The cards' values are printed
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul tops up 20 euros
        paulsCard.addMoney(20);

        // Matt eats heartily
        mattsCard.eatHeartily();

        // The cards' values are printed again
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul eats affordably twice
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        // Matt tops up 50 euros
        mattsCard.addMoney(50);

        // The cards' values are printed one last time
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
