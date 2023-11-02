package com.learn.java_programming.part10.exercise17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    public void add(Card card) {
        cards.add(card);
    }
    public void print() {
        Iterator<Card> cardIterator = cards.iterator();
        while (cardIterator.hasNext()) {
            System.out.println(cardIterator.next());
        }
    }
    public void sort() {
        Collections.sort(this.cards);
    }
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand o) {
        int thisSum = cards.stream().map(Card::getValue).reduce(0, Integer::sum);
        int oSum = o.cards.stream().map(Card::getValue).reduce(0, Integer::sum);
        return thisSum - oSum;
    }
}
