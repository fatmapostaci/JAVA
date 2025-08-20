package learnJava.srcHoca.j04_javaoperators.comparisonoperators.tasks;

public class T01_ComparisonOperators {
    /*
         1. Karşılaştırma Operatörlerini Anlama
     Aşağıdaki iki sayıyı karşılaştıran bir Java programı yazın.
     Kullanmanız gereken operatörler: >, <, >=, <=, ==, !=

         Her bir karşılaştırmanın sonucunu ekrana yazdırın.

     */

    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        System.out.println("(a>b) = " + (a > b));
        System.out.println("(a<b) = " + (a < b));
        System.out.println("(a>=b) = " + (a >= b));
        System.out.println("(a<=b) = " + (a <= b));
        System.out.println("(a==b) = " + (a == b));
        System.out.println("(a!=b) = " + (a != b));
    }
}
