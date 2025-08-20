package learnJava.src.dersler.gun33;

public class Scope {
    public static void main(String[] args) {
        //int a;
        {
             int a = 3;  //scope içinde tanımladığım değer
            System.out.println(a);
        }
        int a=5;  //scope bitince yeniden aynı değişkeni tanımlayabilirim
        System.out.println(a);
    }
}
