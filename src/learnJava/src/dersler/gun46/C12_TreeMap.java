package learnJava.src.dersler.gun46;

import java.util.*;

public class C12_TreeMap {
        /*
        TreeMap->Mudur sırası
        1-TreeMap key'lerde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
         */

    public static void main(String[] args) {
        TreeMap<Integer,String> tmap = new TreeMap<>();

        tmap.put(101,"tester1"); // --> Entry girildi
        tmap.put(131,"tester4");
        tmap.put(141,"tester5");
        tmap.put(111,"tester2");
        tmap.put(121,"tester1");

        // Null Key girilemez:
        //tmap.put(null,"tester"); // NullPointerException

        tmap.put(121,"tester12"); // dublicate key girilemiyor, eski value eziliyor

        tmap.put(51,"defaultTester"); // en başa ekler...

        // ceilingEntry() girilen değere ait entryi veya en yakın bir üst entryi döner
        System.out.println("tmap.ceilingEntry(120) = " + tmap.ceilingEntry(120));  // 121=tester12
        System.out.println("tmap.ceilingEntry(121) = " + tmap.ceilingEntry(121));  // 121=tester12
        System.out.println("tmap.ceilingEntry(122) = " + tmap.ceilingEntry(122));  // 131=tester4
        System.out.println("tmap.ceilingEntry(500) = " + tmap.ceilingEntry(500));  //  null

        // floorEntry() girilen değere ait entryi veya en yakın bir alt entryi döner
        System.out.println("tmap.floorEntry(120) = " + tmap.floorEntry(120)); //111=tester2
        System.out.println("tmap.floorEntry(121) = " + tmap.floorEntry(121)); // 121=tester12
        System.out.println("tmap.floorEntry(122) = " + tmap.floorEntry(122)); // 121=tester12
        System.out.println("tmap.floorEntry(50) = " + tmap.floorEntry(50)); // null

        System.out.println("tmap.floorKey(122) = " + tmap.floorKey(122)); // 121
        System.out.println("tmap.ceilingKey(122) = " + tmap.ceilingKey(122)); // 131

        // descendingKeySet
        System.out.println("tmap.descendingKeySet() = " + tmap.descendingKeySet()); // [141, 131, 121, 111, 101, 51]

        // ascendingKeySet zaten natural sıralama yapıldı

        System.out.println("map = " + tmap);

    }
}
