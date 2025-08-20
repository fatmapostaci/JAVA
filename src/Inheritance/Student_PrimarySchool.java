package Inheritance;

/**
 * Represents a primary school student, inheriting from Student, with additional
 * attributes such as grade level and BILSEM participation.
 */
public class Student_PrimarySchool extends Student {
    private int grade;
    private boolean joinedBilsem;

    /**
     * Constructor to create a PrimarySchoolStudent.
     * @param name The name of the student.
     * @param id The school ID of the student.
     * @param schoolName The name of the school the student attends.
     * @param grade The grade level of the student.
     * @param joinedBilsem Whether the student has joined BILSEM.
     */
    public Student_PrimarySchool(String name, int id, String schoolName, int grade,boolean joinedBilsem) {
        super(name, id, schoolName);
        this.grade = grade;
        joinedBilsem = joinedBilsem;
    }
    @Override
    public String introduceYourself(){
        return "\nMy name is " + name + " I am a " + grade +". grade student in " + getSchoolName() +" . My school id is " + getId()  ;
    }
    /**
     * Checks if the student is part of BILSEM.
     * @return True if the student is in BILSEM, false otherwise.
     */
    public boolean isABilsemStudent(){

        if (joinedBilsem){
            System.out.println(name + " Bilseme girdi");
            return true;
        }
        else return false;

    }

    public boolean isJoinedBilsemExam() {
        return joinedBilsem;
    }

    public void setJoinedBilsemExam(boolean joinedBilsem) {
        this.joinedBilsem = joinedBilsem;
    }
}
