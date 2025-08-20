package learnJava.src.OCA;

public class Singleton {

    private String name;
    private int age;
    private static Singleton singletonObj;

    public static Singleton s = new Singleton();


    private Singleton() {
    }

    void fatma(){

    }

    public static Singleton getSingletonObj() {
        if(singletonObj ==null)
            singletonObj = new Singleton();

        System.out.println(singletonObj);

        return singletonObj;

    }

}
