package learnJava.srcHoca.j99_codechallenge.codechallenge03;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        // Kullanıcıdan isim ve soy isim al
        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz");

        String isim = input.next();
       // String isim2 = input.next();
        String soyIsim = input.next();
        System.out.println("isim = " + isim);
       // System.out.println("isim = " + isim2);
        System.out.println("soyIsim = " + soyIsim);

        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyIsim = soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).toLowerCase();

        System.out.println("İsminizin düznlemiş hali : " + isim.concat(" ").concat(soyIsim));

        /*
        System.out.println('a'-'A');
        System.out.println('A'*1);
        System.out.println('a'+0);
        System.out.println((char)('b' -32));

         */
    }
}
