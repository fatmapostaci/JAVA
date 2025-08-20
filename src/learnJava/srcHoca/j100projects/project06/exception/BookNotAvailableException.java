package learnJava.srcHoca.j100projects.project06.exception;

public class BookNotAvailableException extends LibraryException {
    public BookNotAvailableException(String isbn) {
        super("Book is not available with ISBN: " + isbn);
    }
}
