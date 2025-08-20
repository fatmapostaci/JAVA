package learnJava.src.dersler.gun6;

import java.util.Scanner;

public class Task08_BilesikFaizHesabı {
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

    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan başlangıç para miktarını al
        System.out.print("Başlangıçtaki para miktarını girin: ");
        double baslangicMiktari = scanner.nextDouble();

        // Kullanıcıdan yıllık faiz oranını al
        System.out.print("Yıllık faiz oranını (%) girin: ");
        double faizOrani = scanner.nextDouble();

        // Kullanıcıdan yıl sayısını al
        System.out.print("Kaç yıl sonrası için hesap yapmak istiyorsunuz?: ");
        int yilSayisi = scanner.nextInt();

        // Bileşik faiz formülünü kullanarak sonucu hesapla
        double gelecektekiMiktar = baslangicMiktari * Math.pow(1 + (faizOrani / 100), yilSayisi);

        // Sonucu ekrana yazdır
        System.out.printf("%d yıl sonunda bileşik faizle paranız: %.2f\n", yilSayisi, gelecektekiMiktar);
    }









    }

