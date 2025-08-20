package learnJava.src.dersler.gun46;

import java.util.Hashtable;

public class C13_HashTable {
         /*
        HashTable ->
        HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
        1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
        olan bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
        2-HashTable HashMap'e göre daha yavaştır
        3-HashTable key ve value'lerda null değere izin vermez.
        4-HashTable eleman ataması yapılırken  HashMap gibi randum(rastgele: hurra )  yapar.
         */

    public static void main(String[] args) {
        Hashtable<String,String> ht = new Hashtable<>();
        ht.put("Amazon", "296 Euro");
        ht.put("Saturn", "200 Euro");
        ht.put("Vatan", "111 Euro");
        ht.put("Apple", "450 Euro");
        ht.put("Teknosa", "333 Euro");
        ht.put("Media Markt", "");

        System.out.println("ht = " + ht);
       // ht.put("Media Markt", null); // null value girilemez -> NullPointerException
       // ht.put(null, "450 Euro"); // null key girilemez -> NullPointerException

        Hashtable<String, String> ht1 = new Hashtable<>();//bos ht tanımlandı
        ht1.put("falan", "filan");
        ht1.put("ebik", "gabık");
        ht1.put("ıkır", "zıkır");
        ht1.put("vıddı", "vıddı");
        ht1.put("nörüyong", "nişleding");

        System.out.println("ht1 = " + ht1);

        ht.putAll(ht1);

        System.out.println("ht = " + ht);

    }
}
