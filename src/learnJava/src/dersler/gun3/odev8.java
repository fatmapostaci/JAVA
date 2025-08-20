package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev8 {
    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


        int vize1, vize2, finaL;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Geçme notunuzu görmek için notlarınızı girin!");
        System.out.print("1.vize notunu girin: ");
        vize1 = scanf.nextInt();
        System.out.print( "2.vize notunu girin: ");
        vize2 = scanf.nextInt();
        System.out.print( "Final notunu girin: ");
        finaL = scanf.nextInt();
        System.out.println( "Geçme notunuz: " +((vize1+vize2)*30/100 + finaL*70/100));



    }
}
