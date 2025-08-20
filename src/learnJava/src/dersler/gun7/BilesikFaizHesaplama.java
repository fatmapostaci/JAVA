package learnJava.src.dersler.gun7;

import java.util.Scanner;

public class BilesikFaizHesaplama {
    public static void main(String[] args) {
         /*
    Bileşik Faiz Hesaplama Uygulaması

    Kullanıcıdan aşağıdaki bilgileri alarak bileşik faiz hesaplayan bir Java programı yazın:
    1. Başlangıçtaki para miktarı
    2. Yıllık faiz oranı (% olarak)
    3. Yıl sayısı (kaç yıl sonrası için hesap yapılacağı)

    ### Bileşik Faiz Formülü:
    A = P * (1 + r / 100)^t
    - A: Gelecekteki para miktarı
    - P: Başlangıçtaki para miktarı
    - r: Yıllık faiz oranı
    - t: Yıl sayısı

    İpucu: Üst alma işlemi için `Math.pow()` metodunu kullanabilirsiniz.

    Program, kullanıcıdan aldığı verilerle hesaplama yaparak sonucu ekrana yazdırmalıdır.
    */
        double r, t, P, A;
        Scanner scanf = new Scanner(System.in);
        System.out.print("Başlangıçtaki para miktarını girin: ");
        P = scanf.nextInt();
        System.out.print("Yıllık faiz oranını % olarak girin: ");
        r = scanf.nextInt();
        System.out.print("Yıl sayısını girin: ");
        t = scanf.nextInt();

        A= P * Math.pow((1+r/100),t);
        System.out.printf("Gelecekteki para miktarı = %.2f" + A);
    }
}
