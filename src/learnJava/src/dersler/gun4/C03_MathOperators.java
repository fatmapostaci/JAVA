package learnJava.src.dersler.gun4;

public class C03_MathOperators {
    /*
        Math.abs(a)
        Girilen degerin mutlak degerini verir.

        Math.max(a, b)
        Girilen iki degerden buyuk olani verir.

        Math.min(a, b)
        Girilen iki degerden kucuk olani verir.

        Math.round(a)
        Girilen degerin en yakin tamsayiya yuvarlar.

        Math.sqrt(a)
        Girilen degerin karekokunu verir.

        Math.pow(a, b)
        Girilen a ve b degerini a uzeri b olarak verir.

        Math.ceil(a) 3.1 => 4
        Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

        Math.floor(a) 3.7 => 3
        Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
         */

    public static void main(String[] args) {

        System.out.println("Math.abs(-13.45) = " + Math.abs(-13.45));
        System.out.println("Math.max(13,-23) = " + Math.max(13, -23));
        System.out.println("Math.min(13,-23) = " + Math.min(13, -23));
        System.out.println("Math.round(13.986) = " + Math.round(13.986));
        System.out.println("Math.sqrt(81) = " + Math.sqrt(81));
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3)); // 2*2*2
        System.out.println("Math.ceil(9.00001) = " + Math.ceil(9.00001));
        System.out.println("Math.floor(34.9998) = " + Math.floor(34.9998));


    }

}
