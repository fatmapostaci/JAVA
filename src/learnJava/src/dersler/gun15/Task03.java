package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80
        Scanner scanf = new Scanner(System.in);
        System.out.print("input: ");
        int tamsayi = scanf.nextInt();
        System.out.println("output: ");
        for (int i=1; i<=10; i++){
            System.out.println(tamsayi+" x "+ i + " = " + tamsayi*i );
        }

    }

    }
