package KutuphaneYonetimSistemi1;

import model.Book;
import model.Member;
import service.IPersonService;

import java.util.List;

public class ConsoleController {
    public static class PersonService implements IPersonService {

        @Override
        public void addMember(Member member) {

        }

        @Override
        public void removeMember(String id) {

        }

        @Override
        public Member findMember(String id) {
            return null;
        }

        @Override
        public void updateMember(String id, Member member) {

        }

        @Override
        public List<Member> getAllMembers() {
            return List.of();
        }

        @Override
        public void borrowBook(String memberId, String isbn) {

        }

        @Override
        public void returnBook(String memberId, String isbn) {

        }

        @Override
        public List<Book> getBorrowedBooks(String memberId) {
            return List.of();
        }
    }
}
