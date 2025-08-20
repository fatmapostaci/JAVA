package learnJava.srcHoca.j23encapsulation.tasks.task2.fatma;

public class StudentRunner {
    public static void main(String[] args) {
        Student fatma = new Student();
        fatma.setName("Fatma");
        fatma.setAge(37);
        System.out.println("fatma.getName() = " + fatma.getName());
        System.out.println("fatma.getAge() = " + fatma.getAge());
    }

}
