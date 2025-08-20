package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        String isim, soyIsim;
        int yas, kilo, uyelikSuresi,  aylikUcret = 20;
        double boy;
        Scanner scan = new Scanner(System.in);

        System.out.println("Clarusway Spor Salonuna hoşgeldiniz. Kullanıcı bilgilerinizi giriniz! ");
        System.out.print("İsim: ");        isim = scan.next();

        System.out.print("Soyisim: ");        soyIsim = scan.next();

        System.out.print("Yaş: ");        yas = scan.nextInt();

        System.out.print("Kilo: ");        kilo = scan.nextInt();

        System.out.print("Boy: ");        boy = scan.nextDouble();

        System.out.print("Üyelik sürenizi girin (ay): ");        uyelikSuresi = scan.nextInt();

        System.out.printf("Sayın %s %s, %d ay boyunca ödemeniz gereken tutar: $ %d", isim,soyIsim,uyelikSuresi,uyelikSuresi*20);

    }
}
