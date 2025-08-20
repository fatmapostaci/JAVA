package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task7 {
       /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */
       public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4));

        ArrayList<Integer> list2 = new ArrayList<>(List.of(4,3,13));
           System.out.println(common_values2(list1, list2));
       }

    public static ArrayList<Integer> common_values(ArrayList<Integer> intList1, ArrayList<Integer> intList2)
    {
           ArrayList<Integer> returnList = new ArrayList<>();
           for (Integer i : intList1)
               for (Integer j : intList2)
                  if( i.equals(j) && !returnList.contains(j))
                      returnList.add(j);
           return returnList ;
    }
    public  static ArrayList<Integer> common_values2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> ortak = new ArrayList<>();

        for (Integer value : list1) {
            if (list2.contains(value) && !ortak.contains(value)) {
                ortak.add(value);
            }
        }
        return ortak;
    }
}
