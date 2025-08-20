package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayının asal olma durumunu kontrol edelim:");
        int sayi = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                System.out.println("sayi asal değildir");
                flag=false;
                break;
            }
        }
        if (flag) System.out.println("Sayı asaldır");


    }
}
