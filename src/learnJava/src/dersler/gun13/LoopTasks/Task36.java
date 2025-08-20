package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.
        Scanner sc = new Scanner(System.in);
        System.out.println("Java ile girilen sayının harmonik serisini bulan program yazacağız.");
        int harmonik_seri = sc.nextInt();
        double harmonik_toplam = 0.0;
        for (int i = 1; i < harmonik_seri; i++) {
            harmonik_toplam += 1.0 / i;
            
        }
        System.out.println("harmonik_toplam = " + harmonik_toplam);
    }
}
