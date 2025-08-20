package learnJava.srcHoca.j23encapsulation.dummy;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student();
        int kullanıcı = 3;
        //System.out.println("student1 = " + student1.not);
        //student1.not = 90; // Private yaparak direk ulaşımı engelledik.
        //System.out.println("student1 = " + student1.not);

        student1.setNot(80);
        System.out.println("student1.getNot(kullanıcı) = " + student1.getNot());



    }
}
