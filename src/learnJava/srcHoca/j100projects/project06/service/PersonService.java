package learnJava.srcHoca.j100projects.project06.service;

import j100projects.project06.model.Book;
import j100projects.project06.model.Member;
import j100projects.project06.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService implements IPersonService {
    private List<Person> people;
    private IBookService bookService;

    public PersonService(IBookService bookService) {
        this.people = new ArrayList<>();
        this.bookService = bookService;
    }

    @Override
    public void addPerson(Person person) {
        if (findById(person.getId()) != null) {
            throw new RuntimeException("Person with ID " + person.getId() + " already exists");
        }
        people.add(person);
    }

    @Override
    public void removePerson(String id) {
        Person person = findById(id);
        if (person == null) {
            throw new RuntimeException("Person not found with ID: " + id);
        }
        if (person instanceof Member) {
            Member member = (Member) person;
            if (!member.getBorrowedBooks().isEmpty()) {
                throw new RuntimeException("Member has borrowed books and cannot be removed");
            }
        }
        people.remove(person);
    }

    @Override
    public Person findById(String id) {
        return people.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Person> getAllPeople() {
        return new ArrayList<>(people);
    }

    @Override
    public void updatePerson(Person person) {
        Person existingPerson = findById(person.getId());
        if (existingPerson == null) {
            throw new RuntimeException("Person not found with ID: " + person.getId());
        }
        people.remove(existingPerson);
        people.add(person);
    }

    @Override
    public void borrowBook(String memberId, String isbn) {
        Person person = findById(memberId);
        if (person == null || !(person instanceof Member)) {
            throw new RuntimeException("Member not found with ID: " + memberId);
        }

        Member member = (Member) person;
        if (!member.canBorrowBooks()) {
            throw new RuntimeException("Member has reached maximum number of borrowed books");
        }

        Book book = bookService.findByIsbn(isbn);
        if (book == null) {
            throw new RuntimeException("Book not found with ISBN: " + isbn);
        }

        if (!bookService.isBookAvailable(isbn)) {
            throw new RuntimeException("Book is not available for borrowing");
        }

        member.borrowBook(book);
    }

    @Override
    public void returnBook(String memberId, String isbn) {
        Person person = findById(memberId);
        if (person == null || !(person instanceof Member)) {
            throw new RuntimeException("Member not found with ID: " + memberId);
        }

        Member member = (Member) person;
        Book book = bookService.findByIsbn(isbn);
        if (book == null) {
            throw new RuntimeException("Book not found with ISBN: " + isbn);
        }

        member.returnBook(book);
    }

    @Override
    public List<Member> getAllMembers() {
        return people.stream()
                .filter(person -> person instanceof Member)
                .map(person -> (Member) person)
                .collect(Collectors.toList());
    }
}
