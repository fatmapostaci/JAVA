package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Girilen  String'in tersini(reverse String) bulalım");
        System.out.print("Input: ");
        String metin=sc.nextLine(),ters_metin="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            ters_metin+=metin.substring(i,i+1);
        }
        System.out.println("ters_metin = " + ters_metin);




        }

}
