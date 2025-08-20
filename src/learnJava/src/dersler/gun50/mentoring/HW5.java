package learnJava.src.dersler.gun50.mentoring;

import java.util.List;

public class HW5 {
    public static void main(String[] args) {
        // reduce()
        List<String> words = List.of("Java", "Lambda", "Stream", "Reduce");
        // liste içindeki kelimeleri aralarında virgül olacak şekilde birleştirerek tek bir String haline getir.
        // Çıktı:
        // "Java, Lambda, Stream, Reduce"
        String senteceOfWords = words.stream()
                .reduce((t,u)-> t.concat(", ").concat(u))
                .get();
        System.out.println(senteceOfWords);
    }
}
