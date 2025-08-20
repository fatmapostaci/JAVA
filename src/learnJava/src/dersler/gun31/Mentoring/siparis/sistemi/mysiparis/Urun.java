package learnJava.src.dersler.gun31.Mentoring.siparis.sistemi.mysiparis;

public class Urun {
    String name;
    double price;

    public Urun(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
