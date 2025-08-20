package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
        // ************************** Task 05 ***********************************
        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.
        int sayi1,sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.printf("2 tam sayının dört işlemini hesaplayalım. \nBirinci sayıyı girin: ");
        sayi1 = scan.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        sayi2 = scan.nextInt();

        System.out.printf("Sayıların toplamı:  %d + %d = %d \n" , sayi1,sayi2,(sayi1+sayi2));
        System.out.printf("Sayıların farkı:  %d - %d = %d \n" , sayi1,sayi2,(sayi1-sayi2));
        System.out.printf("Sayıların çarpımı:  %d * %d = %d \n" , sayi1,sayi2,(sayi1*sayi2));
        System.out.printf("Sayıların bölümü:  %d / %d = %f \n" , sayi1,sayi2,((float)sayi1/(float)sayi2));


    }
}
