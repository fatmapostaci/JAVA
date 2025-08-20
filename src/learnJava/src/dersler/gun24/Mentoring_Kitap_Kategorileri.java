package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mentoring_Kitap_Kategorileri {
    /*
       Senaryo: Kitap Kategorileri
       Bir kitapçıda kitaplar kategorilere göre sıralanmış ve bir liste oluşturulmuştur.
       Liste üzerinde subList kullanarak belirli kategorilere erişim sağlamak için aşağıdaki görevleri tamamlayın.

       Görevler:
       1-Aşağıdaki kategorilerden oluşan bir ArrayList oluşturun:
       ["Roman", "Şiir", "Tarih", "Bilim", "Felsefe", "Çocuk", "Psikoloji", "Sanat"].
       2-İlk 4 kategoriyi içeren bir alt liste oluşturun ve yazdırın.
       3-Son 3 kategoriyi içeren bir alt liste oluşturun ve yazdırın.
       4-Listenin 3. ve 6. indeksleri arasındaki kategorileri içeren bir alt liste oluşturun ve yazdırın.
       Ek Görev: Alt Liste Üzerinde Değişiklik Yapma
       5- Alt listedeki 0. indexdeki elemanı "Bilim Kurgu" olarak güncelleyelim
       */
    public static void main(String[] args) {
        ArrayList<String> kitapKategorileri = new ArrayList<>(List.of("Roman", "Şiir", "Tarih", "Bilim", "Felsefe", "Çocuk", "Psikoloji", "Sanat"));
        List<String> subList0_4 = kitapKategorileri.subList(0,4);
        System.out.println("subList0_4 = " + subList0_4);
        List<String>  subListSon3 = kitapKategorileri.subList(kitapKategorileri.size()-3,kitapKategorileri.size());
        System.out.println("subListSon3 = " + subListSon3);
        List<String> subList3_6 = kitapKategorileri.subList(2,5);
        System.out.println("subList3_6 = " + subList3_6);
        System.out.println("subList3_6.set(0,\"Bilim Kurgu\") = " + subList3_6.set(0, "Bilim Kurgu"));
        System.out.println("subList3_6 = " + subList3_6);
    }
}
