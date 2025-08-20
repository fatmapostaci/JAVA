package learnJava.srcHoca.j100projects.project06.exception;

public class MemberNotFoundException extends LibraryException {
    public MemberNotFoundException(String memberId) {
        super("Member not found with ID: " + memberId);
    }
}
