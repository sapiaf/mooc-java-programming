package com.learn.java_programming.part4.exercise20;

public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public void printInfo(String info) {
        if (info.equalsIgnoreCase("everything")) System.out.println(getTitle() + ", " + getPages() + " pages, " + getYear());
        else if (info.equalsIgnoreCase("name")) System.out.println(getTitle());
        else System.out.println("Wrong choice");
    }
}
