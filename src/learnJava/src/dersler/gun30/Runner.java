package learnJava.src.dersler.gun30;

public class Runner {
        /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
     */

    public static void main(String[] args) {
        Musteri adil = new Musteri();
        adil.name= "Adil Pekyaman";
        adil.hesap = new ElektrikHesap();
        adil.hesap.tuketimEkle(200);
        System.out.println("İlk ay yapılan tüketim"+adil.hesap.toplamTuketim);
        double ilkAyTutar = adil.hesap.odenecekTutar();

        adil.hesap.tuketimEkle(300);
        System.out.println("İlk ay yapılan tüketim"+adil.hesap.toplamTuketim);
        double ikiAylikTutar = adil.hesap.odenecekTutar();

        System.out.println("ilkAyTutar = " + ilkAyTutar);
        System.out.println("ikiAylikTutar = " + ikiAylikTutar);

    }

}
