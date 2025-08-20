package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner scan = new Scanner(System.in);
        System.out.print("iki tamsayı girin: ");
        int tamsayi1 = scan.nextInt();
        int tamsayi2 = scan.nextInt();
        if (tamsayi2 < tamsayi1) {
            int temp = tamsayi2;
            tamsayi2 = tamsayi1;
            tamsayi1 = temp;
        }
        System.out.println("girilen iki tamsayı arasındaki çift sayılar: ");
        for (int i = tamsayi1; i <= tamsayi2; i++)
            if (i % 2 == 0)
                System.out.print(" " + i);
    }
}
