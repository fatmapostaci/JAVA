package learnJava.srcHoca.j12ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C12ReplaceAll_Fill {
    //replaceAll();-> List'te belirli bir elemanı belirli bir elemana update eder.true/ false return eder

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        System.out.println("ReplaceAll öncesi countryList = " + countryList);
        Collections.replaceAll(countryList,"Almanya","Germany");
        System.out.println("ReplaceAll sonrası countryList = " + countryList);

        //fill()-> list'tin tum elemanlarını istenen değere update eder...
        System.out.println("Fill öncesi countryList = " + countryList);
        Collections.fill(countryList,"Trabzon");
        System.out.println("Fill sonrası countryList = " + countryList);

    }
}
