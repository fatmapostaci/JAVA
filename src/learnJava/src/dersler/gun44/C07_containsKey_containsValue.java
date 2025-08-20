package learnJava.src.dersler.gun44;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    //map.containsKey();->Girilen Key değerinin  map'de varlığını  kontrol eder boolean  return eder.
    //map.containsValue();->Girilen value değerinin  map'de varlığını  kontrol eder boolean  return eder.

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        //map.containsKey()
        System.out.println("map.containsKey(\"tester3@tes.com\") = " + map.containsKey("tester3@tes.com")); // true
        System.out.println("map.containsKey(\"tester3@test.com\") = " + map.containsKey("tester3@test.com")); // false

        //map.containsValue()
        System.out.println("map.containsValue(\"tester4\") = " + map.containsValue("tester4")); // true
        System.out.println("map.containsValue(\"tester\") = " + map.containsValue("tester")); // false

    }
}
