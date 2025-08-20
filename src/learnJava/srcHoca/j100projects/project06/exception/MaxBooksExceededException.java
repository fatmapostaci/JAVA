package learnJava.srcHoca.j100projects.project06.exception;

public class MaxBooksExceededException extends LibraryException {
    public MaxBooksExceededException(String memberId) {
        super("Member has reached maximum number of borrowed books. Member ID: " + memberId);
    }
}
