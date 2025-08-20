package learnJava.srcHoca.j32enum.enum02;

public class User {
    String name;
    //int role; // 0-> Admin   1 -> Customer
    Roles role;
    //int status; // 0 -> Active 1 -> InActive  2 -> InProgress
    Status status;
    public User() {
    }

    public User(String name, Roles role, Status status) {
        this.name = name;
        this.role = role;
        this.status = status;
    }

}
