package learnJava.src.dersler.gun7;

import java.util.Scanner;

public class Restoran_Indırım_Uygulaması {
    public static void main(String[] args) {
         /*
       Bir restoranda yemek fiyatlarına göre indirim uygulanmaktadır. Aşağıdaki kurallara göre indirim hesaplanacaktır:
       Standart yemek fiyatı 100 TL.
       Eğer sipariş tutarı 50 TL'nin altındaysa hiçbir indirim yapılmaz.
       Sipariş tutarı 50 TL ile 100 TL arasında ise %10 indirim uygulanır.
       Sipariş tutarı 100 TL veya üzerinde ise %20 indirim uygulanır.
       Eğer müşteri "öğrenci" ise ekstra %5 indirim yapılır.
       Görev: Bu senaryoya uygun bir program yazın. Program, sipariş tutarına ve müşteri durumuna göre indirimli fiyatı hesaplayacaktır.
       */
        int siparisTurari;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Müşteri türü öğrenci ise \"Ogrenci\" bilgisini girin ");
        String musteriTuru = scanf.next();
        System.out.println("Sipariş tutarını girin: ");
        siparisTurari = scanf.nextInt();
        if (siparisTurari < 50 && musteriTuru.equals("Ogrenci")){

        }
        else if(siparisTurari < 100){

        }
        else if(siparisTurari >= 100){

        }


        System.out.println(((siparisTurari % 2) == 0) ? "Sayi Cift" : "Sayi Tek");
    }
}
