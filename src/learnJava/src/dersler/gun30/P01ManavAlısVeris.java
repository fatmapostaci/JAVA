package learnJava.src.dersler.gun30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P01ManavAlısVeris {
    /* TASK :
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     * */

    static List<String > urunList = new ArrayList<>(List.of("Elma","Armut","Çilek","Domates","Salatalık"));
    static List<Double> fiyatList = new ArrayList<>(Arrays.asList(35.0,30.0,70.0,50.0,30.0));

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean devam = true;
        double toplamFiyat = 0.0;

        System.out.println("-----------------------------------------");
        System.out.println("Java Market Uygulamasına Hoşgeldiniz ...");
        System.out.println("-----------------------------------------");

        int secim;
        double kilo;


        while (devam) {
            double fiyat;
            urunListele();
            secim = urunSec(scn);
            kilo = kiloSor(scn);
            fiyat = fiyatHesapla(secim, kilo);
            toplamFiyat =toplamFiyataEkle(fiyat,toplamFiyat);
            devam = devamEt(scn);

        }
        System.out.print("Almış olduğunuz ürünlerin toplam fiyatı =  " + toplamFiyat );

    }

    private static boolean devamEt(Scanner scn) {
        System.out.println("Ürün Almaya devam etmek istiyormusunuz ? (E/H)");
        return scn.next().substring(0,1).equalsIgnoreCase("E");
    }

    private static double toplamFiyataEkle(double fiyat,double totalPrice) {
       return totalPrice += fiyat;
    }

    private static double fiyatHesapla(int secim, double kilo) {
        double fiyat =kilo*fiyatList.get(secim-1);
        System.out.printf("%s ürününden %.2f kg talebinizin ücreti %.2f TL", urunList.get(secim-1),kilo,fiyat);
        return fiyat;
    }

    private static double kiloSor(Scanner scn) {
        double kilo =0.0;
        System.out.println("Üründen kaç kilo almak istediğinizi giriniz...");
        if (scn.hasNextDouble()){
            kilo = scn.nextDouble();
            if (kilo < 0){
                System.out.println("Negatif sayı girilemez");
                kiloSor(scn); // Sıfırdan küçük olduğunda recursive olarak metod tekrar çalıştırılıyor
            }
        } else {
            System.out.println("Geçersiz girdi yaptınız. Tekrar deneyiniz");
            scn.next(); // Satırı temizledik
            kiloSor(scn);
        }
        return kilo;
    }

    private static void urunListele() {
        for (int i =0;i<urunList.size();i++){
            System.out.printf("%5d. %-10s fiyatı : %.2f \n",i+1,urunList.get(i),fiyatList.get(i));
        }
    }

    private static int urunSec(Scanner input) {
        int secenek;
        System.out.println("Lütfen Almak istediğiniz Ürün numarasını giriniz");

        while (true) {
            if (input.hasNextInt()) {
                secenek = input.nextInt();
                if (secenek > 0 && secenek < 6){
                    break;
                } else {
                    System.out.println("Yanlış seçenek. Lütfen 1 ile " + urunList.size()+ " arasında değer giriniz");
                }
            } else {
                System.out.println("Yanlış değer girdiniz. Yalnızca sayı giriniz ");
                input.next(); // satırı temizlemek için (alt satıra alıyoruz)
            }
        }
        return secenek;
    }

}
