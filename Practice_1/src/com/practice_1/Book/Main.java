package com.practice_1.Book;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("Test_book", "Test_genre", 200);
        Book book_2 = new Book("My book", 123);
        System.out.println(book_1);
        System.out.println(book_2);
    }
}

