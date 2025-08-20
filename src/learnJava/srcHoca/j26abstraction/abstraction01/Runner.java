package learnJava.srcHoca.j26abstraction.abstraction01;

public class Runner {
    public static void main(String[] args) {

        Civic c1 = new Civic();
        c1.name = "Mertay";
        c1.motor(); // 1.6 motor bu model için yeterli
        c1.koltuk(); // Kumaş koltuklar ile ekonomik bir araç oluşturuldu
        c1.kapi(); // 4 kapılı hafif malzemeler kullanıldı
        c1.sunRoof(); // sunRoof concrete methodu çağrıldı

        System.out.println();
        System.out.println("Accord............");
        Accord a1 = new Accord();
        System.out.println("a1.name = " + a1.name); // Mehmet
        a1.koltuk();// deri koltuklar ile konfor sağlandı
        a1.motor();// 2.0 motor biraz çok yakar
        a1.kapi();// 4 kapı daha sağlam malzemeler ile oluşturuldu
        a1.sunRoof(); //sunRoof concrete methodu çağrıldı

        System.out.println();
        System.out.println("CRV............");
        CRV crv1 = new CRV();
        crv1.name = "Şengül";
        System.out.println("crv1.name = " + crv1.name); // Şengül
        crv1.koltuk();// Yazın deri koltuklar yakar
        crv1.motor();// 2.4 çok yakar
        crv1.kapi();// 5 kapılı oluyor değilmi bu model
        crv1.sunRoof(); // Sun roof olmadan Lüks olmaz



    }
}
