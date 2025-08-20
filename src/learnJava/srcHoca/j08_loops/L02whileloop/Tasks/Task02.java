package learnJava.srcHoca.j08_loops.L02whileloop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayı girin");
        int sayi1 = sc.nextInt();
        System.out.println("Sayı girin");
        int sayi2 = sc.nextInt();

        if (sayi1>sayi2){
            int temp=sayi1;
            sayi1=sayi2;
            sayi2=temp;
        }
        int toplam=0;
        while (sayi1 < sayi2) {
            System.out.print(sayi1+" ");
            toplam += sayi1;
            sayi1++;
        }
        System.out.println();
        System.out.println("Girilen sayıların toplamı = " + toplam);
    }


    }

