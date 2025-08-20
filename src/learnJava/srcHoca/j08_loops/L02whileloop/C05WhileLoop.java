package learnJava.srcHoca.j08_loops.L02whileloop;

import java.util.Scanner;

public class C05WhileLoop {
    //task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz

    public static void main(String[] args) {
        int sayac= 100;

        while(sayac < 1000){
            if (sayac%4==0){
                System.out.print(sayac+ " ");
            }
            sayac++;
        }
    }
}
