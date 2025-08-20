package learnJava.srcHoca.j12ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06isEmptyClear {
    //isEmpty()-> listin boş olmasını kontrol eder true/false return eder
    public static void main(String[] args) {


        ArrayList<String> countryList = new ArrayList<>(List.of("Almanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre"));
        System.out.println("countryList.isEmpty() = " + countryList.isEmpty()); // False

        //clear->listin tum elemanlarini siler bosaltir
        countryList.clear();
        System.out.println("countryList temizlik sonrası = " + countryList.isEmpty()); // False
        System.out.println("countryList = " + countryList);


    }
}