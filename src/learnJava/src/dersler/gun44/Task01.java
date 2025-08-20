package learnJava.src.dersler.gun44;

import java.util.*;

public class Task01 {
       /* Task->
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */

    public static void main(String[] args) {
        String[] strArr = {"Ali","Marry","Alice","John"};
        Integer[] intArr = {1,4,7,3};



        ArrayList<String> list = chanegeArraytoArrayList2(strArr);
        ArrayList<Integer> intlist = chanegeArraytoArrayList2(intArr);

        HashSet<String> hashSet = new HashSet<>(list);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(list);
        TreeSet<String> treeSet = new TreeSet<>(list);

        System.out.println("hashSet = " + hashSet); //hashSet = [Alice, John, Ali, Marry]
        System.out.println("linkedHashSet = " + linkedHashSet); //linkedHashSet = [Ali, Marry, Alice, John]
        System.out.println("treeSet = " + treeSet); //treeSet = [Ali, Alice, John, Marry]

    }

    public static ArrayList<String> chanegeArraytoArrayList(String[] arr ){
        return new ArrayList<>(Arrays.asList(arr));
    }
    public static <T> ArrayList<T> chanegeArraytoArrayList2(T [] arr ){
        return new ArrayList<>(Arrays.asList(arr));
    }
    }

