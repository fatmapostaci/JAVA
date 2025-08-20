package learnJava.src.dersler.gun31.Mentoring.siparis.sistemi.mysiparis;

public class SiparisRunner {

    public static void main(String[] args) {

        Siparis siparis = new Siparis();

        Urun urun1 = new Urun("defter",20);
        Urun urun2 = new Urun("kalem", 30);

        siparis.urunEkle(urun1);
        siparis.urunEkle(urun2);

    }

}
