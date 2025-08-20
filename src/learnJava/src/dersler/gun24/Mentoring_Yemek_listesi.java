package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mentoring_Yemek_listesi {
    /*
        Senaryo 2: Favori Yemekler Listesi
        Bir restoranda müşterilerin en sevdikleri yemeklerin olduğu bir liste oluşturulmuştur.
        Liste üzerinde indexOf ve get yöntemlerini kullanarak işlemler yapalım.

        Görevler:
        1-Aşağıdaki yemeklerden oluşan bir liste oluşturun:
        ["Pizza", "Burger", "Sushi", "Pasta", "Taco"].
        2-Müşteri "Sushi" yemeğini arıyor. Listenin kaçıncı sırada olduğunu bulun.
        3-Listenin üçüncü (indeks 2) yemeğini öğrenmek için get yöntemini kullanın.
        4-Listeye yeni bir yemek olarak "Pizza" yı bir kez daha ekleyin.
        5-İlk "Pizza"nın indeksini bulun.
        6-Listeyi yazdırarak doğrulayın.
        */
    public static void main(String[] args) {
        List<String> favoriYemekler = new ArrayList<>(List.of("Pizza", "Burger", "Sushi", "Pasta", "Taco"));
        System.out.println("favoriYemekler.indexOf(\"Sushi\") = " + favoriYemekler.indexOf("Sushi"));
        System.out.println("favoriYemekler.get(2) = " + favoriYemekler.get(2));
        favoriYemekler.add("Pizza");
        System.out.println("favoriYemekler.indexOf(\"Pizza\") = " + favoriYemekler.indexOf("Pizza"));
        System.out.println("favoriYemekler = " + favoriYemekler);
    }
}
