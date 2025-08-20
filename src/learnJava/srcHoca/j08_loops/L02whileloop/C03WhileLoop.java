package learnJava.srcHoca.j08_loops.L02whileloop;

import java.util.Scanner;

public class C03WhileLoop {
    // task-> girilen tamsayının rakamları toplamını print eden code create ediniz.
    // 2316->6+1+3+2       571622->2+2+6+1+7+5

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = scn.nextInt();
        int sum =0;

        while (number > 0){
            sum = sum +number%10;
            number/=10;
        }
        System.out.println("Girdiğiniz sayının rakamları toplamı = " + sum);
 }

}
