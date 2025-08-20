package learnJava.src.dersler.gun35.inheritance;

public class Student extends Human {

    private int id;
    private String schoolName;

    public Student(String name, int id, String schoolName ) {
        super(name);
        this.schoolName=schoolName;
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
