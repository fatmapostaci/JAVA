package learnJava.src.dersler.gun13.LoopTasks;

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

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir tam sayıyı giriniz");
        int num= scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++)
                System.out.printf("%2d " ,(i*j) );
            System.out.println();
        }
    }
}
