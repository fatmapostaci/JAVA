package KutuphaneYonetimSistemi1.service;

import model.Book;
import model.Member;

import java.util.List;

public interface IPersonService {
    void addMember(Member member);              // Yeni üye ekleme
    void removeMember(String id);               // ID ile üye silme
    Member findMember(String id);               // ID ile üye arama
    void updateMember(String id, Member member);// Üye bilgilerini güncelleme
    List<Member> getAllMembers();               // Tüm üyeleri listeleme
    void borrowBook(String memberId, String isbn);// Kitap ödünç alma
    void returnBook(String memberId, String isbn);// Kitap iade etme
    List<Book> getBorrowedBooks(String memberId);// Üyenin ödünç aldığı kitapları listeleme
}

