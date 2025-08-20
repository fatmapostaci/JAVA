package learnJava.srcHoca.j04_javaoperators.aritmaticoperators;

public class C02_IncrementDecrement {
    /*
   Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
   Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
       */

    public static void main(String[] args) {
        int a = 10;
        a = a+4; // Increment
        System.out.println("a = " + a);

        a = a/2;  // decrement
        System.out.println("a = " + a);

        // Sayı değerini bir arttırmak için x++ post-inc veya ++x pre-inc kullanılabilir

        a++; // post-incr
        System.out.println("a = " + a);

        ++a; // pre-incr
        System.out.println("a = " + a);

        // Aynı anda iki işlem yapılırsa:
        // post Invrement
        System.out.println("incremenr esnasında " + a++);  // önce sout (a) sonra a+1
        System.out.println("inc sonrasında " + a);

        // PreIncrement
        System.out.println("Icrement anında " + ++a); // önce a+1 sonra sout a
        System.out.println("Increment sonra "+a);


        int b = 23;
        int d = b++;
        System.out.println("b = " + b);
        System.out.println("d = " + d);

        int c = ++b;
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int num = 12;
        System.out.println(""+ num++ + ++num);
        System.out.println("a = " + num);
        System.out.println("" + ++num + num++ );
        System.out.println("num = " + num);

        System.out.println("***Decrement - Azaltma***");
        int k=3;
        System.out.println(k); // 3
        System.out.println(k--);// 3
        System.out.println(--k);// 1

        int x=20;
        int y=15;
        System.out.println("*****");
        System.out.println(++x + y--);//36
        System.out.println(y++ + x++ + --x);//56

    }
}
