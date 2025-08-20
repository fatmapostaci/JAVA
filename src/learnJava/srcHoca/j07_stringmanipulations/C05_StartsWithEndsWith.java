package learnJava.srcHoca.j07_stringmanipulations;

import java.util.Scanner;

public class C05_StartsWithEndsWith {
            /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

    public static void main(String[] args) {

        String str ="ebikgabik";
        System.out.println("str = " + str);
        System.out.println("str.startsWith(\"e\") = " + str.startsWith("e")); // true
        System.out.println("str.startsWith(\"eb\") = " + str.startsWith("eb")); // true
        System.out.println("str.startsWith(\"ebik\") = " + str.startsWith("ebik")); // true

        String str1 = "ebik";
        System.out.println("str1 = " + str1);
        System.out.println("str.startsWith(str1) = " + str.startsWith(str1)); // true

       // str.startsWith('e'); // CTE parametre olarak char yazılamaz...

        String str2 = "gabik";
        System.out.println("str.endsWith(str2) = " + str.endsWith(str2)); // true
        System.out.println("str.endsWith(\"k\") = " + str.endsWith("k"));
        System.out.println("str.endsWith(\"gabık\") = " + str.endsWith("gabık")); // false -> gabik != gabık

        //Task-> girilen e-mail hesabının  @gmail.com ile bitmiyorsa "lütfen gmail hesabı giriniz"
        Scanner input = new Scanner(System.in);
        System.out.println("Google mail adresinizi giriniz...");
        String mail = input.next();

        String mesaj = mail.endsWith("@gmail.com") ? "Teşekkür ederiz" : "lütfen gmail hesabı giriniz";
        System.out.println("mesaj = " + mesaj);


    }
}
