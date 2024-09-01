package com.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void addBook() {
        library.addBook("978-3-16-148410-0", "To Kill a Mockingbird", "Harper Lee", 1960);
        assertEquals(1, library.getAvailableBooks().size());
    }

    @Test
    void borrowBook() {
        library.addBook("978-3-16-148410-0", "To Kill a Mockingbird", "Harper Lee", 1960);
        library.borrowBook("978-3-16-148410-0");
        assertEquals(0, library.getAvailableBooks().size());
    }

    @Test
    void returnBook() {
        library.addBook("978-3-16-148410-0", "To Kill a Mockingbird", "Harper Lee", 1960);
        library.borrowBook("978-3-16-148410-0");
        library.returnBook("978-3-16-148410-0");
        assertEquals(1, library.getAvailableBooks().size());
    }

    @Test
    void borrowUnavailableBook() {
        library.addBook("978-3-16-148410-0", "To Kill a Mockingbird", "Harper Lee", 1960);
        library.borrowBook("978-3-16-148410-0");
        assertThrows(IllegalArgumentException.class, () -> library.borrowBook("978-3-16-148410-0"));
    }

    @Test
    void returnUnborrowedBook() {
        library.addBook("978-3-16-148410-0", "To Kill a Mockingbird", "Harper Lee", 1960);
        assertThrows(IllegalArgumentException.class, () -> library.returnBook("978-3-16-148410-0"));
    }
}

