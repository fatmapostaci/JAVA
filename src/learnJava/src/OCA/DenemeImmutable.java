package learnJava.src.OCA;

public class DenemeImmutable {
    private final String name;
    private final int age;

    // Constructor
    public DenemeImmutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Deneme{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }


}