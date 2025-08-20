package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........

        fibonaccidenSayiYazdir(16);
    }

    public static void fibonaccidenSayiYazdir(int adet) {
        int first = 0;
        int second = 1;
        int temp;
        int[] fibonacci = new int[16];

        for (int i = 0; i < adet; i++) {
            //bulunan sayıları fibonacci array ine atadım
            fibonacci[i] = first;
            temp = second;
            second = first + temp;
            first = temp;
           // System.out.print(" " + first);

        }
        for (int j : fibonacci) {
            System.out.print(" " + j);
        }

    }
}
