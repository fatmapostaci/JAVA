package learnJava.src.dersler.gun42.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class HW {
    public static void main(String[] args) {


    /*
      task -> Verilen bir integer listin tek  elemanlarının karesini tersten iterator  print eden code create ediniz
       */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14, 25, 36, 47, 58, 69, 12, 45, 78));
        ArrayList<Integer> newList = new ArrayList<>();

        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()){

            int temp = iterator.previous();
            //System.out.println("iterator.previous = " + temp);
            if(temp %2 == 1)
                newList.add(temp);
        }
        System.out.println("newList = " + newList);


    /*  task->
        Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
        elementleri silip print eden code create ediniz
        (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
         */

        ArrayList<Integer> sayiList = new ArrayList<>(Arrays.asList(7,14, 25, 36, 47, 19, 69, 12, 45, 78));
        Iterator<Integer> itr = sayiList.iterator();
        while (itr.hasNext()){
            int temp = itr.next();
            if(temp<20 || temp>40){
                itr.remove();
                System.out.println("removed number = " + temp);
            }
        }
        System.out.println("output = " + sayiList);


        // Task->verilen listedeki her elementi 3 artirip print eden code create ediniz..
        ArrayList<Integer> sayiList1 = new ArrayList<>(Arrays.asList(14, 25, 36, 47, 58, 69, 12, 45, 78));
        System.out.println("sayiList1 işlem öncesi= " + sayiList1);

        ListIterator<Integer> itr2 = sayiList1.listIterator();
        while (itr2.hasNext()){
            itr2.set(itr2.next()+3);
        }
        System.out.println("sayiList1 elemenetleri 3 fazlası = " + sayiList1);
    }
}