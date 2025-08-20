package learnJava.src.dersler.gun33;

public class C02AccesModifiers {

    public static void main(String[] args) {
        C01AccesModifiers obj1 = new C01AccesModifiers(12,18);
        System.out.println("obj1.defaultYas = " + obj1.defaultYas);
        System.out.println("obj1.protectedYas = " + obj1.protectedYas);
        System.out.println("obj1.publicYas = " + obj1.publicYas);

        C01AccesModifiers.defaultMeth();



    }
}
