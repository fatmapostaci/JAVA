package learnJava.src.dersler.arac;

public class AracRunner {

    public static void main(String[] args) {
        Arac arac1 = new Arac();
        arac1.play();
        System.out.println("arac1.model = " + arac1.model);
        Arac ar=null;
        ar.play();
    }

}
