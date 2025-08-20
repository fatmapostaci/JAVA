package learnJava.srcHoca.j07_stringmanipulations;

import java.util.Scanner;

public class C04_Contains {
        /*
        String içersinde istenen stringinin varlığını kontrol eder boolean değer return eder..
        char parametre kabul etmez-> CTE
         */

    public static void main(String[] args) {
        String str = "Başarı gayete aşıktır";
        System.out.println("str.contains(\"Başarı\") = " + str.contains("Başarı"));// true
        System.out.println("str.contains(\"Başarı\") = " + str.contains("başarı"));// false
        System.out.println("str.contains(\"Başarı\") = " + str.contains("Başarı "));// true
        System.out.println("str.contains(\"e a\") = " + str.contains("e a")); // true
        System.out.println("str.contains(\"ş\") = " + str.contains("ş")); // true

        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz...

        System.out.println("Bir metin giriniz...");
        Scanner input = new Scanner(System.in);       String metin = input.nextLine();

        System.out.println("Metinde sorgulatmak istediğiniz kelimeyi giriniz...");
        String kelime = input.next();

        String sonuc =metin.contains(kelime) ? metin + " metninde '" + kelime + "' kelimesi bulunur" : metin + " metninde '" + kelime + "' kelimesi bulunmaz";
        System.out.println("sonuc = " + sonuc);


    }
}
