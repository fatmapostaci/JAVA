package learnJava.srcHoca.j04_javaoperators.comparisonoperators.tasks;

public class T03_ComparisonOperators {
/*
     3. String Karşılaştırması
 İki String değerini karşılaştıran bir Java programı yazın.
 Program, iki String'in eşit olup olmadığını (equals metodu) kontrol etsin ve sonucu ekrana yazdırsın.


 */

    public static void main(String[] args) {

        String str1 = "Merhaba";
        String str2 = "Dünya";
        String str3 = "Merhaba";
        String str4 = new String("Merhaba");

        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equals(str4) = " + str1.equals(str4));
        System.out.println("(str1==str4) = " + (str1 == str4));


    }
}
