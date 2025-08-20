package learnJava.src.dersler.gun42;

import java.util.*;

public class Tasks_ListIterator {

    public static void main(String[] args) {
        //Task01-> l2  elemanlarını :-) update edip  print eden code create ediniz.
        List<String> l2 = new ArrayList<>(Arrays.asList("javaCAN", "javvaNUR", "javaNAZZZ", "javaSU", "javaHAN", "javaZADE", "javaTAR", "javaLAZIM"));

        ListIterator<String> listIterator = l2.listIterator();
        while (listIterator.hasNext()){
            listIterator.set(listIterator.next().toUpperCase());
            if(listIterator.previous().equals("JAVASU")) {
                listIterator.set("fatma".toUpperCase());
            }
            //previousu kontrol ettirdiğğim için cursor geri gidiyor, o yüzden cursor ı tekrar ileri almalıyım
            listIterator.next();
        }
        System.out.println("l2 = " + l2);

        //Task02-> l3  elemanlarını ilk harfi buyuk kalan harfleri *** ile update edip  print eden code create ediniz.
        List<String> l3 = new ArrayList<>(Arrays.asList("küşleme", "göveç", "soğan kebap", "ankara doner", "kuzu gerdan", "acıl antep tava", "şaşlık", "mardin şiş"));

        listIterator = l3.listIterator();
        listIterator.add("deneme");
        System.out.println("l3 = " + l3);


    }
}
