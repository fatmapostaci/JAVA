package KutuphaneYonetimSistemi1.exception;

public class BookNotFoundException extends Exception {
    // Kitap bulunamadığında fırlatılır

    public BookNotFoundException(String message) {
        super(message);

    }

}
