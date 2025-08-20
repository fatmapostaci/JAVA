package learnJava.srcHoca.j100projects.project06.service;

import j100projects.project06.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService implements IBookService {
    private List<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        if (findByIsbn(book.getIsbn()) != null) {
            throw new RuntimeException("Book with ISBN " + book.getIsbn() + " already exists");
        }
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        Book book = findByIsbn(isbn);
        if (book == null) {
            throw new RuntimeException("Book not found with ISBN: " + isbn);
        }
        books.remove(book);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    @Override
    public boolean isBookAvailable(String isbn) {
        Book book = findByIsbn(isbn);
        if (book == null) {
            throw new RuntimeException("Book not found with ISBN: " + isbn);
        }
        return book.isAvailable();
    }

    @Override
    public void updateBook(Book book) {
        Book existingBook = findByIsbn(book.getIsbn());
        if (existingBook == null) {
            throw new RuntimeException("Book not found with ISBN: " + book.getIsbn());
        }
        books.remove(existingBook);
        books.add(book);
    }
}
