package KutuphaneYonetimSistemi1.model;

public class Book {
    private String isbn;          // Kitap ISBN numarası
    private String title;         // Kitap başlığı
    private String author;        // Yazar
    private boolean available;    // Müsaitlik durumu
    private String currentBorrower; // Mevcut ödünç alan kişi

    // Getter ve Setter metodları
    // Constructor
    // toString metodu


    public Book() {
    }

    public Book(String isbn, String title, String author, boolean available, String currentBorrower) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = available;
        this.currentBorrower = currentBorrower;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getCurrentBorrower() {
        return currentBorrower;
    }

    public void setCurrentBorrower(String currentBorrower) {
        this.currentBorrower = currentBorrower;
    }

    @Override
    public String toString() {
        return  "isbn='" + getIsbn() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", available=" + isAvailable() +
                ", currentBorrower='" + getCurrentBorrower() + '\'' +
                '}';
    }
}
