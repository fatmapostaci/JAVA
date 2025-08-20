package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task14 {

    //Task-> Girilen iki sayının EBOB ve EKOK değerlerini "While Döngüsü" prnt eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayının EBOB ve EKOK değerlerini bulalım");
        System.out.print("Sayı 1: ");
        int a = scan.nextInt();
        System.out.print("Sayı 2: ");
        int b = scan.nextInt();
        int ebob, ekok;
        int x = a,y=a;
        while (true) {
            if (x % a == 0 && x % b == 0) {
                ekok = x;
                break;
            }
            x++;
        }
        System.out.println("ekok = " + ekok);
        while (true){
            if(a%y==0 && b%y==0){
                ebob=y;
                break;
            }
            y--;
        }
        System.out.println("ebob = " + ebob);

    }
}
