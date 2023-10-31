package com.learn.java_programming.part10.exercise14;

import java.util.*;

public class Literature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) break;
            System.out.println("Input the age recommendation: ");
            int bookAge = Integer.parseInt(scanner.nextLine());
            bookList.add(new Book(bookTitle, bookAge));
        }
        System.out.println(bookList.size() + " books in total.");
        System.out.println("Books: ");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);

        bookList.sort(comparator);
        bookList.forEach(System.out::println);
    }
}
