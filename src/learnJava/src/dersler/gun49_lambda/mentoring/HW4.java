package learnJava.src.dersler.gun49_lambda.mentoring;

import codeChallenge.ALLSUBJECTS.inheritancePackage.Vehicle;

import java.util.Arrays;
import java.util.function.Function;

public class HW4 {

    // Function <T , R>
// T A S K 01) Sayıyı Karesine Dönüştürme
// T A S K 02) Bir Kelimeyi Büyük Harfe Dönüştürme
// T A S K 03) Bir Sayıyı String'e Dönüştürme
// T A S K 04) Bir Kelimeyi Sabit Metin ile Birleştirme
// T A S K 05) Bir Stringin harflerini array e atma

    public static void main(String[] args) {

        // T A S K 01) Sayıyı Karesine Dönüştürme
        Function<Integer, Integer> karesiniAl = e -> {return e*e; };
        Integer sayi = karesiniAl.apply(7);
        System.out.println("sayi = " + sayi);

        // T A S K 02) Bir Kelimeyi Büyük Harfe Dönüştürme
        Function<String,String> toUpperCase = String::toUpperCase;
        String newString =  toUpperCase.apply("asdgfd asdfa");
        System.out.println("newString = " + newString);

        // T A S K 03) Bir Sayıyı String'e Dönüştürme
        Function<Integer,String> stringeDonustur = i -> {return Integer.toString(i); };
        String newStr= stringeDonustur.apply(324);
        System.out.println("newStr = " + newStr);

        // T A S K 04) Bir Kelimeyi Sabit Metin ile Birleştirme
        Function<String,String> birlestir = s-> s.concat(" Usta");
        String newIsim = birlestir.apply("Ahmet");
        System.out.println("newIsim = " + newIsim);

        // T A S K 05) Bir Stringin harflerini array e atma
        Function<String, String[]> arrayeDonustur = s ->{ return s.split("");};

        String str= "stringi arraye at";
        String []arrString =  arrayeDonustur.apply(str);
        System.out.println("arrString = " + Arrays.toString(arrString));


    }
}
