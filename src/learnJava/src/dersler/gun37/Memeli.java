package learnJava.src.dersler.gun37;

public class Memeli extends Hayvan{
    int m =1;
    int c = 6;

    public Memeli() {
        this(1.70); //
        System.out.println("Memeli Classtaki Default Cons Calıştı");
    }

    public Memeli(double boy) {
        super("Aldo"); // Super Class ta String parametreli Cons Cağırdı.
        System.out.println("Memeli Classtaki double data typelı Cons Calıştı");

    }
    public Memeli(String boy) {

        System.out.println("Memeli Classtaki String data typelı Cons Calıştı");

    }


    public Memeli(int num) {
        System.out.println("Memeli Classtaki Default Cons Calıştı");

    }



    public void mM(){
        System.out.println("Memeliler Classında mM Çalıştı");
    }

    public void mC(){
        System.out.println("Memeliler Classında mC Çalıştı");
    }

}
