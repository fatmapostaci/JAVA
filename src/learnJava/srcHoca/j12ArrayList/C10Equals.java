package learnJava.srcHoca.j12ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10Equals {
    //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder true/false return eder

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        ArrayList<String> countryList2 = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));

        System.out.println("countryList.equals(countryList2) = " + countryList.equals(countryList2));
        String firstEleman = countryList2.get(0);
        String secondEleman = countryList2.get(1);
        countryList2.set(0,secondEleman);
        countryList2.set(1,firstEleman);
        System.out.println("countryList = " + countryList);
        System.out.println("countryList2 = " + countryList2);
        System.out.println("countryList.equals(countryList2) = " + countryList.equals(countryList2));
        Collections.sort(countryList);
        Collections.sort(countryList2);
        System.out.println("countryList.equals(countryList2) = " + countryList.equals(countryList2));

    }
}
