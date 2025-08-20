package learnJava.srcHoca.j30maps;

import java.util.HashMap;

public class C03_Get {
    //map.get(key);->girilen key'e ait value return eder.

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        System.out.println("map.get(\"tester5@tes.com\") = " + map.get("tester5@tes.com"));
        String tester3Sifre = map.get("tester3@tes.com");
        System.out.println("tester3Sifre = " + tester3Sifre);

        String tester3SifreYanlıs = map.get("tester3@test.com"); // olmayan key değerinin value su sorgulanırsa null döner
        System.out.println("tester3SifreYanlıs = " + tester3SifreYanlıs);

    }
}
