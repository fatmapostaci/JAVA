package learnJava.srcHoca.j08_loops.L01forloop;

import java.util.Scanner;

public class C02ForLoop {
    // Task-> girilen sayıdan 100'e kadar 4'un katı olan tamsayıları yan yana print eden code create ediniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = input.nextInt(); // 20

        if (sayi<100 && sayi>0) {
            for (int i = sayi; i < 100; i++) {
                if (i % 4 == 0) System.out.print(i + " ");
            }
        } else {
            System.out.println("gireceğiniz satı 0 ile 100 arasında olmalı");
        }














    }
}
