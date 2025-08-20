package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C13Sort {
    //Collection.sort():-> list elemanlarını doğal (NATUREL ORDER) sıralama yapar

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        System.out.println("sort öncesi countryList = " + countryList);
        Collections.sort(countryList);
        System.out.println("sort sonrası countryList = " + countryList);

        List<Integer> numList = new ArrayList<>(List.of(23,2,45,6,8,2,4,6,2));
        Collections.sort(numList);
        System.out.println("numList = " + numList);

        // Collections.reverse() -->Tam ters şekilde sıralama yapmak için kullanılır
        System.out.println("reverse öncesi countryList = " + countryList);
        Collections.reverse(countryList);
        System.out.println("reverse sonrası countryList = " + countryList);

        Collections.reverse(numList);
        System.out.println("reverse sonrası numList = " + numList);

        // List.sort() --> Daha modern bir sıralama metodu
        ArrayList<String> countryList2 = new ArrayList<>(List.of("Z","Asa","Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        //countryList2.sort(Comparator.naturalOrder());
        //countryList2.sort(null);

        countryList2.sort(Comparator.reverseOrder());
        countryList2.sort(Comparator.comparing(String::length)); // harfsayısına göre  sıralar
        countryList2.sort(Comparator.comparing(String::length).reversed()); // harfsayısına göre reverse sıralar
        System.out.println("countryList2 = " + countryList2);


    }
}
