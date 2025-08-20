package learnJava.src.dersler.gun7;

import java.util.Scanner;

public class BasitFaizHesaplama {
    public static void main(String[] args) {
        /*
    Basit Faiz Hesaplama Uygulaması

    Kullanıcıdan aşağıdaki bilgileri alarak basit faiz hesaplayan bir Java programı yazın:
    1. Başlangıçtaki para miktarı
    2. Yıllık faiz oranı (% olarak)
    3. Yıl sayısı (kaç yıl sonrası için hesap yapılacağı)

    ### Basit Faiz Formülü:
    A = P + (P * r / 100 * t)
    - A: Gelecekteki para miktarı
    - P: Başlangıçtaki para miktarı
    - r: Yıllık faiz oranı
    - t: Yıl sayısı

    Program, kullanıcıdan aldığı verilerle hesaplama yaparak sonucu ekrana yazdırmalıdır.
*/
        int r, t, P; double A;
        Scanner scanf = new Scanner(System.in);
        System.out.print("Başlangıçtaki para miktarını girin: ");
        P = scanf.nextInt();
        System.out.print("Yıllık faiz oranını % olarak girin: ");
        r = scanf.nextInt();
        System.out.print("Yıl sayısını girin: ");
        t = scanf.nextInt();

        A= P + (P*r/100*t);
        System.out.println("Gelecekteki para miktarı = " + A);

    }
}
