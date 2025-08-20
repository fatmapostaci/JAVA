package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int sayi = 100;
        while ( sayi <= 999) {
            if (sayi % 4 == 0) {
                System.out.print(sayi + " ");
            }
            sayi++;
        }

        int index = 1, counter = 0;
        while (sayi > index) {

            if (sayi % index == 0) {
                counter++;
            }
            index++;
        }
        System.out.println(sayi + " nin " + counter + " adet böleni vardır");


    }

}
