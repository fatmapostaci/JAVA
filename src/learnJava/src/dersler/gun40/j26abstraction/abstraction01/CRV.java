package learnJava.src.dersler.gun40.j26abstraction.abstraction01;

public class CRV extends Honda {
    @Override
    public void motor() {
        System.out.println("2.4 çok yakar");
    }

    @Override
    public void koltuk() {
        System.out.println("Yazın deri koltuklar yakar");
    }

    @Override
    public void kapi() {
        System.out.println("5 kapılı oluyor değilmi bu model");
    }

    @Override
    public void sunRoof (){
        System.out.println("Sun roof olmadan Lüks olmaz");
    }
}
