package learnJava.src.dersler.gun28;

public class C04PassByValue {
            /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static (gökteki güneş) olarak tanımlanır.
        Metodun static değişkene direk ulaşarak değiştirmesini sağlarsınız
         */
    static double fiyat;
    public static void main(String[] args) {
        fiyat = 2000;
        double yuzde = 20;
        System.out.println("method öncesi fiyat = " + fiyat+" yüzde = "+ yuzde);// 2000  20
        fiyatIndir2(fiyat,yuzde);
        System.out.println("method öncesi fiyat = " + fiyat+" yüzde = "+ yuzde); // 1600 20

        System.out.println("*******************************************");
        System.out.println("method öncesi fiyat = " + fiyat+" yüzde = "+ yuzde);// 2000  20
        fiyatIndir(yuzde);
        System.out.println("method öncesi fiyat = " + fiyat+" yüzde = "+ yuzde); // 1600 20

    }


    public static void fiyatIndir(double yuzde){
        fiyat = fiyat*(1-yuzde/100);
        yuzde = 30;
        System.out.println("Metod içinde fiyat = " + fiyat +" yüzde = "+ yuzde);// 2000 30

    }
    public static void fiyatIndir2(double fiyat ,double yuzde){
        fiyat = fiyat*(1-yuzde/100);
        yuzde = 30;
        System.out.println("Metod içinde fiyat = " + fiyat +" yüzde = "+ yuzde);// 2000 30

    }
}
