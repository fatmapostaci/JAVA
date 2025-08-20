package learnJava.src.dersler.gun35.inheritance;

public class Student_PrimarySchool extends Student {
    private int grade;
    private boolean joinedBilsem;

    public Student_PrimarySchool(String name, int id, String schoolName, int grade,boolean joinedBilsem) {
        super(name, id, schoolName);
        this.grade = grade;
        joinedBilsem = joinedBilsem;
    }
    @Override
    public String introduceYourself(){
        return "\nMy name is " + name + " I am a " + grade +". grade student in " + getSchoolName() +" . My school id is " + getId()  ;
    }
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
