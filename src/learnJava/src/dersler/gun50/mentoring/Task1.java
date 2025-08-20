package learnJava.src.dersler.gun50.mentoring;

import dersler.gun50.Tasks.SeedMethods;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

         List<Integer> numbers = List.of(-5, 10, -3, 7, 0, 8);

        // T A S K 01) Pozitif Sayıları Yazdıralım
        numbers.stream().filter(SeedMethods::isPositive).forEach(SeedMethods::yazdir);


        System.out.println();
        // T A S K 02) Negatif sayıları yazdıralım
        numbers.stream().filter( t->t<0).forEach(SeedMethods::yazdir);
    }
}
