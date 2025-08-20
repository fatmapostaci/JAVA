package learnJava.src.dersler.gun30;

public class C02Arac {
            /*
        1- consturctor ismi Class name ile aynı olmalı.Cons. name Buyuk harf ile başlamalı
        2- constructor create edilirken name den sonra () {} mutlaka kullanılmalı.
        3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
        4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
        5- Class tanımlandığında java default(p'siz) cons. kendi create eder.
        6- Fields-> obj'nin uretilirken alacagı değer instance variables
        7- bir class'da bir den çok cons. tanımlanabilir.
         */

    /*
        Task-> fields: marka,model,km,motorHacim,vitesAotu,ikinciEl,yıl olan
         3 obj  create ederek fields print eden code create ediniz.
         */
    String marka;
    String model;
    int km;
    int motorHacim;
    boolean vitesAotu;
    boolean ikinciEl;
    int uretimYili;

    public C02Arac(String marka ,String model,int uretimYili){
        this.marka=marka;
        this.model = model;
        this.uretimYili = uretimYili;
        System.out.println("3 Parametreli Cons çalıştı");

    }

    public C02Arac(String marka, String model, int km, int motorHacim, boolean vitesAotu, boolean ikinciEl, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.km = km;
        this.motorHacim = motorHacim;
        this.vitesAotu = vitesAotu;
        this.ikinciEl = ikinciEl;
        this.uretimYili = uretimYili;
        System.out.println("Tüm paramereleri oluşturan Cons çalıştı");
    }

    public C02Arac(){
        System.out.println("Parametresiz Cons çalıştı");

    }

    @Override
    public String toString() {
        return "{" +
                " marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAotu=" + vitesAotu +
                ", ikinciEl=" + ikinciEl +
                ", uretimYili=" + uretimYili +
                '}';
    }

    public static void main(String[] args) {
        C02Arac arac1 = new C02Arac();
        System.out.println("arac1.uretimYili = " + arac1.uretimYili);
        System.out.println("arac1.marka = " + arac1.marka);
        arac1.marka= "Mercedes";
        arac1.km= 5000;
        arac1.uretimYili= 2022;
        arac1.motorHacim= 2000;
        arac1.vitesAotu= true;
        arac1.ikinciEl= true;

        C02Arac arac2 = new C02Arac("Bmw","X3",2023);
        System.out.println("arac2.marka = " + arac2.marka);

        C02Arac arac3 = new C02Arac("Audi","A8",1000,3000,true,false,2024);

        System.out.println("arac3.toString() = " + arac3.toString());
        System.out.println("arac1.toString() = " + arac1.toString());
        System.out.println("arac2.toString() = " + arac2.toString());

    }
}
