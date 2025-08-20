package learnJava.srcHoca.j24inheritance.tasks.task02;

import java.util.ArrayList;
import java.util.List;

class Parent {
    public Parent() {
        System.out.println("Parent Cons çalıştı");
    }

    int age =56;

    public List<String> display() {
        System.out.println("Parent display");
        return new ArrayList<>();
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Cons çalıştı");

    }
    String name = "Selam";

    int age =26;

    public ArrayList<String> display(String a) {  // Override yapmaz farklı metod gibi algılar -> overload olur child class için.
        age =30;
        System.out.println("Child display");
        return new ArrayList<>();
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(); // Parent display
        System.out.println("obj.age = " + obj.age); // 56

        System.out.println();
        System.out.println("task02");
        Parent obj1 = new Parent();

        System.out.println("obj1.age = " + obj1.age);
        obj1.display(); // Parentta sadece bir tane display okunur

        System.out.println();
        System.out.println("task03");
        Child obj2 = new Child();
        System.out.println("obj2.age = " + obj2.age);
        obj2.display("yeni"); // Childdaki
        obj2.display(); // Parenttaki
        System.out.println("obj2.age = " + obj2.age);


    }
}
