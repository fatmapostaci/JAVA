package learnJava.srcHoca.j99_codechallenge.codechallenge02;

import java.util.Locale;
import java.util.Scanner;

public class Task07_Ternary {

        /*  Task->
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen A, B veya C harflerinden birini seçiniz...");

        // Harfleri String olarak okuyabiliriz:
        String harfStr = scanner.next().toUpperCase();

       String result =  harfStr.equals("A") ? "Java is easy" :
                              harfStr.equals("B") ? "Java is fun" :
                                   harfStr.equals("C") ? "I need to study :)" : "Hatalı girdi yaptınız";

        System.out.println("result = " + result);

        // Harfleri Char olarak alabiliriz.
        char harf = scanner.next().toUpperCase().charAt(0);

        System.out.println(harf == 'A' ? "Java is easy" :
                                        harf == 'B' ? "java is fun" :
                                                harf == 'C' ? "I need to study" :
                                                    "Yanlis harf girdiniz");

    }
}
