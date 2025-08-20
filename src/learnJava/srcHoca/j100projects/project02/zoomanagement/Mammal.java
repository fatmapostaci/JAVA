package learnJava.srcHoca.j100projects.project02.zoomanagement;

public class Mammal extends Animal {
    private boolean isAquatic;

    public Mammal(String name, String species, int age, boolean isAquatic) {
        super(name, species, age);
        this.isAquatic = isAquatic;
    }

    public boolean isAquatic() {
        return isAquatic;
    }

    public void setAquatic(boolean aquatic) {
        isAquatic = aquatic;
    }
}
