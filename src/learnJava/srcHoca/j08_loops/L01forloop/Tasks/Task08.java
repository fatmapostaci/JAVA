package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

import java.awt.*;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */

        Scanner input = new Scanner(System.in);
        System.out.println("İlk boyutu giriniz:");
        int ilkBoyut = input.nextInt();
        System.out.println("İkinci boyutu giriniz:");
        int ikinciBoyut = input.nextInt();

        for (int i = 1; i <= ilkBoyut; i++){
            for (int j = 1; j <= ikinciBoyut ; j++){
                System.out.print((i*j) +"\t");
                //System.out.printf("%2d " ,(i*j) ); digitler arasında 2 boşluk bırakır
            }
            System.out.println();
        }

    }
}
