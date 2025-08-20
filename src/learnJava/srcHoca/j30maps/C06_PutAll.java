package learnJava.srcHoca.j30maps;

import java.util.HashMap;

public class C06_PutAll {
    // map.putAll();-> Girilen map istenen map'e eklenir.

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        HashMap<String, String> map2 = new HashMap<>();//bos hm tanımlandı
        HashMap<Integer, String> map3 = new HashMap<>();//bos hm tanımlandı
       // map3.putAll(map); // PutAll metodunda key ve value ların data tipleri uyumlu olmalı

        map2.put("javaCAN ", "abdullah");
        map2.put("javaNAZ", "sebinem");
        map2.put("javaTAR", "busura");
        map2.put("javvaNUR", "sennur");
        map2.put("javaSU", "ayse");
        map2.put("tester5@tes.com", "ayse"); // Orginal mapteki value değerini ezer

        System.out.println("putAll öncesi map = " + map);

        map.putAll(map2);
        System.out.println("putAll sonrası map = " + map);


    }
}
