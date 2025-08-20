package learnJava.srcHoca.j05_ifconditions;

import java.util.Scanner;

public class C05_TernaryOperator {
        /* Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını
       kontrol eden code create ediniz.
    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...");
        int num = input.nextInt();
        String result = num > 9 || num < -9 ? num + " sayısı iki veya daha fazla basamak içerir." : num + " sayısı tek basamaklıdır.";
        System.out.println("result = " + result);


    }
}
