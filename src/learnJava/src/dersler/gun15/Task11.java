package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scanf = new Scanner(System.in);
        System.out.println("Programı sonlandırmak için 0 girin!");
        int sayi, toplam = 0,adet=0;
        do {
            System.out.print("Sayı girin: ");
            sayi = scanf.nextInt();
            toplam += sayi;

            if ( sayi!=0) adet++;

        } while (sayi != 0);
        System.out.println("Sayıların toplamı = " + toplam);
        System.out.println("adet = " + adet);



    }
}
