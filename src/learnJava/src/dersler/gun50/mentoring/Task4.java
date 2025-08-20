package learnJava.src.dersler.gun50.mentoring;

import dersler.gun50.Tasks.SeedMethods;

import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        List<String> texts = List.of("Java", "", "Lambda", "  ", "Streams", "");

        // T A S K 01) Boş Olmayan Elemanları Filtreleyip Yazdırma
        texts.stream().filter( t -> !t.trim().isEmpty() ).forEach(SeedMethods::yazdir);

        System.out.println();
        texts.stream().filter(SeedMethods::isEmpty).forEach(SeedMethods::yazdir);
    }
}
