package learnJava.srcHoca.j99_codechallenge.codechallenge02;

import java.util.Scanner;

public class Task06_NestedIfStatement {
        /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı girin: ");

        int age = scanner.nextInt();
        String durum;

        if (age < 18) {
            durum = "Oy kullanmaya uygun değil.";
        } else if (age >= 70 ) {
            durum = "Oy kullanmaya uygun. Üç kez oy kullanabilir.";
        } else if (age >= 50) {
            durum = "Oy kullanmaya uygun. İki kez oy kullanabilir.";
        } else {
            durum = "Oy kullanmaya uygun. Bir kez oy kullanabilir.";
        }

        System.out.println(durum);
  }
}
