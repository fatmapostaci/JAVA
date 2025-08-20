package KutuphaneYonetimSistemi1.exception;

public class MemberNotFoundException extends Exception {
    // Üye bulunamadığında fırlatılır

    public MemberNotFoundException(String message) {
        super(message);

    }
}
