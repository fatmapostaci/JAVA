package learnJava.src.dersler.gun30;


public class C01OgretmenRunner {

    public static void main(String[] args) {
        C01Ogretmen.selamla(); // Static değerler class a tanımlı oldugundan obje olmadan class ismiyle ulaşılır

        C01Ogretmen asli = new C01Ogretmen();
        C01Ogretmen veysel = new C01Ogretmen();
        asli.name = "Asli";
        asli.tecrube = 15;
        String okulAdi = "Clarusway";

        System.out.println("veysel.name = " + veysel.name); // null
        System.out.println("veysel.tecrube = " + veysel.tecrube); // 0
        System.out.println("veysel.okulAdi = " + okulAdi); // Clarusway
        okulAdi = "Ondia";

        System.out.println("asli.okulAdi = " + okulAdi); // Ondia
        System.out.println("veysel.okulAdi = " + okulAdi); // Ondia

        asli.maas = C01Ogretmen.maasHesapla(asli.tecrube);
        //veysel.maas = C01Ogretmen.maasHesapla(veysel.tecrube);
        System.out.println("asli.maas = " + asli.maas);
        System.out.println("veysel.maas = " + veysel.maas);
        System.out.println("veysel.ogretmenSayisi = " + veysel.ogretmenSayisi);
        System.out.println("asli.ogretmenSayisi = " + asli.ogretmenSayisi);
    }
}
