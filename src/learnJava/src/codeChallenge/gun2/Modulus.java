package learnJava.src.codeChallenge.gun2;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru print eden code create ediniz.
        // Hint: use / and %
        //    input: 12345
        //    output:
        //      birler : 5
        //      onlar : 4
        //      yüzler : 3
        //      binler : 2
        //      onbinler : 1
        Scanner scanf = new Scanner(System.in);
        double sayi = scanf.nextDouble();
        double sayi2=sayi;
        System.out.println("sayi%10 = " + (int)sayi % 10);
        System.out.println("sayi/10%10 = " + (int)sayi/10 % 10);
        System.out.println("sayi/100%10 = " + (int)sayi / 100 % 10);
        System.out.println("sayi/1000%10 = " + (int)sayi / 1000 % 10);
        System.out.println("sayi/10000%10 = " + (int)sayi / 10000 % 10);

        System.out.println("sayi%10 = " + (int)sayi % 10);
        System.out.println("sayi/=10%10 = " + (int)(sayi /= 10) % 10);
        System.out.println("(sayi/=10)%10 = " + (int)(sayi /= 10) % 10);
        System.out.println("(sayi/=10)%10 = " + (int)(sayi /= 10) % 10);
        System.out.println("(sayi/=10) = " + (int)(sayi /= 10));

        while(sayi2>1){
            System.out.println("(sayi2%10 = " + (int)sayi2 % 10);
            sayi2 /= 10;
        }
        /*
           Girilen 5 basamakli tamsayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini print eden code create ediniz.

            Ex :
            input  : 14531
            output : 9
         */
        double sayi3 = scanf.nextDouble();
        int ilkIkı = (int) sayi3/1000;
        int sonIkı =  (int) sayi3%100;
        System.out.println("output = " +( (ilkIkı / 10 + ilkIkı % 10)+(sonIkı / 10 + sonIkı % 10)));
    }
}
