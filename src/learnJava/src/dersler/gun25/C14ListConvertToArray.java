package learnJava.src.dersler.gun25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14ListConvertToArray {

    public static void main(String[] args) {
        //listi arraya cevirme->toArray()
        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        ulkeList.set(ulkeList.indexOf("Alamanya"),"Almanya");

        //1. yontem -> toArray(new String[0]); toArray() parametre olarak String[0] olarak eklenir..
        //ulkeList.toArray(new String[ulkeList.size()]); // Arrayin length i ni bu şekilde belirtebiliriz
        String [] ulkeArr = ulkeList.toArray(new String[0]);
        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));
        ulkeArr[0] = "Almanya";

        //2. yöntem -> tanımlanan Array'in data type Object(Hz Adem Class) olarak tanımlanır
        Object [] ulkeArr2 = ulkeList.toArray();
        System.out.println("ulkeArr2[0] = " + ulkeArr2[0]);
        String ulke = ulkeArr2[0].toString();
        System.out.println("ulke = " + ulke);

    }
}
