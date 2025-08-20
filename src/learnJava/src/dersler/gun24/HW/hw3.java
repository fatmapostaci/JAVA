package learnJava.src.dersler.gun24.HW;

import java.util.ArrayList;
import java.util.List;

public class hw3 {
    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        Tüm elementlerin uzunluğunu döndürün
        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */
    public static void main(String[] args) {
       List <String> stringList = List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston");
        ArrayList <String> stringArrayList = new ArrayList<>(stringList);
        System.out.println("String Array Listesi = " + stringArrayList);
        ArrayList<Integer> integerArrayList = getLength(stringArrayList);
        System.out.println("Her stringin uzunluğu = " + integerArrayList);
    }
    public static ArrayList<Integer> getLength(ArrayList<String> stringArrayList ){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (String i : stringArrayList){
            integerArrayList.add( i.length() );
        }
        return integerArrayList;
    }
}
