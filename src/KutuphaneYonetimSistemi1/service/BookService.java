package KutuphaneYonetimSistemi1.service;

import model.Book;

import java.util.List;

public class BookService implements IBookService {
    @Override
    public void addBook(Book book) {

    }

    @Override
    public void removeBook(String isbn) {

    }

    @Override
    public Book findBook(String isbn) {
        return null;
    }

    @Override
    public void updateBook(String isbn, Book book) {

    }

    @Override
    public List<Book> getAllBooks() {
        return List.of();
    }

    @Override
    public boolean isBookAvailable(String isbn) {
        return false;
    }

    @Override
    public List<Book> searchBooks(String keyword) {
        return List.of();
    }
    //implemente etmek

}
