package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task06 {    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */


    public static void main(String[] args) {
        ArrayList<String> sehirList = new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));

        System.out.println("sehirList = " + sehirList);
        //rotateList2(sehirList);
        ArrayList<String> reversedList = rotateList(sehirList);
        System.out.println("sehirList = " + sehirList);
        System.out.println("reversedList = " + reversedList);

    }

    public static ArrayList<String> rotateList(ArrayList<String> list ){
        return new ArrayList<>(list.reversed());

    }
    public static void rotateList2(ArrayList<String> list ){
        Collections.reverse(list);
    }
}
