/*
 * Created by Nikitin Saveliy, - "08.08.2023"
 */

package data;

import domain.Book;

import java.util.List;

public interface BookRepository {
    void addBook(Book book);
    void removeBook(Book book);
    List<Book> getAllBooks();
}