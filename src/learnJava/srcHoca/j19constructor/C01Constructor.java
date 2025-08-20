package learnJava.srcHoca.j19constructor;

public class C01Constructor {
    String name; // instance variable - nesneye ait değişken
    //static String name; // Class variable - Class'a ait değişken
    int age;
    static String okulAdi; // Static değişkene obje olmadan ulaşılabilir

         /*
    N e D e N  --> OOP <--  k U l L a N ı L ı R...
     Nesne Yönelimli Programlamanın(oop) Faydaları
     1- Obj oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe imkan sağlar.
     2- Class'ların 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar ile çalıştırılabilir.
     3- Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
     4- Object'ler birbirinden bağımsız olduğundan data güvenliği konusunda avantaj sağlar.
     5- Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir Class'da değişiklik yapılıp tüm projelerde çalışması sağlanır.
    Bu zaman kaybını büyük ölçüde azaltır.
     */

    public void selamla(){
        System.out.println(name + " ilgili kişiyi selamla");
    }
    public void dersCalis(){
        System.out.println(okulAdi +" okulundaki "+name + " artık "+ age+ "yasidasın kendin çalışmalısın");
    }

    public static void main(String[] args) {
        C01Constructor ogr1 = new C01Constructor();
        C01Constructor ogr2 = new C01Constructor();
        C01Constructor ogr3 = new C01Constructor();
        C01Constructor ogr4 = new C01Constructor();
        ogr1.name= "Selim";
        ogr2.name= "Selma";
        ogr3.name= "Serdar";
        ogr4.name= "Semra";
        okulAdi= "Clarusway";

        ogr1.age= 15;
        ogr2.age= 16;
        ogr3.age= 14;
        ogr4.age= 18;
        System.out.println("okulAdi = " + okulAdi);
        System.out.println("ogr1.okulAdi = " + ogr1.okulAdi);

        ogr1.dersCalis();
        ogr2.dersCalis();
        ogr3.dersCalis();
        ogr4.dersCalis();

    }

}
