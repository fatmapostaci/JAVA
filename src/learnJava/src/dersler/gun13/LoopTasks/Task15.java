package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Rakam sayısını sayabileceğim bir metin girin:");
		String satir = sc.nextLine();
		int counter = 0;
		for (int i = 0; i < satir.length() - 1; i++) {
			if (Character.isDigit(satir.charAt(i))) counter++;
		}
		System.out.println("MEtindeki rakam sayısı = " + counter);
	}
}
