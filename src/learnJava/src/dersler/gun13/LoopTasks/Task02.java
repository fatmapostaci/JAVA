package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        polindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir metin girin:");
        String metin = scan.nextLine();
        int length = metin.length();
        String ters_metin ="";
       /* for (int i = length - 1  ; i >= 0; i--) {
            ters_metin+=metin.charAt(i);

        }*/
        for (int i = length - 1  ; i >= 0; i--) {
            ters_metin=ters_metin.concat(""+metin.charAt(i));
        }
        System.out.println(ters_metin);

        if (metin.equals(ters_metin))
        System.out.println("polindrom");


    }
}
