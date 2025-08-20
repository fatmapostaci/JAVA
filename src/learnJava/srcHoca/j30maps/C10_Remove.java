package learnJava.srcHoca.j30maps;

import java.util.HashMap;

public class C10_Remove {
    // map.remove(); -> Girilen entry map'de var ise siler ve true return eder yoksa false return eder.
    // parametre entry değil sadece key değer girilirse key map'de varsa siler ve silinen key value return eder yoksa null return eder

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        System.out.println("remove öncesi map = " + map);

        // Tek parametreli remove:
        String removedValue1 = map.remove("tester5"); // uymayan key değeri olduğu için kaldırmaz null döner.
        String removedValue2 = map.remove("tester5@tes.com"); // key değeri olduğu için kaldırır  ve kaldırılan valueyu döner.


        System.out.println("removedValue1 = " + removedValue1);
        System.out.println("removedValue2 = " + removedValue2);

        // İki paremetreli remove key ve value eşleşmesini kontrol eder.
        map.remove("tester4@test.com","tester4"); // key yanlış
        map.remove("tester4@tes.com","tester5"); // value yanlış
        map.remove("tester4@tes.com","tester4"); // eşleşme sağlandığı için kaldırılır

        System.out.println("remove sonrası map = " + map);

    }
}
