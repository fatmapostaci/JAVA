package learnJava.srcHoca.j99_codechallenge.codechallenge01;

import java.util.Scanner;

public class Task07_UcgeniHesaplamaUygulaması {
        /*
    30-60-90 Üçgeni Hesaplama Uygulaması

    Kullanıcıdan 90 derecenin karşısındaki kenar uzunluğunu (hipotenüs) alarak,
    30 ve 60 derecelik açıların karşısındaki kenar uzunluklarını hesaplayan bir Java programı yazın.

    30-60-90 üçgeninde kenar uzunlukları arasındaki oranlar şu şekildedir:
    - 90 derecenin karşısındaki kenar (hipotenüs): 2 * x
    - 30 derecenin karşısındaki kenar: x
    - 60 derecenin karşısındaki kenar: x * √3

    Burada:
    - x: 30 derecenin karşısındaki kenar uzunluğu (90 derecenin karşısındaki kenarın yarısı)

    Kullanıcıdan alınacak veriler:
    - 90 derecenin karşısındaki kenar uzunluğu (hipotenüs)

    Program, kullanıcıdan aldığı bu değere göre 30 ve 60 derecelik açılara denk gelen kenar uzunluklarını hesaplayarak sonucu ekrana yazdırmalıdır.
*/

    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 90 derecenin karşısındaki kenar uzunluğunu (hipotenüs) al
        System.out.print("90 derecenin karşısındaki kenar uzunluğunu girin (hipotenüs): ");
        double hipotenus = scanner.nextDouble();

        // 30 derecenin karşısındaki kenar uzunluğunu hesapla
        double karsi30 = hipotenus / 2;

        // 60 derecenin karşısındaki kenar uzunluğunu hesapla
        double karsi60 = karsi30 * Math.sqrt(3);

        // Sonuçları ekrana yazdır
        System.out.printf("30 derecenin karşısındaki kenar uzunluğu: %.2f\n", karsi30);
        System.out.printf("60 derecenin karşısındaki kenar uzunluğu: %.2f\n", karsi60);
    }
}
