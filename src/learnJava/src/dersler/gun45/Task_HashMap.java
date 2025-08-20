package learnJava.src.dersler.gun45;

import java.util.*;

public class Task_HashMap {
    /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
            dublicate kabul etmez.
            Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap  print edildiğinde hem key degerleri hem de value degerleri aralarina = sembolu konularak print eder
            HashMap'ler tanımlanırken rastgele(hurra style) siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();

        HashMap<String, String> map = new HashMap<>();

        HashMap<String, ArrayList<String>> map3 = new HashMap<>();

        map.put("tester1@tes.com","tester1");
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester3@tes.com","tester2");

        System.out.println("map = " + map);

        Set<String> keyset = map.keySet();
        System.out.println("keyset = " + keyset);

        Collection<String> valueCollection = map.values();
        System.out.println("valueCollection = " + valueCollection);

        for (String key : map.keySet()) {
            key = key.toUpperCase();
            System.out.print(" " + key);
        }

        for (String value : map.values()){
            System.out.print(" " + value);
        }

        map.put("tester5@tes.com","tester5");
        System.out.println("map.get(\"tester5@tes.com\") = " + map.get("tester5@tes.com"));
        String tester3Sifre = map.get("tester3@tes.com");
        System.out.println("tester3Sifre = " + tester3Sifre);

        String olmayanKey = map.get("tes@tes.com");
        System.out.println("olmayanKey = " + olmayanKey);

        Set<Map.Entry<String, String>> stringSet = map.entrySet();
        System.out.println("stringSet = " + stringSet);
        Iterator<Map.Entry<String, String>> itrSet = stringSet.iterator();
        while (itrSet.hasNext()){
            System.out.println( itrSet.next());
        }

        HashMap<String,String> mapNew = new HashMap<>();

        mapNew.putAll(map);
        System.out.println("mapNew = " + mapNew);

        System.out.println("map.containsKey(\"tester3@tes.com\") = " + map.containsKey("tester3@tes.com"));
        System.out.println("map.containsKey(\"test@tes\") = " + map.containsKey("test@tes"));

        System.out.println("map.containsValue(\"tester2\") = " + map.containsValue("tester2"));
        System.out.println("map.containsValue(\"tes\") = " + map.containsValue("tes"));
    }
}
