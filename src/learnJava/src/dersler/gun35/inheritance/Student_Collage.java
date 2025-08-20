package learnJava.src.dersler.gun35.inheritance;

public class Student_Collage extends Student{
    private int term;

    public Student_Collage(String name, int id, String schoolName, int term) {
        super(name, id, schoolName);
        this.term = term;
    }
    @Override
    public String introduceYourself(){
        return "My name is " + name + " I am a " + term +". grade student in " + getSchoolName() +" . My school id is " + getId()  ;
    }

    public void enterForDoubleMajorEducation (){

    }
    public void joinAClub(){

    }
}
