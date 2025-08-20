package learnJava.src.dersler.gun23;

import java.util.*;

public class Mentoring {
    public static void main(String[] args) {
        /* Boş Bir ArrayList Oluşturup Eleman Eklemek (add() Metodu ile) */
// Soru 1 : ogrenciler adında bir ArrayList oluşturnuz.
// Ve bu listeye add() methodunu kullnarak 3 öğrenci ekleyiniz
// Listeyi yazdırınız
        ArrayList<String> ogrenciler = new ArrayList<>();
        ogrenciler.add("Fatma");
        ogrenciler.add("Ahmet");
        ogrenciler.add("Zeynep");
        System.out.println("ogrenciler = " + ogrenciler);

        /*ArrayList'i Doğrudan Başlatma (Arrays.asList)*/
// Soru 2 : "Ali , Veli ,Hasan " isimli öğrencilerden oluşan ogrenciler2 isimli bir ArrayList oluşturunuz.
// Ve bu listeyi yazdırınız

        List <String> ogrencilerList = Arrays.asList("Ali","Veli","Hasan");
        System.out.println("ogrencilerList = " + ogrencilerList);
       // ogrencilerList.add("Fatma"); hata veriyor
        List <String> ogrencilerList2 = new ArrayList<>(List.of("Ali","Veli","Hasan"));
        System.out.println("ogrencilerList2 = " + ogrencilerList2);
        ogrencilerList2.add("Fatma");  //new ArrayList olunca yeni eklerken hata vermiyor
        System.out.println("ogrencilerList2 = " + ogrencilerList2);

        // Soru 3 : 1 den 10 kadar olan sayılardan oluşan
// ismi "sayilar" olan bir ArryaListi for döngüsü ile oluşturunuz.
// Ve ArrayList i yazdırınız
        ArrayList<Integer> sayilar = new ArrayList<>();
        for (Integer i = 1; i < 10 ; i++) {
            sayilar.add(i);

        }
        System.out.println("sayilar = " + sayilar);

        // Kütüphane Sistemi Oluşturma

    // Görev 1 : Bos bir ArrayList Oluşturalım
        ArrayList <String> uyeler=new ArrayList<>();

        // Görev 2 : Kütüphaneye 10 yeni üye ekleyelim.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Uye bilgisi girin: ");
            uyeler.add(sc.next().toLowerCase());
        }
        // Görev 3 : Uye listesini alfabetik olarak sıralayıp yazıralım.
        Collections.sort(uyeler);
        System.out.println(uyeler);
        // Görev 4 : 3. uyeyi silelim
        uyeler.remove(2);
        System.out.println(uyeler);

        // Görev 5 : Spesifik bir üyenin kaydını kontrol edelim. (kayıtlı mı değil mi )
        System.out.print("Kontrol etmek için bir üye ismi girin: ");
        String uye_kontrol =sc.next().toLowerCase();
        if(uyeler.contains(uye_kontrol)) System.out.println("üye kayıtlı");
        else System.out.println("üye kayıtlı değil");

        // mesela  : sildiğimiz uye ve silmediğimiz bir uye kotrolu olabilir
        System.out.print("Silmek istediğiniz üye adını girin: ");
        String silinecek_uye=sc.next();
        if(uyeler.contains(silinecek_uye)){
            uyeler.remove(silinecek_uye);
            System.out.println("üye silindi");
        }
        else System.out.println("bu isimde bir üye sistemde bulunmuyor");
        System.out.println(uyeler);
        System.out.println("uyeler.size() = " + uyeler.size());

        // Görev 6 : Listenin ilk sırasına en küçük uye olan "Zeynep Su" yu ekleyelim.
        uyeler.addFirst("Zeynep Su");
        System.out.println(uyeler);
        System.out.println("uyeler.size() = " + uyeler.size());

        // Görev 7 : Listenin son sırasında kayıtlı uyeyi "Michael" ile güncelleyelim.
        uyeler.set((uyeler.size()-1),"Micheal");
        System.out.println(uyeler);
        System.out.println("uyeler.size() = " + uyeler.size());
        //ikinci yol, önce son üyeyi silerim sonra son yeni bir son üye eklerim
        uyeler.removeLast();
        uyeler.addLast("Micheal");
        System.out.println(uyeler);

        // Görev 8 : Yöneticinin talebiyle Tüm listeyi buyuk harfe cevirelim
        for (int i = 0; i < uyeler.size(); i++) {
            uyeler.set(i, uyeler.get(i).toUpperCase());
        }
        System.out.println(uyeler);

        // Görev 9 : Listenin boş olmadığını kontro edelim
        boolean isEmpty =  uyeler.isEmpty();
        if (isEmpty) System.out.println("uyeler listesi boş");
        else System.out.println("uyeler listesi mevcut");

        // Görev 10 : Kütüphane listesi kaç kişilik kontrol edelim yazdıralım
        System.out.println("kayıtlı kişi sayısı = " + uyeler.size());

    }
}
