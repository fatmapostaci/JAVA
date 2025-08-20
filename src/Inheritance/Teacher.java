package Inheritance;
/**
 * Represents a teacher, inheriting from Human,
 * with an additional attribute for the teaching branch and working years.
 */
public class Teacher extends Human {
    private final String branch;
    private int yearsOfExperience;
    /**
     * Constructor to create a Teacher.
     * @param name The name of the teacher.
     * @param branch The teaching branch of the teacher.
     */
    public Teacher(String name, String branch, double salary) {

        super(name,salary);
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "{" +

                ", name='" + name + '\'' +
                ", age=" + age +
                "branch='" + branch + '\'' +
                '}';
    }
    public void doHomework(){

    }
    public void gatherSchoolCommision() {

    }


    public String getBranch() {
        return branch;
    }

    /**
     * Represents a primary school teacher, inheriting from Teacher, with additional attributes
     * for BILSEM counselor status.
     */
//?????**bu methodu neden static yapması gerekti??????????
    public static class PrimarySchoolTeacher extends Teacher {

        private final boolean bilsemCounselorTeacher;

    /**
     * Constructor to create a PrimarySchoolTeacher.
     * @param name The name of the teacher.
     * @param branch The teaching branch of the teacher.
     * @param bilsemCounselorTeacher True if the teacher is a BILSEM counselor.
     */
        public PrimarySchoolTeacher(String name, String branch, double salary, boolean bilsemCounselorTeacher) {
            super(name, branch,salary);
            this.bilsemCounselorTeacher = bilsemCounselorTeacher;

        }

        @Override
        public String introduceYourself() {
            String sufficiency = setSalary(getSalary());   // checks the teachers salary's condition of suffiency
            return "My name is "+getName()+". I work as a "+getBranch()  +". " + sufficiency;
        }

        public void gatherBilsemCommision(Student_PrimarySchool std) {
            System.out.println(getName()+ " asked the commission to approve BILSEM applicant for " + std.getName());
            //bilsem öğretmeni ise öğrencinin bilseme onayını verebilsin
            if(bilsemCounselorTeacher){
                System.out.printf( "Komisyon onayıyla %s in bilseme girmesi onaylandı.\n",std.getName());
                std.setJoinedBilsemExam(true);

            }

        }
    }





}
