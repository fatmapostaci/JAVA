package learnJava.srcHoca.j99_codechallenge.codechallenge03;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("String 1 :");
        String str1 = scan.nextLine();
        System.out.println("String 2 :");
        String str2 = scan.nextLine();

        // Birinci yol:
        String birlesik_metin1 = str1.concat(" ").concat(str2);
        System.out.println("birlesik_metin1 = " + birlesik_metin1);

        // İkinci Yol:
        String birlesik_metin2 = str1 + " " + str2;
        System.out.println("birlesik_metin2 = " + birlesik_metin2);

    }
}
