package learnJava.srcHoca.j05_ifconditions.tasks;

import java.util.Scanner;

public class T01_PozitifNegatifKontrol {

    /*
Runner
   girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
 */

    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");

       // double number = scn.nextDouble();
        int number = 's';
        if (number > 0) {
            System.out.println("Girilen sayı pozitif.");
        } else if (number < 0) {
            System.out.println("Girilen sayı negatif.");
        } else if(number == 0){
            System.out.println("Girilen sayı sıfır.");
        } else {
            System.out.println("Yanlış değer girdiniz...");
        }
        }
    }

