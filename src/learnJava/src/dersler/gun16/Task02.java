package learnJava.src.dersler.gun16;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz

        char baslangic;
        char bitis;
        Scanner scn = new Scanner(System.in);

        System.out.println("Başlangıç karakterini giriniz");
        baslangic = scn.next().charAt(0);
        System.out.println("baslangic = " + (baslangic+0)); // istersek ascii değerinden yararlanarak ta bir kurgu yapabilirdik
        System.out.println("Bitiş karakterini giriniz");
        bitis = scn.next().charAt(0);
        System.out.println("bitis = " + bitis*1);

        if (baslangic < bitis) {
            do {
                System.out.print(baslangic +" ");
                baslangic++;
            } while (baslangic <= bitis);
        } else if (baslangic > bitis){
            do {
                System.out.print(bitis +" ");
                bitis++;
            } while (baslangic >= bitis);
        } else {
            System.out.println(baslangic);
        }
  }
}
