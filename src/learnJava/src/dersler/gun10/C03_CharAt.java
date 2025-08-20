package learnJava.src.dersler.gun10;

import java.util.Scanner;

public class C03_CharAt {
        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
         */

    public static void main(String[] args) {

        String qa = "Team Lead kim?";

        System.out.println("qa.charAt(3) = " + qa.charAt(3)); // m
        System.out.println("qa.charAt(7) = " + qa.charAt(7)); // a

        // Stringin son karakterini çağırma:
        System.out.println("qa.length() = " + qa.length()); // 14
        System.out.println("qa.charAt(qa.length()-1) = " + qa.charAt(qa.length() - 1));

        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Kelime grubu giriniz");

        String girdi = input.nextLine();
        int uzunluk = girdi.length(); // 7   7/2 = 3
        if (uzunluk % 2 == 1) {
            System.out.println(" Girdiğiniz değerin ortasında '" + girdi.charAt(uzunluk / 2) + "' harfi bulunur");
        } else {
           // System.out.println("girdi.charAt(uzunluk / 2) = " + girdi.charAt(uzunluk / 2)); // Sağındaki harf
           // System.out.println("girdi.charAt(uzunluk / 2) = " + (girdi.charAt(uzunluk / 2-1))); // Solundaki harf
            System.out.println("girdiğiniz dizinin ortasında bir harf bulunamaz !" );
        }
}
}
