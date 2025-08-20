package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.
        Scanner scanf=new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int toplam=0,sayi = scanf.nextInt();
        for (int i = 1; i < sayi; i+=2) {
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}
