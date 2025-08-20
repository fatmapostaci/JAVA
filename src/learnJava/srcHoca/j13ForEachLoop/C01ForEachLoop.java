package learnJava.srcHoca.j13ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01ForEachLoop {

    public static void main(String[] args) {
        /*
        for-each loop for loop'un gelişmiş halıdir.
        1. clean code- yazım kolaylığı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır.
         */
        List<Integer> sayiList=new ArrayList<>(List.of(16,21,33,54,15,45,58));
        System.out.println("***Task 01***");
        // Runner-> sayiList elemanlarını ayrı satırda print eden code create ediniz.

        for (int i = 0; i< sayiList.size(); i ++){
            int sayi = sayiList.get(i);
            System.out.print(sayi + " ");
        }
        System.out.println();
        System.out.println("********* For Each ile **********");

        //   dataType      variable    data source(Collection)
        for (  int           sayi :       sayiList ) {
            System.out.print(sayi + " ");
        }


        System.out.println();
        System.out.println("   ***   Runner   ***   ");
        // task2-> sayiList tek elemanlarını ilk 3 eleman hariç print eden code create ediniz.
        for ( int sayi : sayiList.subList(3, sayiList.size())){
            if (sayi % 2 ==1) System.out.print(sayi + " ");
        }

        System.out.println();
        System.out.println("   ***   Task03   ***   ");
        // task03-> sayiList  elemanlarını 2 ve 5 index(2,3,4,5) dahil  toplamını print eden code create ediniz.
        int sum = 0;
        for (int w: sayiList.subList(2,6)){
            sum += w;
        }
        System.out.println("Sayıların toplamı = " + sum);
    }

}
