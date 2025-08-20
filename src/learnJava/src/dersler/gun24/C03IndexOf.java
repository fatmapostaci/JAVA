package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.List;

public class C03IndexOf {
    //indexOf()-> list içinde istenen eleman var ise index'ini return eder olmayan eleman için -1 return eder.

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        System.out.println("countryList.indexOf(\"almanya\") = " + countryList.indexOf("almanya"));// -1 --> CaseSensitive
        System.out.println("countryList.indexOf(\"Almanya\") = " + countryList.indexOf("Almanya"));// 0
        System.out.println("countryList.indexOf(\"Danimarka\") = " + countryList.indexOf("Danimarka"));// 3

        countryList.add("Almanya");
        System.out.println("countryList.lastIndexOf(\"Almanya\") = " + countryList.lastIndexOf("Almanya")); // LastIndexOf() elemanın son indexini dödürüyor
        System.out.println("countryList = " + countryList);
        System.out.println("countryList.lastIndexOf(\"Danimarka\") = " + countryList.lastIndexOf("Danimarka"));

    }
}
