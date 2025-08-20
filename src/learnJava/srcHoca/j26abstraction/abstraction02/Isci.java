package learnJava.srcHoca.j26abstraction.abstraction02;

public class Isci extends Personel{
    int tecrübe = 20;

    @Override
    public void maasHesapla() {
        System.out.println("Isci sınıfına günlük yevmiyesi 599 TL dir");
    }
    public void yeniMethod() {
        System.out.println("Yeni şeyler");
    }
    @Override
    public void maasBilgisi() {
        System.out.println("İşçiler iş yerinde en az 8 saat çalışmak zorunda");
    }
}
