package learnJava.src.dersler.gun40.personel;

public class IdariPersonel extends Personel {
    @Override
    public void maasHesapla() {
        System.out.println("idari personel saatlik 100$ alır");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("idari personel günlük 2 saat ofisten çalışmak zorunda.");
    }
}
