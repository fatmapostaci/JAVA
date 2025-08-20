package learnJava.src.dersler.gun30;

public class C05Arac {

    String model;
    int maxHiz;

    public C05Arac() {
        this("Tesla");
        System.out.println("Parametresiz Cons Çalıştı");
    }

    public C05Arac(String model) {
        this("BMW",250);
        System.out.println("Tek Parametreli Cons Çalıştı");
        this.model = model;
    }

    public C05Arac(String model, int maxHiz) {
        System.out.println("Çift Parametreli Cons Çalıştı");
        this.model = model;
        this.maxHiz = maxHiz;
    }
}
