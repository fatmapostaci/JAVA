package learnJava.srcHoca.j100projects.project02.zoomanagement;

public class Animal {
    private String name;
    private String species;
    private int age;

    // Constructor

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Getterlar ile private özellikleri okuyabiliriz
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    // Setterlar ile private özellikleri update edebiliriz
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    // Method overloading aynı metodun farklı şekilde çalışmasını sağlar:
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void eat(String food){
        System.out.println(name + " is eating " + food + " currently");
    }
    public void eat(String food, int adet){
        System.out.println(name + " eats " + food + " " + adet + " times a day");
    }
}
