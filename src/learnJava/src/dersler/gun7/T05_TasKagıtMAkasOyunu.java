package learnJava.src.dersler.gun7;

import java.util.Random;
import java.util.Scanner;

public class T05_TasKagıtMAkasOyunu {
                /*
        Task-> Taş, kağıt, makas oyununu simüle eden bir program yazınız.
         Bu oyunda kullanıcı bir seçim yapacak (taş, kağıt veya makas),
         bilgisayar da rastgele bir seçim yapacak. Ardından iki seçimi
         karşılaştırarak kazanan belirlenecek.
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taş için 'T' , \nKağıt için 'K', \nMakas için 'M' giriniz:");
        char initial = scan.next().toUpperCase().charAt(0); // Scanner ile char okumak için datayı String okuyup ilk karakteri char a çevirmeliyiz.

        // 1. random sayı oluşturma yolu : Math.random() metodu
        double sayi = Math.random();
        System.out.println("sayi = " + sayi);
        int random = (int)(sayi*3) +1; // random metodu 0 -1 aralığında double döner
        System.out.println("Math.random() = " + random);

        // 2. random sayı oluşturma Random class ı kullanılarak:
        Random random1 = new Random();
        int randomSayi = random1.nextInt(2) + 1;
        System.out.println("randomSayı = " + randomSayi);

        if (initial == 'T'){
            System.out.println("Kullanıcı 'Taş' seçti");
            // Kullanıcı Taş seçerse:
            if (randomSayi ==1){
                System.out.println("Bilgisayar 'Taş' seçti");
                System.out.println("Beraberlik");
            } else if (randomSayi == 2){
                System.out.println("Bilgisayar 'Kağıt' seçti");
                System.out.println("Kağıt Taşı sarar -> Kaybettiniz :( ");
            } else if (randomSayi == 3) {
                System.out.println("Bilgisayar 'Makas' seçti");
                System.out.println("Taş makası kırar  -> Kazandınız :) ");
            }
        } else if (initial == 'K'){
            // Kullanıcı Kağıt seçerse
            System.out.println("Kullanıcı 'Kağıt' seçti");
            if (randomSayi ==1){
                System.out.println("Bilgisayar 'Taş' seçti");
                System.out.println("Kağıt Taşı sarar -> Kazandınız :) ");
            } else if (randomSayi == 2){
                System.out.println("Bilgisayar 'Kağıt' seçti");
                System.out.println("Beraberlik ");
            } else if (randomSayi == 3) {
                System.out.println("Bilgisayar 'Makas' seçti");
                System.out.println("Makas kağıdı  keser  -> Kaybettiniz :( ");
            }
        } else if (initial == 'M'){
            // Kullanıcı Makas seçerse
            System.out.println("Kullanıcı 'Makas' seçti");
            if (randomSayi ==1){
                System.out.println("Bilgisayar 'Taş' seçti");
                System.out.println("Taş makası kırar ->  Kaybettiniz :(");
            } else if (randomSayi == 2){
                System.out.println("Bilgisayar 'Kağıt' seçti");
                System.out.println("Makas kağıdı  keser  -> Kazandınız :) ");
            } else if (randomSayi == 3) {
                System.out.println("Bilgisayar 'Makas' seçti");
                System.out.println("Beraberlik ");
            }
        } else {
            // Hatalı seçim
            System.out.println("Yanlış giriş yaptınız.");
        }
}
}
