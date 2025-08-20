package learnJava.srcHoca.j24inheritance.inheritance1;

import java.security.PublicKey;

public class Insan {
    String name;
    String surname;
    protected int age;
    private int id;



    public void beslenme(){
        System.out.println("Her insan besin tüketir");
    }

    public void sıvıTükettme(){
        System.out.println("Her insan sıvı tüketir");
    }

    @Override
    public String toString() {
        return "Insan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
