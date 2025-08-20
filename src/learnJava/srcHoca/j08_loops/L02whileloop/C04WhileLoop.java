package learnJava.srcHoca.j08_loops.L02whileloop;

import java.util.Scanner;

public class C04WhileLoop {
    // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
    // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
    // 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scn.nextInt();
        int bolenSayi =1;
        int counter=0;

        while (bolenSayi <= number){
            if (number % bolenSayi == 0){
                System.out.print(bolenSayi + " ");
                counter++;
            }
            bolenSayi++;
        }
        System.out.println();
        System.out.println( number + " sayısının " + counter + " adet böleni vardır");
}
}
