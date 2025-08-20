package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *
      * * * * *
      * * * *
      * * *
      * *
      *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir üçgen şekli için yükseklik değeri giriniz");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++)
                System.out.printf("*  ");
            System.out.println();
        }
        for (int i = num - 1; i > 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.printf("*  ");
            System.out.println();

        }
        //System.out.println("Math.random()*10 = " + (int)(Math.random() * 10));
    }

    }
