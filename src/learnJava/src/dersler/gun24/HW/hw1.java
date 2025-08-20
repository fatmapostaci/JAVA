package learnJava.src.dersler.gun24.HW;

import java.util.ArrayList;
import java.util.List;

public class hw1 {
    /*
         ismi getCount() olan bir method oluşturun.
         Parametre olarak bir String ArayList  ve  bir tane String
         Return tipi int olmalı.
         ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
         Örneğin;
         ArrayList = Orange , Kiwi , Peach , Banana , Orange
         String Orange:
         Count = 2 olmalı. (Orange 2 kez yazılmış)
          */
    static int counter = 0;  //counter ı method dışına almak zorundaydım. (başka bir methodda kullanmadan önce değer sıfırlanmalı)

    public static void main(String[] args) {
        ArrayList<String> listArray = new ArrayList<>(List.of("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        System.out.println("getCount(listArray,\"Orange\") = " + getCount(listArray, "Orange"));
        counter=0;
        System.out.println("getCount(listArray,\"Banana\") = " + getCount(listArray, "Banana"));
    }

    public static int getCount(ArrayList<String> list, String s) {
        int index = list.indexOf(s);
        if (list.contains(s)) {
            list.remove(index);  //listeden indexteki string i siler
            counter++;
            getCount(list, s);  //string arraylist in içinde var olduğu sürece recursive olarak çağırıyorum.
        }
        return counter;
    }
}
