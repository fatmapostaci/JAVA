package learnJava.srcHoca.j100projects.project06.service;

import j100projects.project06.model.Book;
import java.util.List;

public interface IBookService {
    void addBook(Book book);
    void removeBook(String isbn);
    Book findByIsbn(String isbn);
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> getAllBooks();
    boolean isBookAvailable(String isbn);
    void updateBook(Book book);
}
