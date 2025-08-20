package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6 {
    /*
      rotateList() isminde bir method oluşturun.
      Parametre olarak String ArrayList
      ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
      Tersten yazılmış halini return edin.
      Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
      cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
   */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(List.of("New jersey", "New york", "Atlanta", "Florida", "Ohio"));

        ArrayList<String> returnedList =rotateList(arrayList);
        System.out.println("returnedList = " + returnedList);
        System.out.println(arrayList);

        System.out.println();

        rotateList3(arrayList);
        System.out.println(arrayList);

        rotateList2(arrayList);
        System.out.println(arrayList);

        swapList(arrayList);
        System.out.println("swapped arrayList = " + arrayList);

    }
        //orjinal arraylisti değiştirmeden return eder.
    public static ArrayList<String> rotateList(ArrayList<String> arrayList) {
        //ArrayList<String> newList = new ArrayList<>(arrayList.reversed());  //ilk yol
        //return newList;
        return  new ArrayList<>(arrayList.reversed());  //daha kısa ikinci yol
    }
    public static void rotateList2(ArrayList<String> arrayList) {
        Collections.reverse(arrayList);  //orjinal listi direk günceller, çünkü method içinde set methodunu içeriyor
    }
    public static void rotateList3(ArrayList<String> arrayList) {
        arrayList.reversed();  // orjinal listi güncellemez return etmesi gerek
    }
    public static void swapList(ArrayList<String> arrayList){
        Collections.swap(arrayList,arrayList.indexOf("Atlanta"),0);  //orjinal listi günceller return etmesine gerek yok
    }

}

