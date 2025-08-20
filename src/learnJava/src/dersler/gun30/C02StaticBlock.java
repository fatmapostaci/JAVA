package learnJava.src.dersler.gun30;

public class C02StaticBlock {
        /*
   1.static blok yapıları static variable'rı değer ataması update için kullanılır
   2.static blok Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
   3.birden fazla static blok varsa yukarıdan aşagiya sıralama ile çalışır.
   4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
    */

    static String isim = "JavvaNur";

    public C02StaticBlock() {
        System.out.println("**************Constructor çalıştı **************");
    }

    static {  // Birden fazla static block varsa yukarıdan aşağıya bir sıralama ile çalışır
        System.out.println("Static Block1 Başladı");
        System.out.println("isim modifiye edilmeden önce static blokta = "+ isim);
        isim = "FatmaNur";
        System.out.println("isim modifiye edildikten sonra static blokta = "+ isim);
    }

    public static void main(String[] args) {
        System.out.println("-------*********---------*********---------");
        System.out.println("Main başladı");
        System.out.println("Değişkenin mainde güncellenmesi öncesinde isim = " + isim);
        isim = "HavvaNur";
        System.out.println("Değişkenin mainde güncellenmesi sonrasında isim = " + isim);

        C02StaticBlock obj1 = new C02StaticBlock();
        C02StaticBlock obj2 = new C02StaticBlock();



    }
    static {
        System.out.println("Static Block2 Başladı");
        System.out.println("isim modifiye edilmeden önce static blokta = "+ isim);
        isim = "DeryaNur";
        System.out.println("isim modifiye edildikten sonra static blokta = "+ isim);
    }
}
