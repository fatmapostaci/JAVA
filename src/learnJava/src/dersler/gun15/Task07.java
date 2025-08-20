package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz
        Scanner scanf = new Scanner(System.in);
        int temp=0;
        for(int i = 1; i <= 5 ; i++){
            System.out.print(i + ". sayıyı girin: ");
            int sayi = scanf.nextInt();
            if( temp<sayi)
                temp=sayi;
        }
        System.out.println("En büyük sayi: "+temp);
    }
}
