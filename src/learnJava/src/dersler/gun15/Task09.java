package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner scanf = new Scanner(System.in);
        System.out.println("Programı sonlandırmak için 0 girin!");
        int sayi, toplam = 0;
        do {
            System.out.print("Sayı girin: ");
            sayi = scanf.nextInt();
            toplam += sayi;

        } while (sayi != 0);
        System.out.println("Sayıların toplamı = " + toplam);
    }

}
