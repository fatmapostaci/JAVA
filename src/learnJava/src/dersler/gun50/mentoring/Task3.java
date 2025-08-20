package learnJava.src.dersler.gun50.mentoring;

import dersler.gun50.Tasks.SeedMethods;

import java.util.List;
import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "car", "banana", "hat", "umbrella", "coat", "phone");

        // T A S K 01) Belirli Uzunluktaki(5) Kelimeleri Filtreleyip Büyük Harfle Yazdırma
        words.stream().filter(t -> t.length() > 5).map(t -> t.toUpperCase()).forEach(SeedMethods::yazdir);

        // T A S K 02) Uzunluğu 4 veya daha fazla olan kelimeleri seçip büyük harf ile yazdırma.
        words.stream().filter(SeedMethods::checkLenght4).map(SeedMethods::toUpperCase).forEach(SeedMethods::yazdir);

        int minLength = 4;
        words.stream()
                .filter(lengthPredicate(minLength))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }


    public static Predicate<String> lengthPredicate(int length) {
        return word -> word.length() >= length;
    }


}