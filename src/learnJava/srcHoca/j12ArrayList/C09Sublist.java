package learnJava.srcHoca.j12ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C09Sublist {
    //sublist() -> listini istenen list parcasını(şu index'ten şu index'e parcasını) return eder
    static ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));

    public static void main(String[] args) {
        System.out.println("countryList.subList(1,4) = " + countryList.subList(1, 4));
        System.out.println("countryList = " + countryList);

        // 1. Yol
        ArrayList<String> yeniList = new ArrayList<>(countryList.subList(1,4));
        System.out.println("yeniList = " + yeniList);
        yeniList.set(0,"England");
        System.out.println("yeniList = " + yeniList);
        yeniList.ensureCapacity(4);

        // 2. yol
        List<String> dahaYeniList = new ArrayList<>();
        dahaYeniList.addAll(countryList.subList(1,4));

        // 3. yol
        List<String> enYeniList =  countryList.subList(1,4);

    }
}
