package learnJava.src.dersler.gun44;

import java.util.*;

public class Tasks {


    public static void main(String[] args) {

              /* Task->
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */
        String [] strArr = {"Ali", "Ahmet","Mary","John","Alice"};
        ArrayList<String> list = changeArrayToArrayAsList(strArr);
        HashSet<String> hashSet = new HashSet<>(list);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(list);
        TreeSet<String> treeSet = new TreeSet<>(list);

        System.out.println("hashSet = " + hashSet); // rastgele sıralar
        System.out.println("linkedHashSet = " + linkedHashSet);  //listeyi oluşturduğum şekilde sıralar
        System.out.println("treeSet = " + treeSet);  //alfabetik sıralar


        /*
         Task->
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "Germany" , "Brazil" ,"USA"
    ArrayListi print eden method create ediniz.
     */
        HashSet<String> hs1 = new HashSet<>(Arrays.asList( "Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Germany" , "China" , "Brazil" , "France" ,  "USA"));
        System.out.println("commonValues(hs1,hs2) = " + commonValues(hs1, hs2));
    }


//interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
    // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
    // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...
    // iyi bir javaCAN  için gelişMAC lazım :)

    private static ArrayList<String> commonValues(HashSet<String> hs1,HashSet<String> hs2) {

        hs1.retainAll(hs2);  //ortak olanlar s1 de kalıyor, s2 deki ortak olmayanlar ekleniyor

        return new ArrayList<>(hs1);
    }

    //orjinal datayı bozmadan retain methodunu kullanalım
    private  <T> ArrayList<T> commonValues2(HashSet<T> hs1, HashSet<T> hs2){

        HashSet<T> tempSet = new HashSet<>(hs1);
        tempSet.retainAll(hs2);
        return new ArrayList<>(tempSet);
    }
    public static <T>ArrayList<T> changeArrayToArrayAsList (T[] arr){

        return  new ArrayList<>(Arrays.asList(arr));
    }


}
