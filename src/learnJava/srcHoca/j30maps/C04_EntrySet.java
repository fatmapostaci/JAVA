package learnJava.srcHoca.j30maps;

import java.util.*;

public class C04_EntrySet {
    //map.entrySet();->girilen map'in key-value tum datalarını Set'e atayıp return eder.

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        System.out.println("map = " + map);
        System.out.println("map.entrySet() = " + map.entrySet()); // key valulardan oluşan bir Set döndürür

       /*
       Set<Map.Entry<String,String>> strSet = map.entrySet();

        List<Map.Entry<String,String>> list = new ArrayList<>(strSet);
        System.out.println("list.get(1) = " + list.get(1));

        */
    }
}
