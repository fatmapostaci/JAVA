package learnJava.src.OCA;

public class SingletonRun {
    public static void main(String[] args) {

        Singleton.s.fatma();
        Singleton d1= Singleton.getSingletonObj();
        Singleton d2 = Singleton.getSingletonObj();

        System.out.println("(d1==d2) = " + (d1 == d2));

    }
}
