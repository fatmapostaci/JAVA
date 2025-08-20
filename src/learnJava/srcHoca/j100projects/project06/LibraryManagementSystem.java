package learnJava.srcHoca.j100projects.project06;

import j100projects.project06.exception.LibraryException;
import j100projects.project06.model.Book;
import j100projects.project06.model.Member;
import j100projects.project06.model.Person;
import j100projects.project06.service.BookService;
import j100projects.project06.service.IBookService;
import j100projects.project06.service.IPersonService;
import j100projects.project06.service.PersonService;

import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    private final IBookService bookService;
    private final IPersonService personService;
    private final Scanner scanner;

    public LibraryManagementSystem() {
        this.bookService = new BookService();
        this.personService = new PersonService(bookService);
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            printMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        handleBookOperations();
                        break;
                    case 2:
                        handleMemberOperations();
                        break;
                    case 3:
                        handleBorrowReturnOperations();
                        break;
                    case 0:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void printMainMenu() {
        System.out.println("\n=== Library Management System ===");
        System.out.println("1. Book Operations");
        System.out.println("2. Member Operations");
        System.out.println("3. Borrow/Return Operations");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private void handleBookOperations() {
        while (true) {
            System.out.println("\n=== Book Operations ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book by ISBN");
            System.out.println("4. List All Books");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    findBook();
                    break;
                case 4:
                    listAllBooks();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addBook() {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        Book book = new Book(isbn, title, author);
        bookService.addBook(book);
        System.out.println("Book added successfully!");
    }

    private void removeBook() {
        System.out.print("Enter ISBN of book to remove: ");
        String isbn = scanner.nextLine();
        bookService.removeBook(isbn);
        System.out.println("Book removed successfully!");
    }

    private void findBook() {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        Book book = bookService.findByIsbn(isbn);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found!");
        }
    }

    private void listAllBooks() {
        List<Book> books = bookService.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("No books in the library!");
            return;
        }
        books.forEach(System.out::println);
    }

    private void handleMemberOperations() {
        while (true) {
            System.out.println("\n=== Member Operations ===");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Find Member");
            System.out.println("4. List All Members");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    removeMember();
                    break;
                case 3:
                    findMember();
                    break;
                case 4:
                    listAllMembers();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addMember() {
        System.out.print("Enter Member ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Member member = new Member(id, name, email);
        personService.addPerson(member);
        System.out.println("Member added successfully!");
    }

    private void removeMember() {
        System.out.print("Enter Member ID to remove: ");
        String id = scanner.nextLine();
        personService.removePerson(id);
        System.out.println("Member removed successfully!");
    }

    private void findMember() {
        System.out.print("Enter Member ID: ");
        String id = scanner.nextLine();
        Person person = personService.findById(id);
        if (person != null && person instanceof Member) {
            System.out.println(person);
        } else {
            System.out.println("Member not found!");
        }
    }

    private void listAllMembers() {
        List<Member> members = personService.getAllMembers();
        if (members.isEmpty()) {
            System.out.println("No members in the library!");
            return;
        }
        members.forEach(System.out::println);
    }

    private void handleBorrowReturnOperations() {
        while (true) {
            System.out.println("\n=== Borrow/Return Operations ===");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    borrowBook();
                    break;
                case 2:
                    returnBook();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void borrowBook() {
        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = scanner.nextLine();

        personService.borrowBook(memberId, isbn);
        System.out.println("Book borrowed successfully!");
    }

    private void returnBook() {
        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = scanner.nextLine();

        personService.returnBook(memberId, isbn);
        System.out.println("Book returned successfully!");
    }

    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        system.start();
    }
}
