package learnJava.src.dersler.gun40.j26abstraction.abstraction02;

public class IdariPersonel extends Personel{
    int tecrübe = 15;
    @Override
    public void maasHesapla() {
        System.out.println("Kodunuza bağlı olarak saatlik 100$ alabilir");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("İdari personel 2 saat onsite olacak şekilde günlük 6 saat çalışır");
    }

    @Override
    public void sigorta(){
        System.out.println("İdari personel Üst seviden sigortalanırlar");
    }

}
