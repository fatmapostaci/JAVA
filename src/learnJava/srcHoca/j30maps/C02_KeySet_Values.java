package learnJava.srcHoca.j30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class C02_KeySet_Values {
    //map.keySet()-> map key değerlerini Set'e(coll.) atayıp return eder
    //map.values()-> map value değerlerini coll.  atayıp return eder

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        // keySet() metodu ile Key değerlerine toplu şekilde ulaşma.

        Set<String> keyset = map.keySet();
        System.out.println("keyset = " + keyset);
        //System.out.println("map.keySet() = " + map.keySet());

        // values() metodu ile tüm değerleri toplu şekilde ele alabiliriz
        Collection<String> valueList = map.values();
        System.out.println("valueList = " + valueList);

        // task-> hm key ve value'ları aynı satırda (satır-satır) ve keyler buyuk harf olarak print eden code create ediniz
        System.out.println();
        System.out.println("********** Keyleri yan yana yazdıralım *********");

        for (String key : map.keySet()){
            key =key.toUpperCase();
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.println("********** Valueları yan yana yazdıralım *********");

        for (String value: map.values()){
            System.out.print(value + " ");
        }
    }
}
