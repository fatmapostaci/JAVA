package learnJava.src.dersler.gun49.TEKRAREDILECEK.HW;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HW2 {
    public static void main(String[] args) {
            /*
     Task-> aşağıdaki çıktıyı print eden code create ediniz.
     Kiraz 100
     İncir 200
     Enginar 150
     Üzüm 145
     Nar 250

     */

        //immutable hashmap oldu.
        HashMap<String, Integer>  hashMap =new LinkedHashMap<>( Map.of("Kiraz",100,"İncir",200,"Enginar",150,"Üzüm",145));

        hashMap.put("Nar",250);

        for (Map.Entry<String,Integer> entry : hashMap.entrySet()){

            System.out.println( entry.getKey() + " " +  entry.getValue() );
        }

    }
}
