package learnJava.src.dersler.gun42;

import java.util.*;

public class C03Previous {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>(Arrays.asList("Trileçe", "KazanDibi", "HavucDilimi", "CennetÇamuru", "Künefix", "Bal-Gaymahhh", "Kerebiç"));
        System.out.println("l1 ilk hali  = " + l1);

        System.out.println("*** task 01 ***");
        // Task01-> l1 elemanlarını  sondan başa dogru print eden code create ediniz.

        // 1. Yol:
        //Collections.reverse(l1);
       // System.out.println("l1 = " + l1);

        ListIterator<String> litr = l1.listIterator();
        while (litr.hasNext()){
            litr.next();  // Cursor en sona alındı
        }

        while (litr.hasPrevious()){
            System.out.print(litr.previous() + " ");
        }

        System.out.println();

        System.out.println("*** task 02 ***");
        // Task02-> l1 son elemanını :-) ile update edip print eden code create ediniz.
        System.out.println("litr.previousIndex() = " + litr.previousIndex()); // -1 cursorun öncesindaki (solundaki index)
        System.out.println("litr.nextIndex() = " + litr.nextIndex()); // 0 cursorun sağındaki index

        while (litr.hasNext()){
            litr.next();
        }

        String sonIsim = litr.previous();
        litr.set(sonIsim + ":-)");

        System.out.println("l1 = " + l1);
    }
}
