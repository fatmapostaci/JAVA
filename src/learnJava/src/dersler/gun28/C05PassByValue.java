package learnJava.src.dersler.gun28;

public class C05PassByValue {
            /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
       2 .değişklik  yapılan variable'lar atama tanımlanır.
         */

    public static void main(String[] args) {
        double fiyat = 2000;
        double yuzde = 25;
        System.out.println("fiyat = " + fiyat);
        fiyat = C02PassByValue.fiyatIndir2(fiyat,yuzde);
        System.out.println("fiyat = " + fiyat);


    }

}
