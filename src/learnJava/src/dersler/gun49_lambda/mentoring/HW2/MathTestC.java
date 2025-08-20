package learnJava.src.dersler.gun49_lambda.mentoring.HW2;

import dersler.gun49_lambda.mentoring.MathTest;

public class MathTestC {

    /*
A R A Y U Z --> MathTest
* int parametreli
* boolean return Type lı
* Tek methodlu fonksiyonel arayüz(test())
C L A S S --> MathTestC
* isPrime() : Sayının asal olup olmadığının kontrolü lambda
* isPossitive() : Sayının pozitif olup olmadığının kontrolu lambda
*/

    public static void main(String[] args) {

        MathTest isPrime = n -> {
            if ( n < 2 ) return false;
            for (int i = 2; i < n ; i++) {  // yada math.sqrt(n) kadar bakmak yeterliymiş
               if( n % i == 0) return false;
            }
            return true;

        };
        boolean result= isPrime.test(6);
        System.out.println("result = " + result);

        MathTest isPositive = n ->{ return   n > 0; };

        result = isPositive.test(3);
        System.out.println("result = " + result);

    }
}
