package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.List;

public class C05Size {
    //size()-> listin eleman sayısını return eder.(arr->length)

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        System.out.println("countryList ekleme öncesi = " + countryList.size());
        countryList.add("Türkiye");
        System.out.println("countryList ekleme sonrası = " + countryList.size());



    }
}
