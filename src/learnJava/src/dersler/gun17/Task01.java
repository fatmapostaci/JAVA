package learnJava.src.dersler.gun17;

import java.util.Scanner;

public class Task01 {
    /*
    Task:  Kullanıcıdan bir sayı alarak 1’den bu sayıya kadar olan sayıları kontrol et.
        Eğer sayı 50’ye ulaşırsa döngüyü sonlandır (break kullan). Çift sayılarda ekrana
        "Çift sayı bulundu" mesajı yaz ve sonraki sayıya geç (continue kullan).
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=scn.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (i==50)
                break;
            if (i%2==1) {
                continue;
            }
            System.out.println(i+ " Çift sayı bulundu");
        }
    }
}
