package learnJava.src.dersler.gun50.mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW4 {
    public static void main(String[] args) {
        // reduce()
        List<Integer> sayi = new ArrayList<>(Arrays.asList(10, 18, 20, 32, 40, 55));
        // Listedeki 8 e bölünebilen sayıların carpımını bulalım
        Integer carpim = sayi.stream()
                .filter(t -> t % 8 == 0)
                .reduce((t, u) -> t * u)
                .get();
        System.out.println("carpim = " + carpim);

        List<String> sayiList = new ArrayList<>(Arrays.asList("Halime", "Sibel", "Ozcan", "Huseyin", "Melisa", "Ahmet", "Mehmet", "Ayse", "Fatma"));
        //  Listedeki elemanların karakter sayılarının karesinin max değerini bulunuz ve print ediniz
        Integer maxDeger = sayiList.stream()
                .map(t->t.length())
                .map(t->t*t)
                .reduce(Math::max)
                .get();
        System.out.println("maxDeger = " + maxDeger);

        //  Listedeki elemanların karakter sayılarının küplerinin min değerini bulunuz ve print ediniz
        Double minDeger = sayiList.stream()
                .map( t->t.length())
                .map( t-> Math.pow(t,3))
                .reduce(Math::min)
                .get();
        System.out.println("minDeger = " + minDeger);

    }
}
