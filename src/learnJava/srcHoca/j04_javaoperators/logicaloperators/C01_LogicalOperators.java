package learnJava.srcHoca.j04_javaoperators.logicaloperators;

public class C01_LogicalOperators {
         /*
 -------- && - and - (ve)---------

      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False


     -------- ||- or - (veya)---------

      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False
 */

    // && ile & arasindaki fark
    //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
    // Ancak & tum satırı kontrol eder ondan sonra durur.
    //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir

    public static void main(String[] args) {
        boolean b1 = Math.pow(2,3) > Math.pow(3,2); // False
        boolean b2 = 10 < 23; // True
        int c = 30;
        int d = 20;

        System.out.println("(b1&&(c>d)) = " + (b1 && (c > d))); //F
        System.out.println("(b2&&(c==d)) = " + (b2 && (c == d))); // F
        System.out.println("(b2 || (c < d)) = " + (b2 || (c < d))); // T
        System.out.println("(b1 || (c>d)) = " + (b1 || (c > d))); // T
        System.out.println("!(b1) = " + !(b1)); // T
        System.out.println("!(b2 || (c < d)) = " + !(b2 || (c < d))); // F



    }
}
