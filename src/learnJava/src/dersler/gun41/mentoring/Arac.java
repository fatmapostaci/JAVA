package learnJava.src.dersler.gun41.mentoring;
/*
--> Arac:
Tüm araçlar için ortak özellikleri ve davranışları tanımlayan bir abstract sınıf.
--> Ortak özellikler:
(encapsulation ile korunur).
Plaka
Model.
Günlük kira bedeli.
--> Ortak davranışlar:
Aracı kirala (toplam ücreti hesaplar).
Araç bilgilerini göster.
 */
public abstract class Arac implements KiralamaHizmeti{
    private String plaka;
    private  String model;
    private double gunlukKiraBedeli;

    // setter method olmadığı için parametreli constructor üreterek verilere atama yapabiliriz
    public Arac(String plaka, double gunlukKiraBedeli, String model) {
        this.plaka = plaka;
        this.gunlukKiraBedeli = gunlukKiraBedeli;
        this.model = model;
    }

//Aracı kirala (toplam ücreti hesaplar).
    //abstract classta implement ettiği interface methodunu yazmak  zorunda değiliz
    //ancak child class oluşturduğumuzda override etmek zorunda kalacak

    public String getPlaka() {
        return plaka;
    }

    public String getModel() {
        return model;
    }

    public double getGunlukKiraBedeli() {
        return gunlukKiraBedeli;
    }

    //Araç bilgilerini göster.
    abstract void aracBilgileriniGoster();

    @Override
    public String toString() {
        return "Arac{" +
                "plaka='" + plaka + '\'' +
                ", model='" + model + '\'' +
                ", gunlukKiraBedeli=" + gunlukKiraBedeli +
                '}';
    }
}
