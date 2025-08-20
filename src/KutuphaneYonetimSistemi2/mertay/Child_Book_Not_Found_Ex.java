package KutuphaneYonetimSistemi2.mertay;

public class Child_Book_Not_Found_Ex extends RuntimeException {

    public Child_Book_Not_Found_Ex(String message) {
        super(message);
    }

    public Child_Book_Not_Found_Ex(String message, Throwable cause) {
        super(message, cause);
    }
}
