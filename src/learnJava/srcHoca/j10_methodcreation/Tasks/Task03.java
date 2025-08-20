package learnJava.srcHoca.j10_methodcreation.Tasks;

import java.util.Scanner;

public class Task03 {
    //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // kullanıcının değiştirmek istediği birim belirlenecek
        System.out.println("Değiştirmek istediğiniz birimi seçiniz : (saat/mil/kg)");
        String birim = input.next().toLowerCase();

        // kullanıcının değiştirmek istediği büyüklük belirlenecek
        System.out.println("Değiştirmek istediğiniz büyüklüğü giriniz : ");
        double buyukluk = input.nextDouble();

        // çevirme işlemi gerçekleştirilecek
        //birimDonusturucu(birim,buyukluk);
        saatiSaniyeyeDonustur(2); // consola çıktı verir, return type void olduğu için atama yapılamaz.
        double saniye = saatiSaniyeyeDonustur2(3); // return type double oldugu için başka bir değere atanabilir
        System.out.println("saniye = " + saniye);
        String price = saatiSaniyeyeDonustur(4);
        System.out.println("price = " + price);
    }


    public static void birimDonusturucu(String birim, double buyukluk ){
        switch (birim){
            case "saat" :
                //System.out.println("Girdiğiniz "+ buyukluk + " saatin saniye olarak karşılığı = "+ (buyukluk*3600) + " saniyedir");
                saatiSaniyeyeDonustur(buyukluk);
                break;
            case "mil" :
               // System.out.println("Girdiğiniz "+ buyukluk + " mil değerinin karşılığı = "+ (buyukluk*1.6) + " kilometredir") ;
                miliKmyeDonustur(buyukluk);
                break;
            case "kg":
               // System.out.println("Girdiğiniz "+ buyukluk + " kg değerinin karşılığı = "+ (buyukluk*1000) + " gramdır") ;
                kgGramaDonustur(buyukluk);
                break;
            default: {
                System.out.println("Yanlış girdi yaptınız");
            }
        }
    }

    public static void saatiSaniyeyeDonustur(double buyukluk){
        System.out.println("Girdiğiniz "+ buyukluk + " saatin saniye olarak karşılığı = "+ (buyukluk*3600) + " saniyedir");
    }

    public static double saatiSaniyeyeDonustur2(double buyukluk){ // metod ismi ile ayrıştırdım
        System.out.println("Girdiğiniz "+ buyukluk + " saatin saniye olarak karşılığı = "+ (buyukluk*3600) + " saniyedir");
        return buyukluk*3600;
    }
    public static String saatiSaniyeyeDonustur(int buyukluk){ // parametreyi faflı yaparak ayrıştırdım
        System.out.println("Girdiğiniz "+ buyukluk + " saatin saniye olarak karşılığı = "+ (buyukluk*3600) + " saniyedir");
        return "$ "+buyukluk*3600;
    }

    public static void miliKmyeDonustur(double buyukluk){
        System.out.println("Girdiğiniz "+ buyukluk + " mil değerinin karşılığı = "+ (buyukluk*1.6) + " kilometredir") ;
    }

    public static void kgGramaDonustur(double buyukluk){
        System.out.println("Girdiğiniz "+ buyukluk + " kg değerinin karşılığı = "+ (buyukluk*1000) + " gramdır") ;
    }
}// Class sonu
