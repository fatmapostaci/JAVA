package learnJava.src.dersler.gun32.mentoring;

public class Example_block_constructor {
    // Static değişken
    static int staticVar = initializeStaticVar();
    int a ;

    // Static blok
    static {
        System.out.println("2. Static blok çalıştı.");
    }

    // static olmayan blok
    {
        System.out.println("blok çalıştı");
    }

    // Parametreli Constructor
    public Example_block_constructor(String param) {
        System.out.println("4. Constructor çalıştı. Parametre: " + param);
    }

    // Main metot
    public static void main(String[] args) {
        System.out.println("3. Main metot çalıştı.");
        Example_block_constructor obj = new Example_block_constructor("Test");
    }

    // Static değişkeni başlatma metodu
    private static int initializeStaticVar() {
        System.out.println("1. Static değişken başlatıldı.");
        return 0;
    }
}
