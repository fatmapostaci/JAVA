package learnJava.srcHoca.j99_codechallenge.codechallenge04;

import java.util.Scanner;

public class Task03 {
    /*
    Kullanıcıdan iki sayı girmesini isteyin
    Bu sayıların ebob (en büyük ortak bölen) ve
    ekok (en küçük ortak kat) larını bulunuz
     */

    public static void main(String[] args) {

        // Kullamıcıdan sayıları alalım:
        Scanner input = new Scanner(System.in);
        System.out.println("Küçük sayıyı giriniz");
        int kSayi = input.nextInt();
        System.out.println("Büyük sayıyı giriniz");
        int bSayi = input.nextInt();

        // Ebob Hesaplaması
        int ebob = 1;
        for (int i = kSayi ; i > 0 ; i --){
            if (kSayi % i == 0 && bSayi % i == 0){
                ebob = i;
                break;
            }
        }
        System.out.println("ebob = " + ebob);

        // Ekok
        int ekok = 1;
        for (int i = bSayi ; i <= kSayi*bSayi  ; i++){
            if (i%kSayi == 0 && i % bSayi==0 ){
                ekok = i;
                break;
            }
        }
        System.out.println("ekok = " + ekok);
        System.out.println("ebob = " + ebob);

    }

}
