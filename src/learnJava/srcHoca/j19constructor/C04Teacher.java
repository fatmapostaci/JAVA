package learnJava.srcHoca.j19constructor;

public class C04Teacher {
    String ad;
    String soyad;
    String brans;
    static String okulAdi;
    int tecrube;
    boolean calisiyormu;
    int maas;
    boolean emekli;

    public C04Teacher() {
        brans = "Sınıf Öğretmen";
        calisiyormu = true;
    }

    public C04Teacher(String ad, String soyad, String brans, int tecrube, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.emekli = emekli;
        calisiyormu = true;
    }

    @Override
    public String toString() {
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekli=" + emekli +
                '}';
    }

    public void tebrikEt(){
        System.out.println(ad +" " +soyad + " sizi başarınızdan dolayı tebrik ediyor...");
    }

    public int maasHesapla(){
        return (40000 +tecrube*500);
    }














}
