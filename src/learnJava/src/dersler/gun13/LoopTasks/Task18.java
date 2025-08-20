package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Girdi:");
        int sayi = sc.nextInt();
        boolean flag = false;
        for (int i = 1; Math.pow(3,i) <= sayi; i++) {

            if (Math.pow(3,i) == sayi ) {
                System.out.print("Çıktı: True\nAçıklama: ");
                flag = true;
                for(int x=i;x>0;x--)
                    System.out.print(3 + "x");
                System.out.print("="+sayi);

            }
        }
        if(flag==false) System.out.println("Çıktı: False");


    }
}
