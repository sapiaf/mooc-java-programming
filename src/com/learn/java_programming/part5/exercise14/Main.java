package com.learn.java_programming.part5.exercise14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) break;
            System.out.println("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, publicationYear);
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else books.add(book);
        }
        System.out.println("Thank you! Books added: " + books.size());
    }
}
