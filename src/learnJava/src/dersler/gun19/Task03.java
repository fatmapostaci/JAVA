package learnJava.src.dersler.gun19;

import java.util.Scanner;

public class Task03 {
    //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger=0;
        try {
            System.out.println("Dönüştürmek istediğiniz değeri yazın");
            deger = input.nextInt();
        }catch (Exception e){
            System.out.println("int deger girin");
        }

        System.out.println("Hangi birime değiştirmek istediğinizi seçiniz : saat/mil/kg");
        String secenek = input.next();
        birimDonusturucu(deger,secenek);
    }
    public static void birimDonusturucu(double deger, String birim) {
       switch (birim) {
            case "saat" -> {
                System.out.println("saatiSaniyeyeDonustur = " + saatiSaniyeyeDonustur(deger));
            }
            case "mil" ->
                System.out.println("miliKilometreyeDonustur = " + miliKilometreyeDonustur(deger));
           case "kg" ->
               System.out.println("kgGramaDonustur = " + kgGramaDonustur(deger));
           default -> System.out.println("Doğru değer giriniz");
        };

    }
    public static double saatiSaniyeyeDonustur(double buyukluk){
        double saniye = buyukluk*3600;
        return saniye;
    }
    public static double miliKilometreyeDonustur(double buyukluk){
        double km = buyukluk*1.6;
        return km;
    }
    public static double kgGramaDonustur(double buyukluk){
        double gram = buyukluk*1000;
        return gram;
    }

}// Class sonu
