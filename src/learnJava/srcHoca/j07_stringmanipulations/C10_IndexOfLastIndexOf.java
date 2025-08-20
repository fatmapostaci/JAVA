package learnJava.srcHoca.j07_stringmanipulations;

import java.util.Scanner;

public class C10_IndexOfLastIndexOf {


    public static void main(String[] args) {
        /* indexOf()->aranan yolcunun koltuk numarasını verir
          char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false verir
        */

        String msj = "Madem geldin dünyaya otur çalış Javaya!";
        System.out.println("msj = " + msj);
        System.out.println("msj.indexOf('y') = " + msj.indexOf('y')); // 16
        System.out.println("msj.indexOf(\"ü\") = " + msj.indexOf("ü")); // 14
        System.out.println("msj.indexOf(\"geldin\") = " + msj.indexOf("geldin")); // 6

        int ilkA = msj.indexOf("a"); // 1
        System.out.println(ilkA);

        System.out.println("msj.indexOf('ü',14) = " + msj.indexOf('a', 2));
        System.out.println("msj.indexOf(\"a\",ilkA + 1) = " + msj.indexOf("a", ilkA + 1)); // "a" nın ikinci görünüşünü döndürür.

        // son "a" yı bulmak için :
        System.out.println("msj.lastIndexOf(\"a\") = " + msj.lastIndexOf("a"));
        System.out.println("msj.lastIndexOf(\"geldin\") = " + msj.lastIndexOf("geldin"));

        System.out.println("msj.charAt(1) = " + msj.charAt(1)); // a
        System.out.println("msj.indexOf(\"a\") = " + msj.indexOf("a")); // 1

         /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
        a-) girilen ifade java içermiyor
        b-) girilen ifade 1 adet java içeriyor
        c-) girilen ifade  1'den çok java içeriyor
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = input.nextLine().toUpperCase();
        System.out.println("Metin içerisnde aramak istediğiniz kelimeyi giriniz");
        String kelime = input.nextLine().toUpperCase();

        if (metin.indexOf(kelime)==-1){
            System.out.println("Metin aradiginiz kelimeyi icermiyor");
        } else if (metin.indexOf(kelime)==metin.lastIndexOf(kelime)) {
            System.out.println("Metin aradiginiz kelimeyi bir tane iceriyor");
        }else System.out.println("Metin aradiginiz kelimeyi birden fazla iceriyor");


    }
}
