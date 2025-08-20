package learnJava.src.codeChallenge.gun2;

import java.util.Scanner;

public class FaizHesaplama {
    /*
Faiz Hesaplama Uygulaması

Kullanıcıdan aşağıdaki bilgileri alarak faiz hesaplayan bir Java programı yazın:
1. Başlangıçtaki para miktarı
2. Yıllık faiz oranı (% olarak)
3. Yıl sayısı (kaç yıl sonrası için hesap yapılacağı)

Kullanıcıya iki farklı faiz türü sunulacak:
1. Bileşik faiz
2. Basit faiz

Her iki tür için de gerekli hesaplamaları yaparak sonucu ekrana yazdıran bir program yazmanız beklenmektedir.

### Bileşik Faiz Formülü:
A = P * (1 + r / 100)^t
- A: Gelecekteki para miktarı
- P: Başlangıçtaki para miktarı
- r: Yıllık faiz oranı
- t: Yıl sayısı

### Basit Faiz Formülü:
A = P + (P * r / 100 * t)
- A: Gelecekteki para miktarı
- P: Başlangıçtaki para miktarı
- r: Yıllık faiz oranı
- t: Yıl sayısı

İpucu: Üst alma işlemi için `Math.pow()` metodunu kullanabilirsiniz.*/
    public static void main(String[] args) {


        int r, t, P;
        Scanner scanf = new Scanner(System.in);
        System.out.print("Başlangıçtaki para miktarını girin: ");
        P = scanf.nextInt();
        System.out.print("Yıllık faiz oranını % olarak girin: ");
        r = scanf.nextInt();
        System.out.print("Yıl sayısını girin: ");
        t = scanf.nextInt();
        System.out.print("Bileşik faiz(1) Basit faiz(2) girin: ");
        int secim = scanf.nextInt();

        double output = switch (secim) {
            case 1 -> {
                yield (P * Math.pow((1 + r / 100), t));
            }
            case 2 ->{
                yield  (P + (P * r / 100 * t));

            }
            default -> {
                System.out.println("Geçersiz seçim");
                yield 0;
            }
        };
        System.out.println("Gelecekteki para miktarı = " + output);


    }
}