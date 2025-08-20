package learnJava.srcHoca.j23encapsulation.tasks.task2.tugba;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();
        std1.setAge(48);
        std1.setName("Frank");


        System.out.println("std1.getName().toUpperCase() = " + std1.getName().toUpperCase());
        System.out.println(std1);
        System.out.println("");

        // alternatif manuel yazdirma

        System.out.println("Student name is "+ std1.getName());
        System.out.println("He is "+std1.getAge()+" years old");




    }
}


