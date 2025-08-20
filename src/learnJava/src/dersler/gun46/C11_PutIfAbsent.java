package learnJava.src.dersler.gun46;

import java.util.HashMap;

public class C11_PutIfAbsent {
    //map.putIfAbsent(); -> Girilen key map'de yok ise entry(key,value) map'e eklenir ve null return eder.
    //Girilen key map'de var ise key'e ait value return eder


    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        System.out.println("putIfAbsent öncesi map = " + map);
        map.putIfAbsent("tester@tes.com", "tester"); // Bu isimde key olmadığı için ekleyip null döner
        System.out.println("map.putIfAbsent(\"tester1@tes.com\", \"tester\") = " + map.putIfAbsent("tester1@tes.com", "tester")); // Bu isimde key olduğu için ekleme yapmadı

        System.out.println("putIfAbsent sonrası map = " + map);

    }
}
