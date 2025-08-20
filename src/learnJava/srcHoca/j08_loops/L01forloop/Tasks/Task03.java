package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :...");
        int num = input.nextInt();

        int fact = 1;
        for (int i =1;i <= num  ;  i ++ ){
            fact *= i; // fact = fact * i
        }
        System.out.println(num +" sayısının factoriyeli  = " + fact);


    }
}
