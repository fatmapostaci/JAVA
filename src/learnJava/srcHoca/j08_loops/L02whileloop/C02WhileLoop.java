package learnJava.srcHoca.j08_loops.L02whileloop;

import java.util.Scanner;

public class C02WhileLoop {
    // Task: Sihirli sayıyı tamnin etme oyunu yazalım

    public static void main(String[] args) {
        // Flag (Bayrak) mantığı loopun kırılacağı anı belirler
        int sihirliSayi= 7;
        boolean dogruTahmin = false; // Flag şartın istenilen değer olup olmadığını kontrol eder
        Scanner scn = new Scanner(System.in);

        while (!dogruTahmin) {
            System.out.println("Bir sayı tahmin ediniz:");
            int tahmin = scn.nextInt();
            if (tahmin ==sihirliSayi){
                System.out.println("Tebrikler kazandınız. ");
                dogruTahmin = true; // Bayrağı true yaparak döngüyü kırar
            } else {
                System.out.println("Doğru tahmin edemediniz tekrar deneyin");
            }
        }


    }
}
