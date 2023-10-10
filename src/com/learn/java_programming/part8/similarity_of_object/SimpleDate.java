package com.learn.java_programming.part8.similarity_of_object;

public class SimpleDate {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (!(comparedObject instanceof SimpleDate)) {
            return false;
        }
        SimpleDate comparedBook = (SimpleDate) comparedObject;
        if (this.day == comparedBook.day &&
                this.month == comparedBook.month &&
                this.year == comparedBook.year) {
            return true;
        }
        return false;
    }
}
