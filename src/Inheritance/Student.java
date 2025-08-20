package Inheritance;

/**
 * Student.java: Human sınıfını inherit eder
 *@int id Öğrenci ID’si
 *@String schoolName okul adı.
 * Ödev yapması için attribute içeriyor
 */
public class Student extends Human {

    private int id;
    private String schoolName;
    /**
     * Constructor to create a Student.
     * @param name The name of the student.
     * @param id The school ID of the student.
     * @param schoolName The name of the school the student attends.
     */
    public Student(String name, int id, String schoolName ) {
        super(name);
        this.schoolName=schoolName;
        this.id = id;
    }
    public void doHomework(){

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
