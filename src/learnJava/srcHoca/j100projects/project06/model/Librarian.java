package learnJava.srcHoca.j100projects.project06.model;

public class Librarian extends Person {
    private String employeeId;
    private String department;

    public Librarian(String id, String name, String email, String employeeId, String department) {
        super(id, name, email);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public String getRole() {
        return "LIBRARIAN";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
