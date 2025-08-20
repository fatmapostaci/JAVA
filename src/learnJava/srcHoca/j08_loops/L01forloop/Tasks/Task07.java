package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:...");
        int num = input.nextInt();

        for (int satır = 1; satır <= num; satır ++){
            for (int cell = 1; cell <= num ; cell ++){
                System.out.print((satır == cell ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}
