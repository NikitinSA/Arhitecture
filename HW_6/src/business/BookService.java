/*
 * Created by Nikitin Saveliy, - "08.08.2023, 14:55"
 */
package business;

import domain.Book;
import java.util.List;

public interface BookService {
    void addBook(String title, String author, double price);
    void removeBook(String title, String author, double price);
    List<Book> getAllBooks();
}
