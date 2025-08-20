package KutuphaneYonetimSistemi1.service;

import model.Book;

import java.util.List;

public interface IBookService {
    void addBook(Book book);                     // Yeni kitap ekleme
    void removeBook(String isbn);                // ISBN ile kitap silme
    Book findBook(String isbn);                  // ISBN ile kitap arama
    void updateBook(String isbn, Book book);     // Kitap bilgilerini güncelleme
    List<Book> getAllBooks();                    // Tüm kitapları listeleme
    boolean isBookAvailable(String isbn);        // Kitap müsaitlik kontrolü
    List<Book> searchBooks(String keyword);      // Anahtar kelime ile kitap arama
}
