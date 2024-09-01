package com.library;

public class BookMain {
    public static void main(String[] args) {
        // Create a new Book object
        Book book = new Book("978-0134685991", "Effective Java", "Joshua Bloch", 2018);

        // Test getters
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication Year: " + book.getPublicationYear());
        System.out.println("Is Available: " + book.isAvailable());

        // Test setting availability
        book.setAvailable(false);
        System.out.println("Is Available (after setting to false): " + book.isAvailable());
    }
}
