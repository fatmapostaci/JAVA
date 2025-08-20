package learnJava.src.dersler.gun5;

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
        String str4 = new String("Merhaba");   //bunu da denemek istedim sonuç

        if(str1.equals(str2))//False
            System.out.println(str1 + " (str1) \"equals\" (str2) " + str2  +" TRUE");
        else
            System.out.println(str1 + " (str1) \" not equals\" (str2) " + str2  +" FALSE");
        if(str1.equals(str3))//TRUE
            System.out.println(str1 + " (str1) \"equals\" (str3) " + str3 +" TRUE");
        else
            System.out.println(str1 + " (str1) \" not equals\" (str3) " + str3  +" FALSE");
        if(str1.equals(str4)) //TRUE //?????? bu koşulda sonucun else çıkmasını bekliyordum ama if koşulu true döndü çünkü sadece stringlerin içini karşılaştırıyor
            System.out.println(str1 + " (str1) \"equals\" (str4) " + str4  +" TRUE");
        else
            System.out.println(str1 + " (str1) \" not equals\" (str4) " + str4  +" FALSE");


        if(str1==str3)  //?????? bu koşulda adresleri kontrol ediyor.//TRUE
            System.out.println(str1 + " (str1) == (str3) " + str3  +" TRUE");
        else
            System.out.println(str1 + " (str1) != (str3) " + str3  +" FALSE");
        if(str1==str2)  //?????? bu koşulda adresleri kontrol ediyor.//False
            System.out.println(str1 + " (str1) == (str2) " + str2  +" TRUE");
        else
            System.out.println(str1 + " (str1) != (str2) " + str2  +" FALSE");
        if(str1==str4) //FALSE //?????? bu koşulda adresleri kontrol ediyor.
            System.out.println(str1 + " (str1) == (str4) " + str4  +" TRUE" );
        else
            System.out.println(str1 + " (str1) != (str4) " + str4 +" FALSE" );

}
}