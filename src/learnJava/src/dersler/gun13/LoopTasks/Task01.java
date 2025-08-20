package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
    /*
       Interview Question
               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("100 den küçük bir sayı girin: ");
        int tamsayi = scan.nextInt();
        for (int i = 1; i <= tamsayi; i++)
            System.out.println(i % 3 == 0 && i % 5 == 0 ? " JavaCAN" :
                    (i % 5 == 0 ? " CAN'dır" :
                            (i % 3 == 0 ? " Java" :
                                    "")));
    }
}
