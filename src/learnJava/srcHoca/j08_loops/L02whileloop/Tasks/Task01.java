package learnJava.srcHoca.j08_loops.L02whileloop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini
        // ve toplamını print eden code create edinz

        Scanner scan = new Scanner(System.in);
        int sayi ;
        int toplam = 0;
        int sayac=1;
        System.out.println("Lütfen bir sayı giriniz: ");
        toplam = scan.nextInt();
        if (toplam < 333) {

            while (toplam <= 333) {
                System.out.println("Bir sayı daha giriniz:  ");
                sayi = scan.nextInt();
                toplam = toplam + sayi;
                sayac++;
            }
            System.out.println("Toplamları "+ toplam + " olan " + sayac + " adet sayı girdiniz");

        } else {
            System.out.println( toplam +" sayısı 333 ten büyüktür");
        }


    }
}
