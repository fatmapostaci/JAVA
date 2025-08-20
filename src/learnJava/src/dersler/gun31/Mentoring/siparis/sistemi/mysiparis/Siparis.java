package learnJava.src.dersler.gun31.Mentoring.siparis.sistemi.mysiparis;

import java.util.ArrayList;
import java.util.List;

public class Siparis {

     List<Urun> siparisListesi;
    int urunSayisi;

    public Siparis(int urunSayisi) {
        this.urunSayisi = urunSayisi;
        siparisListesi = new ArrayList<>();
    }

    public Siparis() {
    }

    public void urunEkle(Urun u){
        siparisListesi.add(u);
        urunSayisi++;
    }

}
