package learnJava.srcHoca.j10_methodcreation;

public class C05MethodOverloading {
    /*
           Java'da  methodlarin farkli  olmaları  icin
                a)Method ismi  b)parametreler kontrol edilir..

           Java da ayni isimle birden çok method create edilmesine method overloading denir.
           method Overloading icin Method Signature'larinin farkli olmasi gerekir
           Method Signature = method name + parametre sayisi + parametre data type

          ahan da TRICK_01 : Access Modifier'lari degistirmek de method'lari Java  farkli methodlar olarak derlemez
           aynı method olarak derler   Cunku access modifier'lar method signature'a dahil degildir.
          ahan da TRICK_02 : Method'larin body'sini degistirmek de method'lari Java  farkli methodlar olarak derlemez
           aynı method olarak derler. Cunku body'ler method signature'a dahil degildir.
          ahan da TRICK_03 : Overloading "Compile Time Error" verir.

          Overloading :
          1)Parametrelerin sayisi degistirilerek method overloading tanımlanabilir.
          2)Parametre sayisi değiştirilmeden herhangi bir parametrenin data type'ini
            degistirerek method overloading tanımlanabilir.
          Note: topla(2,3); method call topla(double num1, int num2) var oldugu surece
                topla(int num1, int num2) yi kullanir, cunku argument data type ile parametre
                data type birebir eşleşiyor. Fakat argument data type ile parametre
                data type birebir eşleşmeyen data type yoksa auto widening'e
                gore Java kullanacagi method'u secilir. Auto widening'e gore kullanabilecegi bir method
                yoksa Java hata verir.
          3)FARKLI data type'indeki parametrelerin yerlerini degistirerek method overloading tanımlanabilir.
           birbirini kapsayan data turleri oldugunda Java en optimum cozumu tercih eder.
           (bire bir uyan varsa o methodu calistirir, bire bir uyan yoksa en fazla uyan
           methodu kullanir)
           Eger kapsayan bir method da bulamazsa Java CTE verir
        */

    public static void main(String[] args) {

        System.out.println("topla(4,8) = " + topla(4, 8)); // 12 --> int-int
        System.out.println("topla(4.3,8) = " + topla(4.3, 8)); // 12.3 --> double-int
        System.out.println("topla(4,8.3) = " + topla(4, 8.3)); // 12.3 --> int-double
        System.out.println("topla(4.0,8.3) = " + topla(4.0, 8.3)); // 12.3 --> double-double
        System.out.println("topla(4,8,2) = " + topla(4,8,2)); // 14 --> int-int-int

    }

    private static double topla(double a, double b){
        System.out.println("double-double olan metod kullanıldı" );
        return (a +b);
    }

    private static double topla(int a, double b){
        System.out.println("int-double olan metod kullanıldı" );
        return (a +b);
    }
    private static double topla(double a, int b){
        System.out.println("double-int olan metod kullanıldı" );
        return (a +b);
    }

    private static int topla(int a, int b){
        System.out.println("int-int olan metod kullanıldı" );
        return (a +b);
    }



    private static int topla(int a, int b, int c){
        System.out.println("int-int-int olan metod kullanıldı" );
        return a+b+c;
    }












}
