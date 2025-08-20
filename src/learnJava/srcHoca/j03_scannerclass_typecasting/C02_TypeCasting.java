package learnJava.srcHoca.j03_scannerclass_typecasting;

public class C02_TypeCasting {
/*
       Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                     byte < short < int < long < float < double
       Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
       Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
   */

    public static void main(String[] args) {

        double d = 49; // AW : k-> b double dataya dönüştürüldü
        System.out.println("d = " + d);

        int a = 14;
        int b = 5;
        System.out.println("(a/b) = " + (a / b));

        double c = a/b;
        System.out.println("c = " + c);

        /*
        java'da iki int deger bolundugunde sonuc mutlaka int olur
        Yani bolme ondalikli bir sayi olsada ondalıklı kısmı görmezden
        gelerek int yapar
         */
/*
        double e = (double) a/b;
        System.out.println("e = " + e);
 */

        short numS = 20;
        double numD = numS; // AW : k->b
        System.out.println("numD = " + numD);
        System.out.println("numD/b = " + (numD / b));
        //Hap bilgi -> Iki farkli data type isleme girerse AW( k data b dataya casting(cevrilir))
        // veri kaybini onlemek icin

        double numD2 = 129.99;
        long numL = (long) numD2; // EN: Explicit narrowing   b -> k
        System.out.println("numL = " + numL);

        short numS2 = (short) numD2; // EN : b -> k

        long numL2 = 129;
        short num3 = (short) numL2;

        byte numB = (byte) numL2;
        System.out.println("numB = " + numB);


    }
}
