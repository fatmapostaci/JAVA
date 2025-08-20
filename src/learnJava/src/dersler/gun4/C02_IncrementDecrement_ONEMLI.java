package learnJava.src.dersler.gun4;

public class C02_IncrementDecrement_ONEMLI {
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
        System.out.println("incremenr esnasında " + a++);  //9/ önce sout (a) sonra a+1
        System.out.println("inc sonrasında " + a);//10

        // PreIncrement
        System.out.println("Icrement anında " + ++a); //11/ önce a+1 sonra sout a
        System.out.println("Increment sonra "+a);//11


        int b = 23;
        int d = b++; //d=23
        System.out.println("b = " + b); //24
        System.out.println("d = " + d); //23

        int c = ++b; //
        System.out.println("b = " + b); //25
        System.out.println("c = " + c); //25

        int num = 12;
        System.out.println(""+ num++ + ++num);  //1214
        System.out.println("a = " + num); //a=14
        System.out.println("" + ++num + num++ ); //1515
        System.out.println("num = " + num);//16

        System.out.println("***Decrement - Azaltma***");
        int k=3;
        System.out.println(k); // 3
        System.out.println(k--);// 3
        System.out.println(--k);// 1

        int x=20;
        int y=15;
        System.out.println("*****");
        System.out.println(++x + y--);//36  (x:21 y:14)
        System.out.println( y++ + x++ + --x);//56 14+21+21  (y:15 x:21

    }
}
