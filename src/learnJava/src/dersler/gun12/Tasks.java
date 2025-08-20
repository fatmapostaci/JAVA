package learnJava.src.dersler.gun12;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *  // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
         *         //1-replace() methodu char kabul eder ama replaceAll kabul etmez
         *         //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
         *         //(Regular Expressions)
         *         //   \\s bosluk
         *         //   \\S bosluk disindaki tum karakterler
         *         //   \\w harfler ve rakamlar (a z A Z, 0 9)
         *         //   \\W harfler ve rakamlar disindaki tum karakterler
         *         //   \\d rakamlar 0 9
         *         //   \\D rakamlar disindaki tum karakterler
         */
        String word1 = "Java is avll good123456  ?%+^/&/)(6546879";
        String replaced_word1 = word1.replace(' ', '_');
        System.out.println("replaced_word1 = " + replaced_word1);
        //word1 = word1.replace("a", "_A");
        System.out.println(word1.replace("a", "_A"));
        System.out.println("word1 = " + word1);
        System.out.println(word1.replace("Java", "Python"));

        System.out.println("word1.replaceFirst(\"a\",\"?\") = " + word1.replaceFirst("Java", "?"));
        System.out.println(word1.replaceFirst("av", "**"));
        //boşlukları değiştir  \s
        System.out.println("word1.replaceAll( \"\\\\s\",\"#\") = " + word1.replaceAll("\\s", "#"));
        //boşluk dışındakileri değiştir \S
        System.out.println(word1.replaceAll("\\S", "#"));
        // harfler ve rakamlar \w harfler ve rakamlar (a z A Z, 0 9)
        System.out.println( word1.replaceAll("\\w", "#"));
        // harfler ve rakamlar dışındakileri   \W   # yap
        System.out.println( word1.replaceAll("\\W", "#"));
        // \d  rakamlar 0-9
        System.out.println(word1.replaceAll("\\d", "+"));
        // \D  rakamlar 0-9 dışındakileri yap
        System.out.println(word1.replaceAll("\\D", "."));

        System.out.println();
        System.out.println();
        System.out.println(word1);
        System.out.println(word1.replaceAll("\\w", ","));



        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini print eden code create ediniz

        String word = "Alamanya";
        int ilk_a = word.indexOf("a");
        System.out.println("ilk_a = " + ilk_a);
        int ikinci_a = word.indexOf("a",ilk_a+1);
        System.out.println("ikinci_a = " + ikinci_a);



                /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        char ilk_karakter;
        char son_karakter;
        String password;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Şifrenizi giriniz:  ");
            password = input.next();
            ilk_karakter = password.charAt(0);
            System.out.println(Character.isUpperCase(ilk_karakter) ? "ilk harf kabul edildi" : "ilk harf büyük yazılmalı");
            son_karakter = password.charAt(password.length() - 1);
            System.out.println(Character.isDigit(son_karakter) ? "son karakter kabul edildi" : "Son karakter rakam olmalı");
            System.out.println(password.length() == 6 ? "Password uzunluğu kabul edildi" : "Password 6 karakter uzunluğunda olmalıdır");

        } while (!Character.isUpperCase(ilk_karakter) || !Character.isDigit(son_karakter) || password.length() != 6);
    }
}
