package learnJava.srcHoca.j99_codechallenge.codechallenge02;

import java.util.Scanner;

public class Task05_FaizHesaplama {
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

    İpucu: Üst alma işlemi için `Math.pow()` metodunu kullanabilirsiniz.
*/

    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan gerekli bilgileri al
            System.out.print("Başlangıç para miktarını girin: ");
            double baslangicMiktari = scanner.nextDouble();

            System.out.print("Yıllık faiz oranını (%) girin: ");
            double faizOrani = scanner.nextDouble();

            System.out.print("Kaç yıl sonra parayı hesaplamak istiyorsunuz?: ");
            int yilSayisi = scanner.nextInt();

            // Kullanıcıya seçim yapma hakkı tanı (Bileşik faiz mi yoksa basit faiz mi?)
            System.out.println("Faiz türünü seçin: ");
            System.out.println("1. Bileşik faiz");
            System.out.println("2. Basit faiz");
            int secim = scanner.nextInt();

            double toplamMiktar = 0;

            if (secim == 1) {
                // Bileşik faiz hesaplama
                toplamMiktar = baslangicMiktari * Math.pow(1 + (faizOrani / 100), yilSayisi);
                System.out.printf("Bileşik faiz ile %d yıl sonunda sahip olacağınız para: %.2f\n", yilSayisi, toplamMiktar);
            } else if (secim == 2) {
                // Basit faiz hesaplama
                toplamMiktar = baslangicMiktari + (baslangicMiktari * (faizOrani / 100) * yilSayisi);
                System.out.printf("Basit faiz ile %d yıl sonunda sahip olacağınız para: %.2f\n", yilSayisi, toplamMiktar);
            } else {
                System.out.println("Geçersiz seçim yaptınız!");
            }
        }
    }
}
