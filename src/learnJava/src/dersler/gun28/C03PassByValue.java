package learnJava.src.dersler.gun28;

import java.util.ArrayList;
import java.util.List;

public class C03PassByValue {
    /*
        Java Pass By Value uygulayan bir programlama dilidir.  --> Değişkenin kendisini değil değerinin kopyasını iletir.

        Eğer bir metodun parametresine primitive bir veri tipi (örneğin int, double, char) geçirirseniz,
    bu veri tipinin değeri metota kopyalanır.
        Metot içinde bu kopyayı değiştirebilirsiniz, ama bu değişiklik orijinal değişkeni etkilemez.

        Eğer bir metodun parametresine bir obje (örneğin bir String veya bir List) geçirirseniz,
    bu objenin referansı kopyalanır.
        Bu, metot içinde kopyalanan referansla orijinal objeye erişilebildiği anlamına gelir.
    Bu yüzden, objenin içeriği değiştirilebilir.
    *** Ancak, metot içinde referansın kendisi değiştirilirse (örneğin, referansa yeni bir obje atanırsa),
    orijinal obje bundan etkilenmez.
     */
    // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
    //      update edip print eden METHOD create ediniz.
    //1. method-> with for each 2. method-> set(index,value)
     public static void main(String[] args) {

         List<Integer> numList = new ArrayList<>();
         numList.add(24);
         numList.add(20);
         numList.add(87);

         System.out.println("metod öncesi numList = " + numList);
         updateList(numList);
         System.out.println("metod sonrası numList = " + numList);

         System.out.println("metod öncesi numList = " + numList);
         updateList2(numList);
         System.out.println("metod sonrası numList = " + numList);

     }
     public static void updateList(List<Integer> list){
         for (Integer w:list){
             list.set(list.indexOf(w),w+5 );
         }
         System.out.println("metod içinde numList = " + list);
     }
    public static void updateList2(List<Integer> list){
        List<Integer> newList = new ArrayList<>(list);
         for (Integer w:newList){
             newList.set(list.indexOf(w),w+5 );
        }
        System.out.println("metod içinde numList değişmeyen = " + list);
        System.out.println("metod içinde numList2 yeniliste= " + newList);
    }
}
