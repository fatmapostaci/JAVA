package learnJava.srcHoca.j05_ifconditions;

import java.util.Scanner;

public class C06_NestedTernary {
        /*
     TASK :
     Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
     10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
     Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int num = input.nextInt();
        String result = num >= 0 ? (num < 10 ? "Rakam" :"Pozitif Sayi") : ("Negatif Sayi") ;
        System.out.println("result = " + result);


    }
}
