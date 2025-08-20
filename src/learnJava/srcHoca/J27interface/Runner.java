package learnJava.srcHoca.J27interface;

public class Runner {

    public static void main(String[] args) {

        Sahin doganGorunumlu = new Sahin();
        doganGorunumlu.jant(); //Çelik jantlar güzelleştirdi
        doganGorunumlu.kapi();// Kapıları farklı renkte boyandı
        doganGorunumlu.klima();// Sıcak havalarda çok işe yarar
        doganGorunumlu.koltuk();// Kadife kumaş biraz garip kaçmış
        doganGorunumlu.motor();// Pekde güçlü değil
        doganGorunumlu.yakit();// Gaz taktırırsan daha az yakar
        doganGorunumlu.kaporta();//  Bir iki ezik var
        doganGorunumlu.tavanAydinlatmasi(3); // tavan ışıkları 3 seviyesinde aydınlatma yapıyor.

        doganGorunumlu.anten();// Anteni olmayan çekmeyebilir -> DışDonanım int concrete metod çağrıldı (non-statik)
        doganGorunumlu.sunRoof();// Soğuk havalarda problem çıkarmaz mı ? -> Tofask abs classından non statik method call edildi

        System.out.println("DisDonanim.sisLamp() = " + DisDonanim.sisLamp()); // Interfaceden statik metod call edildi

        System.out.println("DisDonanim.RENK = " + DisDonanim.RENK); // Kırmızı
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK); // Yavru Ağzı
        System.out.println("Lastik.RENK = " + Lastik.RENK); // Beyaz Çizgili
    }
}
