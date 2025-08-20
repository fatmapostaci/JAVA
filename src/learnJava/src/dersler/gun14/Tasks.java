package learnJava.src.dersler.gun14;

import java.util.OptionalInt;
import java.util.Scanner;

public class Tasks
{
    public static void main(String[] args) {
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.

        for (int a = 1; a <= 5; a++) {

            System.out.print(a + " ");
            for (int b = 1; b <a; b++)
            {
                int toplam = 0;
                for (int i = 4; i > b; i--)
                {
                    toplam += i;
                    System.out.print( (a + toplam)+" ");
                }
            }
            System.out.println();
        }
/*
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        for (int i = 'A'; i <='F'; i++) {
            for (int j = 'A'; j <= i; j++)
                System.out.print(""+ (char)(i)+ " ");
            System.out.println();
        }
/*
A               //1. satıra 1 harf
A B             //2. satıra 2 harf
A B C           //3. satıra 3 harf
A B C D
A B C D E
A B C D E F
şekli print eden code create ediniz.  65=A'nın ascıı değeri

        for (int i = 'A'; i <='F'; i++) {
            for (int j = 'A'; j <= i; j++)
                System.out.print(""+ (char)(j)+ " ");
            System.out.println();
        }



/*
            task->: Asagidaki output'u print eden code create ediniz.
                        Hafta: 1
                          Gun: 1
                          Gun: 2
                          Gun: 3
                          .....
                        Hafta: 2
                          Gun: 1
                          Gun: 2
                          Gun: 3
                          ....
                        Hafta: 3
                          Gun: 1
                          Gun: 2
                          Gun: 3
                          ....

        for (int hafta=1;hafta<4;hafta++) {
            System.out.println("Hafta: " + hafta);
            for (int gun = 1; gun < 8; gun++) {
                System.out.println("  Gun: " + gun);

            }
        }
*/

    }
}
