package learnJava.src.codeChallenge.gun4;

import java.util.Scanner;

public class Task3 {
    /*
   Kullanıcıdan iki sayı girmesini isteyin
   Bu sayıların ebob (en büyük ortak bölen) ve
   ekok (en küçük ortak kat) larını bulunuz
    */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("iki sayı girin");
        int sayi1 = scanf.nextInt();
        int sayi2 = scanf.nextInt();
        int ebob = 1, ekok=1;
        for (int i = 2; i <= sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        if (ebob == 1) System.out.println("Ortak böleni yok");
        else System.out.println("ebob = " + ebob);
        int temp=sayi2;
        if(sayi1>sayi2) temp=sayi2;
        for (int i = temp; i <= sayi1*sayi2; i++) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
                break;
            }
        }
        System.out.println("ekok = " + ekok);
    }
}
