package learnJava.srcHoca.j10_methodcreation;


import static j10_methodcreation.C04MethodDepo.gecmeNotu;

public class C03MethodCreation {
                /*
        Farkli class'lardan meth call etmek icin clasName.methodName ile ya da class import edilerek call islemi yapilir
        static method olarak call edilir->gokteki gunes gibi
        Ayni classta method dogrudan name ile call edilir
         */

    public static void main(String[] args) {
        // Girdiğimiz notun değerlendirmesini yapan bir metodu başka classtan çağırın

        // 1. Yol: metod ismi yazılıp class import edilebilir.
       // gecmeNotu(89);

        // 2. Yol: class ismi yazılır ve kullanılabilecek metod ve değişkenlere ulaşılır.
        C04MethodDepo.gecmeNotu(59);

    }


}
