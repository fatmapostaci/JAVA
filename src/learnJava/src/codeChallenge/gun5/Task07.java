package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
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
        ArrayList<Integer> list1 = new ArrayList<>(List.of(3, 2, 5, 6));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(5, 8, 9));

        ArrayList<Integer> list3 = new ArrayList<>(List.of(8, 7, 9, 6, 7));
        ArrayList<Integer> list4 = new ArrayList<>(List.of(6, 7, 12, 3, 1));

        ArrayList<Integer> common = common_values1(list3, list4);
        ArrayList<Integer> common2 = common_values1(list1, list2);
        System.out.println("common = " + common);
        System.out.println("common2 = " + common2);


    }

    public static ArrayList<Integer> common_values1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> ortak = new ArrayList<>();

        for (Integer value : list1) {
            if (list2.contains(value) && !ortak.contains(value)) {
                ortak.add(value);
            }
        }
        return ortak;
    }
/*
    public static ArrayList<Integer> common_values(ArrayList<Integer> intList1, ArrayList<Integer> intList2) {

        ArrayList<Integer> returnList = new ArrayList<>();
        for (Integer i : intList1)
            for (Integer j : intList2)
                if (i.equals(j))
                    if (returnList.contains(i)) {
                        continue;
                    } else
                        returnList.add(j);
        return returnList;
    }

    public static int common_valuesT(ArrayList<Integer> arr, ArrayList<Integer> arr2) {
        int sayi = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr2.get(j).equals(arr.get(i))) {
                    sayi = arr2.get(j);
                }
            }
        }
        return sayi;
    }

    public static ArrayList<Integer> common_valuesM(ArrayList<Integer> liste1, ArrayList<Integer> liste2) {
        ArrayList<Integer> ortaklar = new ArrayList<>();
        for (Integer deger : liste1) {
            if (liste2.contains(deger)) {
                ortaklar.add(deger);
            }
        }
        return ortaklar;
    }

 */
}