package learnJava.src.codeChallenge.gun4;

import java.util.Scanner;

public class Task04 {
    //fibonacci
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        System.out.println("fibonacci sayısı girin");
        int fibonacci = scanf.nextInt();
        int sayi1=0;
        int sayi2=1;
        for (int i = 0; i < fibonacci ; i++) {
            System.out.print(" " + sayi1);
            int temp=sayi2;
            sayi2=sayi2+sayi1;
            sayi1=temp;
        }
    }
}
