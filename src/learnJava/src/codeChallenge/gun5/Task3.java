package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
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
                ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
                ArrayList<Integer> lenghtArrayList  = getLength(stringArrayList);
                System.out.println(lenghtArrayList);
        }

        public static ArrayList<Integer> getLength(ArrayList<String> stringArrayList ) {
                ArrayList<Integer> integerArrayList = new ArrayList<>();
                for (String s : stringArrayList){
                        integerArrayList.add( s.length() );
                }
                return integerArrayList;
        }
}
