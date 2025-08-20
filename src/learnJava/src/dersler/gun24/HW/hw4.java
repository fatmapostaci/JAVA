package learnJava.src.dersler.gun24.HW;

import java.util.ArrayList;
import java.util.List;

public class hw4 {
    /*
     İsmi changeInArraylist() olan bir method oluşturun.
     Parametre olarak String ArrayList, String s1, String s2
        Arraylist'te s1'i s2 olarak değiştirin
     Return String arrayList
     Örneğin;
     Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
     s1 = blue
     s2 = yellow
     Tüm blue 'ları yellow'a dönüştürün.
     cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
  */
    public static void main(String[] args) {
        ArrayList<String> colorArrList = new ArrayList<>(List.of("yellow", "red", "blue", "red", "blue"));
        String color1 = "blue", color2 = "yellow";
        colorArrList = changeInArraylist(colorArrList, color1, color2);
        System.out.println("colorArrList = " + colorArrList);
        color1="yellow";
        color2="black";
        colorArrList = changeInArraylistNotRecursive(colorArrList, color1, color2);
        System.out.println("colorArrList = " + colorArrList);
    }

    public static ArrayList<String> changeInArraylist(ArrayList<String> strArrList, String s1, String s2) {
        if (strArrList.contains(s1)) {
            int index = strArrList.indexOf(s1);
            strArrList.set(index, s2);
            changeInArraylist(strArrList, s1, s2);//recursive olarak çağırıp tüm s1 leri s2 ile set ederiz.
        }
        return strArrList;
    }

    //yada recursive olmadan da çözelim, foreach ile array i gezeriz
    public static ArrayList<String> changeInArraylistNotRecursive(ArrayList<String> strArrList, String s1, String s2) {
        for (String i : strArrList) {
            if (i.equals(s1)) {
                int index = strArrList.indexOf(s1);
                strArrList.set(index, s2);
            }
        }
        return strArrList;
    }

}
