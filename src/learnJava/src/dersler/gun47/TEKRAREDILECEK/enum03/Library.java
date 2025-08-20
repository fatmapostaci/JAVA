package learnJava.src.dersler.gun47.TEKRAREDILECEK.enum03;

import java.util.ArrayList;

public class Library {
                /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 3 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.
*/

    public static void main(String[] args) {

        ArrayList<Kitap> kitapList = new ArrayList<>();

        Kitap kitap1 = new Kitap("Leyla ile Mecnun",Kategory.ROMAN);
        Kitap kitap2 = new Kitap("Nun Masalları",Kategory.ROMAN);
        Kitap kitap3 = new Kitap("Masal İçinde Masal",Kategory.ROMAN);

        kitapList.add(kitap1);
        kitapList.add(kitap2);
        kitapList.add(kitap3);

        System.out.println("kitapList = " + kitapList);


    }
}
