package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mentoring_Ogrenci_Durumları {
     /* Görev: Öğrenci Durumlarını Güncelleme
        Bir öğretmen, öğrencilerin durumlarını bir ArrayList içerisinde tutuyor.
        Durumlar başlangıçta false (geçmedi) olarak belirlenmiş.
        Ancak, sınavları biten öğrencilerin durumlarını true (geçti) olarak güncellemek istiyor.
         Aşağıdaki işlemleri yaparak öğrencilerin durumlarını güncelleyin:

        1-ArrayList'te 5 öğrencinin sınav durumu bilgilerini tutan bir liste oluşturun ve
        ilk başta hepsini false olarak belirleyin.
        2-Tüm öğrencilerin durumlarını true (geçti) olarak güncelleyin.
        3-Güncellenmiş listeyi ekrana yazdırın.
        EK Görev :
        4-Hata yaptığını anlayan öğretmen ilk 3 öğrencinin notlarını tekrar false yapıyor
        5-Son durumu yazdırın
        */
     public static void main(String[] args) {
          List<Boolean> temp = Collections.nCopies(5,false);
          ArrayList<Boolean> ogrenciDurumlari = new ArrayList<>(temp);
          //Collections.fill(ogrenciDurumlari,false);
          System.out.println("ogrenciDurumlari = " + ogrenciDurumlari);

          Collections.fill(ogrenciDurumlari,true);
          System.out.println("ogrenciDurumlari = " + ogrenciDurumlari);

          Collections.fill(ogrenciDurumlari.subList(0,3),false);
          System.out.println("ogrenciDurumlari = " + ogrenciDurumlari);

          ogrenciDurumlari.set(0,true);
          System.out.println("ogrenciDurumlari = " + ogrenciDurumlari);
     }
}
