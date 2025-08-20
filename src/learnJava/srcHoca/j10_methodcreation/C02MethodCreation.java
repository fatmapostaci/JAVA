package learnJava.srcHoca.j10_methodcreation;

import java.util.Scanner;

public class C02MethodCreation { // Class başlangıcı
    // task-> kullanıcının belirlediği adette sayının ortalamasını print eden METHOD create ediniz
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) { // main başlangıcı

        // kullanıcıdan kaç sayı girileceğini al
        System.out.println("Kaç sayının ortalamasını hesaplamak istiyorsunuz?");
        int adet = input.nextInt();

        // bu sayıları alıp toplamını bul

        int ortalama = ortalamaHesapla(adet,toplamiBul(adet));
        System.out.println("Girdiğiniz " + adet + " adet sayının ortalaması = "+ ortalama);

    } // main sonu

    private static int toplamiBul(int adet){
        int sum = 0;
        for (int i =1; i<= adet ; i++){
            System.out.println(i+ ". sayıyı giriniz:");
            int currentNumber = input.nextInt();
            sum +=currentNumber;
        }
        return sum;
    }

    private static int ortalamaHesapla(int adet , int toplam){
        return toplam/adet;
    }

} // Class sonu
