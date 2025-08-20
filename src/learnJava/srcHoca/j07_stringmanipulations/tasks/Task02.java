package learnJava.srcHoca.j07_stringmanipulations.tasks;

import java.util.Scanner;

public class Task02 {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı
		 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz:  ");
        String sifre = input.next();

        boolean isSixDigit = sifre.length() > 5;

        char initial = sifre.charAt(0);
        boolean isBuyukHarf = Character.isUpperCase(initial);

        boolean isCapital = initial >= 'A' && initial <= 'Z';

       /* System.out.println("isCapital = " + isCapital);
        System.out.println("isBuyukHarf = " + isBuyukHarf);
        System.out.println("isSixDigit = " + isSixDigit);
        */
        boolean isDigit = Character.isDigit(sifre.charAt(sifre.length()-1));
        if (isDigit &&  isBuyukHarf && isSixDigit) {
            System.out.println("Şifreniz geçerli");
        } else {
            if (!isDigit){
                System.out.println("Son harf sayı olmalı....");
            }
            if (!isCapital) {
                System.out.println("Büyük harfle başlamalı");
            }
            if (!isSixDigit) {
                System.out.println("Şifre en az 6 haneli olmalı");
            }
        }

    }
}
