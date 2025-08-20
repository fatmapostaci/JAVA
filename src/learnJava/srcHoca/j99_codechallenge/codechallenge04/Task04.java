package learnJava.srcHoca.j99_codechallenge.codechallenge04;

import java.util.Scanner;

public class Task04 {
    /*
    Kullanıcının belirlediği sayıda Fibonacci sayısını yazdıran metod oluşturunuz
     0,1,1,2,3,5,8,.....
                n1, n2, n1+n2,
     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Fibonacci serisiniz kaç elemanını yazdırmak istiyorsunuz ? ");
        int num = scn.nextInt();

        // ilk iki seri elemanı
        int a = 0;
        int b = 1;

        // Fibonacci serisini yazdıralım
        System.out.println("Fibonacci Sreisi = ");



        for (int i = 0;   i    <   num;      i ++    ){


            System.out.print(a + " ");


            int nextTerm = a + b;


            a = b;


            b = nextTerm;


        }




















    }
}
