package com.learn.java_programming.part7.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println();

        System.out.println();
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }


    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
          if (books.get(i).getId() == searchedId) return i;
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        while (begin <= end) {
            int middle = (end + begin) / 2;
            if (books.get(middle).getId() == searchedId) return middle;
            if (books.get(middle).getId() < searchedId) begin = middle + 1;
            if (books.get(middle).getId() > searchedId) end = middle - 1;
        }
        return -1;
    }
}
