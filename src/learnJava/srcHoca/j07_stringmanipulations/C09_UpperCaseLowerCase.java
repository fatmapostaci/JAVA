package learnJava.srcHoca.j07_stringmanipulations;

public class C09_UpperCaseLowerCase {
            /*
       toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
       toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
       ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.
         */

    public static void main(String[] args) {
        String str = " Java Öğreniyorum ";
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
    }
}
