package learnJava.src.dersler.gun33;

public class C02StaticVariable {
            /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi bir objeye ait bir variable'in son degerini
         bulmak icin sadece o objeyi dikkate alınır

       Static variabler ise class variable olarak tanimlanir
       ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali
     */

    static String firmaIsim="Clarusway";//initial edilmis static variable
    static int firmaId;//initial edilmemis static variable
    static boolean firmaIt;//initial edilmemis static variable
    String firmaAdres;//initial edilmemis static variable

    public static void main(String[] args) {

        System.out.println("firmaIsim = " + firmaIsim);
        firmaIt = true;

        System.out.println("C02StaticVariable.firmaId = " + C02StaticVariable.firmaId);

        staticMethod();

    }

    public static void staticMethod() {
        System.out.println("Static Method Run edildi");
        firmaId = 1001;
        C02StaticVariable obj = new C02StaticVariable();
        obj.firmaAdres= "USA";

    }
    public    void nonstaticMethod() {
        System.out.println("Non-Static Method Run edildi");
        firmaId = 1002; // non-static methodlar class(static) variablara ulaşabilir
        firmaAdres= "UK"; // non static methodlar instance(non-static) variablara ulaşabilir

    }
}
