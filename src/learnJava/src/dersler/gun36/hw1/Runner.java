package learnJava.src.dersler.gun36.hw1;

public class Runner {



    public static void main(String[] args) {

        System.out.println("Animal animal = new Animal()");
        Animal animal = new Animal();
        animal.sleep();
        animal.eat();

        System.out.println("Animal cat = new Cat();");
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();

        System.out.println("Animal dog = new Dog()");
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.eat();





        System.out.println("Cat cat1 = new Cat();");
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.sleep();
        cat1.meow();

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.bark();

        System.out.println("------");
        System.out.println(animal.eat() + "  " + cat.eat());

        Animal cat4 = (Animal) new Cat();


    }
}
