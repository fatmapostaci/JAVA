package learnJava.src.dersler.gun15;

import java.util.Scanner;


public class Task01 {
    // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toplam=0,sayac=0;
        while (toplam<333){
            System.out.println("Sayı girin");
            int sayi = sc.nextInt();
            sayac++;
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);
    }

}