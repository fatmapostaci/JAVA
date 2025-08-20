package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.List;

public class C08Set {
    //set()-> listin istenen index'te istenen elemanını update set eder-> şu indexin şu elelmanını şununla değiştir.Eski elemani return eder

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));

        //countryList.add(0,"Germany");
        String ulke = countryList.set(0,"Germany"); // değiştirilen değer istenirse saklanabilir
        System.out.println("countryList = " + countryList);
        System.out.println("ulke = " + ulke);
        String ulkeNew =countryList.get(0);
        System.out.println(ulkeNew);
    }
}
