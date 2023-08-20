package com.learn.java_programming.part5.exercise14;

import com.learn.java_programming.part5.exercise13.Person;

public class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Book comparedBook)) return false;
        return comparedBook.name.equalsIgnoreCase(this.name) && comparedBook.publicationYear == this.publicationYear;
    }

}
