package learnJava.src.dersler.gun43.Mentoring;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

public class Tasks {


    public static void main(String[] args) {
        /*  Soru : Listeyi yazdırma (ListIterator ile çözünüz)
         */
            ArrayList<String> names = new ArrayList<>();
            names.add("Ali");
            names.add("Ayşe");
            names.add("Mehmet");
            names.add("Fatma");
            names.add("Cem");

            ListIterator<String> stringListIterator = names.listIterator();

            while (stringListIterator.hasNext()) {
                System.out.print(" " + stringListIterator.next());
            }
        System.out.println();


         // Elemanları büyük harfe çevirme
        stringListIterator = names.listIterator();
            while (stringListIterator.hasNext()){
                stringListIterator.set(stringListIterator.next().toUpperCase());
            }

        System.out.println("names = " + names);


        // İçinde 10 eleman bulunan bir ArrayList’teki her iki elemandan birini ListIterator kullanarak silin. ***
        ArrayList<String> adlar = new ArrayList<>();
        adlar.add("Ali");
        adlar.add("Ayşe");
        adlar.add("Mehmet");
        adlar.add("Fatma");
        adlar.add("Cem");
        adlar.add("Zeynep");
        adlar.add("Kevser");
        adlar.add("Melike");
        adlar.add("Bilal");
        adlar.add("Mustafa");

        ListIterator<String> listIterator1 = adlar.listIterator();

        System.out.println("adlar = " + adlar);
        while (listIterator1.hasNext()){

            listIterator1.next();

            if (listIterator1.nextIndex()% 2 == 0) { // Check if the current index is odd
                continue;
            }
           else {
                listIterator1.remove();
                listIterator1.add(null);
                System.out.println("listIterator1.nextIndex() = " + listIterator1.nextIndex());
            }

        }

        adlar.removeIf(Objects::isNull);

        System.out.println("----");
        System.out.println("adlar = " + adlar);

    }
}
