package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev9 {
    public static void main(String[] args) {
                    /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        int a, b, c;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Üç sayı giriniz: A, B, C");
        a = scanf.nextInt();
        b = scanf.nextInt();
        c = scanf.nextInt();
        System.out.println("Sonuç: " + ( (Math.pow(a,2)-Math.pow(b,2))/(c*3) ));


    }
}
