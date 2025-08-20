package learnJava.srcHoca.j23encapsulation.tasks.task2.fatma;

public class Student {
    /*
    StudentRunner ve Student classları create ediniz
            Student classı içinde;
            String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz
            StudentRunner classın içinde;
            girilen değerleri aşagıdaki gibi print eden code create ediniz
            Örnek:
            age 48,
            name Frank' olsun.
            output
            "Student name is Frank"
            "He is 48 years old"
     */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
