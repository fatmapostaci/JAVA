package learnJava.srcHoca.j32enum.enum03;

public class Kitap {
    String name;
    Kategory kategory;

    public Kitap(String name, Kategory kategory) {
        this.name = name;
        this.kategory = kategory;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", kategory=" + kategory +
                '}';
    }
}
