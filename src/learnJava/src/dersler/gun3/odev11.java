package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev11 {
    public static void main(String[] args) {
        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         */
        Scanner scanf = new Scanner(System.in);
        String harf;
        do {
            System.out.println("Bir karakter girin");
            harf = scanf.next();

        }while(harf.length() != 1);  //karakter yerine string girerse diye kontrol ediliyor
        char c = harf.charAt(0);
        System.out.println("Girdiğiniz harfin Asci değeri: " + (0+c));
        System.out.println("Girdiğiniz harfin Asci değeri: " + (Character.hashCode(c)));
       System.out.println("c.getClass() = " + c);
    }
}
