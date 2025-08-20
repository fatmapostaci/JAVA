package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp

       */
        Scanner scanf=new Scanner(System.in);
        String input;
        do{
            System.out.print("Input girin: ");
            input=scanf.next();
            if(input.startsWith("x")) {
                System.out.println("javaTAR");
                break;
            }
            System.out.println("javaCAN");
        }while(!input.startsWith("x"));


    }
}
