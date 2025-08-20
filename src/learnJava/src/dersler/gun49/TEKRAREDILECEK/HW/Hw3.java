package learnJava.src.dersler.gun49.TEKRAREDILECEK.HW;

import java.util.LinkedHashMap;
import java.util.Map;

public class Hw3 {
    public static void main(String[] args) {
            /* Task -> Ad ve soyad bulunduran iki ayrı array'i bir map'de print eden code create ediniz.
     input : {"javaCAN", "javaTAR", "javaNAZ"};  {"Ahmet", "Haluk", "İpek"};
     output:{javaCAN=Ahmet,javaTAR=Haluk,javaNAZ=İpek}
    */
        String arr[] = {"javaCAN", "javaTAR", "javaNAZ"};
        String isim[] = {"Ahmet", "Haluk", "İpek"};

        Map<String,String> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i],isim[i]);
        }

        System.out.println(map);
    }
}
