package learnJava.srcHoca.j24inheritance.inheritance3;

public class Hayvan {
    int a;
    int m =3;
    int c = 9;

    public Hayvan(String str) {
        System.out.println("Hayvanlarda String Parametreli Const Çalıştı");
    }

    public Hayvan() {
    }

    public void mA(){
        System.out.println("Hayvanlar Classında mA Çalıştı");
    }

    public void mM(){
        System.out.println("Hayvanlar Classında mM Çalıştı");
    }
}
