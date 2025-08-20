package learnJava.src.dersler.gun15;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */
        Random random = new Random();
        int random_sayi=random.nextInt(0,100);
        int tahmin,counter=0;
        do {
            Scanner scanf = new Scanner(System.in);
            System.out.print("Sayı tahmin edin: ");
            tahmin = scanf.nextInt();
          if(tahmin > random_sayi)
                System.out.println("Daha küçük bir sayı deneyin");
            else if (tahmin<random_sayi)
                System.out.println("Daha büyük bir sayı deneyin");
            else System.out.println("Tebrikler doğru!");
        counter++;
        }while (random_sayi!=tahmin);
        System.out.println(counter + " tahminde bildin." );

    }

}
