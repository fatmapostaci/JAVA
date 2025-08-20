package learnJava.srcHoca.j04_javaoperators.aritmaticoperators;

public class C01_ArithmaticOperators {
 /*
		 Islem Onceligi:
		  1)üs ve Parantez ici islemler
		  2)Carpma ve bolmeler
		  3)Toplama ve cikarmalar
		 */

    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int c = 5;
        System.out.println("(a+b*c) = " + (a + b * c));
        System.out.println("(a*b+c) = " + (a * b + c));
        System.out.println("((a+2*c)/5+1) = " + ((a + 2 * c) / b + 1));
        System.out.println("((a+2*c)/5+1) = " + ((a + 2 * c) / (b + 1)));


        int d =12;
        double e=4;
        float f=4f;
        System.out.println("d/e = " + (d / e));
        System.out.println("d+e = " + (d + e));
        System.out.println("(e/d) = " + (e / d));
        System.out.println("(f/d) = " + (f / d));

        //farkli data type ariymetic islemlerde sonuc ciktisi buyuk olanin data type olarak verilir

        // Modulus operatoru bolmeden kalanı veririr
        // Sayı tek mi cif mi?
        System.out.println(27%2); // 1 donuyorsa tek
        System.out.println(88%2);

        // Sayının son basamagını bulmak:
        System.out.println(375%10);


    }
}
