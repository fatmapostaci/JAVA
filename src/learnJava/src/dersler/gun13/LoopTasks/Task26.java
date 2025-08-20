package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("verilen bir tam sayinin rakamlari toplamini  hesaplayalım");
        System.out.print("Sayıyı girin: ");
        String sayi=sc.next();
        int toplam=0;
        for (int i = 0; i < sayi.length(); i++) {
            toplam += Integer.parseInt( sayi.substring(i,i+1));
        }
        System.out.println("rakamların toplamı = " + toplam);



    }
}
