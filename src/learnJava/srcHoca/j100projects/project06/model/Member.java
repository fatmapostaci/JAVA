package learnJava.srcHoca.j100projects.project06.model;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private List<Book> borrowedBooks;
    private static final int MAX_BOOKS_ALLOWED = 3;

    public Member(String id, String name, String email) {
        super(id, name, email);
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "MEMBER";
    }

    public boolean canBorrowBooks() {
        return borrowedBooks.size() < MAX_BOOKS_ALLOWED;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (canBorrowBooks()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            book.setCurrentBorrower(this.getId());
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
        book.setCurrentBorrower(null);
    }
}
