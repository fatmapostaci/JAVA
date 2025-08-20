package learnJava.srcHoca.j99_codechallenge.codechallenge03;

import java.util.Scanner;

public class Task09 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("String giriniz");

        String str = input.nextLine();

        boolean isDizin = str.contains("xyz") ? true : false;
        System.out.println("Girdiğiniz dizin formata uyuyor mu ? = " + isDizin);

    }
}
