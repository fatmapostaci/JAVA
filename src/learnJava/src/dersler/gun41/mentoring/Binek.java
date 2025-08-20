package learnJava.src.dersler.gun41.mentoring;

//Binek Araç: Ek özellik: Maksimum yolcu kapasitesi.
public class Binek extends Arac{

    int maxYolcuKapasitesi;

    //constructor
    public Binek(String plaka, double gunlukKiraBedeli, String model, int maxYolcuKapasitesi) {
        super(plaka, gunlukKiraBedeli, model);
        this.maxYolcuKapasitesi = maxYolcuKapasitesi;
    }

    //arac classının abstract methodu zorunlu override edildi
    @Override
    void aracBilgileriniGoster() {
        System.out.println("Binek araç bilgileri: " +
                " plaka : " + getPlaka() +
                ", model : " + getModel() +
                ", gunlukKiraBedeli : " + getGunlukKiraBedeli() +
                ", maxYolcuKapasitesi : " + maxYolcuKapasitesi );
    }

    //arac classının implement ettiği interfaceten gelen method
    @Override
    public double kirala(int gun) {

        return gun * getGunlukKiraBedeli();
    }
    public void binekSeyahatEdiyor(){
        System.out.println("child class methodu");
    }

    @Override
    public String toString() {
        return "Binek{" +
                "maxYolcuKapasitesi=" + maxYolcuKapasitesi +
                ", plaka='" + getPlaka() + '\'' +
                ", model='" + getModel() + '\'' +
                ", gunlukKiraBedeli=" + getGunlukKiraBedeli() +
                '}';
    }
}
