package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("girilen 5 sayının 10 ile 20 arası hariç diğerlerinin toplamı");
        int toplam=0;
        for (int i = 0; i <5 ; i++) {
            System.out.print(  "Sayı "+(i+1)+": " );
            int num = scanner.nextInt();
            if(num<10 || num>20)
                toplam=toplam+num;
            //System.out.println("toplam = " + toplam);
        }
        System.out.println("toplam = " + toplam);

    }
}
