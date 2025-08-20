package learnJava.srcHoca.j26abstraction.abstraction02;

public class Runner {
    public static void main(String[] args) {
        IdariPersonel idariPersonel = new IdariPersonel();
        idariPersonel.name = "Rabia";
        System.out.println("idariPersonel.name = " + idariPersonel.name);
        idariPersonel.maasBilgisi();
        idariPersonel.maasHesapla();
        idariPersonel.sigorta();
        idariPersonel.yillikIzin();

        System.out.println();
        Isci isci = new Isci();
        isci.name = "JavaCan";
        System.out.println("isci.name = " + isci.name);
        isci.maasBilgisi();
        isci.maasHesapla();
        isci.sigorta();
        isci.yillikIzin();
        isci.yeniMethod();

        Personel personel1 = new Isci();
        Personel personel2 = new IdariPersonel();


        System.out.println("idariPersonel.tecrübe = " + idariPersonel.tecrübe);// 15
        System.out.println("isci.tecrübe = " + isci.tecrübe); // 20
        System.out.println("personel1.tecrübe = " + personel1.tecrübe); // 12
        System.out.println("personel2.tecrübe = " + personel2.tecrübe); // 12
        personel1.maasHesapla(); // Isci sınıfına günlük yevmiyesi 599 TL dir
        personel2.maasHesapla(); // Kodunuza bağlı olarak saatlik 100$ alabilir
    }
}
