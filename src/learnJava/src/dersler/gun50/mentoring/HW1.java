package learnJava.src.dersler.gun50.mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import dersler.gun50.Tasks.SeedMethods;
import dersler.gun50.mentoring.HW_SeedMethods;

public class HW1 {
    public static void main(String[] args) {
        //  map()
      List<Integer> sayi = new ArrayList<>(Arrays.asList(10,20,30,40,50));
      //listedeki sayıların her birinin 10 a bölümünü yazdıralım
    //  Listedeki sayıların her birinin 10 a bölümlerinin 2 eksiğini yazdıralım

        sayi.stream().map(t -> t/10).forEach(HW_SeedMethods::printWithSpaces);
        System.out.println();
        sayi.stream().map( t -> t/10-2).forEach(HW_SeedMethods::printWithSpaces);
        System.out.println();
        // map()
         List<Integer> sayilar = new ArrayList<>(Arrays.asList(1,4,9,16,25,36,49,64,81,100,121,144));
        // Listedeki elemanlardan karekokÜ çift olanları aralarında boşluk olacak şekilde yazdıralım
        sayilar.stream()
                .map(Math::sqrt)
                .filter(t -> t%2 == 0 )
                .forEach(HW_SeedMethods::printWithSpaces);  // 2 4 6 8 10 12

        System.out.println();

        // map()
         List<Integer> sayilarList = new ArrayList<>(Arrays.asList(1,4,9,16,25,36,49,64,81,100,121,144));
        // Listedeki elemanlardan karekokÜ çift olanları ve 10 dan kuçük olanları aralarında boşluk olacak şekilde yazdıralım

        sayilarList
                .stream()
                .map(t-> (int)Math.sqrt(t))
                .filter(t-> t%2 == 0)
                .filter( t-> t<10 )
                .forEach(HW_SeedMethods::printWithSpaces);



    }
    

}
