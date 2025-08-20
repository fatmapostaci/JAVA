package learnJava.src.dersler.gun10;

import java.util.Scanner;

public class C04_Contains {
        /*
        String içersinde istenen stringinin varlığını kontrol eder boolean değer return eder..
        char parametre kabul etmez-> CTE  (wrapper class kullarak hatayı önledim)
         */

    public static void main(String[] args) {
        String str = "Başarı gayete aşıktır";
        System.out.println("str.contains(\"Başarı\") = " + str.contains("Başarı"));// true
        System.out.println("str.contains(\"Başarı\") = " + str.contains("başarı"));// false
        System.out.println("str.contains(\"Başarı\") = " + str.contains("Başarı "));// true
        System.out.println("str.contains(\"e a\") = " + str.contains("e a")); // true
        System.out.println("str.contains(\"ş\") = " + str.contains("ş")); // true
        System.out.println("str.contains(\"a\") = " + str.contains("a"));
        System.out.println("str.contains('a') = " + str.contains(String.valueOf('a')));  //char değeri kabul etmesi için wrapper class kullandım

        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz...
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz...");
        String metin = input.nextLine();

        System.out.println("Metinde sorgulatmak istediğiniz kelimeyi giriniz...");
        String kelime = input.next();
        System.out.println("metin.contains(kelime) = " + metin.contains(kelime));
        String sonuc =metin.contains(kelime) ? metin.concat("' metninde '").concat(kelime).concat("' kelimesi bulunur") : metin.concat(" metninde ").concat(kelime).concat(" kelimesi bulunmaz");
        System.out.println("sonuc = " + sonuc);


    }
}
