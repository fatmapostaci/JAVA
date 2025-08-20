package learnJava.src.dersler.animals;


public class Kedi extends Memeli {



    int c =2;
    int d = 7;
    public Kedi(String name) {
        this();
         // Aynı Classta Default Cons Çağırıldı
        System.out.println("String parametreli Cons çalistı");
    }

    public Kedi() {
        super(); // Super Classta Parametresiz Cons Çağırıldı
        System.out.println("Parametresiz Kedi Cons çalıştı");
    }

    public void mC(){
        System.out.println("Kediler Classında mC Çalıştı");
    }
}
