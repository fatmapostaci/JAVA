package learnJava.src.dersler.gun40.j26abstraction.abstraction01;

public  class Accord extends Honda {
    @Override
    public void motor() {
        System.out.println("2.0 motor biraz çok yakar");
    }

    @Override
    public void koltuk() {
        System.out.println("Deri koltuklar ile konfor sağlandı");
    }

    @Override
    public void kapi() {
        System.out.println("4 kapı daha sağlam malzemeler ile oluşturuldu");
    }
}
