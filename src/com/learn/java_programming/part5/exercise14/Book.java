package com.learn.java_programming.part5.exercise14;

import com.learn.java_programming.part5.exercise13.Person;

public class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        if (this == compared) return true;

        if (!(compared instanceof Book)) return false;

        Book otherBook = (Book) compared;

        if (this.name.equals(otherBook.name) && this.publicationYear == otherBook.publicationYear) {
            return true;
        }
        // otherwise, the objects are not the same
        return false;
    }
}
