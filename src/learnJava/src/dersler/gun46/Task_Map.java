package learnJava.src.dersler.gun46;

import java.util.*;

public class Task_Map {
    public static void main(String[] args) {
        //map.replace();-> girilen  value değeri ilgili Key'de update edilip oldValue(update öncesi eski value) return edilir.

     // map.remove(); -> Girilen entry map'de var ise siler ve true return eder yoksa false return eder.
    // parametre entry değil sadece key değer girilirse key map'de varsa siler ve silinen key value return eder yoksa null return eder

        HashMap<String, String> map = new HashMap<>();


        map.put("tester1@tes.com","tester1");
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        System.out.println("map = " + map);
        String removedValue1 = map.remove("tester5");
        System.out.println("removedValue1 = " + removedValue1);
        System.out.println("map = " + map);
        String removedValue2 = map.remove("tester5@tes.com");
        System.out.println("removedValue2 = " + removedValue2);
        System.out.println("map = " + map);


        boolean removedValue3 = map.remove("tester4@tes.com","4");
        System.out.println("removedValue3 = " + removedValue3);
        System.out.println("map = " + map);

        boolean removedValue4 = map.remove("tester4@tes.com","tester4");
        System.out.println("removedValue4 = " + removedValue4);
        System.out.println("map = " + map);


        //map.putIfAbsent(); -> Girilen key map'de yok ise entry(key,value) map'e eklenir ve null return eder.
        //Girilen key map'de var ise key'e ait value return eder
        String putIfAbsent = map.putIfAbsent("tester@tes.com", "tester");
        System.out.println("putIfAbsent = " + putIfAbsent);
        System.out.println("map = " + map);
        String putIfAbsent1 = map.putIfAbsent("tester1@tes.com","tester");
        System.out.println("putIfAbsent1 = " + putIfAbsent1);
        System.out.println("map = " + map);
        String putIfAbsent2 = map.putIfAbsent("tester1@tes.com","tester1");
        System.out.println("putIfAbsent2 = " + putIfAbsent2);
        System.out.println("map = " + map);

           /*
        TreeMap->Mudur sırası
        1-TreeMap key'lerde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
         */
        {
            TreeMap<Integer,String> tmap = new TreeMap<>();

            tmap.put(101,"tester1"); // --> Entry girildi
            tmap.put(121,"tester2");
            tmap.put(111,"tester1");
            tmap.put(141,"tester4");
            tmap.put(105,"tester5");

            // Null Key girilemez:
            //tmap.put(null,"tester");    //NullPointerException


            tmap.put(121,"tester12");
            System.out.println("tmap = " + tmap);
            tmap.put(51,"default");
            System.out.println("tmap = " + tmap);

            System.out.println("tmap.ceilingEntry(120) = " + tmap.ceilingEntry(120)); //121
            System.out.println("tmap.ceilingEntry(122) = " + tmap.ceilingEntry(122)); //131
            System.out.println("tmap.ceilingEntry(500) = " + tmap.ceilingEntry(500)); //null
            System.out.println("tmap.ceilingEntry(141) = " + tmap.ceilingEntry(141));

            System.out.println("tmap.floorEntry(120) = " + tmap.floorEntry(120));
            System.out.println("tmap.floorEntry(121) = " + tmap.floorEntry(121));

            System.out.println("tmap.descendingKeySet() = " + tmap.descendingKeySet());
            NavigableSet<Integer> navigableSet = tmap.descendingKeySet();
            List<Integer> integerList = new ArrayList<>(navigableSet);
            System.out.println("navigableSet = " + navigableSet);
            System.out.println("integerList = " + integerList);
            System.out.println("tmap = " + tmap);

        }

    }
}
