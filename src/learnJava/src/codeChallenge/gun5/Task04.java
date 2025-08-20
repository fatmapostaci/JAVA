package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
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
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
       // changeInArraylist(strList,"blue","yellow");
        ArrayList<String> list = changeInArraylist2(strList,"blue","yellow");
        System.out.println("strList = " + strList);
        System.out.println("list = " + list);

    }
    public static void changeInArraylist(ArrayList<String> arrayList, String s1,String s2 ){
        for (String w: arrayList){
            if (w.equals(s1)){
                arrayList.set(arrayList.indexOf(w),s2);
            }
        }
    }

    public static ArrayList<String> changeInArraylist2(ArrayList<String> arrayList, String s1,String s2 ){
        ArrayList<String> newList = new ArrayList<>(arrayList);// newList original arrayList copyasından oluşturulmuş bağımsız bir array. (Farklı referansları kullanıyorlar)
        // ArrayList<String> newList2 =arrayList; // newList2 değiştirilirse bu değişiklik orijinal arrayList arrayini de değiştirir.(Aynı referansları kullanıyorlar)

        for (String w: newList){
            if (w.equals(s1)){
                newList.set(newList.indexOf(w),s2);
            }
        }
        return newList;
    }
}
