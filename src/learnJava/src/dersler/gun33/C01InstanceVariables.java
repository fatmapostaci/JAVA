package learnJava.src.dersler.gun33;

public class C01InstanceVariables {

        /*												INSTANCE VARIABLE

 1) Main method'un ve urettiginiz diger methodlarin disinda  (ustunde veya altinda), class'in icinde
     olusturulan variable'lara non-Static Class level "instance variable" denir.
 2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
 3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
     Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
     Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "yas" variable'i initialize edildi, digerleri initialize edilmedi.
 4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
             byte, short, int, long icin default value 0'dir.
             float, double --> default value 0.0'dir.
             char --> default value ' ''dir.
             boolean --> default value false'dur.
             String --> default value  -null- dir.

*/

    static String kursAdi = "Ondia";
    static String prLanguage; // initialize edilmemiş Class var oluşturuldu

    int yas = 49; // initilize edilmiş değişken olulturuldu
    int tecrube; // initilize edilmemiş değişken;
    String isim;
    boolean isDeveloper;
    double boy;
    char unvan;


    public static void main(String[] args) {
      // static int kg = 99; static değişkenler sadece Class seviyesinde tanımlanabilir
        int kg; // Local variable tanımlandı
        kg = 99; // Local variabla değer atandı

        System.out.println("kg = " + kg); // 99;

        System.out.println("kursAdi = " + kursAdi); // static Var. obje oluşturmadan ismiyle çağırıldı.

        // Instance variablelara objeler üzerinden ulaşılır
        C01InstanceVariables obj1 = new C01InstanceVariables();
        C01InstanceVariables obj2 = new C01InstanceVariables();
        obj2.yas = 50;
        C01InstanceVariables obj3 = new C01InstanceVariables();
        obj3.yas = 51;

        //System.out.println("yas = " + yas); Inst Var sadec objeler üzerinden ulaşılabilir
        System.out.println("obj1.yas = " + obj1.yas); // 49
        System.out.println("obj1.yas = " + obj1.yas); // 49
        System.out.println("obj1.yas = " + obj2.yas); // 50
        System.out.println("obj1.yas = " + obj3.yas); // 51

        System.out.println("obj1.isim = " + obj1.isim);
        System.out.println("obj1.isim = " + obj1.isDeveloper);
        System.out.println("obj1.isim = " + obj1.boy);
        System.out.println("obj1.isim = " + obj1.tecrube);
        System.out.println("obj1.isim = " + obj1.unvan);

        // static methodları çağırmak için firek method ismi kullanılır
        staticMethod(obj3);

        // non-static methodları çağırmak içn obje kullanılır
        obj1.nonstaticMethod();
        System.out.println("obj1.yas = " + obj3.yas); // 51


    }

    public void nonstaticMethod() {
        System.out.println("non-statik method obje üzerinden çağırılabilir");
        //staticMethod(); static methodlar non-statik yapılarda çağrılabilir
        System.out.println("yas = " + yas); // Non-static "instance variable lar cağrılaabilir

    }

    static void staticMethod(C01InstanceVariables obje) {
        System.out.println("statik method direk olarak (Class)ismiyle çağırılabilir");
        System.out.println("obje.yas = " + obje.yas);
        obje.nonstaticMethod(); // non-static metodlar da static yapılarda obje üzerinden kullanılır
    }

}
