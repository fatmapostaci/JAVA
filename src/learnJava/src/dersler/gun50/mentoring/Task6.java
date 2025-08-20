package learnJava.src.dersler.gun50.mentoring;

import dersler.gun50.Tasks.SeedMethods;

import java.util.Map;
import java.util.Set;

public class Task6 {


    public static void main(String[] args) {

        Map<String, Integer> scores = Map.of(
            "Math", 85,
            "Science", 50,
            "English", 75
        );

        // T A S K 01) Map İçinde notu 70 den buyuk olanların ders ve notunu yazdıralım.
        scores.entrySet().stream().filter(SeedMethods::isBiggerThan70).forEach(SeedMethods::yazdir);

        System.out.println("\nikinci yol");
        Set<Map.Entry<String,Integer>> scoresSet = scores.entrySet();
        scoresSet.stream().filter( t -> t.getValue()>70 ).forEach(SeedMethods::yazdir);
    }

}
