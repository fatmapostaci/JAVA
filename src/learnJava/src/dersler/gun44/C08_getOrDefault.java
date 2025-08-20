package learnJava.src.dersler.gun44;

import java.util.HashMap;

public class C08_getOrDefault {
    // map.getOrDefault(); -> girilen key map'de varsa key'e ait value yoksa default değer return eder

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        System.out.println("map.get(\"tester1@tes.com\") = " + map.get("tester1@tes.com")); // tester1
        System.out.println("map.get(\"tester\") = " + map.get("tester")); // null
        System.out.println("map.getOrDefault(\"tester1@tes.com\",\"1234\") = " + map.getOrDefault("tester1@tes.com", "1234")); // tester1
        System.out.println("map.getOrDefault(\"tester\",\"1234\") = " + map.getOrDefault("tester", "1234")); // 1234

    }
}
