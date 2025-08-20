package learnJava.src.dersler.gun44;

import java.util.HashMap;

public class C05_clear_size_empty {
    //map.size();->Girilen  map'in entry(giris: eleman) sayısını return eder.
    //map.clear();->Girilen  map'in  tum entry(giris: eleman)siler .
    //map.isEmpty();->Girilen  map'in entry(giris: eleman) varlığını kontrol eder boolean return eder.

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        int numOfEntries1 = map.size();
        System.out.println("clear öncesi map = " + map);
        boolean bosmu1 = map.isEmpty();

        map.clear();

        System.out.println("clear sonrası map = " + map);
        int numOfEntries2 = map.size();
        boolean bosmu2 = map.isEmpty();

        System.out.println("numOfEntries1 = " + numOfEntries1); // 5
        System.out.println("numOfEntries2 = " + numOfEntries2); // 0
        System.out.println("bosmu1 = " + bosmu1);// false
        System.out.println("bosmu2 = " + bosmu2);// true



    }
}
