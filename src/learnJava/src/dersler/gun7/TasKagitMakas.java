package learnJava.src.dersler.gun7;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
                   /*
        Task-> Taş, kağıt, makas oyununu simüle eden bir program yazınız.
         Bu oyunda kullanıcı bir seçim yapacak (taş, kağıt veya makas),
         bilgisayar da rastgele bir seçim yapacak. Ardından iki seçimi
         karşılaştırarak kazanan belirlenecek.
         */
        // int random = (int) (Math.random()*3+1);
        // System.out.println("random = " + random);

        int kWin=0,bWin=0;
        do {
            System.out.printf("Seçiminizi yapın. (Taş/Kağıt/Makas) \nKullanıcı: ");
            Scanner scanf = new Scanner(System.in);
            String input = scanf.next().toUpperCase();
            Random random1 = new Random();
            int randomSayi = (random1.nextInt(2))+1;

            if (randomSayi==1) System.out.println("Bilgisayar: Taş");
            if (randomSayi==2) System.out.println("Bilgisayar: Kağıt");
            if (randomSayi==3) System.out.println("Bilgisayar: Makas");

            if (input.equals("TAS") || input.equals("TAŞ") || input.equals("T")) {
                if (randomSayi==3)   {System.out.println("Taş makası kırar. Siz kazandınız."); kWin++; }
                if (randomSayi==2)   {System.out.println("Kağıt taşı sarar. Bilgisayar kazandı. "); bWin++;}
                if (randomSayi==1)  System.out.println("Berabere");
            }
            else if (input.equals("KAGIT") || input.equals("KAĞIT") || input.equals("K")) {
                if (randomSayi==3) {System.out.println("Makas kağıdı keser. Bilgisayar kazandı. "); bWin++;}
                if (randomSayi==1) {System.out.println("Kağıt taşı sarar. Siz kazandınız."); kWin++; };
                if (randomSayi==2) System.out.println("Berabere");
            }
            else if (input.equals("MAKAS") || input.equals("M")){
                if (randomSayi==1) {System.out.println("Taş makası kırar. Bilgisayar kazandı. "); bWin++;}
                if (randomSayi==2) {System.out.println("Makas kağıdı keser. Siz kazandınız "); kWin++;}
                if (randomSayi==3) System.out.println("Berabere");
            }
            else System.out.println("Geçersiz input!");
        } while (!(kWin == 10 || bWin == 10 ));

        System.out.println("Kullanıcı = " + kWin);
        System.out.println("Bilgisayar = " + bWin);

    }
}
