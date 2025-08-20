package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.List;

public class C07Contains {
    //contains()-> list'te istenen elamanın varlığını control eder true/false return eder

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));

        System.out.println("countryList.contains(\"Almanya\") = " + countryList.contains("Almanya"));
        System.out.println("countryList.contains(\"Kanada\") = " + countryList.contains("Kanada"));
    }
}
