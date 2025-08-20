package learnJava.src.dersler.gun51.Mentoring;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        // T A S K 01) Listedeki sayıların 49 dan buyuk olanlarını kucukten buyuge print ediniz
        List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144));

        System.out.println(sayi.stream().sorted().filter(t -> t > 49).toList());

        // T A S K 02) Map deki kelimeleri uzunluklarına göre artan sırayla sıralayın ve sonuçları ekrana yazdırın.
        Map<String, Integer> wordLengths = Map.of(
                "Banana", 6,
                "Apple", 5,
                "Cherry", 6,
                "Date", 4
        );
        System.out.println(wordLengths.values().stream().sorted().toList());

        // T A S K 03) Bir kelime listesi içinde alfabetik olmayan karakterleri temizleyip kalanları alfabetik sırayla yazdırın.
        List<String> words = Arrays.asList("Banana123", "Ap@ple!", "Ch#erry", "D@te");
        System.out.println(
                words
                        .stream()
                        .map(t -> t.replaceAll("\\d", "").replaceAll("\\p{Punct}", ""))
                        .sorted()
                        .toList());

        // T A S K 04) Bir String listesinde her elemanı tersine çevirip alfabetik sıraya göre sıralayın ve yazdırın.
        List<String> wordsFruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        System.out.println(
                wordsFruits
                        .stream()
                        .map(StringBuilder::new)
                        .map(StringBuilder::reverse)
                        .sorted().toList());


        // T A S K 05 ) list elemanlarinin son harfine gore ters sirali print ediniz.
        List<String> isim = new ArrayList<>(Arrays.asList("Halime", "Sibel", "Ozcan", "Huseyin", "Melisa", "Ahmet", "Mehmet", "Ayse", "Fatma"));
        System.out.println(isim
                .stream()
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .sorted()
                .toList());

        // T A S K 06) List içinde benzersiz olan çift sayıların toplamını bulun.
        List<Integer> numbers = Arrays.asList(4, 6, 4, 8, 10, 8, 12, 14, 14);
        System.out.println(numbers
                .stream()
                .filter(t -> t % 2 == 0)
                .distinct()
                .reduce(Integer::sum)
                .get());

        // T A S K 07) Listedeki elemanlardan karakter sayısı 6 olanların herhangi brinin  "a" harfi içerip içermediğini kontrol ediniz
        List<String> names = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));
        System.out.println("Listedeki elemanlardan karakter sayısı 6 olanların herhangi birinin  \"a\" harfi içerip içermediği: " +
                names
                .stream()
                .filter(t -> t.length() == 6)
                .anyMatch(t -> t.contains("a")));

        // T A S K 08) Bir List<Integer> içindeki tüm sayıların palindrom olup olmadığını kontrol eden bir program yazın.
        // Palindrom sayılar, tersten de okunduğunda aynı olan sayılardır (örneğin: 121, 2332).
        List<Integer> numberS = Arrays.asList(121, 2332, 12321);
        System.out.println("Tüm sayılar Polindrom mu: " +
                numberS
                .stream()
                .map(String::valueOf)
                .allMatch(t -> t.contentEquals(new StringBuilder(t).reverse())));

        // Matematiksel yöntemle palindrome kontrolü
        List<Boolean> isPalindrome = numbers.stream()
                .map(num -> {
                    int original = num;
                    int reversed = 0;
                    while (num > 0) {
                        int digit = num % 10;
                        reversed = reversed * 10 + digit;
                        num /= 10;
                    }
                    return original == reversed;
                })
                .toList();

        // T A S K 09) Liste içindeki öğelerin hiçbiri yalnızca harflerden oluşmamalıdır (java gibi bir giriş kabul edilmez).
        List<String> elements = Arrays.asList("abc123", "1234", "lambda@", "!@#", "java8");
        System.out.println("Liste içindeki öğelerin hiçbiri yalnızca harflerden oluşmaz: " +
                elements
                .stream()
                .noneMatch(t -> t.matches("[A-Za-z]+")));

        // T A S K 10) Listedeki karakter sayısı 5 den fazla olan elemanların ilk ikisini yazdıralım
        List<String> names2 = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));
        System.out.println("Listedeki karakter sayısı 5 den fazla olan elemanların ilk ikisi: " +
                names2
                        .stream()
                        .filter(t -> t.length() > 5)
                        .limit(2).toList());

        // T A S K 11) Listedeki karakter sayısı 5 den fazla olan elemanların ilk ikisini son harfine göre sıralı yazdıralım
        List<String> name = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));
        System.out.println("Listedeki karakter sayısı 5 den fazla olan elemanların ilk ikisini son harfine göre sıralı hali: "+name.stream()
                .filter(t -> t.length() > 5)
                .limit(2)
                .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .toList());

        // T A S K 12) Listenin en küçük 3 çift sayısını atlayarak, sonraki 4 çift sayıyı ekrana yazdırın.
        List<Integer> numberss = Arrays.asList(12, 5, 8, 20, 1, 30, 42, 4, 60, 25, 11);
        System.out.println("Listenin en küçük 3 çift sayısını atlayarak, sonraki 4 çift sayı: "+numberss.stream()
                .filter(t -> t % 2 == 0)
                .sorted()
                .skip(3)
                .limit(4)
                .toList());

        // T A S K 13) Listenin her kelimesinin ikinci harfi ile dördüncü harfi arasında kalan harfleri alarak yeni bir liste oluşturun.
        List<String> namess = Arrays.asList("Lambda", "Stream", "Function", "Collector");
        List<String> newNames =  namess.stream()
                .map(t->  t.substring(2,4))
                .toList();

        System.out.println("Listenin her kelimesinin ikinci harfi ile dördüncü harfi arasında kalan harflerin listesi = " + newNames);

    }

}
