package learnJava.src.dersler.gun31.Mentoring.siparis.sistemi;

public class SiparisAPP {
    public static void main(String[] args) {
      Siparis siparis1 = new Siparis();
        System.out.println("siparis1 = " + siparis1);


        // Urun uretelim
        Urun urun1 = new Urun("Omo",250);
        Urun urun2 = new Urun("nokia 3400",5000);

        siparis1.urunEkle(urun1);
        siparis1.urunEkle(urun2);

        siparis1.urunEkle(new Urun("kalem",140));

        System.out.println("siparis1 = " + siparis1);


    }
}
