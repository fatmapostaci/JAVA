package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mentoring_Stok_takibi {
    /*
        Senaryo: Stok Takibi ve Depo Güncellemesi
        Bir mağaza, popüler bir üründen stoklarına 5 tane eklemiştir.
        Ürün stok bilgilerini bir listeye kaydeder.
        Daha sonra, farklı bir listeye bu ürünlerin birer yedeğini taşıyarak yedek listeyi oluşturur.

        Bu işlemler sırasında Collections.nCopies yöntemini kullanarak başlangıçtaki stok listesini
        oluşturun ve bu listeyi başka bir listeye ekleyin.

             Görev:
             1-Ürün adı "Akıllı Saat" olan bir üründen stok bilgisi olarak 5 adet kaydeden bir liste oluşturun.
             2-Bu listeyi, başka bir yedek stok listesine ekleyin.
             3-Yedek listeye, stoklardan bağımsız olarak "Görünmez Telefon" adlı üründen 3 adet daha ekleyin.
             4-Hem ana stok listesini hem de yedek stok listesini ekrana yazdırın.
             */
    public static void main(String[] args) {
        ArrayList<String> stokUrunler = new ArrayList<>();
        stokUrunler.add("Akıllı Saat");
        stokUrunler.add("Telefon");
        stokUrunler.add("Kulaklık");
        stokUrunler.add("Kol Saati");
        stokUrunler.add("Tablet");

       //1-Ürün adı "Akıllı Saat" olan bir üründen stok bilgisi olarak 5 adet kaydeden bir liste oluşturun.
       stokUrunler.addAll( Collections.nCopies(5,"Akıllı Saat"));
        System.out.println("stokUrunler = " + stokUrunler);
        //2-Bu listeyi, başka bir yedek stok listesine ekleyin.
        List<String> yedekStokUrunler = new ArrayList<>(stokUrunler);
        System.out.println("yedekStokUrunler = " + yedekStokUrunler);

        //3-Yedek listeye, stoklardan bağımsız olarak "Görünmez Telefon" adlı üründen 3 adet daha ekleyin.
        List <String> temp = Collections.nCopies(3,"Görünmez Telefon");

        yedekStokUrunler.addAll(temp);
        System.out.println("yedekStokUrunler = " + yedekStokUrunler);
        //4-Hem ana stok listesini hem de yedek stok listesini ekrana yazdırın.


    }
}
