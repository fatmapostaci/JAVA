package learnJava.src.dersler.gun17;

import java.util.Scanner;

public class Task04 {
    /*
    Task:  1’den 20’ye kadar olan sayıları yazdır. Ancak, sayılar 15’ten büyük
     olduğunda döngüyü sonlandır (break kullan). Çift sayıları ise atla (continue kullan).
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i >= 15)
                break;
            if (i % 2 == 0)
                continue;
            System.out.println("i = " + i);
        }
    }
}
