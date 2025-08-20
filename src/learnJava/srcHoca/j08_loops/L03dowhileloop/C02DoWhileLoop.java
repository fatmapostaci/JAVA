package learnJava.srcHoca.j08_loops.L03dowhileloop;

import java.util.Scanner;

public class C02DoWhileLoop {
    // task-> girilen sayı 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // While Loop ile:
        int number= 83;

        while (number >12){
            System.out.println("Bir sayı giriniz : ");
            number = scn.nextInt();

        }
        System.out.println("olaaa kazandınız :) ");

        // Do While ile
        int sayi;
        do {
            System.out.println("Bir sayı giriniz : ");
            sayi = scn.nextInt();
        } while (sayi > 12);
        System.out.println("olaaa kazandınız :) ");





















    }
}
