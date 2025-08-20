package learnJava.srcHoca.j26abstraction.abstraction02;

public abstract class Personel {
    String name;
    int tecrübe = 12;
    public abstract void maasHesapla();
    public abstract void maasBilgisi();
    public void sigorta(){
        System.out.println("Bu devirde herkese sigorta şart");
    };
    public final void yillikIzin(){
        System.out.println("Yıllık izin sadece 20 iş günü olacak");
    };
}
