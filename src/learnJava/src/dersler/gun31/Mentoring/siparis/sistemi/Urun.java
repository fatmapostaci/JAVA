package learnJava.src.dersler.gun31.Mentoring.siparis.sistemi;

public class Urun {
    // urun adı , urun fiyatı
    String name;
    double price;

    public Urun(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
