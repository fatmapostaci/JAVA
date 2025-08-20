package learnJava.srcHoca.j26abstraction.abstraction05;

public class Kartal extends Hayvan{
    @Override
    void yiyecegi() {
        System.out.println("Küçük kuşlar");
    }

    @Override
    void yemekMiktari() {
        System.out.println("1000 g");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    void sesi() {
        System.out.println("Çığlık ");
    }

    void tavşanAvlar(){
        System.out.println(getIsim() + " eğlenmek için tavşan avlar");
    }
}
