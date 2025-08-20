package learnJava.src.codeChallenge.gun2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class OyKullanma {
    public static void main(String[] args) {
        /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
        LocalDate dateToday = LocalDate.now();
        LocalDate dogumtarihi = null;
        System.out.println("Dogum tarihinizi girin: Format:(Yil-Ay-Gün) ");
        Scanner scanf = new Scanner(System.in);
        String stringDogumTarihi = scanf.next();
        dogumtarihi = LocalDate.parse(stringDogumTarihi);
        int age = dateToday.getYear() - dogumtarihi.getYear();
        if (age >= 18) {
            System.out.println("==> oy kullanmaya uygun");
            if (age >= 70) {
                System.out.println("==> uc kez oy kullanabilir");
            } else if (age >= 50) {
                System.out.println("==> iki kez oy kullanabilir");
            } else
                System.out.println("==> bir kez oy kullanmaya uygun");
        } else System.out.println("yaşınız oy kullanmaya uygun değil");
    }
}

