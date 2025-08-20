package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner sc=new Scanner(System.in);
        System.out.println("girilen tam sayıya kadar olan sayıların karelerinin toplamını hesaplayalım");
        int sayi=sc.nextInt(),toplam=0;
        for (int i = 1; i < sayi; i++) {
            toplam+=Math.pow(i,2);
            System.out.print(  i+"^2, ");
        }
        System.out.println();
        System.out.println("Sayıların kareleri toplamı = " + toplam);

    }
}
