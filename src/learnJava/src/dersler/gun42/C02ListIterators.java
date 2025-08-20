package learnJava.src.dersler.gun42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02ListIterators {

    public static void main(String[] args) {
        System.out.println("*** Task 01 ***");
        //Task01-> l2  elemanlarını :-) update edip  print eden code create ediniz.
        List<String> l2 = new ArrayList<>(Arrays.asList("javaCAN", "javvaNUR", "javaNAZZZ", "javaSU", "javaHAN", "javaZADE", "javaTAR", "javaLAZIM"));

        ListIterator<String> litr =l2.listIterator();
        while (litr.hasNext()){
            litr.set( litr.next()+" :-");
        }
        System.out.println("l2 = " + l2);
// Gerek olmamasına rağmen güncellemenin bir kısmını ileriye doğru bir kısmını geriye doğru ilerieyerek yaptık
        while (litr.hasPrevious()){
            String isim = litr.previous();
            litr.set(isim + ")");
        }
        System.out.println("l2 = " + l2);

        List<String> l3 = new ArrayList<>(Arrays.asList("küşleme", "göveç", "soğan kebap", "ankara doner", "kuzu gerdan", "acıl antep tava", "şaşlık", "mardin şiş"));
        System.out.println("*** Task 02 ***");
        //Task02-> l3  elemanlarını ilk harfi buyuk kalan harfleri *** ile update edip  print eden code create ediniz.

        ListIterator<String> litr2 = l3.listIterator();

        while (litr2.hasNext()){
            String isim = litr2.next();
            isim = isim.substring(0,1).toUpperCase() + "***";
            litr2.set(isim);
        }
        System.out.println("l3 = " + l3);


    }
}
