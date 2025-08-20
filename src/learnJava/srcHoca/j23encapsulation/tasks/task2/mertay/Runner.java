package learnJava.srcHoca.j23encapsulation.tasks.task2.mertay;

public class Runner {
    public static void main(String[] args) {
        Student student1= new Student();

        student1.setAge(48);
        student1.setName("Frank");

        System.out.println("Student name is "+ student1.getName());
        System.out.println("he is "+ student1.getAge()+ " " + "old");

       // System.out.println("student1 = " + student1);

        //System.out.println("student1.toString() = " + student1.toString());

      //System.out.println("student1.getName().toUpperCase() = " + student1.getName().toUpperCase());

    }



}
