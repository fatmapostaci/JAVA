package learnJava.srcHoca.j16passbyvalue;

public class C02PassByValue {
    //  task -> verilen fiyat için %11 %22 ve %33  indirimli  fiyatı print eden return type METHODlar  create ediniz.

    public static void main(String[] args) {
        double fiyat = 1000;

        double yuzde11 = 11;
        double yuzde22 = 22;
        double yuzde33 = 33;


        System.out.println("************** yuzde 11 indirim *************");
        System.out.println("İndirim öncesi fiyat = " + fiyat);
        fiyatIndir(fiyat,yuzde11);
        System.out.println("İndirim sonrası fiyat = " + fiyat);

        System.out.println("************** yuzde 22 indirim *************");
        System.out.println("İndirim öncesi fiyat = " + fiyat);
        fiyatIndir(fiyat,yuzde22);
        System.out.println("İndirim sonrası fiyat = " + fiyat);

        System.out.println("************** yuzde 33 indirim *************");
        System.out.println("İndirim öncesi fiyat = " + fiyat);
        fiyatIndir(fiyat,yuzde33);
        System.out.println("İndirim sonrası fiyat = " + fiyat);




    }

    public static void fiyatIndir(double fiyat,double yuzde){
        fiyat = fiyat*(1-yuzde/100);
        System.out.println("Metod içinde fiyat = " + fiyat);
    }

    public static double fiyatIndir2(double fiyat ,double yuzde){
        fiyat = fiyat*(1-yuzde/100);
        System.out.println("Metod içinde fiyat = " + fiyat +" yüzde = "+ yuzde);
        return fiyat;
    }
}
