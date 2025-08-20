package learnJava.src.dersler.gun45;

import java.util.*;

public class Mentoring {

    public static void main(String[] args) {

        // Bir HashMap oluşturun, birkaç anahtar-değer çifti ekleyin ve map i yazdırın.

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1323110, "Fatma POSTACI");
        hashMap.put(434533, "Melike POSTACI");

        System.out.println("hashMap = " + hashMap);

// Map de belirli bir anahtarın olup olmadığını kontrol edin ve varsa karşılık gelen değeri yazdırın.

        int key = 1323110;
        if (hashMap.containsKey(key)) {
            System.out.print(hashMap.get(key));
        } else
            System.out.println(key + " nolu müşteri bulunmuyor ");

        System.out.println();
        // Map den değeri belirli bir eşikten (60) düşük olan elemanları kaldırın.
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 85);
        scores.put("Ayşe", 45);
        scores.put("Mehmet", 72);
        scores.put("Fatma", 50);

        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            if (entryIterator.next().getValue() < 60) {
                entryIterator.remove();
            }
        }
        System.out.println("scores = " + scores);

        // Bir map deki anahtarları ve değerleri takas ederek yeni bir harita oluşturun.
        Map<String, String> countryCapital = new HashMap<>();
        countryCapital.put("Turkey", "Ankara");
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("France", "Paris");

    }
}


