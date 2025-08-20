package learnJava.src.dersler.gun41.mentoring;
//Ticari Araç: Ek özellik: Taşıma kapasitesi (kg).
public class Ticari extends Arac {

    int tasimaKapasitesi;

    //constructor
    public Ticari(String plaka, double gunlukKiraBedeli, String model, int tasimaKapasitesi) {
        super(plaka, gunlukKiraBedeli, model);
        this.tasimaKapasitesi = tasimaKapasitesi;
    }

    @Override
    void aracBilgileriniGoster() {
        System.out.println("Ticari araç bilgileri: " +
                        " plaka : " + getPlaka() +
                        ", model : " + getModel() +
                        ", gunlukKiraBedeli : " + getGunlukKiraBedeli() +
                        ", tasimaKapasitesi : " + tasimaKapasitesi );
    }

    @Override
    public double kirala(int gun) {

        return gun * getGunlukKiraBedeli();
    }

    @Override
    public String toString() {
        return "Ticari{" +
                "tasimaKapasitesi=" + tasimaKapasitesi +
                ", plaka='" + getPlaka() + '\'' +
                ", model='" + getModel() + '\'' +
                ", gunlukKiraBedeli=" + getGunlukKiraBedeli() +
                '}';
    }

}
