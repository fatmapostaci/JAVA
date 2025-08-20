package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK
        Scanner sc = new Scanner(System.in);
        System.out.println("Girilen  Stringde  index'i tek sayi olanlari kucuk harfle\n" +
                "index'i cift sayi olanlari buyuk harfle yazalım");
        System.out.print("Input: ");
        String metin = sc.nextLine();
        String yeni_metin="";
        for (int i = 0; i < metin.length(); i++) {
            if (i % 2 == 0)
                yeni_metin += metin.substring(i, i + 1).toUpperCase();
            else
                yeni_metin += metin.substring(i, i + 1).toLowerCase();
        }
        System.out.println("metin = " + yeni_metin);

    }
}
