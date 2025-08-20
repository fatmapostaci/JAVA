package learnJava.src.dersler.gun8;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /*
TASK :
Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.


        System.out.println("Bir sayı giriniz.");
        int sayi= input.nextInt();
        int sayiTer = sayi;
        int sayac = 0;
        System.out.println("sayi = " + sayi);
        while (sayi > 0) {
            sayi /= 10;
            sayac++;
        }
        System.out.println( sayac== 4 ? "4 basamaklı " : (sayiTer % 2 == 0 ? "4 basamaklı olmayan çift sayı " : "4 basamaklı olmayan tek sayı"));

        System.out.println("sayi = " + sayi);


     TASK :
     Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
     10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
     Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz

        //Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int num = input.nextInt();
        String result = num >= 0 ? (num < 10 ? "Rakam" :"Pozitif Sayi") : ("Negatif Sayi") ;
        System.out.println("result = " + result);
*/
        System.out.println(Integer.BYTES);
        System.out.println(Double.BYTES);
        //Integer.
        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.
        int a, b;
        Random rand1 = new Random();
        a = rand1.nextInt(-100,100);
        b = rand1.nextInt(-100,100);
        int randomNumber1 = rand1.nextInt(201) - 100;  // Bence bu daha anlaşılır...
        int randomNumber = ThreadLocalRandom.current().nextInt(-100, 101);
        System.out.println("Sayı a= " + a +"  Sayı b= " + b + "  randomNumber: " + randomNumber + "  randomNumber1: " + randomNumber1);
        System.out.println(((a * b) > 0) ? "a+b= "+(a + b)+" işaretleri aynı" : "işaretleri farklı");
        Object s = ((a * b) > 0) ? "a+b= "+(a + b)+" işaretleri aynı" : "işaretleri farklı";
        System.out.println("s = " + s);

        /* Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını
       kontrol eden code create ediniz.

// Bir sıcaklık değerine göre "Soğuk", "Ilıman" veya "Sıcak" olup olmadığını kontrol edin.
// 0'ın altı "Soğuk", 1 ile 30 arası "Ilıman", 30 ve üzeri ise "Sıcak".
        int sicaklik=0;
        while(sicaklik!=100) {
            System.out.println("Sıcaklık değerini girin: ");
            sicaklik= input.nextInt();
            System.out.println(sicaklik < 0 ? "SOGUK" : (sicaklik < 30 ? "ILIMAN" : "SICAK"));
        }

     /*
         Bir öğrencinin aldığı notu harf notuna çeviren sistem.
         90 ve üstü "A", 80-89 arası "B", 70-79 arası "C", 60-69 arası "D", geri kalanı "F".


        int not=0;
        while (not!=100) {
            System.out.println("Öğrencinin notunu girin: ");
            not = input.nextInt();
            System.out.println(not >= 90 ? "A" : (not >= 80 ? "B" : (not >= 70 ? "C" : not >= 60 ? "D" : "F")));
        }

        // Kullanıcıdan iki sayı ve bir işlem seçeneği alarak işlem sonucunu döndüren bir hesap makinesi.
        System.out.println("iki sayi girin: ");
        int sayi1= input.nextInt();
        int sayi2 = input.nextInt();
        double sonuc=0.0; // initialize etmek gerek
        System.out.println("+ - / * işlem türünü girin");
        char islemChar = input.next().charAt(0);
        switch(islemChar) {
            case ('+'):
                sonuc = sayi1+sayi2;
                break;
            case ('-'):
                sonuc = Math.abs(sayi1-sayi2);
                break;
            case ('*'):
                sonuc = sayi1*sayi2;
                break;
            case ('/'):
                sonuc = ( sayi1>sayi2 ? sayi1/sayi2 : sayi2/sayi1 );
                break;
            default:
                System.out.println("geçersiz input");
                break;
        }
        System.out.println("sonuç : " + sonuc);
*/


        // Kullanıcı, ülke kodunu ve ürün fiyatını girerek, ilgili ülkenin KDV oranına göre hesaplanmış fiyatı öğrenir.
        // System.out.println("Ülke kodunu girin (TR, US, DE, FR, UK): ");
        // Ülkeler ve KDV oranları
        System.out.print("Ülke kodunu girin (TR, US, DE, FR, UK): ");
        String ulkeKodu = input.next().toUpperCase();
        System.out.print("KDV oranı hesaplanmasını beklediğiniz tutarı girin: ");
        double fiyat= input.nextDouble();
        switch (ulkeKodu){
            case "TR":
                fiyat*=(130.0/100);
                break;
            case "US":
                fiyat*=(110.0/100);
                break;
            case "DE":
                fiyat*=(115.0/100);
                break;
            case "FR":
                fiyat*=(105.0/100);
                break;
            case "UK":
                fiyat*=(125.0/100);
                break;
            default:
                System.out.println("geçerli bir ülke kodu girin!");
        }
        System.out.printf("%s koduna ait hesaplanan tutar= %.2f ",ulkeKodu, fiyat);

    }
}
