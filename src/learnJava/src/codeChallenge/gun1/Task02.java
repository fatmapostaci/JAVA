package learnJava.src.codeChallenge.gun1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        polindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String txt = input.nextLine();
        int karakterSayisi = txt.length();

        String reversed ="";
         for (int i = karakterSayisi ; i>0  ; i--  ){
             reversed = reversed +txt.charAt(i-1) ;
         }
        System.out.println("reversed = " + reversed);

         String result = reversed.equals(txt) ? "Girdiğiniz metin palindromdur" : "Girdiğiniz metin palindrom değildir";
        System.out.println("result = " + result);
    }
}
