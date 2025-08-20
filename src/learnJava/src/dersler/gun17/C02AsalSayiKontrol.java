package learnJava.src.dersler.gun17;

import java.util.Scanner;

public class C02AsalSayiKontrol {
    //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
    //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int limit = scn.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < limit ; i++ ){
            System.out.print(i + " ");
            if (limit % i == 0){
                isPrime = false; // Bayrak kaldır...
                break;
            }
        }
        System.out.println();
        System.out.println("Girdiğiniz sayı asal sayımıdır = " + isPrime);


    }
}
