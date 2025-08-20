package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("Girilen  bir char karakterden sonra gelen 10 karakteri bulalım");
        System.out.print("Input: ");
        String metin = sc.next();
        int ilk_karakter = metin.charAt(0);
        for (int i = ilk_karakter + 1; i <= ilk_karakter + 10; i++) {
            System.out.print( (char)i +" ") ;

        }
    }
}
