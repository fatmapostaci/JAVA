package learnJava.srcHoca.j12ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02nCopies {

    public static void main(String[] args) {

        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        List<String> namesList = new ArrayList<>(Arrays.asList("Azize", "Fatma", "Mehmet"));

        System.out.println("countryList = " + countryList);
        System.out.println("namesList = " + namesList);

        List<String> ekCountryList = new ArrayList<>(Collections.nCopies(3,"Tanzanya"));
        System.out.println("ekCountryList = " + ekCountryList);

        // countries ArrayListine ekCountries i ekleyiniz...
        countryList.addAll(ekCountryList);
        countryList.addAll(1,ekCountryList);

        System.out.println("countryList = " + countryList);

    }
}
