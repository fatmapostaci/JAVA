package KutuphaneYonetimSistemi1.exception;

public class BookNotAvailableException extends RuntimeException {

    // Kitap müsait olmadığında fırlatılır.



        public BookNotAvailableException(String message) {
            super(message);

        }
    }


