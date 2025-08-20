package learnJava.src.dersler.gun28;

public class C01PassByValue {

    public static void main(String[] args) {
        /*
        Java Pass By Value mantığını uygulayan bir programlama dilidir.
        Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.
         */

        // task -> verilen fiyat için %24 artırılmış fiyatı print eden METHOD create ediniz.

        double fiyat = 100;
        fiyatArttir(fiyat);
        System.out.println("Main metodda fiyat = " + fiyat);

        System.out.println("*********************************");
        System.out.println("Azaltmadan önce fiyat " + fiyat); // 100
        System.out.println("metodun döndürdüğü değer = " + fiyatAzalt(fiyat)); // 76
        System.out.println("Azaltmadan sonra fiyat " + fiyat); // 100

    }
    public static void fiyatArttir(double fiyat){
        fiyat = fiyat*(1.24);
        System.out.println("Cağrılan Metodda fiyat = " + fiyat);

        System.out.println(" Fiyatın %24 fazlası = " + fiyat);
    }

    public static double fiyatAzalt(double fiyat){
        fiyat = fiyat*(0.76);
        System.out.println("Cağrılan Metodda fiyat = " + fiyat);

        System.out.println(" Fiyatın %24 eksiği = " + fiyat);
        return fiyat;
    }
}
