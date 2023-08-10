package com.learn.java_programming.part5.exercise2;

public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }
    public String toString() {
        return getAuthor() + ", " + getName() + ", " + getPages() + " pages.";
    }
}
