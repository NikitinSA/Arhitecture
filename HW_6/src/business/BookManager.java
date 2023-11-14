/*
 * Copyright (c) 2023.
 */

package business;

import data.BookRepository;
import domain.Book;
import java.util.List;

public class BookManager implements BookService {
    private final BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(String title, String author, double price) {
        Book book = new Book(title, author, price);
        bookRepository.addBook(book);
    }

    @Override
    public void removeBook(String title, String author, double price) {
        Book book = new Book(title, author, price);
        bookRepository.removeBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }
}