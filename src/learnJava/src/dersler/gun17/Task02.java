package learnJava.src.dersler.gun17;

import java.util.Scanner;

public class Task02 {
    /*
    Task:  Kullanıcıdan sayılar alarak pozitif sayıların toplamını hesapla.
        Eğer kullanıcı negatif bir sayı girerse o sayıyı atla (continue kullan)
        ve toplamaya devam et. Toplam 100’e ulaştığında döngüyü sonlandır (break kullan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam=0;
        while(true) {
            //Yeni sayı girmeden önce toplamı kontrol edip programı kırmak için kontrolü en başa aldım
            if (toplam>=100)
                break;
            //toplam 100ü aşmıyorsa yeni sayı girilebilir
            System.out.print("Sayı girin: ");
            int sayi = scanner.nextInt();
            //girilen sayı negatif ise toplama eklemeden while döngüsü ilerler
            if(sayi<0)
                continue;
            //şartlar sağlanıyorsa sayı toplama eklenir
            toplam+=sayi;
        }
        System.out.println("Toplam: " + toplam);
    }
}