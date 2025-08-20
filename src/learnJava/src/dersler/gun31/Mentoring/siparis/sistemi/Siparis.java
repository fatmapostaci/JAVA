package learnJava.src.dersler.gun31.Mentoring.siparis.sistemi;

import java.util.ArrayList;
import java.util.List;


public class Siparis {
 static List<Urun> siparisListesi = new ArrayList<>();
 int urunSayisi;


    public Siparis() {
    }

    @Override
    public String toString() {
        return "{" +
                "urunSayisi=" + urunSayisi +
                " siparisListesi=" + siparisListesi +
                '}';
    }

    // siparis listesine urun ekler
    public void urunEkle(Urun urun) {
        siparisListesi.add(urun);
        urunSayisi++;

    }
}
