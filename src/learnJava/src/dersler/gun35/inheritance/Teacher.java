package learnJava.src.dersler.gun35.inheritance;

public class Teacher extends Human {
    private String branch;

    public Teacher(String name, String branch) {
        super(name);
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

    private void gatherSchoolCommision() {

    }

//?????**bu methodu neden static yapması gerekti??????????
    public static class PrimarySchoolTeacher extends Teacher {

        private boolean bilsemCounselorTeacher;


        public PrimarySchoolTeacher(String name, String branch, boolean bilsemCounselorTeacher) {
            super(name, branch);
            this.bilsemCounselorTeacher = bilsemCounselorTeacher;

        }

        public void gatherBilsemCommision(Student_PrimarySchool std) {
            //bilsem öğretmeni ise öğrencinin bilseme onayını verebilsin
            if(bilsemCounselorTeacher){
                System.out.printf( "%s öğretmen %s in bilseme girmesini onayladı.\n",name,std.getName());
                std.setJoinedBilsemExam(true);

            }

        }
    }





}
