package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
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
        ArrayList<String> strList = new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        ArrayList<Integer> resultList = getLength(strList);
        System.out.println("resultList = " + resultList);

    }

    public static ArrayList<Integer> getLength(ArrayList<String> strList){
        ArrayList<Integer> lengthList = new ArrayList<>();
        for (String kelime:strList){
            lengthList.add(kelime.length());
        }
        return lengthList;
    }
}
