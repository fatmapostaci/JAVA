package learnJava.srcHoca.j08_loops.L03dowhileloop.Tasks;

import java.util.Map;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */

        Scanner scn = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayı giriniz");
        int number = scn.nextInt();
        int kok=0;
        int basla = 1;
        do {
            if (basla*basla == number){
                kok = basla;
            }
            basla++;
        } while (basla < number);

        if (kok !=0){
            System.out.println(number + " sayısının kökü = " + kok);
        } else {
            System.out.println("Girdiğiniz sayının tam kökü yoktur.");
        }

    }
}
