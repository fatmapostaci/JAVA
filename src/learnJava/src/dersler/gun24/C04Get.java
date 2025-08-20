package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.List;

public class C04Get {
    //get()-> listte girilen index'deki elemanı return eder. olmayan index için RTE exc. fırlatır

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        System.out.println("countryList.get(1) = " + countryList.get(1)); // Ingiltere
        System.out.println("countryList.get(3) = " + countryList.get(3)); // Danimarka
       // System.out.println("countryList.get(7) = " + countryList.get(7)); // IndexOutOfBoundsException
        System.out.println("countryList son eleman) = " + countryList.get(countryList.size()-1)); // Danimarka




    }
}
