package Inheritance;

/**
 * Student_HighSchool.java: Student sınıfını genişletiyor
 */
public class Student_HighSchool extends Student {
    private int grade;

    public Student_HighSchool(String name, int id, String schoolName, int grade) {
        super(name, id, schoolName);
        this.grade = grade;
    }

    @Override
    public String introduceYourself() {
        return "\nMy name is " + name + " I am a " + grade + ". grade student in " + getSchoolName() + " . My school id is " + getId();
    }

    public void studyForYKS(){
        System.out.println(name + " is getting prepared for collage.");
    }
}
