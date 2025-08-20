package learnJava.src.dersler.gun44;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task03 {

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

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(List.of("Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String> set2 = new HashSet<>(List.of("Germany" , "China" , "Brazil" , "France" ,  "USA"));


        //ArrayList<String> arrayList = commonValues(set1,set2); // static metoda direk class ismiyle
        Task03 obj = new Task03();

        ArrayList<String> arrayList = obj.commonValues2(set1,set2); // non- static metoda obje üzerinden

        System.out.println("arrayList = " + arrayList);
        System.out.println("set1 = " + set1);
    }
    public static <T> ArrayList<T> commonValues(HashSet<T> set1,HashSet<T> set2 ){
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }
    public static ArrayList<Object> commonValues3(HashSet<Object> set1,HashSet<Object> set2 ){
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }

    public <T> ArrayList<T> commonValues2(HashSet<T> set1,HashSet<T> set2 ){
        //set1.retainAll(set2);
        HashSet<T> copySet = new HashSet<>(set1);
        copySet.retainAll(set2);
        return new ArrayList<>(copySet);
    }

}
