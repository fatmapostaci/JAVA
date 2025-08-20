package learnJava.src.dersler.gun24;

import java.util.ArrayList;
import java.util.List;

public class C11Remove {
    //remove()-> list'te istenen elemanı siler

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>(List.of("Alamanya", "Ingiltere", "Fillandiya", "Danimarka", "Isviçre","Tanzanya","Tanzanya","Tanzanya"));

        System.out.println("Silme öncesi countryList = " + countryList);

        String silinenilk = countryList.remove(1); // listedeki ikinci ülke silinir --> İngiltere

        boolean isSilindi = countryList.remove("Alamanya"); // siler ve true döndürür
        boolean isSilindi2 = countryList.remove("Almanya"); // silemez ve False döndürür

        int listSize = countryList.size();
        countryList.removeAll(countryList.subList(listSize-3,listSize));
        System.out.println("Silme sonrası countryList = " + countryList);
        System.out.println("isSilindi2 = " + isSilindi2);
        System.out.println("isSilindi = " + isSilindi);
        System.out.println("silinenilk = " + silinenilk);
        //System.out.println("countryList.remove(9) = " + countryList.remove(9)); // IndexOutOfBoundsException

        List<Integer> numList = new ArrayList<>(List.of(23,2,45,6,8,2,4,6,2));

        numList.remove(numList.indexOf(6));
        System.out.println("numList = " + numList);

       // numList.removeAll(List.of(2)); // Bütün 2 değerlerini sildik.

        System.out.println(numList);
        // Bütün 2 değerlerini silen bir döngü yazınız
        for (int i = 0; i< numList.size() ; i++){
            if (numList.get(i) == 2){
                numList.remove(i);
                i --;
            }
        }
        System.out.println(numList);
       // numList.removeIf(sayi -> sayi == 6);
    }
}
